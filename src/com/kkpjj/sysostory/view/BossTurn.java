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

import com.kkpjj.sysostory.controller.BossAttController;
import com.kkpjj.sysostory.view.ResultView.BossSkillResultView;


public class BossTurn extends JPanel{
	 
//	boolean isSkill = true;
	private JFrame mf;
	private JPanel mainpanel;
	private JLabel skillLabel;
	private JLabel bossLabel;
	
	public BossTurn(JFrame mf, JPanel mainpanel) {
		this.mf = mf;
		this.mainpanel = mainpanel;
		
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

	Image bossface = new ImageIcon("images/text/Bossface_M.png").getImage().getScaledInstance(200, 180, 0);
	bossLabel = new JLabel(new ImageIcon(bossface));
	bossLabel.setBounds(650, 110, 150, 143);
	mainpanel.add(bossLabel);
	bossLabel.setVisible(true);
	
	
	new BossAttController(mf).attBoss();
	
//	new BossAttController(mf);
//	try {
//		new BossSkillResultView().skill3();
//		Thread.sleep(3000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
	}


//	DieText bd = new DieText(mf, mainpanel);
//bd.Chara
