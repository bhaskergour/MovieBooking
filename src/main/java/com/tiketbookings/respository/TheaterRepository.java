package com.tiketbookings.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiketbookings.model.City;
import com.tiketbookings.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, String> {

	public List<Theater> findByCity(City ID);

}