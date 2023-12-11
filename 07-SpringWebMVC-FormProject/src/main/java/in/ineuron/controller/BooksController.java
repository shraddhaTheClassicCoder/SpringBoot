package in.ineuron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ineuron.model.Books;

@Controller
public class BooksController {

	@GetMapping("/book")
	public String loadingForm() {

		return "index";

	}

	@PostMapping("/save")
	public String afterStringSubmission(Books bo, Model model) {

		model.addAttribute("book", bo);

		return "book";
	}

}
