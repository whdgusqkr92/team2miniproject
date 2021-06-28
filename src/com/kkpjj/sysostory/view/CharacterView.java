package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class CharacterView extends JFrame{
	
	private JFrame mf;
	private JPanel statusPanel;
	private JPanel mapPanel;
	private JPanel charInfoPanel;

	public CharacterView() {
		
		mf = new JFrame();
		mf.setTitle("sysoStory");
		mf.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
		
		mf.setBounds(300, 75, 810, 630);
		
		statusPanel = new JPanel();
		statusPanel.setBounds(0, 420, 560, 180);
		
		mapPanel = new JPanel();
		mapPanel.setBounds(560, 420, 240, 180);

		Image statusBg = new ImageIcon("images/status.png").getImage().getScaledInstance(560, 180, 0);
		JLabel label1 = new JLabel(new ImageIcon(statusBg));
		
		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
		JLabel label2 = new JLabel(new ImageIcon(mapBg));
		
		statusPanel.add(label1);
		mapPanel.add(label2);
		
		mf.getContentPane().add(statusPanel);
		mf.getContentPane().add(mapPanel);
				
		// 아이템 창, 나가기 버튼
		
		charInfoPanel = new JPanel();
		charInfoPanel.setBounds(0, 0, 800, 410);
		mf.getContentPane().add(charInfoPanel);
		charInfoPanel.setLayout(null);
		
		JButton exitButton = new JButton();
		exitButton.setBounds(740, 10, 45, 45);
		exitButton.setIcon(new ImageIcon("images/exit.png"));
		charInfoPanel.add(exitButton);
		
		JPanel itemList = new JPanel();
		itemList.setBounds(0, 0, 804, 417);
		charInfoPanel.add(itemList);
		
		JPanel characterProfile = new JPanel();
		characterProfile.setBounds(50, 30, 136, 136);
		charInfoPanel.add(characterProfile);
		
//		itemList.setLayout(null);
		
		Image itemWindowBg = new ImageIcon("images/characterWindow.png").getImage();
		JLabel label3 = new JLabel(new ImageIcon(itemWindowBg));
		
		characterProfile.add(label3);
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
