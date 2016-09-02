package org.creators.movie;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MovieBuff {
	Map<String,Movie> feedBack = new TreeMap<String,Movie>();
	public void insertRating(String movieName,Movie newMovie){
		if(feedBack.containsKey(movieName)){
			feedBack.get(movieName).setRating(newMovie.getRating());
			feedBack.get(movieName).setReview();
		}
		else{
			feedBack.put(movieName, newMovie);
		}
	}		
	public String toString(){
		String str = "";
		str += "\nMovie\tRating\tReviews\n";
		for(Map.Entry<String, Movie> obj:feedBack.entrySet()){
			//System.out.println("\n"+obj.getKey()+"\t"+((float)obj.getValue().getRating()/obj.getValue().getReview())+"\t"+obj.getValue().getReview());
			str += "\n"+obj.getKey()+"\t"+((float)obj.getValue().getRating()/obj.getValue().getReview())+"\t"+obj.getValue().getReview();
		}
		return str;
	}
}
