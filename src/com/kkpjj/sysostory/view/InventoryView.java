package com.kkpjj.sysostory.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.Button;
import javax.swing.Box;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;

public class InventoryView extends JFrame{
	
	private JFrame mf;
	private JPanel mainPanel;
	
	public InventoryView() {
		
		mf = new JFrame();
		mf.setBounds(300, 75, 810, 630);
		mf.getContentPane().setLayout(null);
		
		setFont(new Font("둥근모꼴", Font.PLAIN, 16));
		
		JPanel statusPanel = new JPanel();
		statusPanel.setBounds(0, 387, 560, 180);
		getContentPane().add(statusPanel);
		
		JLabel label2 = new JLabel((Icon) null);
		statusPanel.add(label2);
		
		JPanel mapPanel = new JPanel();
		mapPanel.setBounds(560, 387, 240, 180);
		getContentPane().add(mapPanel);
		
		JLabel label3 = new JLabel((Icon) null);
		mapPanel.add(label3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 70);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 317, 800, 70);
		getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 80, 800, 227);
		getContentPane().add(panel_2);
		
		mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 800, 420);
		
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
