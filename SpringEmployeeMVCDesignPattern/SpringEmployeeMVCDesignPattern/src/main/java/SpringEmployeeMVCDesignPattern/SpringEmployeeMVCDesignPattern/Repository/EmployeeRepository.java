package SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Repository;

import SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
