package com.kkpjj.sysostory.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class StartScreen extends JFrame {
	
	private JFrame mf;
	private JPanel loginPanel;
	private JLabel idLabel;

	
	public StartScreen() {
		
		mf = new JFrame();
		mf.setTitle("syso Story");
		
		mf.setBounds(600, 200, 800, 600);
		mf.getContentPane().setLayout(null);
		
		loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 800, 600);
		
		Image background = new ImageIcon("images/StartScreen.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);

		JPanel idPanel = new JPanel();
		idPanel.setLayout(null);
		JLabel idLabel = new JLabel("ID");
		idLabel.setBounds(30, 10, 36, 42);
		idLabel.setFont(new Font("굴림", Font.PLAIN, 36));
		idPanel.add(idLabel);
		idPanel.setBounds(200, 250, 100, 50);
		
		JPanel pwdPanel = new JPanel();
		pwdPanel.setLayout(null);
		JLabel pwdLabel = new JLabel("PWD");
		pwdLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		pwdLabel.setBounds(17, 8, 68, 36);
		pwdPanel.add(pwdLabel);
		pwdPanel.setBounds(200, 320, 100, 50);
		
		JPanel idTextPanel = new JPanel();
		idTextPanel.setLayout(null);
		idTextPanel.setBounds(320, 320, 300, 50);
		
		
//		JTextField idText = new JTextField();
//		idText.setBounds(67, 15, 6, 21);
//		JTextField pwdText = new JTextField();
//		pwdText.setBounds(320, 320, 300, 50);
//		loginPanel.setLayout(null);
		
		
//		loginPanel.add(idText);
//		loginPanel.add(pwdText);
		loginPanel.add(label);
		
				
		
		mf.getContentPane().add(idPanel);
		mf.getContentPane().add(pwdPanel);
		mf.getContentPane().add(loginPanel);
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}
