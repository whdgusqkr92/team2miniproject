package com.kkpjj.sysostory.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NickName extends JFrame{
	private JTextField textField;

	public NickName() {
		
		JFrame mf = new JFrame();
		mf.setBounds(0, 0, 800,600);
		mf.setLocationRelativeTo(null);
		mf.setTitle("syso Story");
		mf.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		
		Image background = new ImageIcon("images/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);
		
		
		Image window = new ImageIcon("images/characterWindow.png").getImage().getScaledInstance(500, 200, 0);
		JLabel windowLabel = new JLabel(new ImageIcon(window));			/* 닉네임 창 */
		windowLabel.setBounds(150, 200, 500, 200);
		windowLabel.setLayout(null);
		mf.getContentPane().add(windowLabel);
		
		JLabel nickNameLabel = new JLabel("닉네임 : "); 					
		nickNameLabel.setForeground(Color.WHITE);/* 닉네임 라벨 창 */
		nickNameLabel.setBounds(80, 65, 120, 25);
		windowLabel.add(nickNameLabel);
		nickNameLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		
		textField = new JTextField(); 									
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("둥근모꼴", Font.PLAIN, 24));/* 닉네임 입력 란 */
		textField.setBounds(195, 54, 260, 50);
		windowLabel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("확인");						
		btnNewButton.setForeground(Color.BLACK);/* 확인 버튼 */
		btnNewButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		btnNewButton.setBounds(175, 130, 150, 50);
		windowLabel.add(btnNewButton);
		
		
		mf.getContentPane().add(label);
		

		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
