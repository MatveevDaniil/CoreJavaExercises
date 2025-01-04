package com.javaoo.store;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Artist {
	private String name;
	private SortedSet<String> memberNames;
	private Map<String, SortedSet<String>> memberInstruments;
	
	public Artist() {
		memberNames = new TreeSet<>();
		memberInstruments = new HashMap<>();
	}
	
	public Artist(String name) { 
		this();
		setName(name); 
	}
	
	public void addMember(String name, SortedSet<String> instruments) {
		memberNames.add(name);
		memberInstruments.put(name, instruments);
	}
	
	public SortedSet<String> getMembers() {
		return memberNames;
	}
	
	public SortedSet<String> getMemberInstruments(String memberName) throws Exception, InconsistentArtistException {
		// forcing the InconsistentArtistException to happen:
		// memberNames.remove(memberName);
		// forcing some other exception to happen
		if (memberName == "Pete")
			throw new Exception("some other exception");
		if (memberNames.contains(memberName) != memberInstruments.containsKey(memberName)) {
			throw new InconsistentArtistException(name, memberName);
		} else if (memberNames.contains(memberName) == false) {
			System.out.printf("Artist `%s` doesn't have a member named `%s`\n", name, memberName);
		}
		return memberInstruments.get(memberName);
			
	}
	
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
}