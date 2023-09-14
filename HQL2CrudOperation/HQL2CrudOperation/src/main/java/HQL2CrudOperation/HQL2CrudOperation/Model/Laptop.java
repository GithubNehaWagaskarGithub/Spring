package HQL2CrudOperation.HQL2CrudOperation.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laptop_hql_eclipse")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="lapNO")
	private int lapNo;
	
	@Column(name="lapCompany")
	private String lapCompany;
	
	@Column(name="eachLapPrice")
	private double eachLapPrice;
	
	@Column(name="noOfLaptop")
	private int noOfLaptop;
	
	@Column(name="lapTotalPrice")
	private double lapTotalPrice;
	
	public Laptop() {
		
	}

	public Laptop(int lapNo, String lapCompany, double eachLapPrice, int noOfLaptop, double lapTotalPrice) {
		super();
		this.lapNo = lapNo;
		this.lapCompany = lapCompany;
		this.eachLapPrice = eachLapPrice;
		this.noOfLaptop = noOfLaptop;
		this.lapTotalPrice = lapTotalPrice;
	}

	public int getLapNo() {
		return lapNo;
	}

	public void setLapNo(int lapNo) {
		this.lapNo = lapNo;
	}

	public String getLapCompany() {
		return lapCompany;
	}

	public void setLapCompany(String lapCompany) {
		this.lapCompany = lapCompany;
	}

	public double getEachLapPrice() {
		return eachLapPrice;
	}

	public void setEachLapPrice(double eachLapPrice) {
		this.eachLapPrice = eachLapPrice;
	}

	public int getNoOfLaptop() {
		return noOfLaptop;
	}

	public void setNoOfLaptop(int noOfLaptop) {
		this.noOfLaptop = noOfLaptop;
	}

	public double getLapTotalPrice() {
		return lapTotalPrice;
	}

	public void setLapTotalPrice(double lapTotalPrice) {
		this.lapTotalPrice = lapTotalPrice;
	}
}
