import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelExample_Extended {
	
	public JPanel createContentPane() {
		
	JPanel totalGUI = new JPanel();
	
	
	
	totalGUI.setLayout(null);
	totalGUI.setBackground(Color.YELLOW);
	JPanel redPanel = new JPanel();
	redPanel.setLayout(null);
	redPanel.setBackground(Color.red);
	redPanel.setLocation(10, 32);
	redPanel.setSize(100, 100);
	totalGUI.add(redPanel);
	JButton Stop = new JButton("Stop");
	Stop.setBackground(Color.gray);
	Stop.setBounds(15,40,70,20);
	redPanel.add(Stop);

	JLabel redLabel = new JLabel("red");
	redLabel.setLocation(0,0);
	redLabel.setSize(50,40);
	redLabel.setHorizontalAlignment(0);
	redPanel.add(redLabel);
	
	
	
	
	
	
	JPanel greenPanel = new JPanel();
	greenPanel.setBackground(Color.GREEN);
	greenPanel.setLocation(120, 32);
	greenPanel.setSize(330, 100);
	totalGUI.add(greenPanel);
	
	JLabel greenLabel = new JLabel("green");
	greenLabel.setLocation(0,0);
	greenLabel.setSize(50,40);
	greenLabel.setHorizontalAlignment(0);
	greenPanel.add(greenLabel);
	
	JPanel orangePanel = new JPanel();
	orangePanel.setLayout(null);
	orangePanel.setBackground(Color.ORANGE);
	orangePanel.setLocation(10, 140);
	orangePanel.setSize(550, 100);
	totalGUI.add(orangePanel);
	
	JLabel leftLabel = new JLabel("left");
	leftLabel.setLocation(0,30);
	leftLabel.setSize(50,40);
	leftLabel.setHorizontalAlignment(0);
	orangePanel.add(leftLabel);
	
	JLabel rightLabel = new JLabel("right");
	rightLabel.setLocation(500,30);
	rightLabel.setSize(50,40);
	rightLabel.setHorizontalAlignment(0);
	orangePanel.add(rightLabel);
	
	JPanel whitePanel = new JPanel();
	whitePanel.setLayout(null);
	whitePanel.setBackground(Color.white);
	whitePanel.setLocation(50, 10);
	whitePanel.setSize(450, 80);
	orangePanel.add(whitePanel);
	
	JPanel cyanPanel = new JPanel();
	cyanPanel.setLayout(null);
	cyanPanel.setBackground(Color.cyan);
	cyanPanel.setLocation(10, 10);
	cyanPanel.setSize(430, 60);
	whitePanel.add(cyanPanel);
	
	JButton push = new JButton("Push Me");
	push.setBackground(Color.gray);
	
	push.setBounds(170,20,100,20);
	cyanPanel.add(push);
	
	JPanel bluePanel = new JPanel();
	bluePanel.setLayout(null);
	bluePanel.setLayout(null);
	bluePanel.setBackground(Color.BLUE);
	bluePanel.setLocation(460, 32);
	bluePanel.setSize(100, 100);
	totalGUI.add(bluePanel);
	JButton b2 = new JButton("go");
	b2.setBackground(Color.gray);
	
	b2.setBounds(15,40,70,20);
	bluePanel.add(b2);
	
	JLabel blueLabel = new JLabel("blue");
	blueLabel.setLocation(0,0);
	blueLabel.setSize(50,40);
	blueLabel.setHorizontalAlignment(0);
	bluePanel.add(blueLabel);

	
	return totalGUI;
	}
	
	
	
}
