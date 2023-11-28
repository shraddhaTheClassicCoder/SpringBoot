package in.ineuron.comp;

import java.sql.SQLException;
import java.util.List;

import in.ineuron.model.Employee;

public interface IEmployeeDao {

	public List<Employee> findAllEmployee() throws SQLException;
}
