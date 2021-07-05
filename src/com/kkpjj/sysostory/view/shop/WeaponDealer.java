package com.kkpjj.sysostory.view.shop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class WeaponDealer extends JPanel {
	
	private JFrame mf;

	public WeaponDealer(JFrame mf) {
		
		// 레이아웃 설정
		this.mf = mf;
		init();
		// 아이템 리스트
		
	}
	
	private void init() {
		this.setBounds(310, 250, 50, 80);
		this.setLayout(null);
		this.setOpaque(false);
	}
	
	// 캐릭터 이미지 추가
	Image chr = new ImageIcon("images/npc/무기상인.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(chr, 0, 0, getWidth(), getHeight(), this);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		this.mf = mf;
//		
////		new StatusPanel(mf);	// 하단 패널 호출
//		
//		// ----------------------------------------- 아이템 창
//		
//		weaponDealerPanel = new JPanel();
//		weaponDealerPanel.setBounds(0, 0, 800, 420);
//		mf.getContentPane().add(weaponDealerPanel);
//		weaponDealerPanel.setLayout(null);
//		
//		// ----------------------------------------- 나가기 버튼
//		
//		JButton exitButton = new JButton();
//		exitButton.setBounds(750, 0, 45, 45);
//		exitButton.setIcon(new ImageIcon("images/exit.png"));
//		weaponDealerPanel.add(exitButton);
//		
//		JPanel itemList = new JPanel();
//		itemList.setBackground(Color.LIGHT_GRAY);
//		itemList.setBounds(5, 50, 387, 275);
//		weaponDealerPanel.add(itemList);
//		itemList.setLayout(null);
//		
//		Image itemWindowBg = new ImageIcon("images/itemWindow.png").getImage();
//		JLabel label3 = new JLabel(new ImageIcon(itemWindowBg));
//		
//		itemList.add(label3);
//		
//		JPanel itemDirection = new JPanel();
//		itemDirection.setLayout(null);
//		itemDirection.setBounds(0, 325, 400, 90);
//		weaponDealerPanel.add(itemDirection);
//		
//		JTextPane textPane = new JTextPane();
//		textPane.setEditable(false);
//		textPane.setBackground(Color.LIGHT_GRAY);
//		textPane.setFont(new Font("둥근모꼴", Font.PLAIN, 18));
//		textPane.setText("여기는 아이템의 설명이 출력되는 화면이다.");
//		textPane.setToolTipText("");
//		textPane.setBounds(5, 5, 389, 80);
//		itemDirection.add(textPane);
//		
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.LIGHT_GRAY);
//		panel.setBounds(5, 0, 136, 45);
//		weaponDealerPanel.add(panel);
//		
//		JTextPane textPane_1 = new JTextPane();
//		textPane_1.setEditable(false);
//		textPane_1.setBackground(Color.LIGHT_GRAY);
//		textPane_1.setFont(new Font("둥근모꼴", Font.PLAIN, 25));
//		textPane_1.setText("물약상점");
//		panel.add(textPane_1);
//		
//		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(Color.LIGHT_GRAY);
//		panel_1.setBounds(404, 50, 391, 365);
//		weaponDealerPanel.add(panel_1);
//		
//		bg = new ImageIcon("images/village.png");
//		
//		// 마을, 물약 상인 다시 그리기
//		
//		JPanel itemPanel = new JPanel()	{
//			
//			public void paintComponent(Graphics g) {
//				g.drawImage(bg.getImage(), 0, 0, 800, 420, null);
//			}
//			
//		};
//		
//		itemPanel.setBounds(0, 0, 800, 420);
//		mf.getContentPane().add(itemPanel);
//		itemPanel.setLayout(null);
//		
//		JButton weaponDealerButton = new JButton();
//		weaponDealerButton.setBounds(320, 250, 50, 80);
//		weaponDealerButton.setIcon(new ImageIcon("images/npc/무기상인.png"));
//		
//		// 버튼의 배경 없애기
//		weaponDealerButton.setBorderPainted(false);
//		weaponDealerButton.setContentAreaFilled(false);
//		weaponDealerButton.setFocusPainted(false);
//		weaponDealerButton.setOpaque(false);
//		
//		itemPanel.add(weaponDealerButton);
//		
//		
//		// -----------------------무기상인, 나가기 버튼 상호작용-------------------------
//		
//		weaponDealerPanel.setVisible(false);
//		
//		weaponDealerButton.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				weaponDealerPanel.setVisible(true);
//				itemPanel.setVisible(false);
//			}
//		});
//		
//		exitButton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				itemPanel.setVisible(true);
//				weaponDealerPanel.setVisible(false);
//			}
//		});

	

}
