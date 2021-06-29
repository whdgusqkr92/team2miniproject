package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class GameScreen extends JFrame {
	
	private JFrame mf;
	private JPanel mainPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;

	public GameScreen() {
		mf = new JFrame();
		mf.setTitle("sysoStory");
		
		mf.setBounds(300, 75, 810, 630);
		mf.getContentPane().setLayout(null);
		
		mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 800, 420);
		
		statusPanel = new JPanel();
		statusPanel.setBounds(0, 420, 560, 180);
		
		mapPanel = new JPanel();
		mapPanel.setBounds(560, 420, 240, 180);


		
		Image statusBg = new ImageIcon("images/status.png").getImage().getScaledInstance(560, 180, 0);
		JLabel label2 = new JLabel(new ImageIcon(statusBg));
		
		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
		JLabel label3 = new JLabel(new ImageIcon(mapBg));
		

		statusPanel.add(label3);
		mapPanel.add(label3);
	

		mf.getContentPane().add(statusPanel);
		mf.getContentPane().add(mapPanel);
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GameScreen();
	}
}