import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
public class wordleGUI extends JFrame
{
	private JPanel northPanel;
	private JPanel centerPanel;
	private JPanel southPanel;

	private JLabel Would;
	
	public wordleGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//northPanel 1
		northPanel = new JPanel();
		northPanel.setLayout(new BorderLayout());
		add(northPanel,BorderLayout.NORTH);
		setSize(500,300);

		//First - JLable - Would you want to play
		JLabel makeAguessLable = new JLabel();
		makeAguessLable = new JLabel(""
				+ "                                                   Make A Guess");
		//centerPanel 2
		southPanel = new JPanel();		
		add(southPanel,BorderLayout.CENTER);
		//Second - JButton - ELDROW
		JButton ELDROWsouthPanel = new JButton();
		ELDROWsouthPanel = new JButton("ELDROW");		
				
		//SOUTHPanel 3
		
		//Fist - Text field
		JPanel textPanel = new JPanel();
		JLabel textLabel = new JLabel("letter:");
		textField = new JTextField("Put Your Name Here");
		textPanel.add(textLabel);
		textPanel.add(textField); 
				
		componentPanel.add(textPanel);		
		southPanel = new JPanel();		
		add(southPanel,BorderLayout.SOUTH);
		
		JLabel playHereLable = new JLabel();
		makeAguessLable = new JLabel(""
				+ "                                                   Make you Guess here");
		
				
		
		
		
		centerPanel.add(makeAguessLable);
		southPanel.add(ELDROWsouthPanel);
		southPanel.add(playHereLable);
		
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		GUImake main = new GUImake();
	}
}