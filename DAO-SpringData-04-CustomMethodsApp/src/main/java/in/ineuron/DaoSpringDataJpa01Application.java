package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.ICoronoVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpa01Application.class, args);

		ICoronoVaccineMgmtService service = context.getBean(ICoronoVaccineMgmtService.class);

		service.fetchDetailsByCompany("russie").forEach(System.out::println);
		
		
		service.fetchVaccineByPriceLessThan(690.2).forEach(System.out::println);;
		

		((ConfigurableApplicationContext) context).close();
	}

}
