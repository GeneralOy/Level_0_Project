// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		int Turn = 0;
		// 3. Make a variable to hold the number of sides and set it to 0
		String Number = JOptionPane.showInputDialog("Shape?");
		int number = Integer.parseInt(Number);
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		if (Number.equals("Triangle")) {
			Turn = (120);
			CreateShape(Turn);
		}else if(Number.equals("Square")) {
			Turn = (90);
			CreateShape(Turn);
		}else if(number == (number)){
			CreateShape(number);
		}else if(Number.equals(Number)){
			JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw a " + Number);
		}
		
	}

	private static void CreateShape(int Turn) {
		for (int j = 0; j < 1000; j++) {
			Tortoise.setPenWidth(0.75);
			Tortoise.setSpeed(10);
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.move(j);
			Tortoise.turn(0 + (Turn));
			
		}
	}

}

