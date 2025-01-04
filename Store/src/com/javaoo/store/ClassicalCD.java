package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
	private String composer;
	private final int PERFORMERS_LIMIT = 5;
	private String[] performers = new String[PERFORMERS_LIMIT];
	private int performerCount = 0;
	private String recordingLocation;
	private Date releaseDate;
	
	public ClassicalCD(
			String title, int quantity, double price, 
			String composer, String[] performers, String recordingLocation, Date releaseDate) {
		super(title, quantity, price);
		setComposer(composer);
		for (String performer: performers)
			addPerformer(performer);
		setRecordingLocation(recordingLocation);
		setReleaseDate(releaseDate);
	}
	
	public void addPerformer(String performer) {
		if (performerCount < PERFORMERS_LIMIT) {
			performers[performerCount] = performer;
			performerCount++;
		} else {
			System.out.printf("ClassicalCD object cannot have more than %d performers\n", PERFORMERS_LIMIT);
		}
			
	}
	
	public void showPerformers() {
		System.out.print("Performers List: ");
		for (int i = 0; i < performerCount; i++)
			System.out.printf("%s, ", performers[i]);
		System.out.println();
	}
	
	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getRecordingLocation() {
		return recordingLocation;
	}

	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

}
