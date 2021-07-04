package com.kkpjj.sysostory.view.boss;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BossAttController;


public class BossSkillEffect extends JPanel {

	//	boolean isSkill = true;
	private JFrame mf;
	private JPanel mainpanel;
	private JPanel subpanel;
	private JLabel skillLabel;
	Image field = new ImageIcon("Images/field/field.png").getImage().getScaledInstance(800, 200, 0);
	
	//						 (JFrame mf)
	public BossSkillEffect(JFrame mf) {
	

		this.mf = mf;
		this.mainpanel = this;
//
//		mainpanel = new JPanel();
		
		mainpanel.setBounds(0, 0, 800, 420);
		
		mainpanel.setLayout(null);
		
		
		mf.add(mainpanel); // 생성한 패널 프레임에 추가
//		try {
		
//		skill1();
	}	
		//15
			
	
			public void skill1() {
					
			this.subpanel = new JPanel();
			subpanel.setBounds(80, 100, 600, 350);
			subpanel.setOpaque(false);
			Image skill = new ImageIcon("images/skill/bossSkill2.gif").getImage().getScaledInstance(450, 350, 0);
			skillLabel = new JLabel(new ImageIcon(skill));
			skillLabel.setBounds(0, 0, 100, 350);
			mainpanel.add(subpanel);
			subpanel.add(skillLabel);
			
//			return;
		}
			
			//15
			public void skill2() {
				
				
			this.subpanel = new JPanel();
			subpanel.setBounds(80, 100, 600, 350);
			subpanel.setOpaque(false);
			Image skill = new ImageIcon("images/skill/테스트스킬.gif").getImage().getScaledInstance(450, 350, 0);
			skillLabel = new JLabel(new ImageIcon(skill));
			skillLabel.setBounds(0, 0, 100, 350);
			
			mainpanel.add(subpanel);
			subpanel.add(skillLabel);
			
			
			
		}
			//0.01 즉사기
			public void skill3() {
				
				this.subpanel = new JPanel();
 				subpanel.setBounds(20, 0, 800, 420);
				subpanel.setOpaque(false);
				Image skill = new ImageIcon("images/skill/bossSkill3.gif").getImage().getScaledInstance(800, 420, 0);
				skillLabel = new JLabel(new ImageIcon(skill));
				skillLabel.setBounds(0, 0, 800, 420);
				
				mainpanel.add(subpanel);
				subpanel.add(skillLabel);
				
				
				
			}
			
		
		
			
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

	
	public void paintComponent(Graphics g) {
		
		g.drawImage(field,0,0,800,420,this);
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
