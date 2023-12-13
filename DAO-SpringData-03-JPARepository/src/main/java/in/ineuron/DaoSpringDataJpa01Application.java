package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.service.ICoronoVaccineMgmtService;

@SpringBootApplication
public class DaoSpringDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DaoSpringDataJpa01Application.class, args);

		ICoronoVaccineMgmtService service = context.getBean(ICoronoVaccineMgmtService.class);

		/*
		 * CoronaVaccine vaccine = new CoronaVaccine();
		 * 
		 * vaccine.setPrice(690.2);
		 * 
		 * service.searchVaccineByGivenData(vaccine, true,
		 * "price").forEach(System.out::println);
		 */

		try {
			CoronaVaccine vaccine = service.getVaccineById(10L);
			if (vaccine != null) {
				System.out.println("Vaccine Details Are::" + vaccine);
			} else {
				System.out.println("Record not available for given Id"+vaccine.getRegNo());
			}

		} catch (DataAccessException e) {

			e.printStackTrace();
		}

		((ConfigurableApplicationContext) context).close();
	}

}
