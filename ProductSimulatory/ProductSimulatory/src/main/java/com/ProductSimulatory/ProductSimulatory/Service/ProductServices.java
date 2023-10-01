package com.ProductSimulatory.ProductSimulatory.Service;

import com.ProductSimulatory.ProductSimulatory.Model.Product;

public interface ProductServices {

    public void saveProduct(Product p1);
    //---------------------------------------
    public Product updateProductById(int id);
    //---------------------------------------
    public void deleteProduct(int id);
    //---------------------------------------
}
