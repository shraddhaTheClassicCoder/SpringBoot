package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ineuron.model.Student;

@Controller
public class StudentController {

	@GetMapping("/studentInfo")
	public String getStudent(Model model, Student student) {

		student.setSid(1);
		student.setName("shraddha");
		student.setAddress("pune");

		model.addAttribute("student",student);
		
		return "student";
	}

}
