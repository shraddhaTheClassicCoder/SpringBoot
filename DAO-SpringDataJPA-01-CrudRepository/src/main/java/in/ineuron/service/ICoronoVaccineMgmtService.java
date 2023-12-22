package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronoVaccineMgmtService {

	public String registerVaccine(CoronaVaccine vaccine);
	public Iterable<CoronaVaccine> registerBatch(Iterable<CoronaVaccine> vaccines);
	public Long getVaccineCount();
    public boolean checkAvailablityByRegNo(Long regNo);
    public Iterable<CoronaVaccine> fetchAllDetails();
    public Iterable<CoronaVaccine> fetchAllDetailsById(List<Long> ids);
    public Optional<CoronaVaccine> fetchVaccineById(Long id);
    public String deleteById(Long id);
    public String removeVaccineByObject(CoronaVaccine vaccine);
    public String removeVaccineById(List<Long> ids);
    
}
