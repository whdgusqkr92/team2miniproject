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
import com.kkpjj.sysostory.view.ViewUtil;

public class FindIdView extends JPanel{
	
	private JFrame mf;
	
	public FindIdView(JFrame mf) {	
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		panel.setLayout(null);
		
		Image background = new ImageIcon("images/login/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);
		
		
		JPanel namePanel = new JPanel();							/* name 패널 */
		namePanel.setBounds(200, 200, 80, 45);
		namePanel.setBackground(Color.LIGHT_GRAY);
		namePanel.setLayout(null);
		
		JTextField nameText = new JTextField();
		nameText.setFont(new Font("둥근모꼴", Font.PLAIN, 20));		/* name 입력란 */
		nameText.setBounds(300, 200, 300, 45);
		nameText.setColumns(5);
		
		JPanel emailPanel = new JPanel();							/* email 패널 */
		emailPanel.setBounds(200, 280, 80, 45);
		emailPanel.setBackground(Color.LIGHT_GRAY);
		emailPanel.setLayout(null);
		
		JTextField emailText = new JTextField();
		emailText.setFont(new Font("둥근모꼴", Font.PLAIN, 20));		/* email 입력란 */
		emailText.setBounds(300, 280, 300, 45);
		emailText.setColumns(20);
		
		JButton findIdButton = new JButton("ID 찾기");				
		findIdButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));	/* id찾기 버튼 */
		findIdButton.setBounds(250, 360, 130, 50);
		
		findIdButton.addActionListener(new ActionListener() {
			
			MemberController memberController = new MemberController();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(nameText.getText().length() > 0 && emailText.getText().length() > 0) {
					String resultId = memberController.findId(nameText, emailText);
					
					if(resultId.length() > 0) {
						infoBox("회원님의 아이디는 '" + resultId + "' 입니다.","아이디 찾기 결과");
					} else {
						infoBox("이름과 이메일을 확인해주세요", "아이디 찾기 결과");						
					}
				}
			}
		});
		
		JButton backButton = new JButton("뒤로가기");				
		backButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));		/* 뒤로가기 버튼 */
		backButton.setBounds(420, 360, 130, 50);
		
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUtil.changePanel(mf, panel, new StartScreen(mf));
			}
		});
		
		panel.add(backButton);
		panel.add(findIdButton);
		panel.add(emailText);
		panel.add(emailPanel);
		
		JLabel emailLabel = new JLabel("이메일");
		emailLabel.setBounds(0, 10, 75, 24);
		emailPanel.add(emailLabel);
		emailLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		panel.add(nameText);
		panel.add(namePanel);
		
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(12, 10, 50, 24);
		namePanel.add(nameLabel);
		nameLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		panel.add(label);
		mf.getContentPane().add(panel);
		
		
		
	}
	public static void infoBox(String infoMessage, String titleBar){
		JOptionPane.showMessageDialog(null, infoMessage, /*"InfoBox: " +*/ titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
}


