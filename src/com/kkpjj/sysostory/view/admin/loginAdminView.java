package com.kkpjj.sysostory.view.admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kkpjj.sysostory.controller.AdminController;

public class loginAdminView {
	
	private JFrame mf;
	private JPanel panel;
	
	
	public loginAdminView() {
		mf = new JFrame();
		mf.setBounds(0, 0, 800, 600);
		mf.setLocationRelativeTo(null);
		mf.getContentPane().setLayout(null);
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 800, 600);
		panel.setLayout(null);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.PINK);
		centerPanel.setForeground(Color.WHITE);
		centerPanel.setBounds(200, 150, 400, 300);
		centerPanel.setLayout(null);
		
		JTextField idText = new JTextField();
		idText.setBounds(100, 80, 260, 45);
		centerPanel.add(idText);
		
		JPasswordField pwdText = new JPasswordField();
		pwdText.setBounds(100, 150, 260, 45);
		centerPanel.add(pwdText);
		
		JButton loginButton = new JButton("로그인");
		loginButton.setBounds(80, 230, 100, 40);
		centerPanel.add(loginButton);
		
		loginButton.addActionListener(new ActionListener() {
			
			AdminController adminController = new AdminController();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(idText.getText().length() > 0 && pwdText.getPassword().length > 0) {
					int result = adminController.adminLogin(idText, pwdText);
				}
			}
		});
		
		JButton cancelButton = new JButton("취소");
		cancelButton.setBounds(220, 230, 100, 40);
		centerPanel.add(cancelButton);
		
		JLabel centerTopLabel = new JLabel("관리자 로그인");
		centerTopLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		centerTopLabel.setBounds(120, 30, 160, 25);
		centerPanel.add(centerTopLabel);
		
		JLabel centerIdLabel = new JLabel("ID");
		centerIdLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		centerIdLabel.setBounds(58, 91, 30, 15);
		centerPanel.add(centerIdLabel);
		
		JLabel centerPwdLabel = new JLabel("PWD");
		centerPwdLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		centerPwdLabel.setBounds(52, 161, 36, 15);
		centerPanel.add(centerPwdLabel);
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.PINK);
		topPanel.setBounds(0, 0, 800, 40);
		topPanel.setLayout(null);
		
		JLabel topLabel = new JLabel("관리자 모드");
		topLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		topLabel.setBounds(10, 0, 135, 40);
		topPanel.add(topLabel);

		panel.add(centerPanel);
		panel.add(topPanel);
		mf.getContentPane().add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
