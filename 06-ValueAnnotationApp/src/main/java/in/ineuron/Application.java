package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.BillGenerator;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		
		BillGenerator bill=context.getBean(BillGenerator.class);
		
		System.out.println(bill);
		
		((ConfigurableApplicationContext) context).close();
	}

}
