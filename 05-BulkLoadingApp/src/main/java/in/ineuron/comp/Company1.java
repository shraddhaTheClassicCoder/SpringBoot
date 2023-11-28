package in.ineuron.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.info")
public class Company1 {

	private String name;
	private String type;
	private Integer capacity;
	
	static {
		System.out.println("Company1 .class file is laoding....");
	}
	
	public Company1() {
		System.out.println("Company1 class is instantiated...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Company1.setName()");
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("Company1.setType()");
		this.type = type;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		System.out.println("Company1.setCapacity()");
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Company1 [name=" + name + ", type=" + type + ", capacity=" + capacity + "]";
	}
	
	
	
	
	
	
}
