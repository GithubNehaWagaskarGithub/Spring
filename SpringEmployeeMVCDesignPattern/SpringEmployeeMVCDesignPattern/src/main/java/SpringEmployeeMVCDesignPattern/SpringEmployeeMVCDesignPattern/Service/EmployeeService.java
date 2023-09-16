package SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Service;

import SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Model.Employee;

import java.util.List;



public interface EmployeeService {
    public List<Employee> getAllEmp();
    public void saveEmp(Employee emp);
    public Employee getEmpById(long id);
    public void deleteEmp(long id);
}
