package in.ineuron.dao;

import org.springframework.data.repository.CrudRepository;
import in.ineuron.bo.CoronaVaccine;

public interface ICoronoVaccineRepo extends  CrudRepository<CoronaVaccine, Long> {

}
