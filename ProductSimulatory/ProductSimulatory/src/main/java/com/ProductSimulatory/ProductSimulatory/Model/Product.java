package com.ProductSimulatory.ProductSimulatory.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product_simulatory")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pId")
    private int pId;
    @Column(name = "pName")
    private String pName;
    @Column(name = "pPrice")
    private double pPrice;
    @Column(name = "pQty")
    private int pQty;
    @Column(name = "userQty")
    private int userQty;

    public Product(int pId, String pName, double pPrice, int pQty) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pQty = pQty;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public int getpQty() {
        return pQty;
    }

    public void setpQty(int pQty) {
        this.pQty = pQty;
    }

    public int getUserQty() {
        return userQty;
    }

    public void setUserQty(int userQty) {
        this.userQty = userQty;
    }
}
