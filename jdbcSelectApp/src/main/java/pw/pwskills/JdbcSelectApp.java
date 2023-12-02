package pw.pwskills;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcSelectApp {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/telusko";
		String username = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection object is created:: " + connection);
		Statement statement = connection.createStatement();
		System.out.println("Statement object is created:: " + statement);
		String sqlSelectQuery = "SELECT id,name,age,salary,hike from employee";
		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
		System.out.println("ResultSet object is created:: " + resultSet);
		System.out.println("EID\tENAME\t\tEAGE\t\tESAL\t\tEHIKE");
		while (resultSet.next()) {
			Integer id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Integer age = resultSet.getInt(3);
			String salary = resultSet.getString(4);
			Float hike=resultSet.getFloat(5);
			
			System.out.println(id + "\t" + name + "\t\t\t" + age + "\t\t\t" + salary + "\t\t\t" + hike);
		}
		// Close the Connection
		connection.close();
		System.out.println("Closing the connection...");
	}
}
