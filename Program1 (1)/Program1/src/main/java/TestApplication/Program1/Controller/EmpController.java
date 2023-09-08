package TestApplication.Program1.Controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import TestApplication.Program1.Model.EmpModel;
import TestApplication.Program1.Service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	//Display All Data
	@GetMapping("/displayAllData")
	public List<EmpModel> displayAllData()
	{
		return service.displayAllData();
	}
	//---------------------------------------------------------------------------------
	//Add Data
	@PostMapping("/addData")
	public String addData(@RequestBody EmpModel e)
	{
		return service.addData(e);
	}
	//----------------------------------------------------------------------------------
	//display Departments
	@GetMapping("/displayAllDepartments")
	public Set<String> displayAllDepartments()
	{
		return service.displayAllDepartments();
	}
	//--------------------------------------------------------------------------------
	//update Salary In Sales Department by 10%
	@PostMapping("/updateSalaryInSalesDepartment")
    public String updateSalaryInSalesDepartment() {
        double percentage = 10.0; // You can adjust the percentage as needed.
        service.updateSalaryInSalesDepartment(percentage);
        return "Salary Updated for Sales department By 10%";
    }
	//---------------------------------------------------------------------------------
	//display All EmpName whose Salary is between Range
	@GetMapping("/displayAllEmpSalBetweenRange")
	public Set<String> displayAllEmpSalBetweenRange(@RequestParam double minSal,double maxSal)
	{
		return service.displayAllEmpSalBetweenRange(minSal, maxSal);
	}
	//---------------------------------------------------------------------------------
	//Move All Sales Departments To Accounting Departments
	@PostMapping("/moveAllSalesDepartmentsToAccountingDepartments")
	public String moveAllSalesDepartmentsToAccountingDepartments()
	{
		return service.moveAllSalesDepartmentsToAccountingDepartments();
	}
	//---------------------------------------------------------------------------------
	//fireSpecificDepartments
	@DeleteMapping("/fireSpecificDepartment/{department}")
	public String fireSpecificDepartments(@PathVariable String department)
	{
		return service.fireSpecificDepartments(department);
	}
	//---------------------------------------------------------------------------------
	//display Id With Name Of All Employee
	@GetMapping("/displayIdWithNameOfAllEmp")
	public Map<Integer,String> displayIdWithNameOfAllEmp()
	{
		return service.displayIdWithNameOfAllEmp();
	}
	//------------------------------------------------------------------------------------
}
