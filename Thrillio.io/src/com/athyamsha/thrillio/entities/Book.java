package com.athyamsha.thrillio.entities;

import java.util.Arrays;

public class Book extends Bookmark {
	private long id;
	private String title;
	private int publicationYear;
	private String publisher;
	private String[] authors;
	private String genre;
	private double amazonRating;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getAmazonRating() {
		return amazonRating;
	}

	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publicationYear=" + publicationYear + ", publisher="
				+ publisher + ", authors=" + Arrays.toString(authors) + ", genre=" + genre + ", amazonRating="
				+ amazonRating + "]";
	}

}
