// Copyright Wintriss Technical Schools 2013
/****** MUST BE USED WITH JAVA 1.6 *****/

import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class FeedTheTortoise implements KeyEventDispatcher
{
	int X = new Random().nextInt(300);
	int Y = new Random().nextInt(300);

	private void feedTheTortoise()
	{
		addFood(X, Y);
		//400 max y, 450-500 max x
	}

private void goUp()
	{
		Tortoise.setPenColor(Colors.getRandomColor());
		System.out.println("going up");
		Tortoise.move(5);
	}

	private void goDown()
	{
		Tortoise.setPenColor(Colors.getRandomColor());
		System.out.println("going down");
		Tortoise.move(-5);
	}
	
	private void goLeft()
	{
		Tortoise.setPenColor(Colors.getRandomColor());
		System.out.println("right");
		Tortoise.turn(-90);
		Tortoise.move(5);
		Tortoise.turn(90);
	}

	private void goRight()
	{
		Tortoise.setPenColor(Colors.getRandomColor());
		System.out.println("left");	
		Tortoise.turn(90);
		Tortoise.move(5);
		Tortoise.turn(-90);
		}

	private void checkIfFoodFound() throws Exception
	{
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
		System.out.println(tortoiseLocationX);
		System.out.println(tortoiseLocationY);
		if (tortoiseLocationX > (X) && tortoiseLocationX < (X + 10)) {
			if (tortoiseLocationY > (Y) && tortoiseLocationY < (Y + 10)) {
						System.out.println("CHOMPYHUE!");
						eatFood();
			}
			
		}
		
	}

private void eatFood() {
		component.setText("");
	}

	private void addFood(int x, int y)
	{
		component.setLocation(x, y);
		window.add(component);
	}

	TurtlePanel window = Tortoise.getBackgroundWindow();
Label component = new Label("*");

	public static void main(String[] args)
	{
		FeedTheTortoise feeder = new FeedTheTortoise();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise() 
{
KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				 goDown();
			try {
			checkIfFoodFound();
			} catch (Exception exception) {}
		}
		return false;
	}

}
