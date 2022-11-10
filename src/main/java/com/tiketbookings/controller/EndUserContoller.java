package com.tiketbookings.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiketbookings.DAO.BookingsDAO;
import com.tiketbookings.DAO.CityDAO;
import com.tiketbookings.DAO.MovieDAO;
import com.tiketbookings.DAO.ShowDAO;
import com.tiketbookings.DAO.TheaterDAO;
import com.tiketbookings.model.Bookings;
import com.tiketbookings.model.City;
import com.tiketbookings.model.Movie;
import com.tiketbookings.model.Show;
import com.tiketbookings.model.Theater;

@RestController
@RequestMapping("/user")
public class EndUserContoller {

	@Autowired
	CityDAO theCityDAO;
	
	@Autowired
	MovieDAO theMovieDAO;
	
	@Autowired
	TheaterDAO theTheaterDAO;
	
	@Autowired
	ShowDAO theShowDAO;
	
	@Autowired
	BookingsDAO theBookingsDAO;
	
//	Get the list of City where you can book the movie 
	
	@GetMapping("/city")
	public List<City> getAllCity(){
		
		return theCityDAO.getCity();
	}
	
	
//	GEt list of theater Available against a City
	
	@GetMapping("/{citi}/theater/{movie}")
	public List<Theater> getTheaterInCity(@PathVariable(value = "citi") String citi,
			@PathVariable(value = "movie") String Movie){
		
		City theCity = theCityDAO.findCitiName(citi);
		return theTheaterDAO.gettheaterByCityId(theCity);
	}
	
//	Get Movie available on the theaters
	
	@GetMapping("/theater/{ID}/movie")
	public List<Object[]> getMovieByTheaterID(@PathVariable(value = "ID") long ID){
		
		return theMovieDAO.getMovieByTheaterId(ID);
	}
	
//	Get Available Show for a particular movie 
	
	@GetMapping("/movie/{id}/show")
	public List<Show> geShowByMovieId(@PathVariable(value ="id") long id){
		
		Movie theMovie = theMovieDAO.findOne(id);
	
		return theShowDAO.fetchByMovie(theMovie);
	}
	
//	Get the seat available for a particular Show using the show ID
	
	@GetMapping("/show/{id}")
	public Bookings getAvailableSeat(@PathVariable ( value = "id") long id)
	{
		return theBookingsDAO.getAvailableSeat(id);
	}
	
//	Book a Seat using the show id By passing the show POJO to the API 
	
	@PostMapping("show/{id}/bookings")
	public Bookings bookSeatForShow(@PathVariable (value = "id") long id, @Valid @RequestBody Bookings b)
	{
		return theBookingsDAO.bookTheSeat(b);
	}
	
	
	
}






