package org.teachingkidsprogramming.section01forloops;
import java.util.Random;
import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
for (int i = 0; i < 11; i++) {
	int randomNumber = new Random().nextInt(5);
	System.out.println(randomNumber);
	if(randomNumber == 1){
		System.out.println("You r not fgt");
	}else if(randomNumber == 2){
		System.out.println("You has a nice sweater");
	}else if(randomNumber == 3){
		System.out.println("You are so unique");
	}else if(randomNumber == 4){
		System.out.println("Your hair is fluffy");
	}else if(randomNumber == 5){
		System.out.println("You were born just in time to explore dank memes");
	}else if(randomNumber == 0){
		System.out.println("You r kewl");
	}
	/***if(i == 10){
		System.out.println("Jk");
	}***/
}
		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}