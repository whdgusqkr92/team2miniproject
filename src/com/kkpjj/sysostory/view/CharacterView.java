package com.kkpjj.sysostory.view;

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

public class CharacterView extends JFrame implements Runnable {
	
	private JPanel statusPanel;
	private JPanel mapPanel;
	
	private ImageIcon status = null;
	private ImageIcon map = null;
	private ImageIcon characterWindow = null;
	private ImageIcon sysoIcon = null;
	private ImageIcon exit = null;
	
	
	JList<String> list; // 데이터베이스 내용을 뿌려주기 위한 리스트 선언
	

	public CharacterView() {
//		list = new JList<String>();
	}

	@Override
	public void run() {
		
		JFrame mf = new JFrame();
		mf.setTitle("sysoStory");
		mf.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
		mf.setBounds(300, 75, 810, 630);
		mf.setLayout(null);
		
		statusPanel = new JPanel();
		statusPanel.setBounds(0, 420, 560, 180);
		
		mapPanel = new JPanel();
		mapPanel.setBounds(560, 420, 240, 180);

		Image statusBg = new ImageIcon("images/status.png").getImage().getScaledInstance(560, 180, 0);
		JLabel label1 = new JLabel(new ImageIcon(statusBg));
		
		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
		JLabel label2 = new JLabel(new ImageIcon(mapBg));
		
		statusPanel.add(label1);
		mapPanel.add(label2);
		
		mf.getContentPane().add(statusPanel);
		mf.getContentPane().add(mapPanel);
		
		// 캐릭터 정보 창, 나가기 버튼
		
		JPanel charInfoPanel = new JPanel();
		charInfoPanel.setBounds(0, 0, 800, 410);
		mf.getContentPane().add(charInfoPanel);
		charInfoPanel.setLayout(null);

		JPanel characterInfo = new JPanel();
		characterInfo.setBounds(12, 0, 780, 410);
		charInfoPanel.add(characterInfo);
		
		JPanel characterProfile = new JPanel();
		characterProfile.setBounds(88, 50, 136, 136);
		charInfoPanel.add(characterProfile);
		
		Image itemWindowBg = new ImageIcon("images/characterWindow.png").getImage();
		JLabel label3= new JLabel(new ImageIcon(itemWindowBg));
		label3.setBounds(398, 10, 50, 50);
		charInfoPanel.add(label3);
		
		// 캐릭터 이미지
		status = new ImageIcon("images/status.png");
		map = new ImageIcon("images/map.png");
		characterWindow = new ImageIcon("images/characterWindow.png");
		sysoIcon = new ImageIcon("images/sysoIcon.png");
		exit = new ImageIcon("images/status.png");
		
		
		// 캐릭터 상태
		JPanel panel1 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(status.getImage(), 0, 0, 560, 180, null);  // 이미지 원본 크기
			}
		};
		
		panel1.setBounds(0, 420, 560, 180);
		
		// 캐릭터 맵 정보
		JPanel panel2 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(map.getImage(), 0, 0, 240, 180, null);
			}
		};
		
		panel2.setBounds(560, 420, 240, 180);
		
		// 캐릭터 정보창
		JPanel panel3 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(characterWindow.getImage(), 0, 0, 800, 410, null);
			}
		};
		
		panel3.setBounds(12, 0, 780, 410);
		
		// 나가기 버튼
		JButton exitButton = new JButton();
		exitButton.setBounds(720, 15, 50, 50);
		exitButton.setIcon(new ImageIcon("images/exit.png"));
		mf.add(exitButton);
		
		
		// 캐릭터 프로필사진
		JPanel panel4 = new JPanel() {
			
			public void paintComponent(Graphics g) {
				g.drawImage(sysoIcon.getImage(), 0, 0, 136, 136, null);
			}
		};
		
		panel4.setBounds(88, 50, 136, 136);
		

		
		mf.add(panel1);
		mf.add(panel2);
		mf.add(panel4);
		mf.add(panel3);
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
