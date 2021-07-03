package com.kkpjj.sysostory.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MiddleBoss extends JPanel{

	private JFrame mf;
	private JPanel mainpanel;
	
	private JLabel charaLabel;
	private JLabel bossLabel;
	private JLabel textLabel;
	private JLabel textLabel2;
	
	private JButton btn;
	private JButton btn2;
	
	public MiddleBoss(JFrame mf) {
		this.mf = mf;
		this.mainpanel = this;

	
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

	//---------------------------주인공 얼굴------------------------------------
	Image chara = new ImageIcon("images/text/주인공.png").getImage().getScaledInstance(100, 100, 0);
	charaLabel = new JLabel(new ImageIcon(chara));
	charaLabel.setBounds(0, 120, 150, 143);
	mainpanel.add(charaLabel);
//	textLabel2.setVisible(false);
	//---------------------------보스 얼굴------------------------------------
		Image bossface = new ImageIcon("images/text/Bossface_M.png").getImage().getScaledInstance(200, 180, 0);
		bossLabel = new JLabel(new ImageIcon(bossface));
		bossLabel.setBounds(650, 110, 150, 143);
		mainpanel.add(bossLabel);
		bossLabel.setVisible(false);
	//-------------------------대화 이미지1 출력------------------------------------------------	
	Image text1 = new ImageIcon("images/text/text1.png").getImage().getScaledInstance(700, 180, 0);
	textLabel = new JLabel(new ImageIcon(text1));
	textLabel.setBounds(0, 251, 792, 143);
	mainpanel.add(textLabel);
	//-------------------------대화 이미지 2출력--------------------------------------------------
	Image text2 = new ImageIcon("images/text/text2.png").getImage().getScaledInstance(700, 180, 0);
	textLabel2 = new JLabel(new ImageIcon(text2));
	textLabel2.setBounds(0, 251, 792, 143);
	mainpanel.add(textLabel2);
	textLabel2.setVisible(false);
	
	//-------------------------버튼 누르면 대화창 넘기기-------------------------------------
	
	textLabel.addMouseListener(new OneActionListener());
	mainpanel.addMouseListener(new BattleActionListener());	
	
	}
	//---------------------------------------------------------
	private class OneActionListener extends MouseAdapter {
		
		@Override
		public void mousePressed(MouseEvent e) {
			
			textLabel.setVisible(false);
			textLabel2.setVisible(true);
			charaLabel.setVisible(false);
			bossLabel.setVisible(true);
			
			}
	}	
	private class BattleActionListener extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
//			ViewUtil.changePanel(mf, mainpanel, new BossTurn(mf));
			
			
			}
		}
}

