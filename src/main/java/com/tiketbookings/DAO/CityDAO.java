package com.tiketbookings.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiketbookings.model.City;
import com.tiketbookings.respository.CityRepository;

@Service
public class CityDAO {

	@Autowired
	CityRepository theCityRepository;

//	to save city
	public City save(City c) {
		return theCityRepository.save(c);
	}

//	Get all list of  City 
	public List<City> getCity() {
		return theCityRepository.findAll();
	}

//	get City by ID
	public City findOne(String city) {
		return theCityRepository.getOne(city);
	}

//	Delete city
	public void deletecity(City c) {
		theCityRepository.delete(c);
	}

	public City findCitiName(String city) {
		return (City) theCityRepository.getTheateByCiti(city);
	}

}
