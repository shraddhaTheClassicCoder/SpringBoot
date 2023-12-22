package in.ineuron;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.service.ICoronoVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpa01Application.class, args);

		ICoronoVaccineMgmtService service = context.getBean(ICoronoVaccineMgmtService.class);

		service.fetchAllDetails(false, "price", "name").forEach((vaccine) -> {
			System.out.println(vaccine.getName() + "==" + vaccine.getCompany());
		});
		
		((ConfigurableApplicationContext) context).close();
	}

}
