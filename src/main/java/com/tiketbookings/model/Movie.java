package com.tiketbookings.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "tableMovie")
@EntityListeners(AuditingEntityListener.class)
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long M_id;

	private String M_name;

	@OneToMany(mappedBy = "theMovie")
	public List<Show> theShow;

	public long get_id() {
		return M_id;
	}

	public void set_id(long m_id) {
		M_id = m_id;
	}

	public String get_name() {
		return M_name;
	}

	public void set_name(String m_name) {
		M_name = m_name;
	}

}
