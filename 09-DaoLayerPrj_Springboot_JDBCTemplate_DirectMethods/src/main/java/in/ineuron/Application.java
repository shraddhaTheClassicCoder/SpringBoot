package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.service.employeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		
		employeeService service=context.getBean(employeeService.class);
		
		int rowCount=service.addBonusToEmpByDesg("batsman", 1000);
		System.out.println("RoCount is:: "+rowCount);
	}

}
