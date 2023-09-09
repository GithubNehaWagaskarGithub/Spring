package com.project2.crudOperation.Model;

import jakarta.persistence.*;
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "st_generator")
    @SequenceGenerator(name = "st_generator",initialValue = 101,allocationSize = 1)
    @Column(name = "sId")
    private int sId;
    @Column(name = "sName")
    private String sName;
    @Column(name = "sAdd")
    private String sAdd;

    public Student() {
    }

    public Student(String sName, String sAdd) {
        this.sName = sName;
        this.sAdd = sAdd;
    }

    public Student(int sId, String sName, String sAdd) {
        this.sId = sId;
        this.sName = sName;
        this.sAdd = sAdd;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAdd() {
        return sAdd;
    }

    public void setsAdd(String sAdd) {
        this.sAdd = sAdd;
    }
}
