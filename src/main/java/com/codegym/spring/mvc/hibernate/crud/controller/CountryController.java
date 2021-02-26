package com.codegym.spring.mvc.hibernate.crud.controller;

import java.util.List;

import com.codegym.spring.mvc.hibernate.crud.entity.Country;
import com.codegym.spring.mvc.hibernate.crud.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/country/{id}")
	public String getCountry(@PathVariable int id, ModelMap countryModel) {
		Country country = countryService.getCountry(id);
		countryModel.addAttribute("country", country);
		return "country";
	}

	@GetMapping("/countrys")
	public String getCountrys(ModelMap teacherModel) {
		List<Country> countrys = countryService.getCountrys();
		countryModel.addAttribute("countrys", countrys);
		return "countrys";
	}

	@GetMapping("addCountry")
	public String addPage() {
		return "add";
	}

	@PostMapping("/add/country")
	public String addCountry(@RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "country", required = true) String country, ModelMap countryModel) {
		Country country = new Country();
		country.setCity(city);
		country.setCountry(country);
		countryService.addCountry(country);
		countryModel.addAttribute("msg", "Country added successfully");
		List<Country> countrys = countryService.getCountrys();
		countryModel.addAttribute("countrys", countrys);
		return "redirect:/countrys";
	}

	@GetMapping("update/country/{id}")
	public String updatePage(@PathVariable("id") int id, ModelMap countryModel) {
		countryModel.addAttribute("id", id);
		Country country = countryService.getcountry(id);
		countryModel.addAttribute("country", country);
		return "update";
	}

	@PostMapping("/update/country")
	public String updateTeacher(@RequestParam int id, @RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "country", required = true) String expertise, ModelMap countryModel) {
		Country country = new Country(id,city,country);
		countryService.updateCountry(country);
		List<Country> countrys = countryService.getCountrys();
		countryModel.addAttribute("countrys", countrys);
		countryModel.addAttribute("id", id);
		countryModel.addAttribute("msg", "Country updated successfully");
		return "redirect:/countrys";
	}

	@GetMapping("/delete/country/{id}")
	public String deleteCountry(@PathVariable int id, ModelMap countryModel) {
		countryService.deleteCountry(id);
		List<Country> countrys = countryService.getCountrys();
		countryModel.addAttribute("countrys", countrys);
		countryModel.addAttribute("msg", "Country delete successfully");
		return "redirect:/countrys";
	}

}
