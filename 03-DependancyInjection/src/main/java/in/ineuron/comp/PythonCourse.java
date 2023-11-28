package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component("python")
public class PythonCourse implements Courses {

	static {
		System.out.println("PythonCourse .class file is laoding....");
	}

	public PythonCourse() {
		System.out.println("PythonCourse class is instantiated...");
	}

	@Override
	public String courseContent() {

		System.out.println("PythonCourse.courseContent()");
		return "1. dont know 2. just added here 3. plz forgive me";
	}

	@Override
	public float price() {
        System.out.println("PythonCourse.price()");
		return 340.45f;
	}

}
