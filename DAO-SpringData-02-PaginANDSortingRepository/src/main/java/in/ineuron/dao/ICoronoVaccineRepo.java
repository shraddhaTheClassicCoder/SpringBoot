package in.ineuron.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronoVaccineRepo extends  PagingAndSortingRepository<CoronaVaccine, Long> {

}
