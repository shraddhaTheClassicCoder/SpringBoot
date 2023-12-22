package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/view")
	public String display(Model model) {

		model.addAttribute("msg", "Ineuron offers Awsome courses in offordable prices");

		return "index";
	}

}
