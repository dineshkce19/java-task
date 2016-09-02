package org.creators.movie;

public class Movie {
	private int rating=0;
	private int review =1;
	public Movie() {
		super();
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating += rating;
	}
	public int getReview() {
		return review;
	}
	public void setReview() {
		//this.review = review;
		this.review++;
	}
	
	
}
