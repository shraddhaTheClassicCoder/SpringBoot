package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronoVaccineMgmtService {

	public Iterable<CoronaVaccine> fetchAllDetails(boolean asc, String ...properties);
    
}
