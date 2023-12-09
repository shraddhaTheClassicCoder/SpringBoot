package in.ineuron.service;

import java.util.List;
import java.util.Map;
import in.ineuron.dao.employeeDao;

public class employeeServiceImpl implements employeeService {

	private employeeDao dao;

	public employeeServiceImpl(employeeDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int fetchEmpCount() {
		
		return dao.getEmployeeCount();
	}

	@Override
	public String toString() {
		return "employeeServiceImpl [dao=" + dao + "]";
	}

	@Override
	public String getEmployeeNamebyNo(int id) {
		
		return dao.getEmployeeNameByNo(id);
	}

	@Override
	public Map<String, Object> employeeDetailsByNo(int id) {
		
		return dao.employeeDetailsByNo(id);
	}

	@Override
	public List<Map<String, Object>> employeeDetailsDesign(String desg1, String desg2) {
	
		return dao.employeeDetailsDesign(desg1, desg2);
	}

	@Override
	public int insertEmp(String name, int age, String address, float salary, float hike, String desg1) {
		
		return dao.insertEmp(name, age, address, salary, hike, desg1);
	}

	@Override
	public int addBonusToEmpByDesg(String desg, int bonus) {
		
		return dao.addBonusToEmpByDesg(desg, bonus);
	}

}
