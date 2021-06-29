package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class PotionShopView extends JPanel {
	
	private JFrame mf;
	private JPanel drenchPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;
	
	private ImageIcon bg = null;

	public PotionShopView() {
		
//		mf.setBounds(300, 75, 810, 630);
		
//		statusPanel = new JPanel();
//		statusPanel.setBounds(0, 420, 560, 180);
//		
//		mapPanel = new JPanel();
//		mapPanel.setBounds(560, 420, 240, 180);
//
//		Image statusBg = new ImageIcon("images/status.png").getImage().getScaledInstance(560, 180, 0);
//		JLabel label1 = new JLabel(new ImageIcon(statusBg));
//		
//		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
//		JLabel label2 = new JLabel(new ImageIcon(mapBg));
//		
//		statusPanel.add(label1);
//		mapPanel.add(label2);
//		
//		mf.getContentPane().add(statusPanel);
//		mf.getContentPane().add(mapPanel);
		
		
		// 아이템 창, 나가기 버튼
		
		drenchPanel = new JPanel();
		drenchPanel.setBounds(0, 0, 800, 419);
		mf.getContentPane().add(drenchPanel);
		drenchPanel.setLayout(null);
		
		JButton exitButton = new JButton();
		exitButton.setBounds(750, 0, 45, 45);
		exitButton.setIcon(new ImageIcon("images/exit.png"));
		drenchPanel.add(exitButton);
		
		JPanel itemList = new JPanel();
		itemList.setBackground(Color.LIGHT_GRAY);
		itemList.setBounds(5, 50, 387, 275);
		drenchPanel.add(itemList);
		itemList.setLayout(null);
		
		Image itemWindowBg = new ImageIcon("images/itemWindow.png").getImage();
		JLabel label3 = new JLabel(new ImageIcon(itemWindowBg));
		
		itemList.add(label3);
		
		JPanel itemDirection = new JPanel();
		itemDirection.setLayout(null);
		itemDirection.setBounds(0, 325, 400, 90);
		drenchPanel.add(itemDirection);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setFont(new Font("둥근모꼴", Font.PLAIN, 18));
		textPane.setText("여기는 아이템의 설명이 출력되는 화면이다.");
		textPane.setToolTipText("");
		textPane.setBounds(5, 5, 389, 80);
		itemDirection.add(textPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(5, 0, 136, 45);
		drenchPanel.add(panel);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setFont(new Font("둥근모꼴", Font.PLAIN, 25));
		textPane_1.setText("물약상점");
		panel.add(textPane_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(404, 50, 391, 365);
		drenchPanel.add(panel_1);
		
		
		bg = new ImageIcon("images/test.png");
		
		// 마을, 물약 상인
		
		JPanel itemPanel = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(bg.getImage(), 0, 0, 800, 520, null);
			}
			
		};
		
		
		itemPanel.setBounds(0, 0, 810, 419);
		mf.getContentPane().add(itemPanel);
		itemPanel.setLayout(null);
		
		JButton drenchButton = new JButton();
		drenchButton.setBounds(98, 55, 70, 100);
		drenchButton.setIcon(new ImageIcon("images/물약상인.png"));
		drenchButton.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
		itemPanel.add(drenchButton);
		
		
		drenchPanel.setVisible(false);
		
		drenchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				drenchPanel.setVisible(true);
				itemPanel.setVisible(false);
			}
		});
		
		exitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				itemPanel.setVisible(true);
				drenchPanel.setVisible(false);
			}
		});
		
		mf.setVisible(true);
		mf.setResizable(false);
	}
}
