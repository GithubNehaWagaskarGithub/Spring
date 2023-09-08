package Demo.Program1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import Demo.Program1.Model.CarModel;

@Component
@Service
public class CarService {
	@Autowired
	private CarModel carModel;
	
	List<CarModel> carList=new ArrayList<>();
	
	{
		CarModel c1=new CarModel(101,"HondaCity",3499999.99);
		CarModel c2=new CarModel(102,"Verna",4599999.99);
		CarModel c3=new CarModel(103,"Swift",2599999.99);
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
	}
	
	public List<CarModel> displayCars()
	{
		return carList;
	}
	
	public CarModel displayOneCar(int id)
	{
		CarModel temp=null;
		for(CarModel c:carList)
		{
			if(c.getCarId()==id)
			{
				temp=c;
				break;
			}
		}
		return temp;
	}
	
}
