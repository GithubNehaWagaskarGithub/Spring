package com.StudentApp.StudentInfo.Model;

import org.springframework.stereotype.Component;

@Component
public class StudentModel {
    private int RollNo;
    private String Name;
    private long contactNo;
    private String city;
    private double javaMarks;
    private double sqlMarks;
    private double webTechMarks;

    public StudentModel() {
    }

    public StudentModel(int rollNo, String name, long contactNo, String city, double javaMarks, double sqlMarks, double webTechMarks) {
        RollNo = rollNo;
        Name = name;
        this.contactNo = contactNo;
        this.city = city;
        this.javaMarks = javaMarks;
        this.sqlMarks = sqlMarks;
        this.webTechMarks = webTechMarks;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getJavaMarks() {
        return javaMarks;
    }

    public void setJavaMarks(double javaMarks) {
        this.javaMarks = javaMarks;
    }

    public double getSqlMarks() {
        return sqlMarks;
    }

    public void setSqlMarks(double sqlMarks) {
        this.sqlMarks = sqlMarks;
    }

    public double getWebTechMarks() {
        return webTechMarks;
    }

    public void setWebTechMarks(double webTechMarks) {
        this.webTechMarks = webTechMarks;
    }
}
