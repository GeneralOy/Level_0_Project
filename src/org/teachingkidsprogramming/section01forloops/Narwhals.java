package org.teachingkidsprogramming.section01forloops;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.io.IOException;

public class Narwhals {
public static void main(String[] args) {
	String N = "Huehuehue";
	String O = "Meh";
	String n = "Ye";
	int Number = 0;
	for (int i = 1; i < 5; i++) {
		narwhalz(N);
		if (Number == 0) {
			speak("" + O);
			Number = 0;
		} else {
			speak("" + n);
			Number = 1;
		}
	}
	speak("Huey you'd always be mine");
}

private static void narwhalz(String N) {
	for (int j = 0; j < 3; j++) {
		speak ("" + N);
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
