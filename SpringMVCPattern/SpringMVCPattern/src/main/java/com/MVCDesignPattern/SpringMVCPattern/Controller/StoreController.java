package com.MVCDesignPattern.SpringMVCPattern.Controller;

import com.MVCDesignPattern.SpringMVCPattern.Model.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StoreController {

    List<Store> storeList=new ArrayList<>();

    {
        Store s1=new Store(101,"Laptop",3499.00,10,43999.99);
        Store s2=new Store(102,"Mobile",800.00,10,7000.99);
        Store s3=new Store(103,"Projector",599.00,10,9000.99);
        storeList.add(s1);
        storeList.add(s2);
        storeList.add(s3);
    }

    @RequestMapping("/")
    public String getMessage()
    {
        return "index";
    }
    //----------------------------------------------------------------------------------------

    @GetMapping("/displayProduct")
    public String displayProduct(Model model)
    {
        model.addAttribute("productList",storeList);//
        return "display";
    }
    //---------------------------------------------------------------------------

    @GetMapping("/addProduct")
    public String createTempObject(Model model)
    {
         model.addAttribute("product",new Store());
         return "save";
    }
    //---------------------------------------------------------------------------
    @PostMapping("/addProduct")
    public String addObject (Store s)
    {
        storeList.add(s);
        return "redirect:/displayProduct";
    }
    //--------------------------------------------------------------------------
    @GetMapping("/updateProduct/{id}")
    public String getCurrentObject(@PathVariable int id,Model model)
    {
        Store temp=storeList.get(id-101);
        model.addAttribute("tempObject",temp);
        return "update";
    }
    //--------------------------------------------------------------------------
    @GetMapping("/updateTempObject")
    public String updateCurrentObject(Store s)
    {
        storeList.set(s.getPId()-101,s);
        return "redirect:/displayProduct";
    }
    //--------------------------------------------------------------------------
    @GetMapping("/deleteProduct/{id}")
    public String getCurrentObject1(@PathVariable int id, Model model)
    {
        Store temp1=storeList.get(id-101);
        model.addAttribute("tempObject1",temp1);
        return "delete";
    }
    //----------------------------------------------------------------------------
    @GetMapping("/deleteTempObject")
    public String deleteCurrentObject(Store s)
    {
        storeList.remove(s.getPId()-101);
        return "redirect:/displayProduct";
    }
    //----------------------------------------------------------------------------
}
