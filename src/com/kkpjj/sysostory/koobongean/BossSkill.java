package com.kkpjj.sysostory.koobongean;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BossSkill extends JPanel{
	 
//	boolean isSkill = true;
	private JFrame mf;
	private JPanel mainpanel;
	private JLabel textLabel;
	
	public BossSkill() {
		
//	public void MiddleBossSkill() {
			
//		new Thread(new Runnable() {
//	         @Override
//	         public void run() {	
//	        	 while (isSkill) {
//	                 setIcon(skillIcon);
//	                 Col(enemy);
//	                 x++;
//	                 setLocation(x, y); // 내부에 repaint() 존재
//	                 try {
//	                    Thread.sleep(1);
//
//	                 } catch (InterruptedException e) {
//	                    e.printStackTrace();
//
//	                 }
//	              }
//	           }
//	        }).start();
//
//			
//	}
	mf = new JFrame();
	mf.setTitle("sysoStory");
	mf.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
	mf.setBounds(300, 75, 800, 600);


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

	
	Image text1 = new ImageIcon("images/bossSkill.gif").getImage().getScaledInstance(700, 180, 0);
	textLabel = new JLabel(new ImageIcon(text1));
	textLabel.setBounds(0, 251, 792, 143);
	mainpanel.add(textLabel);
	
	
	
	mf.setVisible(true); //계속 보임
	mf.setResizable(false); //창변경 불가
}
	public void FinalBossSkill() {
			
	}
	
	
	
	
	
	public static void main(String[] args) {
		new BossSkill();
	}
}
