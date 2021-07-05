package com.kkpjj.sysostory.view.character;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JTextArea;

public class CharacterView extends JPanel {
	
	private JFrame mf;
	
	private ImageIcon status = null;
	private ImageIcon map = null;
	private ImageIcon characterWindow = null;
	private ImageIcon sysoIcon = null;
	private ImageIcon exit = null;
	
	public CharacterView(JFrame mf) {
		
		this.mf = mf;
		
		// 하단 정보 패널 호출
		new StatusPanel(mf);
		
		
		// 캐릭터 정보 창, 나가기 버튼
//		JPanel charInfoPanel = new JPanel();
//		charInfoPanel.setBounds(0, 0, 800, 410);
//		mf.getContentPane().add(charInfoPanel);
//		charInfoPanel.setLayout(null);
//
//		JPanel characterInfo = new JPanel();
//		characterInfo.setBounds(12, 0, 780, 410);
//		charInfoPanel.add(characterInfo);
//		
//		JPanel characterProfile = new JPanel();
//		characterProfile.setBounds(88, 50, 136, 136);
//		charInfoPanel.add(characterProfile);
//		
//		Image itemWindowBg = new ImageIcon("images/character/characterWindow.png").getImage();
//		JLabel label3= new JLabel(new ImageIcon(itemWindowBg));
//		label3.setBounds(398, 10, 50, 50);
//		charInfoPanel.add(label3);
//		
//		// 캐릭터 이미지
//		status = new ImageIcon("images/character/status.png");
//		map = new ImageIcon("images/character/map.png");
//		characterWindow = new ImageIcon("images/character/characterWindow.png");
//		sysoIcon = new ImageIcon("images/character/sysoIcon.png");
//		exit = new ImageIcon("images/character/exit.png");
//		
//		
//		// 캐릭터 상태
//		JPanel panel1 = new JPanel() {
//			
//			public void paintComponent(Graphics g) {
//				g.drawImage(status.getImage(), 0, 0, 560, 180, null);  // 이미지 원본 크기
//			}
//		};
//		
//		panel1.setBounds(0, 420, 560, 180);
//		
//		// 캐릭터 맵 정보
//		JPanel panel2 = new JPanel() {
//			
//			public void paintComponent(Graphics g) {
//				g.drawImage(map.getImage(), 0, 0, 240, 180, null);
//			}
//		};
//		
//		panel2.setBounds(560, 420, 240, 180);
//		
//		// 캐릭터 정보창
//		JPanel panel3 = new JPanel() {
//			
//			public void paintComponent(Graphics g) {
//				g.drawImage(characterWindow.getImage(), 0, 0, 800, 410, null);
//			}
//		};
//		
//		panel3.setBounds(12, 0, 780, 410);
//		
//		// 나가기 버튼
//		JButton exitButton = new JButton();
//		exitButton.setBounds(720, 15, 50, 50);
//		exitButton.setIcon(new ImageIcon("images/character/exit.png"));
//		mf.add(exitButton);
//		
//		
//		// 캐릭터 프로필사진
//		JPanel panel4 = new JPanel() {
//			
//			public void paintComponent(Graphics g) {
//				g.drawImage(sysoIcon.getImage(), 0, 0, 136, 136, null);
//			}
//		};
//		
//		panel4.setBounds(88, 50, 136, 136);
//		
//		mf.add(panel1);
//		mf.add(panel2);
//		mf.add(panel4);
//		mf.add(panel3);
//		mf.setVisible(true);
//		mf.setResizable(false);
	}

}
