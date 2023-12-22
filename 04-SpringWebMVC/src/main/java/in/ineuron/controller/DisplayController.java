package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayController {

	
	@GetMapping("/disp")
	public String unabletoGuessYou(Model model)
	{
		model.addAttribute("cid", "1");
		model.addAttribute("cname", "java");
		model.addAttribute("cfees", "17700");
		return "course";
		
	}
	
}
