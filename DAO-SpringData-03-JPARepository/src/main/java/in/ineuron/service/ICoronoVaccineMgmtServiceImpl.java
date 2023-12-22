package in.ineuron.service;

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
	public List<CoronaVaccine> searchVaccineByGivenData(CoronaVaccine vaccine, boolean ascOrder, String... propeties) {

		// Searh data by name price

		System.out.println("The Implementation class is:: " + repo.getClass().getName());

		Example<CoronaVaccine> example = Example.of(vaccine);

		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, propeties);

		List<CoronaVaccine> lisEntities = repo.findAll(example, sort);

		return lisEntities;
	}

	@Override
	public CoronaVaccine getVaccineById(Long regNo) {

		CoronaVaccine vaccine = repo.getById(regNo);
		return vaccine;
	}

	@Override
	public String removeVaccineByRegNo(Iterable<Long> regNo) {

		List<CoronaVaccine> listEntities = repo.findAllById(regNo);
		if (listEntities.size() != 0) {
			repo.deleteAllByIdInBatch(regNo);

			return listEntities.size() + "Records are deleted";
		}
		return "Record not found for deletion";
	}

}