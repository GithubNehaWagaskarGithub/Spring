package SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Controller;

import SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Model.Note;
import SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Service.NoteService;
import SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1.Service.NoteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NoteController {
    @Autowired
    private NoteServices service;

   /* @Autowired
    private NoteService ser;*/

    @GetMapping("/")
    public String displayNote(Model model){
        model.addAttribute("NoteList", service.getAllNotes());
        return "index";
    }

    @GetMapping("/newNote")
    public String newNote(Model model) {
        //create object of model
        Note note = new Note();
        model.addAttribute("note",note);
        return "save";
    }

    @PostMapping("/saveNote")
    public String saveNote(@ModelAttribute("note") Note note) {
        //Save employee to database
        service.saveNote(note);
        return "redirect:/";
    }

    @GetMapping("/updateNote/{id}")
    public String updateNote(@PathVariable(value="id") int id, Model model) {
        //get employee from service
        Note note = service.getNoteById(id);
        model.addAttribute(note);
        return "update";
    }

    @GetMapping("/deleteNote/{id}")
    public String deleteNote(@PathVariable(value="id") int id,Model model) {
        this.service.deleteNote(id);
        return "redirect:/";
    }
}
