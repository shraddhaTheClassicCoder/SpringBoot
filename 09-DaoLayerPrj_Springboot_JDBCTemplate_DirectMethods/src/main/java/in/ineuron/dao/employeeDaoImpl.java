package in.ineuron.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class employeeDaoImpl implements employeeDao {

	private static final String SQL_SELECT_QUERY = "select count(*) from employee";
	private static final String SQL_SELECT_QUERY_By_No = "select name from employee where id=?";
	private static final String SQL_SELECT_QUERY_AllDetails_By_NO = "select id,name,age,address,salary,hike from employee where id=?";
	private static final String GET_EMPLOYEE_BY_DESG = "select id,name,age,address,salary,hike from employee where desg1 in (?,?) order by salary";
	private static final String SQL_QUERY_INSERT = "insert into Employee(`name`,`age`,`address`,`salary`,`hike`,`desg1`) values(?,?,?,?,?,?)";
	private static final String ADD_BONUS_EMP_BY_DESG = "update employee set salary=salary+? where desg1=?";;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int getEmployeeCount() {
		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY, Integer.class);
	}

	@Override
	public String toString() {
		return "employeeDaoImpl [jdbcTemplate=" + jdbcTemplate + "]";
	}

	@Override
	public String getEmployeeNameByNo(int id) {

		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY_By_No, String.class, id);
	}

	@Override
	public Map<String, Object> employeeDetailsByNo(int id) {
		Map<String, Object> map = jdbcTemplate.queryForMap(SQL_SELECT_QUERY_AllDetails_By_NO, id);
		return map;
	}

	@Override
	public List<Map<String, Object>> employeeDetailsDesign(String desg1, String desg2) {
		List<Map<String, Object>> empRecords = jdbcTemplate.queryForList(GET_EMPLOYEE_BY_DESG, desg1, desg2);
		return empRecords;
	}

	@Override
	public int insertEmp(String name, int age, String address, float salary, float hike, String desg1) {

		return jdbcTemplate.update(SQL_QUERY_INSERT, name, age, address, salary, hike, desg1);
	}

	@Override
	public int addBonusToEmpByDesg(String desg, int bonus) {

		return jdbcTemplate.update(ADD_BONUS_EMP_BY_DESG, bonus, desg);
	}

}
