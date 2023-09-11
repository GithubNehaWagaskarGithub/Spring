package com.CurdOperation.App1.Service;

import com.CurdOperation.App1.Model.Customer;
import com.CurdOperation.App1.Repository.CustRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustService
{
    @Autowired
    private CustRepository repository;

    public void addData(Customer c)
    {
        repository.save(c);
    }
    //--------------------------------------

    public List<Customer> displayData()
    {
        return repository.findAll();
    }
    //------------------------------------------
    public void updateData(Customer c)
    {
        repository.save(c);
    }
    //------------------------------------------
    public void deleteData(int id)
    {
        repository.deleteById(id);
    }
    //------------------------------------------
}
