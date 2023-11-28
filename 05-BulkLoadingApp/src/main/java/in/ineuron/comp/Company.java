package in.ineuron.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.info")
public class Company {

	private String name;
	private String type;
	private Integer capacity;
	
	static {
		System.out.println("Company .class file is laoding....");
	}
	
	public Company() {
		System.out.println("Company class is instantiated...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Company.setName()");
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("Company.setType()");
		this.type = type;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		System.out.println("Company.setCapacity()");
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", type=" + type + ", capacity=" + capacity + "]";
	}
	
	
	
	
	
	
}
