package org.teachingkidsprogramming.section01forloops;
import javax.swing.JOptionPane;

import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		int x = 0;
		int y = 400;
		String Colors = JOptionPane.showInputDialog("What color do you wish to select? Choose from blue, green, red and yellow");
		Tortoise.setSpeed(10);
		Tortoise.penUp();
		Tortoise.setX(x);
		Tortoise.setY(y);
		Tortoise.turn(90);
		int HouseSize = 1;
		for (int i = 0; i < 9; i++) {
			makeHouses(HouseSize, Colors);
			if(HouseSize <= 5){
				HouseSize += 2;
			}else if(HouseSize >= 5){
				HouseSize -= 3;
			}
		}
	}
	public static void makeHouses(int X, String Color){
		Tortoise.penDown();
		if(Color.equals("blue")){
			Tortoise.setPenColor(Colors.Blues.Blue);
		}else if(Color.equals("yellow")){
			Tortoise.setPenColor(Colors.Yellows.Gold);
		}else if(Color.equals("green")){
			Tortoise.setPenColor(Colors.Greens.ForestGreen);
		}else if(Color.equals("red")){
			Tortoise.setPenColor(Colors.Reds.Crimson);
		}
		Tortoise.move(15);
		Tortoise.turn(-90);
		Tortoise.move(15*X);
		Tortoise.turn(30);
		Tortoise.move(50);
		Tortoise.turn(120);
		Tortoise.move(50);
		Tortoise.turn(30);
		Tortoise.move(15*X);
		Tortoise.turn(-90);
		Tortoise.move(15);
	}
}