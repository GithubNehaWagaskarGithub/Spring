package com.CurdOperation.App1.Controller;

import com.CurdOperation.App1.Model.Customer;
import com.CurdOperation.App1.Service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustController
{
    @Autowired
    private CustService service;

    @PostMapping ("/addData")
    public void addData(@RequestBody Customer c)
    {
        service.addData(c);
    }
    //------------------------------------

    @GetMapping("/displayData")
    public List<Customer> displayData()
    {
        return service.displayData();
    }
    //---------------------------------------

    @PutMapping("/updateData")
    public void updateData(@RequestBody Customer c)
    {
        service.updateData(c);
    }
    //-----------------------------------------

    @DeleteMapping("/deleteData/{id}")
    public void deleteData(@PathVariable int id)
    {
        service.deleteData(id);
    }
}
