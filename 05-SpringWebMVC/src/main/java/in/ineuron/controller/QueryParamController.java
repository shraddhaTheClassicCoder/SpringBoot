package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryParamController {

	@GetMapping("/query")
	public String dispplayQuery(@RequestParam("name") String str,Model model)
	{
		
		
		String msg=str.concat(" Welcome to Ineuron!!!");
		
		model.addAttribute("query", msg);
		
		return "query";
		
	}
}
