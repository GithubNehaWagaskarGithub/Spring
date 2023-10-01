package com.ProductSimulatory.ProductSimulatory.Service;

import com.ProductSimulatory.ProductSimulatory.Model.Product;
import com.ProductSimulatory.ProductSimulatory.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductServices{
    @Autowired
    private ProductRepository repository;

    public List<Product> displayProduct()
    {
        return repository.findAll();
    }
    //-------------------------------------------
    @Override
    public void saveProduct(Product p1)
    {
        repository.save(p1);
    }
    //--------------------------------------------
    @Override
    public Product updateProductById(int id)
    {
        Optional<Product> optional=repository.findById(id);
        Product p1=null;
        if(optional.isPresent())
        {
            p1=optional.get();
        }
        else {
            throw new RuntimeException("Invalid Id :"+id);
        }
        return p1;
    }
    //-------------------------------------------
    @Override
    public void deleteProduct(int id)
    {
        this.repository.deleteById(id);
    }
    //-------------------------------------------------------

    public void updateQty(int qty)
    {
        repository.updateQty(qty);
    }
}
