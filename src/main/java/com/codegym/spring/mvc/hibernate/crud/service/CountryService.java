package com.codegym.spring.mvc.hibernate.crud.service;

import java.util.List;

import com.codegym.spring.mvc.hibernate.crud.entity.Country;
import com.codegym.spring.mvc.hibernate.crud.repository.CountryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

	@Autowired
	private CountryDao countryDao;

	public Country getCountry(final int id) {
		return countryDao.getCountry(id);
	}

	public List<Country> getCountrys() {
		return countryDao.getCountrys();
	}

	public void addCountry(final Country country) {
		countryDao.addCountry(country);
	}

	public void updateCountry(final Country country) {
		countryDao.updateCountry(country);
	}

	public void deleteCountry(final int id) {
		countryDao.deleteCountry(id);
	}

}
