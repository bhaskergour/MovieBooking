package com.tiketbookings.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "tableCity")
@EntityListeners(AuditingEntityListener.class)
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long C_id;

	@Column(nullable = false)
	private String C_name;

	private String C_state;

	@Override
	public String toString() {
		return "City [C_id=" + C_id + ", C_name=" + C_name + ", C_state=" + C_state + ", theTheater=" + theTheater
				+ "]";
	}

	@OneToMany(mappedBy = "city")
	private List<Theater> theTheater;

	public long getID() {
		return C_id;
	}

	public void setID(long iD) {
		C_id = iD;
	}

	public String getName() {
		return C_name;
	}

	public void setName(String name) {
		this.C_name = name;
	}

	public String getState() {
		return C_state;
	}

	public void setState(String state) {
		this.C_state = state;
	}

}
