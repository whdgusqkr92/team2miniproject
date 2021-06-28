package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ResignCheckPwd extends JFrame{
	private JTextField textField;
	
	public ResignCheckPwd() {
		
		JFrame mf = new JFrame();
		mf.setBounds(0, 0, 800, 600);
		mf.setLocationRelativeTo(null);
		mf.setTitle("syso Story");
		mf.setLayout(null);
	
		JPanel panel = new JPanel();
		
		Image background = new ImageIcon("images/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);
		
		JPanel panel_1 = new JPanel(); /* 비밀번호 확인 회색 큰 창 */
		panel_1.setBounds(150, 200, 500, 200);
		panel_1.setBackground(Color.GRAY);
		mf.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel nickNameLabel = new JLabel("비밀번호 확인"); /* 비밀번호 확인 창 라벨 */
		nickNameLabel.setBounds(30, 70, 200, 25);
		panel_1.add(nickNameLabel);
		nickNameLabel.setFont(new Font("굴림", Font.PLAIN, 24));
		
		textField = new JTextField(); /* 비밀번호 입력 란 */
		textField.setBounds(195, 54, 260, 50);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("확인"); /* 확인 버튼 */
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 24));
		btnNewButton.setBounds(175, 130, 150, 50);
		panel_1.add(btnNewButton);
		
		
		mf.add(label);
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
}
