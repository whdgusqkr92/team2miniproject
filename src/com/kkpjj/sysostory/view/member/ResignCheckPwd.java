package com.kkpjj.sysostory.view.member;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ResignCheckPwd extends JFrame{
	private JTextField textField;
	
	public ResignCheckPwd() {
		
		JFrame mf = new JFrame();
		mf.setBounds(0, 0, 800, 600);
		mf.setLocationRelativeTo(null);
		mf.setTitle("syso Story");
		mf.getContentPane().setLayout(null);
	
		JPanel panel = new JPanel();
		
		Image background = new ImageIcon("images/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);
		
		Image window = new ImageIcon("images/characterWindow.png").getImage().getScaledInstance(500, 200, 0);
		JLabel windowLabel = new JLabel(new ImageIcon(window));			/* 비밀번호 확인 창 */
		windowLabel.setBounds(150, 200, 500, 200);
		windowLabel.setLayout(null);
		mf.getContentPane().add(windowLabel);
		
		
		JLabel nickNameLabel = new JLabel("비밀번호 확인"); 					
		nickNameLabel.setForeground(Color.WHITE);/* 비밀번호 확인 창 라벨 */
		nickNameLabel.setBounds(30, 65, 200, 25);
		windowLabel.add(nickNameLabel);
		nickNameLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		
		JPasswordField pwdText = new JPasswordField(20); 
		pwdText.setFont(new Font("둥근모꼴", Font.PLAIN, 24));				/* 비밀번호 입력 란 */
		pwdText.setBounds(195, 54, 260, 50);
		windowLabel.add(pwdText);
		pwdText.setColumns(10);
		
		JButton btnNewButton = new JButton("확인"); 						/* 확인 버튼 */
		btnNewButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		btnNewButton.setBounds(175, 130, 150, 50);
		windowLabel.add(btnNewButton);
		
		mf.getContentPane().add(label);
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
}
