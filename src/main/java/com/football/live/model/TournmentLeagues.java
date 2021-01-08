package com.football.live.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tournmentleague")
public class TournmentLeagues {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	
	@Column(name = "tname")
	private String tname;
	
	@Column(name = "tcountry")
	private String tcountry;
	
	@Column(name = "tyear")
	private String tyear;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTcountry() {
		return tcountry;
	}

	public void setTcountry(String tcountry) {
		this.tcountry = tcountry;
	}

	public String getTyear() {
		return tyear;
	}

	public void setTyear(String tyear) {
		this.tyear = tyear;
	}
	
}
