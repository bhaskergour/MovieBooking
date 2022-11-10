package com.tiketbookings.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "table_show_time")
@EntityListeners(AuditingEntityListener.class)

public class TheaterTiming {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long S_id;

	private String C_tid;

	private String c_time;

	public long getS_id() {
		return S_id;
	}

	public void setS_id(long s_id) {
		S_id = s_id;
	}

	public String getC_tid() {
		return C_tid;
	}

	public void setC_tid(String c_tid) {
		C_tid = c_tid;
	}

	public String getC_time() {
		return c_time;
	}

	public void setC_time(String c_time) {
		this.c_time = c_time;
	}

	@Override
	public String toString() {
		return "TheaterTiming [S_id=" + S_id + ", C_tid=" + C_tid + ", c_time=" + c_time + "]";
	}

}
