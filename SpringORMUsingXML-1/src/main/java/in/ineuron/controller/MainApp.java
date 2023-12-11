package in.ineuron.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.bo.StudentBO;
import in.ineuron.dto.Student;
import in.ineuron.service.IStudentService;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in//ineuron//cfg//ApplicationContext.xml");

		IStudentService service = context.getBean(IStudentService.class);
		System.out.println(service);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Student student = null;
		StudentBO bo = null;

		try {
			while (true) {

				System.out.println("1. CREATE");
				System.out.println("2. READ BY ID");
				System.out.println("3. READ BY OBJECT");
				System.out.println("4. UPDATE");
				System.out.println("5. DELETE BY ID");
				System.out.println("6. DELETE BY OBJECT");
				System.out.println("7. EXIT");
				System.out.print("ENTER UR CHOICE, PRESS[1/2/3/4/5]::  ");

				int option = Integer.parseInt(br.readLine());

				switch (option) {
				case 1:
					System.out.print("Enter the name of student: ");
					String name = br.readLine();

					System.out.print("Enter the age of student: ");
					String age = br.readLine();

					System.out.print("Enter the address of student: ");
					String saddress = br.readLine();

					student = new Student();
					student.setName(name);
					student.setAge(Integer.parseInt(age));
					student.setSaddress(saddress);

					int rowAffected = service.insert(student);

					System.out.println("Record Inserted with id: " + rowAffected);

					break;
				case 2:
					System.out.print("Enter the id of student: ");
					String id = br.readLine();

					Student s = service.getStudent(Integer.parseInt(id));

					System.out.println(s);

					break;
				case 3:
					List<Student> allStudent = service.getAllStudent();

					allStudent.forEach(System.out::println);

					break;
				case 4:
					break;
				case 5:
					System.out.print("Enter the id of student: ");
					String deleteId = br.readLine();

					service.delete(Integer.parseInt(deleteId));

					System.out.println("Record Deleted Successfully");

					break;
				case 6:
					System.out.println("Thanks for choosing Application");

				default:
					System.out.println("Invalid option plz try agin with valid options....");
					break;
				}
			}
		} catch (Exception De) {
			De.printStackTrace();
		} finally {
			((AbstractApplicationContext) context).close();
		}
	}
}
