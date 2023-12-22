package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PathParamController {

	@GetMapping("/param/{bookName}/{authorName}")
	public String getBookDetails(@PathVariable("bookName") String book, @PathVariable("authorName") String author,
			Model model) {

		String str = book + " is written by " + author + " which is very famous ";

		model.addAttribute("book", str);
		return "index";

	}
}
