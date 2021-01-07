package com.football.live.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "soccerpics")
public class SoccerPics {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int spicid;
	
	@Column(name = "caption")
	private String caption;
	
	@Lob
	@Column(name = "spicimg", columnDefinition="LONGBLOB")
	private byte[] spicimg;

	public int getSpicid() {
		return spicid;
	}

	public void setSpicid(int spicid) {
		this.spicid = spicid;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public byte[] getSpicimg() {
		return spicimg;
	}

	public void setSpicimg(byte[] spicimg) {
		this.spicimg = spicimg;
	}
	
}
