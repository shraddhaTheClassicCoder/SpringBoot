package in.ineuron;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Company;
import in.ineuron.comp.Company1;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		Company comapany1 = context.getBean(Company.class);
		System.out.println(comapany1);
		
		System.in.read();
		
		Company1 comapany2 = context.getBean(Company1.class);
		System.out.println(comapany2);
		

		((ConfigurableApplicationContext) context).close();

	}

}
