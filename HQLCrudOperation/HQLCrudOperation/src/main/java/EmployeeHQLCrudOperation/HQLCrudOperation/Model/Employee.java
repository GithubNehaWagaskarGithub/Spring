package EmployeeHQLCrudOperation.HQLCrudOperation.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_hql")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eId")
    private int eId;
    @Column(name = "eName")
    private String eName;
    @Column(name = "eSal")
    private double eSal;
    @Column(name = "eDec")
    private String eDec;
    @Column(name = "eGender")
    private String eGender;

    public Employee() {
    }

    public Employee(int eId, String eName, double eSal, String eDec, String eGender) {
        this.eId = eId;
        this.eName = eName;
        this.eSal = eSal;
        this.eDec = eDec;
        this.eGender = eGender;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double geteSal() {
        return eSal;
    }

    public void seteSal(double eSal) {
        this.eSal = eSal;
    }

    public String geteDec() {
        return eDec;
    }

    public void seteDec(String eDec) {
        this.eDec = eDec;
    }

    public String geteGender() {
        return eGender;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }
}
