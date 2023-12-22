package in.ineuron.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.ineuron.service.IWishMsgservice;

@Controller
public class DisplayHomePage {
	@Autowired
	IWishMsgservice service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayHome() {

		return "home";

	}

	/*
	 * @RequestMapping(value = "/wish", method = RequestMethod.GET) public
	 * ModelAndView getWishMessage() {
	 * 
	 * ModelAndView mv = new ModelAndView();
	 * 
	 * String msg =service.getLocaleDateTime();
	 * 
	 * mv.addObject("msg", msg); mv.setViewName("display");
	 * 
	 * return mv;
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value = "/wish", method = RequestMethod.GET) public String
	 * getWishMessage(Model model) {
	 * 
	 * System.out.println("The Implemantation class object is::"+model.getClass().
	 * getName());
	 * 
	 * String wmg = service.getLocaleDateTime();
	 * 
	 * model.addAttribute("msg", wmg);
	 * 
	 * return "display";
	 * 
	 * }
	 */
	
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public String getWishMessage(Map<String, Object> map) {

		System.out.println("The Implemantation class object is::"+map.getClass().getName());
		
		String wmg = service.getLocaleDateTime();

		map.put("msg", wmg);

		return "display";

	}
}
