package in.ineuron.bo;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CoronaVaccine implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long regNo;
	private String name;
	private String company;
	private Double price;
	private Integer requiredDoseCount;

	CoronaVaccine(){
		System.out.println("Hibernate obj is instantiated...");
	}
	
	
	public CoronaVaccine(long regNo, String name, String company, Double price, Integer requiredDoseCount) {

		this.regNo = regNo;
		this.name = name;
		this.company = company;
		this.price = price;
		this.requiredDoseCount = requiredDoseCount;
	}

	public long getRegNo() {
		return regNo;
	}

	public void setRegNo(long regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getRequiredDoseCount() {
		return requiredDoseCount;
	}

	public void setRequiredDoseCount(Integer requiredDoseCount) {
		this.requiredDoseCount = requiredDoseCount;
	}

	@Override
	public String toString() {
		return "CoronaVaccine [regNo=" + regNo + ", name=" + name + ", company=" + company + ", price=" + price
				+ ", requiredDoseCount=" + requiredDoseCount + "]";
	}

}
