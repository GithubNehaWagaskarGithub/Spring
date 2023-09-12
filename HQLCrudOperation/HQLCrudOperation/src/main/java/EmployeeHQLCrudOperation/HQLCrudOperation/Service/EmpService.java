package EmployeeHQLCrudOperation.HQLCrudOperation.Service;

import EmployeeHQLCrudOperation.HQLCrudOperation.Model.Employee;
import EmployeeHQLCrudOperation.HQLCrudOperation.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
public class EmpService {
    @Autowired
    private Repository repository;

    public void addData(Employee e)
    {
        repository.save(e);
    }
    //-----------------------------------
    public List<Employee> displayAllData()
    {
        return repository.findAll();
    }
    //-------------------------------------
    public List<Employee> displayDataByName(String eName)
    {
        return repository.displayDataByName(eName);
    }
    //------------------------------------------------------

    public void updateData(String prefix,String gender)
    {
        repository.updateData(prefix, gender);
    }
    //-----------------------------------------------------

    public List<Employee> displayData1(String desig,double sal)
    {
        return repository.displayData1(desig, sal);
    }
    //-----------------------------------------------------------
    public List<String> displayDesig()
    {
        return  repository.displayDesig();
    }
    //--------------------------------------------------------------
    public List<String> displayNameStartsWithPerCharacter(String str)
    {
        return repository.displayNameStartsWithPerCharacter(str);
    }
    //----------------------------------------------------------
    public int HikeEmpSalBy15(double per)
    {
        return repository.HikeEmpSalBy15(per);
    }
    //---------------------------------------------------------
    public void deleteDataById(int id)
    {
        repository.deleteDataById(id);
    }
    //----------------------------------------------------------
}
