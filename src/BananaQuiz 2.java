

import javax.swing.JOptionPane;

public class BananaQuiz {
	public static void main(String[] args) {
		String Answer = JOptionPane.showInputDialog("Do you like banananas?");
		if(Answer.equals("Yes"))
		{
			String Answer2 = JOptionPane.showInputDialog("Yay! What's your hobby?");
			JOptionPane.showMessageDialog(null, "I like" + Answer2 + "too!");
		}else if(Answer.equals("No"))
		{
			JOptionPane.showMessageDialog(null, "SHAME ON UUUUUU");
			JOptionPane.showMessageDialog(null, "HUEHUEHUEHUEHUEHUEHUEHUEHUEHUEHUEHUEHUEHUEHUEHUEHUEHUEHUE");
		}else
		{
			JOptionPane.showMessageDialog(null, "Umm...doesn't compute :P");
		}
	}
	
}
