package HQL1CrudOperation.HQL1CrudOperation.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_hql")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sId")
    private int sId;
    @Column(name = "sName")
    private String sName;
    @Column(name = "sAge")
    private int sAge;
    @Column(name = "sPer")
    private double sPer;
    @Column(name = "sGender")
    private String sGender;

    public Student() {
    }

    public Student(int sId, String sName, int sAge, double sPer, String sGender) {
        this.sId = sId;
        this.sName = sName;
        this.sAge = sAge;
        this.sPer = sPer;
        this.sGender = sGender;
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

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public double getsPer() {
        return sPer;
    }

    public void setsPer(double sPer) {
        this.sPer = sPer;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }
}
