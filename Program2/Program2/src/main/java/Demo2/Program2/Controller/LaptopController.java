package Demo2.Program2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Demo2.Program2.Model.LaptopModel;
import Demo2.Program2.Service.LaptopService;

@RestController
public class LaptopController {
	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("/displayAllLaptop")
	public List<LaptopModel> displayAllData()
	{
		return laptopService.displayAllData();
	}
	//----------------------------------------------------------------------------
	
	@GetMapping("/displayAllLaptop/{id}")
	public LaptopModel displayDataById(@PathVariable int id )
	{
		return laptopService.displayDataById(id);
	}
	//-----------------------------------------------------------------------------
	
	@GetMapping("/displayAllLaptops/{lName}")
	public LaptopModel displayDataByName(@PathVariable(value="lName") String name)
	{
		return laptopService.displatDataByName(name);
	}
	//----------------------------------------------------------------------------
	
	@PostMapping("/addData")
	public String addDataByEndUser(@RequestBody LaptopModel l)
	{
		return laptopService.addDataByEndUser(l);
	}
	//---------------------------------------------------------------------------
	
	@PutMapping("/updateData")
	public String updateData(@RequestParam int id,double price) 
	{
		return laptopService.updateData(id,price);
	}
	//----------------------------------------------------------------------------
	
	@DeleteMapping("/deleteData")
	public String deleteData(@RequestParam int id)
	{
		return laptopService.deleteData(id);
	}
	//---------------------------------------------------------------------------
	
	@PutMapping("/updateDataByName")
	public String updateDataByName(@RequestParam String name,double price)
	{
		return laptopService.updateDataByName(name, price);
	}
	//---------------------------------------------------------------------------
	
	@DeleteMapping("/deleteDataByName")
	public String deleteDataByName(@RequestParam String name)
	{
		return laptopService.deleteDataByName(name);
	}
	//----------------------------------------------------------------------------
	
	@PostMapping("/addData1")
	public String addData1(@RequestBody LaptopModel l)
	{
		return laptopService.addData1(l);
	}
	//---------------------------------------------------------------------------
	
	@GetMapping("/displayDataById1/{id}")
	public LaptopModel displayDataById1(@PathVariable int id)
	{
		return laptopService.displayDataById1(id);
	}
	//--------------------------------------------------------------------------
	
	@GetMapping("displayDataByName1/{name}")
	public LaptopModel displayDataByName1(@PathVariable String name)
	{
		return laptopService.displayDataByName1(name);
	}
	//-------------------------------------------------------------------------
}
