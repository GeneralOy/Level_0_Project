package org.teachingkidsprogramming.section01forloops;

//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipies".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	String CassidySuperpower = "AN MLG";
	String ColeSuperPower = "NARWHALSNARWHALSNARWHALSNARWHALSNARWHALS";
	String GabrielSuperPower = "Turn into paulo";
	String PauloSuperPower = "nawwhals!";
	String DaneSuperPower = "LIFEHACKZ";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String NAME = JOptionPane.showInputDialog(null, "What is your name?");
	if (NAME.equals("Cassidy")) {
		JOptionPane.showMessageDialog(null, NAME + ", your superpower is " + CassidySuperpower);
	} else if(NAME.equals("Cole")) {
		JOptionPane.showMessageDialog(null, NAME + ", your superpower is " + ColeSuperPower);
	}else if(NAME.equals("Gabriel")) {
		JOptionPane.showMessageDialog(null, NAME + ", your superpower is " + GabrielSuperPower);
	}else if(NAME.equals("Paulo")) {
		JOptionPane.showMessageDialog(null, NAME + ", your superpower is " + PauloSuperPower);
	}else if(NAME.equals("Dane")) {
		JOptionPane.showMessageDialog(null, NAME + ", your superpower is " + DaneSuperPower);
	}

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}


