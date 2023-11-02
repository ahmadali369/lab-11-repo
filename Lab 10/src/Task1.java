import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Task1 extends JFrame implements ActionListener {
	
	JPanel panel1, panel2, mainPanel;
	JButton tokenize, tknButton;
	JTextField tokenizeField;
	JLabel tokenizeLabel;
	DefaultTableModel model;
	JTable table;
//	JScrollPane scrollPane;
	JComboBox dropDownRoots; 
	
	JLabel tokenJLabe; 
	JLabel rootJLabel; 
	
	public Task1() {
		

 
		tokenJLabe = new JLabel("tokens");
		rootJLabel = new JLabel("roots");
		
		tokenJLabe.setBounds(100, 190, 50, 36);
		rootJLabel.setBounds(100, 210, 50, 36);

		
		
		
		mainPanel = new JPanel(null);
		mainPanel.setBounds(0, 0, 1080, 720);
		
		panel1 = new JPanel(null);
		panel1.setBounds(0, 0, 180, 720);
		
		tokenize = new JButton("Tokenize");
		tokenize.setBounds(0, 0, 180, 100);
		
		tokenizeLabel = new JLabel("Tokenize:");
		tokenizeLabel.setBounds(200, 112, 150, 36);
		
		tokenizeField = new JTextField();
		tokenizeField.setBounds(300, 116, 250, 30);
		
		tknButton = new JButton("Tokenize");
		tknButton.setBounds(600, 112, 120, 36);
		

		
		panel1.add(tokenize);

		
		panel2 = new JPanel(null);
		panel2.setBounds(180, 0, 900, 720);
		
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		add(mainPanel);
		
		setSize(1080, 720);
		setLocation(100, 0);
		setLayout(null);
		
		tokenize.addActionListener(this);
		tknButton.addActionListener(this);

		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tokenize) {
			
			panel2.removeAll();
			
			panel2.add(tokenizeLabel);
			panel2.add(tokenizeField);
			panel2.add(tknButton);
			
			
			mainPanel.repaint();
		}
		if (e.getSource() == tknButton) {
			
			model = new DefaultTableModel();
			
			String poemString = tokenizeField.getText();
			String[] poem = poemString.split(" ");
			
			
			
			
			for (String s : poem) {
				model.addColumn("");
			}
			
			String[] roots = {"حديق", "حمر", "ورد", "شرق", "ألوان" ,"فتح", "حزن", "قلب","سعد", "جميل", "رائحة", "عطي"};

			
			
			model.addRow(poem);
			model.addRow(roots);
			
			table = new JTable(model);
			table.setBounds(150, 200, 500, 200);
			panel2.add(table);
			
			panel2.add(tokenJLabe); 
			panel2.add(rootJLabel); 
			
			mainPanel.repaint();
			
		}

	}
	public static void main(String[] args) {
		new Task1();
	}
}