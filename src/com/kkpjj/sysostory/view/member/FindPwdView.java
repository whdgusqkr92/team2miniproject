package com.kkpjj.sysostory.view.member;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kkpjj.sysostory.controller.MemberController;

public class FindPwdView extends JFrame{

	private JFrame mf;
//	private JTextField nameText;
//	private JTextField emailText;
//	private JTextField idText;
	
	
	public FindPwdView() {	
		JFrame mf = new JFrame();
		mf.setSize(800, 600);
		mf.setLocationRelativeTo(null);
		mf.setTitle("syso Story");
		
		JPanel panel = new JPanel();
		
		Image background = new ImageIcon("images/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);
		mf.getContentPane().setLayout(null);
		
		JPanel idPanel = new JPanel();								/* 아이디 패널 */
		idPanel.setBounds(200, 120, 80, 45);
		idPanel.setBackground(Color.LIGHT_GRAY);
		mf.add(idPanel);
		idPanel.setLayout(null);
		
		JLabel idLabel = new JLabel("아이디");						/* 아이디 라벨 */
		idLabel.setBounds(5, 10, 75, 24);
		idLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		idPanel.add(idLabel);
		
		JTextField idText = new JTextField();
//		idText = new JTextField();								
		idText.setFont(new Font("둥근모꼴", Font.PLAIN, 20));			/* 아이디 입력란 */
		idText.setBounds(300, 120, 300, 45);
		mf.add(idText);
		idText.setColumns(10);
		
		JPanel namePanel = new JPanel();							/* name 패널 */
		namePanel.setBounds(200, 200, 80, 45);
		namePanel.setBackground(Color.LIGHT_GRAY);
		mf.add(namePanel);
		namePanel.setLayout(null);
		
		JLabel nameLabel = new JLabel("이름");						/* name 라벨 */
		nameLabel.setBounds(15, 10, 50, 24);
		nameLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		namePanel.add(nameLabel);
		
		JTextField nameText = new JTextField();
//		nameText = new JTextField();								
		nameText.setFont(new Font("둥근모꼴", Font.PLAIN, 20));		/* name 입력란 */
		nameText.setBounds(300, 200, 300, 45);
		mf.add(nameText);
		nameText.setColumns(5);
		
		JPanel emailPanel = new JPanel();							/* email 패널 */
		emailPanel.setBounds(200, 280, 80, 45);
		emailPanel.setBackground(Color.LIGHT_GRAY);
		mf.add(emailPanel);
		emailPanel.setLayout(null);
		
		JLabel emailLabel = new JLabel("이메일");						/* email 라벨 */
		emailLabel.setBounds(5, 10, 75, 24);
		emailLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		emailPanel.add(emailLabel);
		
		JTextField emailText = new JTextField();
//		emailText = new JTextField();								
		emailText.setFont(new Font("둥근모꼴", Font.PLAIN, 20));		/* email 입력란 */
		emailText.setBounds(300, 280, 300, 45);
		mf.add(emailText);
		emailText.setColumns(10);

		
		JButton findPwdButton = new JButton("PWD 찾기");				
		findPwdButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));	/* 회원가입 버튼 */
		findPwdButton.setBounds(250, 360, 130, 50);
		mf.getContentPane().add(findPwdButton);
		
		findPwdButton.addActionListener(new ActionListener() {
			
			MemberController memberController = new MemberController();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(idText.getText().length() > 0 && nameText.getText().length() > 0 && emailText.getText().length() > 0) {
					String resultPwd = memberController.FindPwd(idText, nameText, emailText);
					
					if(resultPwd.length() > 0) {
						infoBox("회원님의 비밀번호는 '" + resultPwd + "' 입니다.","비밀번호 찾기 결과");
					} else {
						infoBox("이름과 이메일을 확인해주세요", "message");						
					}
				}
				
			}
		});
		
		JButton backButton = new JButton("뒤로가기");				
		backButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));		/* 뒤로가기 버튼 */
		backButton.setBounds(420, 360, 130, 50);
		mf.getContentPane().add(backButton);
		
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new StartScreen();
				mf.setVisible(false);
			}
		});
		
		
		mf.getContentPane().add(label);
		
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void infoBox(String infoMessage, String titleBar){
		JOptionPane.showMessageDialog(null, infoMessage, /*"InfoBox: " +*/ titleBar, JOptionPane.INFORMATION_MESSAGE);
	}

}