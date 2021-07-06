package com.kkpjj.sysostory.view.skill;

import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Skill extends JFrame{

	ImageIcon icon;
	JLabel la;
	
	Logger loginScr;

		public Skill() {
			la = new JLabel();
			// -------------------------이미지 셋아이콘으로 넣기?------------------------
			icon = new ImageIcon("image/BossSkill3.gif");
			la.setIcon(icon);

			add(la);
			setSize(icon.getIconWidth(), icon.getIconHeight());
			setLocationRelativeTo(null);

			new Thread(new Runnable() {
//	         ----------------스킬 쓰래드 해서 하기!!!---------------------
				@Override
				public void run() {
					int n = 0;
					while (true) {
						try {
							Thread.sleep(1000);
							n++;
							if (n == 1000) {
								
							}
					System.out.println("쓰래드 실행");	} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();

			setVisible(true);
		}
		
	}
