import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Task1 extends JFrame implements ActionListener {
	
	JPanel panel1, panel2, mainPanel;
	JButton tokenize, root, tknButton;
	JTextField tokenizeField;
	JLabel tokenizeLabel;
	
	
	public Task1() {
		
		
		mainPanel = new JPanel(null);
		mainPanel.setBounds(0, 0, 1080, 720);
		
		panel1 = new JPanel(null);
		panel1.setBounds(0, 0, 180, 720);
		
		
		tokenize = new JButton("Tokenize");
		tokenize.setBounds(0, 0, 180, 100);
		
		root = new JButton("Root");
		root.setBounds(0, 100, 180, 100);
		
		panel1.add(tokenize);
		panel1.add(root);
		
		panel2 = new JPanel(null);
		panel2.setBounds(180, 0, 900, 720);
		
		
		tknButton = new JButton("Add Poem");
		tknButton.setBounds(662, 32, 120, 36);
		
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		add(mainPanel);
		
		setSize(1080, 720);
		setLocation(100, 0);
		setLayout(null);
		
		tokenize.addActionListener(this);
		tknButton.addActionListener(this);
		root.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tokenize) {
			
			panel2.removeAll();
			
			mainPanel.repaint();
		}
		if (e.getSource() == tknButton) {
			
			
			
			mainPanel.repaint();
			
		}
		if (e.getSource() == root) {
			
			panel2.removeAll();
			
			
			
			mainPanel.repaint();
		}
	}
	public static void main(String[] args) {
		new Task1();
	}
}