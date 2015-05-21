import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {
		// 1. Find out what mood the user is in. Store their answer in a variable.
		int choice = JOptionPane.showOptionDialog(null,"Happy, Sad, Mad, CATS, Dank, Cat? or I dunno?","Choose an option",
				JOptionPane.YES_NO_OPTION, //int optionType
                JOptionPane.INFORMATION_MESSAGE, //int messageType
                null, //Icon icon,
                new String[]{"Happy","Sad", "I dunno", "Mad", "Dank", "CATS", "Cat?"},
                "Happy"); 
		//String Mood = JOptionPane.showInputDialog("What mood are you in?");
		if (choice == 0) {
			playVideo("https://youtu.be/EIyixC9NsLI");
		} else if(choice == 1) {
			playVideo("https://youtu.be/YedVpRzF900");
		} else if(choice == 2){
			playVideo("https://youtu.be/6Xn0Q2m6TAg");
		} else if(choice == 3){
			playVideo("https://youtu.be/2VXacYLcjGA");
		} else if(choice == 4){
			playVideo("https://youtu.be/LX60FSy1Nb0");
		} else if(choice == 5){
			playVideo("https://youtu.be/sP4NMoJcFd4");
		} else if(choice == 6){
			playVideo("https://youtu.be/0A-Czuqzdt0");
		}
		// 3. Play different songs for other moods

		// If you are seeing ads at the beginning of your videos, install Adblock.
		
	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
