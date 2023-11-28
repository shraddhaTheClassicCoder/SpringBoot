package in.ineuron;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.IEmployeeDaoImpl;
import in.ineuron.model.Employee;

@SpringBootApplication
public class Application {

	static {
		System.out.println("Application .class file is laoding....");
	}

	public Application() {
		System.out.println("Application class is instantiated...");
	}
	
	public static void main(String[] args) throws SQLException {
		

		ApplicationContext context = SpringApplication.run(Application.class, args);

		IEmployeeDaoImpl dao = context.getBean(IEmployeeDaoImpl.class);
		try {
			List<Employee> emp = dao.findAllEmployee();

			for(Employee e1:emp)
			{
				System.out.println(e1);
			}
			//emp.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) context).close();

	}

}
