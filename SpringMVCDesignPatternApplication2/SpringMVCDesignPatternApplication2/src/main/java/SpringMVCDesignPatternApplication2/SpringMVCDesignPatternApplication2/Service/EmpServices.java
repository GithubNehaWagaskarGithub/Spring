package SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Service;

import SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Model.Employee;
import SpringMVCDesignPatternApplication2.SpringMVCDesignPatternApplication2.Repository.EmpRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmpServices implements EmpService{
    @Autowired
    private EmpRepository repository;

    @Override
    public List<Employee> displayData()
    {
        return repository.findAll();
    }
    //------------------------------------------
    @Override
    public void saveEmployee(Employee emp) {
        repository.save(emp);
    }
    //----------------------------------------------------------------
    @Override
    public Employee updateEmployee(int id) {
        Optional<Employee> optional=repository.findById(id);
        Employee emp=null;
        if(optional.isPresent())
        {
            emp=optional.get();
        }
        else {
            throw new RuntimeException("Invalid Id :"+id);
        }
        return emp;
    }
    //------------------------------------------------------------------------------

    @Override
    public void deleteEmployee(int id)
    {
        this.repository.deleteById(id);
    }
    //-------------------------------------------------------------------
}
