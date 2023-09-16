package SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Controller;

import java.util.List;

import SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Model.Employee;
import SpringEmployeeMVCDesignPattern.SpringEmployeeMVCDesignPattern.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String displayEmp(Model model){
        model.addAttribute("listEmplyees", employeeService.getAllEmp());
        return "index";
    }
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        //create object of model
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "new_employee";
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        //Save employee to database
        employeeService.saveEmp(employee);
        return "redirect:/";
    }

    @GetMapping("/showFormUpdate/{id}")
    public String updateEmployee(@PathVariable(value="id")long id, Model model) {
        //get employee from service
        Employee employee = employeeService.getEmpById(id);
        model.addAttribute(employee);
        return "update_employee";

    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value="id") long id,Model model) {
        this.employeeService.deleteEmp(id);
        return "redirect:/";

    }
}
