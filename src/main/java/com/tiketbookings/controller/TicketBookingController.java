package com.tiketbookings.controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
@RequestMapping("/api")
public class TicketBookingController {

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

//	@Autowired
//	TheaterMovieDAO theTheaterMovieDAO;

//	For debugging purpose
	@GetMapping("/test")
	public String returnString() {
		return "hellow world";
	}

//	Add city to DB
	@PostMapping("/city")
	public City createCity(@Valid @RequestBody City c) {
		return theCityDAO.save(c);
	}

//	Add Movie to the table
	@PostMapping("/movie")
	public Movie createMovie(@Valid @RequestBody Movie m) {
		return theMovieDAO.save(m);
	}

//	adding show for a theater and movie
	@PostMapping("/{ID}/{id}/show")
	public Show addingShow(@PathVariable(value = "ID") long ID, @PathVariable(value = "id") long id,
			@Valid @RequestBody HashMap<String, String> requestData) {
		Theater theTheater = theTheaterDAO.findOne(ID);
		Movie theMovie = theMovieDAO.findOne(id);
		Show theShow = new Show();
		Show theResponseShow = new Show();
		Bookings theBookings = new Bookings();
		theShow.setShow_time(requestData.get("time"));
		theShow.setTheMovie(theMovie);
		theShow.setTheTheater(theTheater);
		theResponseShow = theShowDAO.save(theShow);
		theBookings.setShow_id(theResponseShow.getShow_Id());
		theBookingsDAO.bookTheSeat(theBookings);
		return theResponseShow;
	}

//	get all City
	@GetMapping("/city")
	public List<City> getCity() {
		return theCityDAO.getCity();
	}

//	Get all Movie
	@GetMapping("/movie")
	public List<Movie> getMovie() {
		return theMovieDAO.getMovie();
	}

//	Get all the Theaters
	@GetMapping("/theater")
	public List<Theater> getTheater() {
		return theTheaterDAO.getTheater();
	}

//	Get movie by particular ID

	@GetMapping("/movie/{ID}")
	public ResponseEntity<Movie> getOneMovie(@PathVariable(value = "ID") long ID) {
		Movie theMovie = theMovieDAO.findOne(ID);
		if (theMovie == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(theMovie);
	}

//	Get Theater By particular ID
	@GetMapping("/theater/{ID}")
	public ResponseEntity<Theater> getOneTheater(@PathVariable(value = "ID") long ID) {
		Theater theTheater = theTheaterDAO.findOne(ID);
		if (theTheater == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(theTheater);
	}

//	update Movie
	@PutMapping("/movie/{ID}")
	public ResponseEntity<Movie> updateMovie(@PathVariable(value = "ID") long ID, @Valid @RequestBody Movie m) {
		Movie theMovie = theMovieDAO.findOne(ID);
		if (theMovie == null) {
			return ResponseEntity.notFound().build();
		}
		theMovie.set_name(m.get_name());

		Movie updatedMovie = theMovieDAO.save(theMovie);
		return ResponseEntity.ok().body(updatedMovie);
	}

//	update theater
	@PutMapping("/theater/{ID}")
	public ResponseEntity<Theater> updatetheater(@PathVariable(value = "ID") long ID, @Valid @RequestBody Theater t) {

		Theater theTheater = theTheaterDAO.findOne(ID);
		if (theTheater == null) {
			return ResponseEntity.notFound().build();
		}
		theTheater.setT_name(t.getT_name());

		Theater updatedTheater = theTheaterDAO.save(theTheater);
		return ResponseEntity.ok().body(updatedTheater);

	}

//	Delete a Movie
	@DeleteMapping("/movie/{ID}")
	public ResponseEntity<Movie> deleteMovie(@PathVariable(value = "ID") long ID) {
		Movie theMovie = theMovieDAO.findOne(ID);
		if (theMovie == null) {
			return ResponseEntity.notFound().build();
		}
		theMovieDAO.deleteMovie(theMovie);
		return ResponseEntity.ok().build();
	}

//   Delete a theater
	@DeleteMapping("/theater/{ID}")
	public ResponseEntity<Theater> deleteTheater(@PathVariable(value = "ID") long ID) {
		Theater theTheater = theTheaterDAO.findOne(ID);
		if (theTheater == null) {
			return ResponseEntity.notFound().build();
		}
		theTheaterDAO.deleteTheater(theTheater);
		return ResponseEntity.ok().build();
	}

}
