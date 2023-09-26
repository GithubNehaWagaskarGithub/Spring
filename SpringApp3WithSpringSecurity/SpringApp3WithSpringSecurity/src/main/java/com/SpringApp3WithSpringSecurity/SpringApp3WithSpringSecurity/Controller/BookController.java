package com.SpringApp3WithSpringSecurity.SpringApp3WithSpringSecurity.Controller;

import com.SpringApp3WithSpringSecurity.SpringApp3WithSpringSecurity.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @Autowired
    private BookService service;

    //------------------------------
    @GetMapping("/")
    public String displayData(Model model)
    {
        model.addAttribute("bookList",service.displayData());
        return "index";
    }
}
