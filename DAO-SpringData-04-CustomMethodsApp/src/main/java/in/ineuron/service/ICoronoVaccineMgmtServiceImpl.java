package in.ineuron.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public List<CoronaVaccine> fetchDetailsByCompany(String company) {

		System.out.println("The Implementation methods are " + repo.getClass()+" "+Arrays.toString(repo.getClass().getDeclaredMethods()));
		List<CoronaVaccine> listEntities = repo.findByCompany(company);
        repo.findByCompanyEquals(company).forEach(System.out::println);
        repo.findByCompanyIs(company).forEach(System.out::println);
		return listEntities;
	}

	@Override
	public List<CoronaVaccine> fetchVaccineByPriceLessThan(Double price) {
		
		List<CoronaVaccine> listEntities = repo.findByPriceLessThan(price);
		
		return listEntities;
	}

}