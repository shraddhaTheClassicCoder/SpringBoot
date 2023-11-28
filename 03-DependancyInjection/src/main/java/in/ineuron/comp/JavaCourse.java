package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourse implements Courses {

	
	static {
		System.out.println("JavaCourse .class file is laoding....");
	}
	
	public JavaCourse() {
		System.out.println("JavaCourse class is instantiated...");
	}
	
	@Override
	public String courseContent() {
		System.out.println("JavaCourse.courseContent()");
		
		return "1.ExceptionHAndling 2. collection 3. Multithreading";
	}

	@Override
	public float price() {
		
		return 500.25f;
	}

	
}
