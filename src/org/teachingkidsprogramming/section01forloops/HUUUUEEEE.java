package org.teachingkidsprogramming.section01forloops;

import java.io.IOException;

import javax.swing.JOptionPane;

public class HUUUUEEEE {
	public static void main(String[] args) {
		String Hues = JOptionPane.showInputDialog("How many Hues?");
		int Hueing = Integer.parseInt(Hues);
		for (int i = 0; i < Hueing; i++) {
			speak("HueHueHueHueHueHueHueHueHueHueHueHue?");
		}
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

}
