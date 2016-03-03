package com.test.lab6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Myscreen extends JFrame implements ActionListener {
	JButton button1,button2;
	JLabel mylable1;
	JTextField mytxt;
	JScrollBar bar1;
	JRadioButton bb2;
	
	//constructor
	public Myscreen(String title)
	{
		super (title);
		setLayout(new GridLayout(0,2));
		mylable1 = new JLabel("this is a lable");
		add(mylable1);
		
		button1 = new JButton("click");
		add(button1);
		
		button1.addActionListener(this);
		
		button2 = new JButton("click again");
		add(button2);
		
		mytxt = new JTextField("this is a txt field", 15);
		add(mytxt);
		
		bar1 = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 500);
		add(bar1);
		
		bb2 = new JRadioButton("this is a radio button");
		add(bb2);
		
		setVisible(true);
		
		setLocation(500, 300);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "MyFirst event!");
	}
	
	

}
