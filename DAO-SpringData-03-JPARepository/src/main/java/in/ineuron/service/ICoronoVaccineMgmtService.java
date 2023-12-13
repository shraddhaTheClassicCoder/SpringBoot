package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronoVaccineMgmtService {

	
	public List<CoronaVaccine> searchVaccineByGivenData(CoronaVaccine vaccine,boolean ascOrder,String...propeties);
	public CoronaVaccine getVaccineById(Long regNo);
}
