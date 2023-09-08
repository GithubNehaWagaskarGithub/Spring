package Demo.Program1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import Demo.Program1.Model.CarModel;
import Demo.Program1.Service.CarService;

@Controller
@ResponseBody
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@GetMapping("/displayCars")//http://localhost:8080/displayCars
	public List<CarModel> displayCars()
	{
		return carService.displayCars();
	}
	
	@GetMapping("/displayCars/{id}")
	public CarModel displayOneCar(@PathVariable int id)
	{
		return carService.displayOneCar(id);
	}
	
}
