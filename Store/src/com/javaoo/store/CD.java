package com.javaoo.store;

import java.util.Date;

public class CD extends Item {
	private Artist artist;
	private Date releaseDate;

	public CD(String title, int quantity, double price, Artist artist, Date releaseDate) {
		super(title, quantity, price);
		setArtist(artist);
		setReleaseDate(releaseDate);
	}
	
	public Artist getArtist() { return artist; }
	public void setArtist(Artist artist) { this.artist = artist; }
	
	
	public Date getReleaseDate() { return releaseDate; }
	public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }

}
