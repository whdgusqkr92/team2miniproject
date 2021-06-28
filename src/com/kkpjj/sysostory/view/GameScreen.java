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

public class GameScreen extends JFrame {
	
	private JFrame mf;
	private JPanel skilPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JTextField textField;

	public GameScreen() {
		mf = new JFrame();
		mf.setTitle("sysoStory");
		
		mf.setBounds(300, 75, 810, 630);
		mf.getContentPane().setLayout(null);
		
		skilPanel = new JPanel();
		skilPanel.setBounds(50, 100, 700, 220);
		
		
		statusPanel = new JPanel();
		statusPanel.setBounds(0, 420, 560, 180);
		
		mapPanel = new JPanel();
		mapPanel.setBounds(560, 420, 240, 180);
		
		
		
		Image background = new ImageIcon("images/skil.png").getImage().getScaledInstance(800, 600, 0);
		Image statusBg = new ImageIcon("images/hp.png").getImage().getScaledInstance(560, 180, 0);
		JLabel label2 = new JLabel(new ImageIcon(statusBg));
		
		Image mapBg = new ImageIcon("images/money.png").getImage().getScaledInstance(240, 180, 0);
		JLabel label3 = new JLabel(new ImageIcon(mapBg));
		statusPanel.add(label2);
		mapPanel.add(label3);
				
		mf.getContentPane().add(skilPanel);
		skilPanel.setLayout(new GridLayout(0, 3 , 50, 50));
		
	
	
		btnNewButton = new JButton("");
		
		skilPanel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("images/스킬창2.png"));
		
		btnNewButton_1 = new JButton("");
		skilPanel.add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("");
		skilPanel.add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("");
		skilPanel.add(btnNewButton_2);
		
		btnNewButton_4 = new JButton("");
		skilPanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		skilPanel.add(btnNewButton_5);
		mf.getContentPane().add(statusPanel);
		mf.getContentPane().add(mapPanel);
		
		JPanel skilHIpanel = new JPanel();
		skilHIpanel.setBounds(50, 20, 700, 43);
		
		mf.getContentPane().add(skilHIpanel);
		skilHIpanel.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(645, 0, 55, 43);
		skilHIpanel.add(btnNewButton_6);
		btnNewButton_6.setIcon(new ImageIcon("images/스킬 창 돌아가기.png"));						//버튼에 이미지 넣는법
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 341, 700, 63);
		mf.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 700, 63);
		panel.add(textField);
		textField.setColumns(10);
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GameScreen();
	}
}