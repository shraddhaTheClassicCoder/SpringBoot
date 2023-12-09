package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstApp {

	@GetMapping("/welcome")
	public ModelAndView displayMsg() {

		ModelAndView mv = new ModelAndView();

		mv.addObject("message", "Welcome to java coding....");
		mv.setViewName("index");
		return mv;
	}

	@GetMapping("/java")
	public String Display(Model model) {

		model.addAttribute("message", "Springboot is awsome");
		return "index";
	}
}
