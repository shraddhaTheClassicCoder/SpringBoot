package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronoVaccineMgmtService {

	public List<CoronaVaccine> fetchDetailsByCompany(String company);
	
	public List<CoronaVaccine> fetchVaccineByPriceLessThan(Double price);
}