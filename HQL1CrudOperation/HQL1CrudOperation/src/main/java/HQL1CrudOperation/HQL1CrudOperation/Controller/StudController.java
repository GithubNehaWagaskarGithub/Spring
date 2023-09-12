package HQL1CrudOperation.HQL1CrudOperation.Controller;

import HQL1CrudOperation.HQL1CrudOperation.Model.Student;
import HQL1CrudOperation.HQL1CrudOperation.Service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudController {

    @Autowired
    private StudService service;

    @PostMapping("/addData")
    public void addData(@RequestBody Student s)
    {
        service.addData(s);
    }
    //------------------------------------------------
    @GetMapping("/displayData")
    public List<Student> displayData()
    {
        return service.displayData();
    }
    //-------------------------------------------------
    @GetMapping("/displayDataByName")
    public  List<Student> displayDataByName(@RequestParam String name)
    {
        return service.displayDataByName(name);
    }
    //--------------------------------------------------------------------
    @PutMapping("/updateNameByGender")
    public void updateNameByGender(@RequestParam String prefix,@RequestParam String gender)
    {
        service.updateNameByGender(prefix, gender);
    }
    //-----------------------------------------------------------------------------------------
    @GetMapping("/displayDataWhoseGenderFemaleAndAgeGreaterThan23")
    public List<Student> displayDataWhosePerGenderAndAgeGreaterThanPerAge(@RequestParam String gender,@RequestParam int age)
    {
        return service.displayDataWhosePerGenderAndAgeGreaterThanPerAge(gender, age);
    }
    //----------------------------------------------------------------------------------------------------------------------
    @GetMapping("/displayDistinctName")
    public List<String> displayDistinctName()
    {
        return service.displayDistinctName();
    }
    //--------------------------------------------------
    @GetMapping("displayDistinctAges")
    public List<Integer> displayDistinctAges()
    {
        return service.displayDistinctAges();
    }
    //-------------------------------------------------
    @GetMapping("/displayNamePresentPerCharacter")
    public List<String> displayNamePresentPerCharacter(@RequestParam String ch)
    {
        return service.displayNamePresentPerCharacter(ch);
    }
    //-------------------------------------------------------------------------------
    @GetMapping("/displayNameStartsWithPerCharacter")
    public List<String> displayNameStartsWithPerCharacter(@RequestParam String ch)
    {
        return service.displayNameStartsWithPerCharacter(ch);
    }
    //------------------------------------------------------------------------------------
    @PutMapping("/updatePercentagesByAdding10MarksExtra")
    public int updatePercentagesByAdding10MarksExtra(@RequestParam double per,@RequestParam double extraMarks)
    {
        return service.updatePercentagesByAdding10MarksExtra(per, extraMarks);
    }
    //-------------------------------------------------------------------------------------------------------------
    @DeleteMapping("/deleteDataById/{id}")
    public void deleteDataById(@PathVariable(value = "id") int id)
    {
        service.deleteDataById(id);
    }
    //------------------------------------------------------------------
}
