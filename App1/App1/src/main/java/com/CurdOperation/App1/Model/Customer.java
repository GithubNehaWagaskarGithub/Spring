package com.CurdOperation.App1.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cId")
    private int cId;
    @Column(name = "cName")
    private String cName;
    @Column(name = "cAdd")
    private String cAdd;

    public Customer()
    {

    }

    public Customer(int cId, String cName, String cAdd) {
        this.cId = cId;
        this.cName = cName;
        this.cAdd = cAdd;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAdd() {
        return cAdd;
    }

    public void setcAdd(String cAdd) {
        this.cAdd = cAdd;
    }
}
