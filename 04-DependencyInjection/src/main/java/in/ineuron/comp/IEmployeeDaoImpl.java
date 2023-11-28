package in.ineuron.comp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.model.Employee;

@Repository("dao")
public class IEmployeeDaoImpl implements IEmployeeDao {

	@Autowired(required = true)
	private DataSource datasource;

	private static final String SelectQuery = "select id,name,age,address,salary,hike from employee";

	static {
		System.out.println("IEmployeeDaoImpl .class file is laoding....");
	}

	public IEmployeeDaoImpl() {
		System.out.println("IEmployeeDaoImpl class is instantiated...");
	}

	@Override
	public List<Employee> findAllEmployee() throws SQLException {

		System.out.println("IEmployeeDaoImpl.findAllEmployee()");

		System.out.println("Implementation class obj::" + datasource.getClass().getName());

		List<Employee> eList = new ArrayList<Employee>();
		try {
			Connection connection = datasource.getConnection();

			PreparedStatement pstmt = connection.prepareStatement(SelectQuery);

			ResultSet res = pstmt.executeQuery();

			if (res != null) {
				while(res.next()) {

					Employee emp = new Employee();

					emp.setEid(res.getInt(1));
					emp.setEname(res.getString(2));
					emp.setEage(res.getInt(3));
					emp.setEaddress(res.getString(4));
					emp.setSalary(res.getFloat(5));
					emp.setHike(res.getFloat(6));

					eList.add(emp);

				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eList;

	}

}
