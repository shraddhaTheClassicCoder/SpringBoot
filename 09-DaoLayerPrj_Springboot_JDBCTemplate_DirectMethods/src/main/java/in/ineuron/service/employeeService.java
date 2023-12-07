package in.ineuron.service;

import java.util.List;
import java.util.Map;

public interface employeeService {

	public int fetchEmpCount();
	public String getEmployeeNamebyNo(int id);
	public Map<String, Object> employeeDetailsByNo(int id);
	public List<Map<String, Object>> employeeDetailsDesign (String desg1,String desg2);
    public int insertEmp( String name,int age,String address,float salary,float hike,String desg1);
    public int addBonusToEmpByDesg(String desg,int bonus);
    
}
