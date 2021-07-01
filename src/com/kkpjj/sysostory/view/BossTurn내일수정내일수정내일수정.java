package com.kkpjj.sysostory.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BossTurn내일수정내일수정내일수정 extends JPanel{
	 
//	boolean isSkill = true;
	private JFrame mf;
	private JPanel mainpanel;
	private JLabel skillLabel;
	
	public BossTurn내일수정내일수정내일수정(JFrame mf) {
		this.mf = mf;
		this.mainpanel = this;
		
//		if(스킬) {
//			
//		}else if(스킬) {
//			
//		}else {
//			평타
//		}
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

	
	Image skill = new ImageIcon("images/bossSkill2.gif").getImage().getScaledInstance(650, 350, 0);
	skillLabel = new JLabel(new ImageIcon(skill));
	skillLabel.setBounds(0, 100, 800, 300);
	mainpanel.add(skillLabel);
	skillLabel.setVisible(true);
	
	
	
}
	public void FinalBossSkill() {
			
	}
	
	
	}
	
