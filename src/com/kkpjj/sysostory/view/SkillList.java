package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Graphics;
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
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class SkillList extends JFrame {

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
	private Image img;
		
	
		
	
		
		
	
	
	


	
	public SkillList() {
		
	
	
		
		mf = new JFrame();
		mf.setTitle("sysoStory");
		mf.setBounds(300, 75, 810, 630);								//메인 프레임
		mf.getContentPane().setLayout(null);							//메인 패널

		JPanel skilHIpanel = new JPanel();								//스킬 상단부 돌아가기 쪽 패널	
		skilHIpanel.setBounds(50, 20, 700, 43);		
		mf.getContentPane().add(skilHIpanel);
		skilHIpanel.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("");					//스킬 상단부 돌아가기 쪽 패널 버튼	
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(645, 0, 55, 43);
		skilHIpanel.add(btnNewButton_6);
		btnNewButton_6.setIcon(new ImageIcon("images/스킬 창 돌아가기.png")); // 버튼에 이미지 넣는법

		JPanel Explanationpanel = new JPanel(); 						// 설명 패널
		Explanationpanel.setBounds(50, 341, 700, 63);
		mf.getContentPane().add(Explanationpanel);
		Explanationpanel.setLayout(null);
		Label ExplanationLabel = new Label();							//설명 라벨		
		
		
		
		Image background = new ImageIcon("image/status.png.").getImage();
		
	

		statusPanel = new JPanel();										// 체력 패널
		statusPanel.setBounds(0, 420, 560, 180);
		Image statusBg = new ImageIcon("images/hp.png").getImage().getScaledInstance(560, 180, 0); // hp 이미지
		JLabel label2 = new JLabel(new ImageIcon(statusBg));
		statusPanel.add(label2);
		mf.getContentPane().add(statusPanel);
		
		

		mapPanel = new JPanel();										//소지한 돈, 맵 이미지 패널
		mapPanel.setBounds(560, 420, 240, 180);
		Image mapBg = new ImageIcon("images/money.png").getImage().getScaledInstance(240, 180, 0); // 소지한 돈 , 맵이미지
		JLabel label3 = new JLabel(new ImageIcon(mapBg));
		mapPanel.add(label3);
		mf.getContentPane().add(mapPanel);
		
		skilPanel = new JPanel();														// 스킬목록 패널
		skilPanel.setBounds(50, 100, 700, 220);
		mf.getContentPane().add(skilPanel);	
		
//		skilPanel.setBackground(Color.blue);
	
		
//		Image skilpanel = new ImageIcon("images/스킬 배경.png").getImage().getScaledInstance(700, 220, 0); // 스킬목록 패널
//		JLabel skilList = new JLabel(new ImageIcon(skilpanel));
//		skilPanel.add(skilList);
		
		btnNewButton = new JButton("");											//스킬 버튼 목록
		btnNewButton.setBounds(50, 50, 32, 32);
		skilPanel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("images/스킬공격2.png")); 				// 버튼 이미지
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		skilPanel.setLayout(null);
		 
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(150, 50, 32, 32);				//버튼 좌표   (1,)
		skilPanel.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon("images/정권.png")); // 버튼 이미지
		

		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(250, 50, 32, 32);
		skilPanel.add(btnNewButton_3);
		btnNewButton_3.setIcon(new ImageIcon("images/돌려차기.png")); // 버튼 이미지

		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(350, 50, 50, 50);
		skilPanel.add(btnNewButton_2);

		btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(450, 50, 50, 50);
		skilPanel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(550, 50, 50, 50);
		skilPanel.add(btnNewButton_5);
		

		

		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	
	public static void main(String[] args) {
		new SkillList();

	
	}
	

}