package HQL2CrudOperation.HQL2CrudOperation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HQL2CrudOperation.HQL2CrudOperation.Model.Laptop;
import HQL2CrudOperation.HQL2CrudOperation.Repository.LaptopRepository;

@Service
public class LaptopService {//Remaining

	@Autowired
	private LaptopRepository repository;
	
	public void addData(Laptop l)
	{
		repository.save(l);
	}
	//-------------------------------------------------------
	public List<Laptop> displayData()
	{
		return repository.displayData();
	}
	//----------------------------------------------------
	public void updateData(String comName)
	{
		repository.updateData(comName);
	}
	//------------------------------------------------------
	public void deleteDataByComName(String comName)
	{
		repository.deleteDataByComName(comName);
	}
	//--------------------------------------------------------
}
