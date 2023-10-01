package com.ProductSimulatory.ProductSimulatory.Repository;

import com.ProductSimulatory.ProductSimulatory.Model.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("update Product p set p.pQty=p.pQty-:qty where p.pQty>=:qty")
    @Modifying
    @Transactional
    public void updateQty(@Param("qty") int qty);
}
