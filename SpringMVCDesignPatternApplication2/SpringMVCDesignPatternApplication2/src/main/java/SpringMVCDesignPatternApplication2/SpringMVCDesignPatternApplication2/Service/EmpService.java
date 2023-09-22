package SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Service;

import SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Model.Employee;

import java.util.List;

public interface EmpService {

    public List<Employee> displayData();
    //---------------------------------------
    public void saveEmployee(Employee emp);
    //---------------------------------------
    public Employee updateEmployee(int id);
    //---------------------------------------
    public void deleteEmployee(int id);
}
