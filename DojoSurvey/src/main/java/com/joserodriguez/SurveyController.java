package com.joserodriguez;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.joserodriguez.models.Survey;

@Controller
public class SurveyController {
	private String[] getLanguages() {
		String[] languages = { "C#", "Java", "Python", "C++" };
		return languages;
	}
	private String[] getLocations() {
		String[] locations = { "Seattle", "Dallas", "San Jose", "Chicago", "Tulsa"};
		return  locations;
	}
	@RequestMapping("/")
	public String Index(Model model) {
		model.addAttribute("locations", getLocations());
		model.addAttribute("languages", getLanguages());
		return "index.jsp";
	}
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String Results(@RequestParam(value="name") String name, 
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment,
			Model model){
		//System.out.println(language);
		if(language.equals("Java") ) {
			model.addAttribute("result", new Survey(name, location, language, comment));
			return "surveyinfojava.jsp";
		}
		model.addAttribute("result", new Survey(name, location, language, comment));
		return "surveyinfo.jsp";
	}

}
