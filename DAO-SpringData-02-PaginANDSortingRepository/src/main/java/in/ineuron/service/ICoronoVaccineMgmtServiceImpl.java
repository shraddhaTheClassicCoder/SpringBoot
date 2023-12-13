package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.dao.ICoronoVaccineRepo;

@Service("service")
public class ICoronoVaccineMgmtServiceImpl implements ICoronoVaccineMgmtService {

	@Autowired
	ICoronoVaccineRepo repo;

	@Override
	public Iterable<CoronaVaccine> fetchAllDetails(boolean asc, String... properties) {

		System.out.println("The Implementation class is ::" + repo.getClass().getName());

		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, properties);
		
		Iterable<CoronaVaccine> listEntities =repo.findAll(sort);
		return listEntities;
	}

}