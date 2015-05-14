package org.teachingkidsprogramming.section01forloops;
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "April 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "Febuary 15th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String Answer1 = JOptionPane.showInputDialog("What birthday do you wish to retrieve?");
		// 3. Print out what the user typed
		if(Answer1.equals("Mom"))
		{
			JOptionPane.showMessageDialog(null, "Your mom's birthday is " + momsBirthday);
		} else if(Answer1.equals("Dad"))
		{
			JOptionPane.showMessageDialog(null, "Your dad's birthday is " + dadsBirthday);
		} else if(Answer1.equalsIgnoreCase("Me"))
		{
			JOptionPane.showMessageDialog(null, "Your birthday is " + myBirthday);
		} else
		{
			JOptionPane.showMessageDialog(null, "Sorry, that birthday is invalid");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}

