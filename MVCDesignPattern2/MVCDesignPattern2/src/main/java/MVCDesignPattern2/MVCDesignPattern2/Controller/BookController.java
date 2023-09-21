package MVCDesignPattern2.MVCDesignPattern2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import MVCDesignPattern2.MVCDesignPattern2.Model.Book;
import MVCDesignPattern2.MVCDesignPattern2.Service.BookService;

@Controller
public class BookController 
{
	@Autowired
	private BookService service;
	
	@GetMapping("/")
	public String displayData(Model model)
	{
		model.addAttribute("bookList",service.displayData());
		return "index";
	}
	//-------------------------------------------------------------
	@GetMapping("/newObject")
	public String newObject(Model model)
	{
		//Model object
		Book book=new Book();
		model.addAttribute("book", book);
		return "insert";
	}
	
	//-----------------------------------------------------------
	@PostMapping("/insertData")
	public String insertData(@ModelAttribute("book") Book book)
	{
		service.insertData(book);
		return "redirect:/";
	}
	//---------------------------------------------------------------------
	
	@GetMapping("/updateData/{id}")
	public String updateDataById(@PathVariable("id") int id,Model model)
	{
		Book book=service.updateDataById(id);
		model.addAttribute(book);
		return "update";
	}
	//------------------------------------------------------------------
	public String deleteDataById(@PathVariable("id") int id,Model model)
	{
		this.service.deleteDataById(id);
		return "delete";
	}
	//-------------------------------------------------------------------
}
