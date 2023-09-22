package SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Controller;

import SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Model.Employee;
import SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Service.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpController {
    @Autowired
    private EmpServices services;

    @GetMapping("/")
    public String getMessage()
    {
        return "index";
    }
    //-----------------------------------------
    @GetMapping("/displayEmployees")
    public String displayData(Model model)
    {
        model.addAttribute("empList",services.displayData());
        return "display";
    }
    //--------------------------------------------------------------------------
    @GetMapping("/newEmployee")
    public String newEmployee(Model model)
    {
        Employee emp=new Employee();
        model.addAttribute("emp",emp);
        return "save";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("emp") Employee emp)
    {
        this.services.saveEmployee(emp);
        return "redirect:/displayEmployees";
    }
    //------------------------------------------------------------------------------
    @GetMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable(value = "id") int id, Model model)
    {
        Employee emp=services.updateEmployee(id);
        model.addAttribute("emp",emp);
        return "update";
    }
    //---------------------------------------------------------------------------
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id") int id,Model model)
    {
        this.services.deleteEmployee(id);
        return "redirect:displayEmployees";
    }
    //----------------------------------------------------------------------------
}
