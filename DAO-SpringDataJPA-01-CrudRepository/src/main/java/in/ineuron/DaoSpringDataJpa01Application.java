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

		List<CoronaVaccine> vaccines = new ArrayList<CoronaVaccine>();
		vaccines.add(new CoronaVaccine(0, "Sputik", "russie", 2309.0, 2));
		vaccines.add(new CoronaVaccine(0, "pyzer", "pyxwer", 690.20, 2));
		vaccines.add(new CoronaVaccine(0, "moderena", "moderena", 2309.0, 2));
		vaccines.add(new CoronaVaccine(0, "covaccine", "IND", 500.0, 2));

		Iterable<CoronaVaccine> listVaccines = service.registerBatch(vaccines);

		listVaccines.forEach(vaccine -> {
			System.out.println(vaccine.getRegNo());
		});

		/*
		 * System.out.println("The Vaccine Count is:: " + service.getVaccineCount());
		 * 
		 * 
		 * System.out.println("The Available id is present ::"+service.
		 * checkAvailablityByRegNo(3L));
		 */

		/* service.fetchAllDetails().forEach(System.out::println); */

		/*
		 * List<Long> ids=new ArrayList<Long>();
		 * 
		 * ids.add(1L); ids.add(2L); ids.add(3L); ids.add(4L);
		 * 
		 * Iterable<CoronaVaccine> records=service.fetchAllDetailsById(ids);
		 * 
		 * records.forEach(System.out::println);
		 */

		/*
		 * Optional<CoronaVaccine> optional = service.fetchVaccineById(10L);
		 * 
		 * if (optional.isPresent()) { System.out.println(optional.get());
		 * 
		 * optional.orElseThrow(() -> new IllegalArgumentException("Record not found"));
		 * }
		 */

		/* System.out.println(service.deleteById(4L)); */

		/*
		 * System.out.println(service.removeVaccineByObject(new CoronaVaccine(3L,
		 * "russie", "sputik", 2309.00, 2)));
		 */

		/*
		 * List<Long> list = new ArrayList<Long>(); list.add(1L); list.add(2L);
		 * 
		 * System.out.println(service.removeVaccineById(list));
		 */

		((ConfigurableApplicationContext) context).close();
	}

}
