package Demo2.Program2.Model;

import org.springframework.stereotype.Component;

@Component
public class LaptopModel {
	private int lapId;
	private String lapName;
	private double lapPrice;
	
	public LaptopModel() {
		
	}

	public LaptopModel(int lapId, String lapName, double lapPrice) {
		this.lapId = lapId;
		this.lapName = lapName;
		this.lapPrice = lapPrice;
	}

	public int getLapId() {
		return lapId;
	}

	public void setLapId(int lapId) {
		this.lapId = lapId;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	public double getLapPrice() {
		return lapPrice;
	}

	public void setLapPrice(double lapPrice) {
		this.lapPrice = lapPrice;
	}
}
