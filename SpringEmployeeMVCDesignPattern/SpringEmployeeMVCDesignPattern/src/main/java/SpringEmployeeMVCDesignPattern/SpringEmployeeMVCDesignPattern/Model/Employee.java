package SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="employee_database1")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private long id;

    @Column(name = "emp_firstName")
    private String firstName;

    @Column(name = "emp_lastName")
    private String lastName;

    @Column(name = "emp_email")
    private String email;

}