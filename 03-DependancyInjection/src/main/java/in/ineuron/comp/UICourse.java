package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component("uicourse")
public class UICourse implements Courses {

	static {
		System.out.println("UICourse .class file is laoding....");
	}

	public UICourse() {
		System.out.println("UICourse class is instantiated...");
	}
	
	@Override
	public String courseContent() {
		
		System.out.println("UICourse.courseContent()");
		return "1.CSS 2. HTML 3. JavaScript";
	}

	@Override
	public float price() {
		System.out.println("UICourse.price()");
		return 590.30f;
	}

}
