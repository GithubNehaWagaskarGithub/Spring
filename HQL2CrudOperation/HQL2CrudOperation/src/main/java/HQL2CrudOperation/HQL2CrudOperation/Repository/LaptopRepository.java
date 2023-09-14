package HQL2CrudOperation.HQL2CrudOperation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import HQL2CrudOperation.HQL2CrudOperation.Model.Laptop;
import jakarta.transaction.Transactional;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Integer>
{

	@Query("from Laptop l")
	public List<Laptop> displayData();
	//--------------------------------------
	
	@Query("update Laptop l set l.lapTotalPrice=l.noOfLaptop*l.eachLapPrice where l.lapCompany=:comName")
	@Modifying
	@Transactional
	public void updateData(@Param("comName")String comName);
	//----------------------------------------------------------------------------------------------------
	
	@Query("delete from Laptop l where l.lapCompany=:comName")
	@Modifying
	@Transactional
	public void deleteDataByComName(@Param("comName")String comName);
	//--------------------------------------------------------------------
}
