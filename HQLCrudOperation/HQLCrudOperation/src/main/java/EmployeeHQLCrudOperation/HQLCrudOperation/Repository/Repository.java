package EmployeeHQLCrudOperation.HQLCrudOperation.Repository;

import EmployeeHQLCrudOperation.HQLCrudOperation.Model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<Employee,Integer> {

    @Query("from Employee e where e.eName=:eName")
    public List<Employee> displayDataByName(@Param(value = "eName") String eName);
    //-------------------------------------------------------------------------------

    @Query("update Employee e set e.eName=:prefix || eName where e.eGender=:gender")
    //@Query("update Employee e set e.empName=:prefix || empName where e.empGender=:gender")
    @Modifying
    @Transactional
    public void updateData(@Param(value = "prefix") String prefix,@Param(value = "gender") String gender);
    //--------------------------------------------------------------------------------------------------------
    @Query("from Employee e where e.eDec=:desig and e.eSal>:sal")
    public List<Employee> displayData1(@Param("desig") String desig,@Param("sal") double sal);
    //-----------------------------------------------------------------------------------------

    @Query("select distinct e.eDec from Employee e")
    public List<String> displayDesig();
    //---------------------------------------------------------------------------------------
    @Query("select eName from Employee e where  e.eName like %:str% ")
    public List<String> displayNameStartsWithPerCharacter(@Param("str") String str);
    //---------------------------------------------------------------------------------------
    @Query("update Employee e set e.eSal=e.eSal+(e.eSal*:per)")
    @Modifying      //@Modifying And @Transactional these annotations is used for to update tha data inside Database
    @Transactional
    public int HikeEmpSalBy15(@Param("per") double per);
    //------------------------------------------------------------------------------------------
    @Query("delete from Employee e where e.eName=:name")
    @Modifying
    @Transactional
    public void deleteDataByName(@Param("name") String name);
    //--------------------------------------------------------------


}
