package in.ineuron.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import in.ineuron.bo.CoronaVaccine;

public interface ICoronoVaccineRepo extends  JpaRepository<CoronaVaccine, Long> {

}
