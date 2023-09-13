package HQL1CrudOperation.HQL1CrudOperation.Service;

import HQL1CrudOperation.HQL1CrudOperation.Model.Student;
import HQL1CrudOperation.HQL1CrudOperation.Repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudService {

    @Autowired
    private StudRepository repository;
    public void addData(Student s)
    {
        repository.save(s);
    }
    //------------------------------------------------------
    public List<Student> displayData()
    {
        return repository.findAll();
    }
    //------------------------------------------------------
    public List<Student> displayDataByName(String name)
    {
        return repository.displayByName(name);
    }
    //--------------------------------------------------------

    public void updateNameByGender(String prefix,String gender)
    {
        repository.updateNameByGender(prefix, gender);
    }
    //-----------------------------------------------------------
    public List<Student> displayDataWhosePerGenderAndAgeGreaterThanPerAge(String gender,int age)
    {
        return repository.displayDataWhosePerGenderAndAgeGreaterThanPerAge(gender, age);
    }
    //------------------------------------------------------------------------------------------------

    public List<String> displayDistinctName()
    {
        return repository.displayDistinctName();
    }
    //------------------------------------------------
    public List<Integer> displayDistinctAges()
    {
        return repository.displayDistinctAges();
    }
    //------------------------------------------------
    public List<String> displayNamePresentPerCharacter(String ch)
    {
        return repository.displayNamePresentPerCharacter(ch);
    }
    //-----------------------------------------------------------------
    public List<String> displayNameStartsWithPerCharacter(String ch)
    {
        return repository.displayNameStartsWithPerCharacter(ch);
    }
    //-----------------------------------------------------------------

    public int updatePercentagesByAdding10MarksExtra(double per,double extraMarks)
    {
        return repository.updatePercentagesByAdding10MarksExtra(per, extraMarks);
    }
    //----------------------------------------------------------------------------

    public void deleteDataByName(String name)
    {
        repository.deleteDataByName(name);
    }
    //--------------------------------------
}
