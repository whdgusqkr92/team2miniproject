package com.kkpjj.sysostory.koobongean;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FinalBoss extends JFrame{

	private JFrame mf;
	private JPanel mainpanel;
	
	private JLabel textLabel;
	private JLabel textLabel2;
	private JLabel textLabel3;
	private JLabel textLabel4;
	private JLabel textLabel5;
	
//	private JButton btn1;
//	private JButton btn2;
//	private JButton btn3;
//	private JButton btn4;
//	private JButton btn5;
	
	public FinalBoss() {
	//------------------------메인 프레임 생성---------------------------------	
	mf = new JFrame();
	mf.setTitle("sysoStory");
	mf.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
	mf.setBounds(300, 75, 800, 600);

	
	//--------------------------배경 필드 패널 만들기------------------------------	
	Image field = new ImageIcon("Images/FinalBossField.png").getImage().getScaledInstance(800, 200, 0);
		
	mainpanel = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(field,0,0,800,420,this);
			}
		};
		
	mainpanel.setBounds(0, 0, 800, 420);
	mainpanel.setLayout(null);
	mf.add(mainpanel); // 생성한 패널 프레임에 추가

	
	//-------------------------대화 이미지1 출력------------------------------------------------	
	Image text1 = new ImageIcon("images/FinalBosstext1.png").getImage().getScaledInstance(800, 260, 0);
	textLabel = new JLabel(new ImageIcon(text1));
	textLabel.setBounds(0, 251, 792, 180);
	mainpanel.add(textLabel);
	//-------------------------대화 이미지 2출력--------------------------------------------------
	Image text2 = new ImageIcon("images/FinalBosstext2.png").getImage().getScaledInstance(800, 230, 0);
	textLabel2 = new JLabel(new ImageIcon(text2));
	textLabel2.setBounds(0, 251, 792, 150);
	mainpanel.add(textLabel2);
	textLabel2.setVisible(false);
	//--------------------------대화 이미지 3 출력---------------------------------------------------
	Image text3 = new ImageIcon("images/FinalBosstext3.png").getImage().getScaledInstance(800, 250, 0);
	textLabel3 = new JLabel(new ImageIcon(text3));
	textLabel3.setBounds(0, 251, 792, 170);
	mainpanel.add(textLabel3);
	textLabel3.setVisible(false);
	//--------------------------대화 이미지 4 출력---------------------------------------------------
	Image text4 = new ImageIcon("images/FinalBosstext4.png").getImage().getScaledInstance(800, 250, 0);
	textLabel4 = new JLabel(new ImageIcon(text4));
	textLabel4.setBounds(0, 251, 792, 170);
	mainpanel.add(textLabel4);
	textLabel4.setVisible(false);
	//--------------------------대화 이미지 3 출력---------------------------------------------------
	Image text5 = new ImageIcon("images/FinalBosstext5.png").getImage().getScaledInstance(800, 300, 0);
	textLabel5 = new JLabel(new ImageIcon(text5));
	textLabel5.setBounds(0, 251, 792, 170);
	mainpanel.add(textLabel5);
	textLabel5.setVisible(false);
	
	
	

	textLabel.addMouseListener(new OneActionListener());
	textLabel2.addMouseListener(new TwoActionListener());
	textLabel3.addMouseListener(new ThdActionListener());
	textLabel4.addMouseListener(new FourActionListener());
//	btn5.addMouseListener(new BattleActionListener());
		
		
	
	mf.setVisible(true); //계속 보임
	mf.setResizable(false); //창변경 불가
	mf.setDefaultCloseOperation(EXIT_ON_CLOSE); //닫으면 실행종료	

	
	}
	//---------------------------------------------------------
	
	
	
private class OneActionListener extends MouseAdapter {
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		textLabel.setVisible(false);
		textLabel2.setVisible(true);
		}
}
private class TwoActionListener extends MouseAdapter {
	
	@Override
	public void mousePressed(MouseEvent e) {
		textLabel2.setVisible(false);
		textLabel3.setVisible(true);
	}
}
private class ThdActionListener extends MouseAdapter {
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		textLabel3.setVisible(false);
		textLabel4.setVisible(true);
		
	}
}
private class FourActionListener extends MouseAdapter {
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		textLabel4.setVisible(false);
		textLabel5.setVisible(true);
		
	}
}
//private class BattleActionListener extends MouseAdapter {
//	
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		btn5.setVisible(false);
//		
//		ViewUtil.changePanel(mf, view, new battle();
//		
//	}
//}

//----------------------메인메소드-----------------	
	public static void main(String[] args) {
		new FinalBoss();
	}
}

