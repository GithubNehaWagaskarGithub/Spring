package SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Repository;

import SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer> {
}
