package HQL1CrudOperation.HQL1CrudOperation.Repository;

import HQL1CrudOperation.HQL1CrudOperation.Model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface StudRepository extends JpaRepository<Student,Integer> {

    @Query("from Student s where s.sName=:name")
    public List<Student> displayByName(@Param("name") String name);
    //------------------------------------------------------------------

    @Query("update Student s set s.sName=:prefix || s.sName where s.sGender=:gender")
    @Modifying
    @Transactional
    public void updateNameByGender(@Param("prefix") String prefix,@Param("gender") String gender);
    //----------------------------------------------------------------------------------------------

    @Query("from Student s where s.sGender=:gender and s.sAge>:age")
    public List<Student> displayDataWhosePerGenderAndAgeGreaterThanPerAge(@Param("gender") String gender,@Param("age") int age);
    //--------------------------------------------------------------------------------------------------------------------------

    @Query("select distinct s.sName from Student s")
    public List<String> displayDistinctName();
    //--------------------------------------------------------------

    @Query("select distinct s.sAge from Student s")
    public List<Integer> displayDistinctAges();
    //----------------------------------------------------------

    @Query("select sName from Student s where s.sName like %:ch%")
    public List<String> displayNamePresentPerCharacter(@Param("ch") String ch);
    //------------------------------------------------------------------------------

    @Query("select sName from Student s where s.sName like :ch%")// endsWith=%:ch
    public List<String> displayNameStartsWithPerCharacter(@Param("ch") String ch);
    //----------------------------------------------------------------------------------

    @Query("update Student s set s.sPer=s.sPer+:extraMarks where s.sPer<=:per")
    @Modifying
    @Transactional
    public int updatePercentagesByAdding10MarksExtra(@Param("per") double per,@Param("extraMarks") double extraMarks);
    //-----------------------------------------------------------------------------------------------------------------

    @Query("delete from Student s where s.sName=:name")
    @Modifying
    @Transactional
    public void deleteDataByName(@Param("name") String name);
    //--------------------------------------------------------------
}
