 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		int Score = 0;
		String Image = "http://i866.photobucket.com/albums/ab228/heavyarms55/cat_watermelon.jpg";
		Component ImageHolder = createImage(Image);
		
		quizWindow.add(ImageHolder);
		quizWindow.pack();
		String Answer = JOptionPane.showInputDialog("What is this cat doing?");
		if(Answer.equals("Pushing a watermelon out of a lake")) {
			System.out.println("Correct!");
			Score += 2;
		}else if(Answer.equals("rolling a watermelon out of a lake")){
			System.out.println("Correct!");
			Score += 2;
		}else if(Answer.equals("Making your arguement invalid")){
			System.out.println("No, your arguement is invalid");
			Score += 1;
		}else{
			System.out.println("Incorrect!");
		}
		quizWindow.remove(ImageHolder);
		String Image2 = "http://i1033.photobucket.com/albums/a419/lol_girl7/funny/cat.gif";
		Component ImageHolder2 = createImage(Image2);
		quizWindow.add(ImageHolder2);
		quizWindow.pack();
		
		String Answer2 = JOptionPane.showInputDialog("What is Snowflake doing?");
		if(Answer2.equals("Trying to eat Mittens brains")){
			System.out.println("Correct!");
			Score += 2;
		}else if(Answer2.equals("trying to eat Mittens brains")){
			System.out.println("Correct!");
			Score += 2;
		}else{
			System.out.println("Incorrect!");
		}
		quizWindow.remove(ImageHolder2);
		String Image3 = "http://img.pandawhale.com/12660-cm126600500611f40e3e0gif-hXfk.gif";
		Component ImageHolder3 = createImage(Image3);
		quizWindow.add(ImageHolder3);
		quizWindow.pack();
		String Answer3 = JOptionPane.showInputDialog("What is happening here?");
		if(Answer3.equals("Perpetual Sunglasses Waterfall")){
			System.out.println("Correct!");
			Score += 2;
		}else if(Answer3.equals("Infinite Deal with It Sunglasses")){
			System.out.println("No...");
			Score += 1;
		}else{
			System.out.println("Nope!");
		}
		JOptionPane.showMessageDialog(null, "Your score is " + Score + " pts.");
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




