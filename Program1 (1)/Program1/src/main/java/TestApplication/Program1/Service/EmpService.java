package TestApplication.Program1.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import TestApplication.Program1.Model.EmpModel;

@Component
@org.springframework.stereotype.Service
public class EmpService {
	
	@Autowired
	private EmpModel model;
	
	List<EmpModel> empList=new ArrayList<>();
	
	{
		EmpModel m1=new EmpModel(101,"Aniket","Research",24999.99,"Male");
		EmpModel m2=new EmpModel(102,"Akshay","Sales",34999.99,"Male");
		EmpModel m3=new EmpModel(103,"Manisha","Research",38999.99,"Female");
		EmpModel m4=new EmpModel(104,"Chetan","Accounting",88888.99,"Male");
		EmpModel m5=new EmpModel(105,"Rohan","Developer",54999.99,"Male");
		EmpModel m6=new EmpModel(106,"Pooja","Sales",43999.99,"Female");
		empList.add(m1);
		empList.add(m2);
		empList.add(m3);
		empList.add(m4);
		empList.add(m5);
		empList.add(m6);
	}
	
	public List<EmpModel> displayAllData()
	{
		return empList;
	}
	//------------------------------------------------------------------------------
	
	public String addData(EmpModel e)
	{
		if(empList.add(e))
		{
			return "Data Added";
		}
		else
		{
			return "Data Not Added";
		}
	}
	//------------------------------------------------------------------------------
	
	public Set<String> displayAllDepartments()
	{
		Set<String> department=new HashSet<>();
		for(EmpModel e:empList)
		{
			department.add(e.getEmpDept());
		}
		return department;
	}
	//-------------------------------------------------------------------------------
	
	public String updateSalaryInSalesDepartment(double percentage) 
	{
        for (EmpModel emp : empList)
        {
            if ("Sales".equalsIgnoreCase(emp.getEmpDept()))
            {
                double currentSalary = emp.getEmpSal();
                double updatedSalary = currentSalary * (1 + (percentage / 100.0)); // Increase salary by 10%.
                emp.setEmpSal(updatedSalary);
            }
        }
		return "Salary Updated for Sales department By 10%";
    }
	//-------------------------------------------------------------------------------
	
	public Set<String> displayAllEmpSalBetweenRange(double minSal,double maxSal)
	{
		Set<String> empName=new HashSet<>();
		for(EmpModel e:empList)
		{
			if(e.getEmpSal()<=maxSal && e.getEmpSal()>=minSal)
			{
				empName.add(e.getEmpName());
			}
		}
		return empName;
	}
	//-------------------------------------------------------------------------------
	
	public String moveAllSalesDepartmentsToAccountingDepartments()
	{
		for(EmpModel e:empList)
		{
			if("Sales".equalsIgnoreCase(e.getEmpDept()))
			{
				e.setEmpDept("Accounting");
			}
		}
		return "Move All Sales Departments To Accounting Departments";
	}
	//-------------------------------------------------------------------------------
	
	public String fireSpecificDepartments(String department)
	{
		boolean status=false;
		for(EmpModel e:empList)
		{
			if(e.getEmpDept().equalsIgnoreCase(department))
			{
				empList.remove(e);
				status=true;
				break;
			}
		}
		if(status=true)
		{
			return "Fire Specific Departments";
		}
		else
		{
			return "Something Went Wrong";
		}
	}
	//---------------------------------------------------------------------------------------
	
	public Map<Integer,String> displayIdWithNameOfAllEmp()
	{
		Map<Integer,String> map=new HashMap<>();
		{
			for(EmpModel e:empList)
			{
				map.put(e.getEmpId(), e.getEmpName());
			}
		}
		return map;
	}
	//---------------------------------------------------------------------------------------------
}
