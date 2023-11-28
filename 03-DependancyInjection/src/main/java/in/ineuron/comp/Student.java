package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	@Qualifier("java")
	private Courses course;
	
	static {
		System.out.println("Student .class file is laoding....");
	}

	public Student() {
		System.out.println("Student class is instantiated...");
	}

	public void preparation() {

		System.out.println("Student.preparation()");
		
		System.out.println("The Choosen course::"+course.getClass().getName());
		
		String content=course.courseContent();
		
		float price=course.price();
		
		System.out.println("Preparation is going on with content "+ content +" with price of "
		+ price + " for the course selected "+course.getClass().getName());
		
		
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
	
}
