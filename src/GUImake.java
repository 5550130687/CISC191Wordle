import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
public class GUImake extends JFrame
{
	
	private JPanel centerPanel;
	private JPanel southPanel;
	private JButton ELDROW;
	private JButton DNIMRETSAM;
	private JLabel Would;
	
	public GUImake()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//CenterPanel 1
		centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		add(centerPanel,BorderLayout.CENTER);
		setSize(500,300);

		
		
		//First - JLable - Would you want to play
		JLabel wouldyouLable = new JLabel();
		wouldyouLable = new JLabel(""
				+ "                                                   Would you want to play");
		
		
		//SOUTHPanel 2
		southPanel = new JPanel();		
		add(southPanel,BorderLayout.SOUTH);
		//Second - JButton - ELDROW
		JButton ELDROWsouthPanel = new JButton();
		ELDROWsouthPanel = new JButton("ELDROW");	
				
		
		//Third - JButton - DNIMRETSAM
		JButton DNIMRETSAMsouthPanel = new JButton();
		DNIMRETSAMsouthPanel = new JButton("DNIMRETSAM");
		
		centerPanel.add(wouldyouLable);
		southPanel.add(ELDROWsouthPanel);
		southPanel.add(DNIMRETSAMsouthPanel);
		
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		GUImake main = new GUImake();
	}
}

