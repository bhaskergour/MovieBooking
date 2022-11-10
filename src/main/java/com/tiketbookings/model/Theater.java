package com.tiketbookings.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tableTheater")
@EntityListeners(AuditingEntityListener.class)

public class Theater {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long T_id;

	private String T_name;

	@Override
	public String toString() {
		return "Theater [T_id=" + T_id + ", T_name=" + T_name + ", city=" + city.getName() + ", theShow=" + theShow
				+ "]";
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private City city;

	/*
	 * First version of creating many to one relationship between theater and movie
	 * entity
	 */
//	@ManyToMany(cascade = {CascadeType.ALL})
//	@JoinTable(
//			name = "theater_movie",
//			joinColumns = {
//					@JoinColumn(name = "T_id")
//			},
//			inverseJoinColumns = {
//					@JoinColumn(name = "M_id")
//			}
//	)
//	Set <Movie> movies = new HashSet	< Movie > (); 
//	

	@OneToMany(mappedBy = "theTheater")
	private List<Show> theShow;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public long getT_id() {
		return T_id;
	}

	public void setT_id(long t_id) {
		T_id = t_id;
	}

	public String getT_name() {
		return T_name;
	}

	public void setT_name(String t_name) {
		T_name = t_name;
	}

}
