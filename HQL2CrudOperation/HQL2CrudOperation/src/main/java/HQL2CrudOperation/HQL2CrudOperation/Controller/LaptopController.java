package HQL2CrudOperation.HQL2CrudOperation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import HQL2CrudOperation.HQL2CrudOperation.Model.Laptop;
import HQL2CrudOperation.HQL2CrudOperation.Service.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	private LaptopService service;
	
	@PostMapping("/addData")
	public void addData(@RequestBody Laptop l)
	{
		service.addData(l);
	}
	//--------------------------------------------
	
	@GetMapping("/displayData")
	public List<Laptop> displayData()
	{
		return service.displayData(); 
	}
	//-------------------------------------------
	
	@PutMapping("/updateData/{comName}")
	public void updateData(@PathVariable("comName")String comName)
	{
		service.updateData(comName);
	}
	//------------------------------------------------------------------
	
	@DeleteMapping("/deleteData/{comName}")
	public void deleteDataByComName(@PathVariable String comName)
	{
		service.deleteDataByComName(comName);
	}
}
