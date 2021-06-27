package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameScreen extends JFrame {
	
	private JFrame mf;
	private JPanel mainPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;

	public GameScreen() {
		mf = new JFrame();
		
		mf.setBounds(300, 75, 810, 630);
		mf.setLayout(null);
		
		mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 800, 420);
		
		statusPanel = new JPanel();
		statusPanel.setBounds(0, 420, 560, 180);
		
		mapPanel = new JPanel();
		mapPanel.setBounds(560, 420, 240, 180);
		Image background = new ImageIcon("images/test.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		Image statusBg = new ImageIcon("images/status.png").getImage().getScaledInstance(560, 180, 0);
		JLabel label2 = new JLabel(new ImageIcon(statusBg));
		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
		JLabel label3 = new JLabel(new ImageIcon(mapBg));
		
		mainPanel.add(label);
		statusPanel.add(label2);
		mapPanel.add(label3);
				
		mf.add(mainPanel);
		mf.add(statusPanel);
		mf.add(mapPanel);
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}