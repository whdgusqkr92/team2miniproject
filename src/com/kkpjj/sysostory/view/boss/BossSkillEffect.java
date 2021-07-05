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

	public BossSkillEffect(JFrame mf) {

		this.mf = mf;
		this.mainpanel = this;
		//		mainpanel = new JPanel();

		mainpanel.setBounds(0, 0, 800, 420);

		mainpanel.setLayout(null);

		mf.add(mainpanel); // 생성한 패널 프레임에 추가

	}	

	public void finalSkill1() {

		this.subpanel = new JPanel();
		subpanel.setBounds(80, 100, 600, 350);
		subpanel.setOpaque(false);
		Image skill = new ImageIcon("images/skill/보스스킬1.gif").getImage().getScaledInstance(450, 350, 0);
		skillLabel = new JLabel(new ImageIcon(skill));
		skillLabel.setBounds(0, 0, 100, 350);
		mainpanel.add(subpanel);
		subpanel.add(skillLabel);
		
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				int cnt = 0;
//				while(true) {
//					try {
//						Thread.sleep(1000);
//						cnt++;
//						if(cnt == 3) {
//							
//						}
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}).start();
//		setVisible(true);
	}
	
	//15
	public void finalSkill2() {

		this.subpanel = new JPanel();
		subpanel.setBounds(0, 100, 600, 350);
		Image skill = new ImageIcon("images/skill/보스스킬2.gif").getImage().getScaledInstance(500, 350, 0);
		skillLabel = new JLabel(new ImageIcon(skill));
		skillLabel.setBounds(0, 0,500, 350);
		subpanel.setOpaque(false);

		mainpanel.add(subpanel);
		subpanel.add(skillLabel);

	}
	//0.01 즉사기
	public void finalSkill3() {

		this.subpanel = new JPanel();
		subpanel.setBounds(20, 0, 800, 420);
		subpanel.setOpaque(false);
		Image skill = new ImageIcon("images/skill/보스스킬3.gif").getImage().getScaledInstance(500, 350, 0);
		skillLabel = new JLabel(new ImageIcon(skill));
		skillLabel.setBounds(0, 0, 500, 350);

		mainpanel.add(subpanel);
		subpanel.add(skillLabel);

	}


	public void middleSkill1() {

		this.subpanel = new JPanel();
		subpanel.setBounds(80, 100, 600, 350);
		subpanel.setOpaque(false);
		Image skill = new ImageIcon("images/skill/중간보스스킬1.gif").getImage().getScaledInstance(450, 350, 0);
		skillLabel = new JLabel(new ImageIcon(skill));
		skillLabel.setBounds(0, 0, 100, 350);
		mainpanel.add(subpanel);
		subpanel.add(skillLabel);

	}

	//15
	public void middleSkill2() {

		this.subpanel = new JPanel();
		subpanel.setBounds(80, 100, 600, 350);
		subpanel.setOpaque(false);
		Image skill = new ImageIcon("images/skill/중간보스스킬2.gif").getImage().getScaledInstance(450, 350, 0);
		skillLabel = new JLabel(new ImageIcon(skill));
		skillLabel.setBounds(0, 0, 100, 350);

		mainpanel.add(subpanel);
		subpanel.add(skillLabel);

	}


		public void paintComponent(Graphics g) {
			
			g.drawImage(field,0,0,800,420,this);
		}
		


}
