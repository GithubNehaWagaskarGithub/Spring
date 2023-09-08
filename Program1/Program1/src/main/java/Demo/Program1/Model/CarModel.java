package Demo.Program1.Model;

import org.springframework.stereotype.Component;

@Component
public class CarModel {

	private int carId;
	private String carName;
	private double carPrice;
	
	public CarModel() {
		
	}
	
	public CarModel(int carId, String carName, double carPrice) {
		this.carId = carId;
		this.carName = carName;
		this.carPrice = carPrice;
	}
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
}
