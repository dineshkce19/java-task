package org.creators.movie;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieBuff obj = new MovieBuff();
		Scanner input = new Scanner(System.in);
		while(true){
			Movie newMovie = new Movie();
			System.out.print("\nMovie Name:");
			String movieName = input.nextLine().toLowerCase();
			System.out.print("\nRating out of 10:");
			newMovie.setRating(input.nextInt());
			obj.insertRating(movieName,newMovie);
			byte flag;
			System.out.print("\nEnter 1 to continue 0 to exit\nChoice:");
			flag = input.nextByte();input.nextLine();
			if(flag!=1)
				break;
		}
		System.out.println(obj);
	}

}
