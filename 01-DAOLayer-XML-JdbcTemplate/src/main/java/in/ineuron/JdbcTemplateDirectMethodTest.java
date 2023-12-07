package in.ineuron;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.service.employeeService;

public class JdbcTemplateDirectMethodTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationcontext.xml");

		employeeService service = context.getBean(employeeService.class);
		System.out.println(service);

		int count = service.fetchEmpCount();

		System.out.println(count);

		/*
		 * String name = service.getEmployeeNamebyNo(1);
		 * 
		 * System.out.println(name);
		 */

		/*
		 * Map<String, Object> empDetails = service.employeeDetailsByNo(2);
		 * 
		 * System.out.println(empDetails);
		 * 
		 * service.employeeDetailsDesign("batsman",
		 * "keeper").forEach(System.out::println);
		 */

		int rowAffected = service.insertEmp("rashid", 27, "Mumbai", 23000, 28000, "keeper");
		System.out.println("Row Affected:: "+rowAffected);
		
		int rowCOunt=service.addBonusToEmpByDesg("batsman",2000);
		System.out.println("Row updated with adding bonus:: "+rowCOunt);
		
		((AbstractApplicationContext) context).close();
	}
}
