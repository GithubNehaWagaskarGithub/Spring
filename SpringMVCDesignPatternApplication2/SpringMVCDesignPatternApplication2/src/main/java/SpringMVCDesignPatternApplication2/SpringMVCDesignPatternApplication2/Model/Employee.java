package SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "emp_database")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eId")
    private int eId;

    @Column(name = "eName")
    private String eName;

    @Column(name = "eDesignation")
    private String eDesignation;

    @Column(name = "eSal")
    private double eSal;
}
