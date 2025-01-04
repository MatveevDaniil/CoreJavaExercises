/**
 * 
 */
package com.javaoo.store.drivers;

import com.javaoo.store.Artist;
import com.javaoo.store.InconsistentArtistException;

import java.util.TreeSet;
/**
 * @author developer
 *
 */
public class ArtistExerciser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Artist band = new Artist("school band");
		TreeSet<String> instruments = new TreeSet<> ();
		for (String instrument : new String[] {"Piano", "Guitar", "Drum"})
			instruments.add(instrument);
		band.addMember("Johny", instruments);
		TreeSet<String> instruments2 = new TreeSet<>(instruments);
		instruments2.remove("Piano");
		band.addMember("Steve", instruments2);
		System.out.println(band.getMembers());
		try {
			System.out.println(band.getMemberInstruments("Johny"));
			System.out.println(band.getMemberInstruments("Steve"));
			System.out.println(band.getMemberInstruments("Pete"));
		} catch (InconsistentArtistException iae) {
			System.out.println(iae);
			iae.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			System.out.print("some final actions");
		}
	}

}
