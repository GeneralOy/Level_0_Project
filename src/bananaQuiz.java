// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String Answer = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
		if (Answer.equals("No"))
		{
			JOptionPane.showMessageDialog(null, "You be crayzy");
		} else if(Answer.equals("Yes"))
		{
			String Answer2 = JOptionPane.showInputDialog("What is your hobby?");
			JOptionPane.showMessageDialog(null, "" + Answer2 + "is much better with bananas than that guy :P");
		}else if(Answer.equals("MLG"))
		{
			JOptionPane.showMessageDialog(null, "YE MLG :D");
		}else
		{
			JOptionPane.showMessageDialog(null, "You failed at dis quiz...F-. . . :P");
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	
	}
}
