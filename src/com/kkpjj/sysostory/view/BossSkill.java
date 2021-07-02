package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BossSkill extends JPanel{

	//	boolean isSkill = true;
	private JFrame mf;
	private JPanel mainpanel;
	private JLabel skillLabel;

	public BossSkill(JFrame mf) {

		this.mf = mf;
		this.mainpanel = this;

		//--------------------------배경 필드 패널 만들기------------------------------	



		mainpanel.setBounds(0, 0, 800, 420);
		mainpanel.setLayout(null);
		mf.add(mainpanel); // 생성한 패널 프레임에 추가

		Image skill = new ImageIcon("images/skill2.gif").getImage().getScaledInstance(650, 350, 0);
		skillLabel = new JLabel(new ImageIcon(skill));
		skillLabel.setBounds(0, 100, 800, 300);
		mainpanel.add(skillLabel);
		skillLabel.setVisible(false);

		mainpanel.addMouseListener(new OneActionListener());



		BossDieText bd = new BossDieText(mf, mainpanel);
		bd.CharaDie();
		
	}

	Image field = new ImageIcon("Images/field.png").getImage().getScaledInstance(800, 200, 0);
	
	public void paintComponent(Graphics g) {
		
		g.drawImage(field,0,0,800,420,this);
	}
	
	public void FinalBossSkill() {



	}


	private class OneActionListener extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {

			skillLabel.setVisible(true);
		}
	}


}
