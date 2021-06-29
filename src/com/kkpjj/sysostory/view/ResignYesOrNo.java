package com.kkpjj.sysostory.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class ResignYesOrNo extends JFrame{
	
	public ResignYesOrNo() {
		
		JFrame mf = new JFrame();
		mf.setSize(800, 600);
		mf.setLocationRelativeTo(null);
		mf.setTitle("syso Story");
		
		Image background = new ImageIcon("images/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));			/* 게임 배경 화면 */
		label.setForeground(Color.WHITE);
		label.setBounds(0, 0, 800, 600);
		mf.getContentPane().setLayout(null);
		
		Image window = new ImageIcon("images/characterWindow.png").getImage().getScaledInstance(500, 200, 0);
		JLabel windowLabel = new JLabel(new ImageIcon(window));			/* 회원탈퇴 예 아니오 선택 창 */
		windowLabel.setBounds(150, 200, 500, 200);
		windowLabel.setLayout(null);
		
		JLabel askLabel = new JLabel("정말 탈퇴 하시겠습니까?");				/* 회원탈퇴  라벨 */
		askLabel.setForeground(Color.WHITE);
		askLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		askLabel.setBounds(260, 250, 300, 30);
		
		JButton yesButton = new JButton("예");						/* 예 버틀 */
		yesButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		yesButton.setBounds(270, 310, 100, 50);
		mf.getContentPane().add(yesButton);
		
		JButton noButton = new JButton("아니오");					/* 아니오 버튼 */
		noButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		noButton.setBounds(430, 310, 110, 50);
		mf.getContentPane().add(noButton);
		
		
		mf.getContentPane().add(askLabel);
		mf.getContentPane().add(windowLabel);
		mf.getContentPane().add(label);
		
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
