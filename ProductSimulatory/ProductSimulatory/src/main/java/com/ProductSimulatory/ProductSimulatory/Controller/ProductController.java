package com.ProductSimulatory.ProductSimulatory.Controller;

import com.ProductSimulatory.ProductSimulatory.Model.Product;
import com.ProductSimulatory.ProductSimulatory.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String getMessage()
    {
        return "home";
    }
    //--------------------------------------------------------------------------------
    @GetMapping("/adminDisplayData")
    public String displayDataToTheAdmin(Model model)
    {
        model.addAttribute("displayAdminDataList",service.displayProduct());
        return "adminDisplay";
    }
    //----------------------------------------------------------------------------------
    @GetMapping("/noaccess")
    public String noaccess()
    {
        return "noaccess";
    }
    //-----------------------------------------------------------------------------------
    @GetMapping("/userDisplayData")
    public String displayDataToTheEndUser(Model model)
    {
        model.addAttribute("displayUserDataList",service.displayProduct());
        return "UserDisplay";
    }
    //------------------------------------------------------------------------------------

    @GetMapping("/newProduct")
    public String newProduct(Model model)
    {
        Product pro=new Product();
        model.addAttribute("pro",pro);
        return "save";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("pro") Product pro)
    {
        this.service.saveProduct(pro);
        return "redirect:/adminDisplayData";
    }
    //------------------------------------------------------------------------------
    @GetMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable("id") int id, Model model)
    {
        Product pro=service.updateProductById(id);
        model.addAttribute("pro",pro);
        return "update";
    }
    //---------------------------------------------------------------------------
    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") int id)
    {
        this.service.deleteProduct(id);
        return "redirect:/adminDisplayData";
    }
    //----------------------------------------------------------------------------
    @GetMapping("/purchaseObjectProduct/{id}")
    public String purchaseProductObject(@PathVariable("id") int id,Model model)
    {
        List<Product> list=service.displayProduct();
        for(Product pro:list)
        {
            if(pro.getpId()==id)
            {
                model.addAttribute("tempPro",pro);
                break;
            }
        }
        return "purchase";
    }
    //---------------------------------------------------------------------------

    @GetMapping("/purchaseProduct")
    public String purchaseProduct(Product product)
    {
        boolean status=false;
        List<Product> list=service.displayProduct();
        for(Product p:list)
        {
            if(p.getpId()==product.getpId())
            {
                if(product.getUserQty()<=p.getpQty() && product.getUserQty()>0)
                {
                    Product p1=new Product(p.getpId(),p.getpName(),p.getpPrice(),(p.getpQty()-product.getUserQty()),product.getUserQty());
                    service.saveProduct(p1);
                    status=true;
                    break;
                }
            }
        }
        if(status)
        {
            return "redirect:/userDisplayData";
        }
        else
        {
            return "invalidUserProductQty";
        }
    }
    //-------------------------------------------------------------------------

//    @GetMapping("/billGenerate")
//    public String billGenerate(Model model)
//    {
//        //model.addAttribute("pro",pro);
//        return "billGenerate";
//    }
    //-----------------------------------------------------------------------------
/*@GetMapping("/billGenerateObject")
public String billGenerate(Product product, Model model)
{
    List<Product> list=service.displayProduct();
    for(Product pro1:list)
    {
        if(pro1.getpId()==product.getpId())
        {
            model.addAttribute("tempPro",pro1);
            break;
        }
    }
    return "redirect:/userDisplayData";
}*/
}
