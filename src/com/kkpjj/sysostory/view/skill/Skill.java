package com.kkpjj.sysostory.view.skill;

import java.awt.Image;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Skill extends JPanel{

	ImageIcon icon;
	Logger loginScr;
	private JFrame mf;
	
	private JPanel mainPanel;
	private JLabel jLabel;
	Skill skill= this;
		public Skill(JFrame mf ) {
			this.mf = mf;
			this.mainPanel = this;
			
			mainPanel.setBounds(0, 0, 800, 380);
			
			

			jLabel = new JLabel();
			jLabel.setBounds(0, 0, 300, 200);
			// -------------------------이미지 셋아이콘으로 넣기?------------------------
			icon = new ImageIcon("image/BossSkill3.gif");
			jLabel.setIcon(icon);
			mainPanel.add(jLabel);
			
			
			//			new LoginScr(loading);
//            loading.setVisible(false);
			
		
			

			new Thread(new Runnable() {
//	         ----------------스킬 쓰래드 해서 하기!!!---------------------
				@Override
				public void run() {
					int n = 0;
					while (true) {
						try {
							Thread.sleep(1000);
							n++;
							if (n == 5) {
								
								new ImageIcon("iamge/bossSkill3.gif");
								new Skill(mf);
								mainPanel.setVisible(true);
							}
					System.out.println("쓰래드 실행");	} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();

			setVisible(true);
			
			
			
			mf.getContentPane().add(mainPanel);
		}
		
	}
