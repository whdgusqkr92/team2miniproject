package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BossSkill extends JPanel implements Runnable {

	//	boolean isSkill = true;
	private JFrame mf;
	private JPanel mainpanel;
	private JLabel skillLabel;
	Image field = new ImageIcon("Images/field.png").getImage().getScaledInstance(800, 200, 0);

	
	public BossSkill(JFrame mf) {

		this.mf = mf;
		this.mainpanel = this;

//		mainpanel.setBounds(0, 0, 800, 420);
//		mainpanel.setLayout(null);
//		mf.add(mainpanel); // 생성한 패널 프레임에 추가
		
		
//		try {
			
			Image skill = new ImageIcon("images/bossSkill2.gif").getImage().getScaledInstance(650, 350, 0);
			skillLabel = new JLabel(new ImageIcon(skill));
			skillLabel.setBounds(0, 100, 800, 300);
			mainpanel.add(skillLabel);
			
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

//		skillLabel.setVisible(true);
		
	}

	
	@Override
	public void run() {
		
	}
	
	
	
	public void paintComponent(Graphics g) {
		
		g.drawImage(field,0,0,800,420,this);
	}
	
	public void FinalBossSkill() {



	}



//	private class OneActionListener extends MouseAdapter {
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//
//			skillLabel.setVisible(true);
//		}
//	}


}
