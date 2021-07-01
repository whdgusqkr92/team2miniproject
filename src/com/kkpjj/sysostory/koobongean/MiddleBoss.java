package com.kkpjj.sysostory.koobongean;

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


public class MiddleBoss extends JFrame{

	private JFrame mf;
	private JPanel mainpanel;
	
	private JLabel textLabel;
	private JLabel textLabel2;
	
	private JButton btn;
	private JButton btn2;
	
	public MiddleBoss() {
	//------------------------메인 프레임 생성---------------------------------	
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

	
	//-------------------------대화 이미지1 출력------------------------------------------------	
	Image text1 = new ImageIcon("images/text1.png").getImage().getScaledInstance(700, 180, 0);
	textLabel = new JLabel(new ImageIcon(text1));
	textLabel.setBounds(0, 251, 792, 143);
	mainpanel.add(textLabel);
	//-------------------------대화 이미지 2출력--------------------------------------------------
	Image text2 = new ImageIcon("images/text2.png").getImage().getScaledInstance(700, 180, 0);
	textLabel2 = new JLabel(new ImageIcon(text2));
	textLabel2.setBounds(0, 251, 792, 143);
	mainpanel.add(textLabel2);
	textLabel2.setVisible(false);
	
	//-------------------------버튼 누르면 대화창 넘기기-------------------------------------
	
	textLabel.addMouseListener(new OneActionListener());
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
	//----------배틀 전환---------------------------
//private class BattleActionListener extends MouseAdapter {
//	
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		
//		
//	}
//}

//----------------------메인메소드-----------------	
	public static void main(String[] args) {
		new MiddleBoss();
	}
}

