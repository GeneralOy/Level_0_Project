package org.teachingkidsprogramming.section01forloops;

import java.net.URI;
import javax.swing.JOptionPane;

public class CrazyCatLady {
	
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String Cats = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
		int CatsNumber = Integer.parseInt(Cats);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if(CatsNumber > 3){
			JOptionPane.showMessageDialog(null, "Y0U R CRAZY CAT LADY");
			playVideo("https://youtu.be/mTTwcCVajAc");
		}else if(CatsNumber < 3){
			JOptionPane.showMessageDialog(null, "Y0U R NORMAL FGT");
			playVideo("https://youtu.be/SKRgktzRvZ0");
		}
		// 4. If they have 3 or less, call the method below to show them a cat video

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
