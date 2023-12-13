package in.ineuron.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CoronaVaccine;
import in.ineuron.dao.ICoronoVaccineRepo;

@Service("service")
public class ICoronoVaccineMgmtServiceImpl implements ICoronoVaccineMgmtService {

	@Autowired
	ICoronoVaccineRepo repo;

	@Override
	public String registerVaccine(CoronaVaccine vaccine) {

		System.out.println("In memory proxy class is " + repo.getClass().getName());

		CoronaVaccine saveVaccine = null;

		if (vaccine != null) {
			saveVaccine = repo.save(vaccine);
		}

		return saveVaccine != null ? "Vaccine Registered with " + saveVaccine.getRegNo()
				: "Vaccine Registration Failed";
	}

	@Override
	public Iterable<CoronaVaccine> registerBatch(Iterable<CoronaVaccine> vaccines) {

		if (vaccines != null) {
			return repo.saveAll(vaccines);
		} else {
			throw new IllegalArgumentException("Batch Insertion not done...");
		}

	}

	@Override
	public Long getVaccineCount() {

		return repo.count();
	}

	@Override
	public boolean checkAvailablityByRegNo(Long regNo) {

		return repo.existsById(regNo);
	}

	@Override
	public Iterable<CoronaVaccine> fetchAllDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Iterable<CoronaVaccine> fetchAllDetailsById(List<Long> ids) {
		// TODO Auto-generated method stub
		return repo.findAllById(ids);
	}

	@Override
	public Optional<CoronaVaccine> fetchVaccineById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public String deleteById(Long id) {

		Optional<CoronaVaccine> optional = repo.findById(id);
		if (optional.isPresent()) {
			repo.deleteById(id);
			return "record not available with Id" + id;

		} else {
			return "Record not availble with Id" + id;
		}
	}

	@Override
	public String removeVaccineByObject(CoronaVaccine vaccine) {

		Optional<CoronaVaccine> optional = repo.findById(vaccine.getRegNo());

		if (optional.isPresent()) {

			repo.delete(vaccine);

			return "Record is deleted with Id:: " + vaccine.getRegNo();
		}

		return "Record not available for given Id:: " + vaccine.getRegNo();
	}

	@Override
	public String removeVaccineById(List<Long> ids) {
		Iterable<CoronaVaccine> listEntities = repo.findAllById(ids);
		int count = ids.size();

		if (count == ((List) listEntities).size()) {
			repo.deleteAllById(ids);
			return count + " no of ids deleted";
		}

		return "Record not found for deletion";
	}
}