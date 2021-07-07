//package com.kkpjj.sysostory.view.skill;
//
//import java.awt.Image;
//import java.util.logging.Logger;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//
//public class Skill extends JPanel{
//
//	ImageIcon icon;
//	Logger loginScr;
//	private JFrame mf;
//	
//	private JPanel mainPanel;
//	private JPanel subPanel;
//	private JLabel skillLabel;
//	
//	Skill skill= this;
//	
//		public Skill(JFrame mf ) {
//			this.mf = mf;
//			this.mainPanel = this;
//			
//			mainPanel.setBounds(0, 0, 800, 380);
//			mainPanel.setLayout(null);
//			mf.add(mainPanel); // 생성한 패널 프레임에 추가
//
//		
//			
//			// -------------------------이미지 셋아이콘으로 넣기?------------------------
//			icon = new ImageIcon("image/BossSkill3.gif");
//		
//		}
//			
//			//			new LoginScr(loading);
////            loading.setVisible(false);
////		public void finalSkill1 () {
////				this.subPanel = new JPanel();
////				subPanel.setBounds(20, 0, 450, 330);
////				subPanel.setOpaque(false);
////				Image skill = new ImageIcon("images/skill/보스스킬1.gif").getImage().getScaledInstance(450, 330, 0);
////				skillLabel = new JLabel(new ImageIcon(skill));
////				skillLabel.setBounds(0, 0,500, 330);
////				mainPanel.add(subPanel);
////				subPanel.add(skillLabel);
////		
////		}
//		public void skill() {
//		   
//			this.subPanel = new JPanel();
////			subPanel.setBounds(20, 0, 450, 330);
////			subPanel.setOpaque(false);
////			Image skill = new ImageIcon("images/skill/보스스킬1.gif").getImage().getScaledInstance(450, 330, 0);
////			skillLabel = new JLabel(new ImageIcon(skill));
////			skillLabel.setBounds(0, 0,500, 330);
////			mainPanel.add(subPanel);
////			subPanel.add(skillLabel);
//			
//			new Thread(new Runnable() {
//		       @Override
//		       public void run() {
//		    		int n = 0;
//		          while (true) {
//		        	  try {
//							Thread.sleep(1000);
//							n++;
//							if (n == 5) {
//								
//								subPanel.setBounds(20, 0, 450, 330);
//								subPanel.setOpaque(false);
//								Image skill = new ImageIcon("images/skill/보스스킬1.gif").getImage().getScaledInstance(450, 330, 0);
//								skillLabel = new JLabel(new ImageIcon(skill));
//								skillLabel.setBounds(0, 0,500, 330);
//								mainPanel.add(subPanel);
//								subPanel.add(skillLabel);
//								
//							}
//					System.out.println("쓰래드 실행");	} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//		          }
//		       }
//		    }).start();
////				new Thread(new Runnable() {
//////	         ----------------스킬 쓰래드 해서 하기!!!---------------------
////				@Override
////				public void run() {
////					int n = 0;
////					while (true) {
////						try {
////							Thread.sleep(1000);
////							n++;
////							if (n == 5) {
////								
////								new ImageIcon("iamge/bossSkill3.gif");
////								new Skill(mf);
////								mainPanel.setVisible(true);
////							}
////					System.out.println("쓰래드 실행");	} catch (InterruptedException e) {
////							e.printStackTrace();
////						}
////					}
////				}
////			}).start();
////
////			setVisible(true);
////			
//			
//			
//			
//			}
//}
//
//
// 
//	
