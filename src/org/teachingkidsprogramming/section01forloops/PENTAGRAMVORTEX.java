package org.teachingkidsprogramming.section01forloops;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PENTAGRAMVORTEX {
public static void main(String[]args )
{
	new PENTAGRAMVORTEX().makePrettyThings();
}
private void makePrettyThings()
{
	Tortoise.setSpeed(10);
	Tortoise.setPenColor(Colors.Greens.LawnGreen);
	for (int i = 0; i < 2000000000; i++) {
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.setPenWidth(0.7);
		Tortoise.move(100 + i);
		Tortoise.turn(201);
	}
		
}
}
