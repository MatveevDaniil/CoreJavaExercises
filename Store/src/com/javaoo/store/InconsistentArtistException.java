package com.javaoo.store;

public class InconsistentArtistException extends Exception {
	private String message;
	
	public InconsistentArtistException(String artistName, String MemberName) {
		this.message = String.format(
				"Internal error. Member names and member instruments for artist `%s` are incosistent",
				artistName);
		this.message += String.format("Inconsistent MemberName: `%s` ", MemberName);
	}
	
	public String toString() {
		return message;
	}
}
