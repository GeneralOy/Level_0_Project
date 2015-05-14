package org.teachingkidsprogramming.section01forloops;
//Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;
public class ChangeCalculator {

	public static void main(String[] args) {
		String stringNickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int intNickels = Integer.parseInt(stringNickels);
		String stringDimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int intDimes = Integer.parseInt(stringDimes);
		String stringQuarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int intQuarters = Integer.parseInt(stringQuarters);
		int money1 = intQuarters * 25;
		int money2 = intDimes * 10;
		int money3 = intNickels * 5;
		int minorChange = money1 + money2 + money3;
		int totalChange = minorChange/100;
		JOptionPane.showConfirmDialog(null, "You have " + totalChange + "$ in change");
		if (totalChange > 5)
		{
			JOptionPane.showConfirmDialog(null, "Gimme moneys");
		}
		int CAKE = JOptionPane.showConfirmDialog(null, "Do you want a cake?");
		JOptionPane.showMessageDialog(null, "well, THE CAKE IS A LIE");
		
		
	}
}

