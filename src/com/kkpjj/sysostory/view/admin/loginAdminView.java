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
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.member.StartScreen;

public class loginAdminView extends JPanel{
	
	private JFrame mf;
	private JPanel panel;
	
	
	public loginAdminView(JFrame mf) {
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 800, 600);
		panel.setLayout(null);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.PINK);
		centerPanel.setForeground(Color.WHITE);
		centerPanel.setBounds(200, 150, 400, 300);
		centerPanel.setLayout(null);
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.PINK);
		topPanel.setBounds(0, 0, 800, 40);
		topPanel.setLayout(null);
		
		JLabel topLabel = new JLabel("관리자 모드");
		topLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		topLabel.setBounds(10, 0, 135, 40);

		panel.add(topLabel);
		panel.add(topPanel);
		panel.add(centerPanel);
		
		JLabel centerPwdLabel = new JLabel("PWD");
		centerPwdLabel.setBounds(44, 162, 36, 15);
		centerPanel.add(centerPwdLabel);
		centerPwdLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		
		JLabel centerIdLabel = new JLabel("ID");
		centerIdLabel.setBounds(50, 92, 30, 15);
		centerPanel.add(centerIdLabel);
		centerIdLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		
		JLabel centerTopLabel = new JLabel("관리자 로그인");
		centerTopLabel.setBounds(112, 31, 160, 25);
		centerPanel.add(centerTopLabel);
		centerTopLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		
		JButton cancelButton = new JButton("취소");
		cancelButton.setBounds(212, 231, 100, 40);
		centerPanel.add(cancelButton);
		
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUtil.changePanel(mf, panel, new StartScreen(mf));
			}
		});
		
		JButton loginButton = new JButton("로그인");
		loginButton.setBounds(72, 231, 100, 40);
		centerPanel.add(loginButton);
		
		JPasswordField pwdText = new JPasswordField();
		pwdText.setBounds(92, 151, 260, 45);
		centerPanel.add(pwdText);
		
		JTextField idText = new JTextField();
		idText.setBounds(92, 81, 260, 45);
		centerPanel.add(idText);
		
		loginButton.addActionListener(new ActionListener() {
			
			AdminController adminController = new AdminController();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(idText.getText().length() > 0 && pwdText.getPassword().length > 0) {
					int result = adminController.adminLogin(idText, pwdText);
					
				}
			}
		});
		mf.getContentPane().add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
