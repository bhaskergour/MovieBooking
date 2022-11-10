package com.tiketbookings.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tiketbookings.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, String> {

	@Query(value = "SELECT * FROM table_city as c where c.c_name = ?1", nativeQuery = true)
	public City getTheateByCiti(String C_name);

}
