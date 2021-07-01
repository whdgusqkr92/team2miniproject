package com.kkpjj.sysostory.view;

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

public class 내일수정내일수정내일수정 extends JPanel {
	
	private JFrame mf;
	private JPanel mainpanel;
	
	private JLabel textLabel;
	private JLabel textLabel2;
	
	private JButton btn;
	
	public 내일수정내일수정내일수정(JFrame mf) {
		this.mf = mf;
		this.mainpanel = this;
		
		//--------------------------배경 필드 패널 만들기------------------------------	
		Image field = new ImageIcon("Images/field.png").getImage().getScaledInstance(800, 200, 0);
			
		mainpanel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(field,0,0,800,420,this);
				}
			};
			
		mainpanel.setBounds(0, 0, 800, 420);
		mainpanel.setLayout(null);
		mf.add(mainpanel); // 생성한 패널 프레임에 추가
		
		
		//-------------------------나약한 녀석 대화 이미지  출력------------------------------------------------	
		
//		if(hp == 0) {
			
			Image chrDieText = new ImageIcon("images/chrDieText.png").getImage().getScaledInstance(650, 170, 0);
			textLabel = new JLabel(new ImageIcon(chrDieText));
			textLabel.setBounds(0, 251, 792, 143);
			mainpanel.add(textLabel);
			
			btn = new JButton("다음");
			btn.setBounds(680, 300, 75, 57);
			mainpanel.add(btn);
		//-----------내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정내일수정--------------내일수정-------------------------------------
//				btn.addActionListener();
				
//		} else if(bosshp ==0 ) {
		
//			Image bossDieText = new ImageIcon("images/bossDieText.png").getImage().getScaledInstance(680, 200, 0);
//			textLabel2 = new JLabel(new ImageIcon(bossDieText));
//			textLabel2.setBounds(0, 251, 792, 143);
//			mainpanel.add(textLabel2);
//			
//				btn = new JButton("다음");
//				btn.setBounds(680, 300, 75, 57);
//				mainpanel.add(btn);
//				//-------------------------버튼 누르면 대화창 넘기기-------------------------------------
//					btn.addActionListener(new ActionListener() {
//						@Override
//						public void actionPerformed(ActionEvent e) {
//							textLabel2.setVisible(false);
//						}
//					});
//		
		}
}
