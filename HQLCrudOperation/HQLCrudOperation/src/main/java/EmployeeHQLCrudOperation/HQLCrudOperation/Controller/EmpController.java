package EmployeeHQLCrudOperation.HQLCrudOperation.Controller;

import EmployeeHQLCrudOperation.HQLCrudOperation.Model.Employee;
import EmployeeHQLCrudOperation.HQLCrudOperation.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService service;

    @PostMapping("/addData")
    public void addData(@RequestBody Employee e)
    {
        service.addData(e);
    }
    //-------------------------------------------------

    @GetMapping("/displayAllData")
    public List<Employee> displayAllData()
    {
        return service.displayAllData();
    }
    //-------------------------------------------------

    @GetMapping("/displayDataByName/{eName}")
    public List<Employee> displayDataByName(@PathVariable String eName)
    {
        return service.displayDataByName(eName);
    }
    //---------------------------------------------------------------------

    @PutMapping("/updateData")
    public void updateData(@RequestParam String prefix,@RequestParam String gender)
    {
        service.updateData(prefix,gender);
    }
    //-----------------------------------------------------------------------------
    @GetMapping("/displayData1")
    public List<Employee> displayData1(@RequestParam String desig,@RequestParam double sal)
    {
        return service.displayData1(desig,sal);
    }
    //-----------------------------------------------------------------------------------

    @GetMapping("/displayDesig")
    public List<String> displayDesig()
    {
        return service.displayDesig();
    }
    //---------------------------------------------------------------------------------

    @GetMapping("/displayNameWithPerCharacter")
    public List<String> displayNameStartsWithPerCharacter(@RequestParam String str)
    {
        return service.displayNameStartsWithPerCharacter(str);
    }
    //---------------------------------------------------------------------------

    @PutMapping("/HikeEmpSalBy15")
    public int HikeEmpSalBy15(@RequestParam double per)
    {
        return service.HikeEmpSalBy15(per);
    }
    //------------------------------------------------------------------------------
    @DeleteMapping("/deleteDataById/{id}")
    public void deleteDataById(@PathVariable(value = "id") int id)
    {
        service.deleteDataById(id);
    }
    //--------------------------------------------------------------------------
}
