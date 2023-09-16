package SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Model.Employee;
import SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EmpService implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmp() {

        return employeeRepository.findAll();
    }

    @Override
    public void saveEmp(Employee emp) {

        this.employeeRepository.save(emp);

    }

    @Override
    public Employee getEmpById(long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if(optional.isPresent()) {
            employee = optional.get();
        }else {
            throw new RuntimeException("Employee not found for id :"+id);
        }
        return employee;
    }

    @Override
    public void deleteEmp(long id) {

        this.employeeRepository.deleteById(id);
    }

}
