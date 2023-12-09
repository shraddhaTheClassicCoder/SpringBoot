package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/second")
public class SecondController {

	
	@GetMapping("/welcome")
	public ModelAndView Work() {

		ModelAndView mv = new ModelAndView();

		mv.addObject("message", "Hey Buddy!!! Welcome to the World of SpringBoot....");
		mv.setViewName("index");
		return mv;
	}

	@GetMapping("/ui")
	public String SomeOtherWork(Model model) {

		model.addAttribute("message", "Springboot is Best FrameWork");
		return "index";
	}
	
	@GetMapping("/learn")
	public String JustFOrTimePass(Model model) {

		model.addAttribute("message", "I am damm serious about the learning springboot");
		return "index";
	}
	
	@PostMapping
	public String JustFOrTimePass1(Model model) {

		model.addAttribute("message", "I am not serious about the learning springboot");
		return "index";
	}
}
