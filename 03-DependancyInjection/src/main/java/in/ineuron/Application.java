package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Student;

@SpringBootApplication
public class Application {

	static {
		System.out.println("Application .class file is laoding....");
	}

	public Application() {
		System.out.println("Application class is instantiated...");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		Student student = context.getBean(Student.class);
		System.out.println(student);

		student.preparation();

		((ConfigurableApplicationContext) context).close();

	}

}
