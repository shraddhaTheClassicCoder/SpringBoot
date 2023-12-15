package in.ineuron.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import in.ineuron.bo.CoronaVaccine;

public interface ICoronoVaccineRepo extends  JpaRepository<CoronaVaccine, Long> {

	List<CoronaVaccine> findByCompany(String company);
	List<CoronaVaccine> findByCompanyEquals(String company);
	List<CoronaVaccine> findByCompanyIs(String company);

	List<CoronaVaccine> findByPriceLessThan(Double price);
}
