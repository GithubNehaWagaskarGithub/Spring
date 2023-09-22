package com.SringMVCDesignPattern1.MVCDesignPattern1.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SringMVCDesignPattern1.MVCDesignPattern1.Model.Product;

@Controller
public class ProductController {
	
	List<Product> list=new ArrayList<>();
	
	{
		Product p1=new Product(101,"Laptop",3599.99,10,40000.99);
		Product p2=new Product(102,"Mobile",2599.99,10,20000.99);
		Product p3=new Product(103,"Projector",1599.99,10,30000.99);
		list.add(p1);
		list.add(p2);
		list.add(p3);
	}
	@RequestMapping("/")
	public String getMessage()
	{
		return "index";
	}
	//------------------------------
	@GetMapping("/displayProduct")
	public String displayProduct(Model model)
	{
		model.addAttribute("productList",list);
	    return "display";
	}
	//-----------------------------------------------
}
