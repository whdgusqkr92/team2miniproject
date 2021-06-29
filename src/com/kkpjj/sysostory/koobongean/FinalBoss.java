package com.kkpjj.sysostory.koobongean;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FinalBoss {
	private JFrame mf;
	private JPanel mainpanel;
	
	private JLabel textLabel;
	private JLabel textLabel2;
	
	private JButton btn;
	private JButton btn2;
	
	public FinalBoss() {
	//------------------------메인 프레임 생성---------------------------------	
	mf = new JFrame();
	mf.setTitle("sysoStory");
	mf.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
	mf.setBounds(300, 75, 800, 600);

	
	//--------------------------배경 필드 패널 만들기------------------------------	
	Image field = new ImageIcon("Images/.png").getImage().getScaledInstance(800, 200, 0);
		
	mainpanel = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(field,0,0,800,420,this);
			}
		};
		
	mainpanel.setBounds(0, 0, 800, 420);
	mainpanel.setLayout(null);
	mf.add(mainpanel); // 생성한 패널 프레임에 추가

	
	//-------------------------대화 이미지1 출력------------------------------------------------	
	Image text1 = new ImageIcon("images/text1.png").getImage().getScaledInstance(535, 154, 0);
	textLabel = new JLabel(new ImageIcon(text1));
	textLabel.setBounds(0, 251, 792, 143);
	mainpanel.add(textLabel);
	//-------------------------대화 이미지 2출력--------------------------------------------------
	Image text2 = new ImageIcon("images/text2.png").getImage().getScaledInstance(650, 150, 0);
	textLabel2 = new JLabel(new ImageIcon(text2));
	textLabel2.setBounds(0, 251, 792, 143);
	mainpanel.add(textLabel2);
	textLabel2.setVisible(false);
	//-------------------------버튼 생성------------------------------------------------
	btn = new JButton("다음");
	btn.setBounds(680, 300, 75, 57);
	mainpanel.add(btn);
	//-------------------------버튼 누르면 대화창 넘기기-------------------------------------
	btn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			textLabel.setVisible(false);
			textLabel2.setVisible(true);
			btn.setVisible(false);
		}
	});
	
	btn2 = new JButton("다음");
	btn2.setBounds(680, 300, 75, 57);
	mainpanel.add(btn2);
	btn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			new BattlePage2();
		}
	});
	
	
	mf.setVisible(true); //계속 보임
	mf.setResizable(false); //창변경 불가
	}
	
//----------------------메인메소드-----------------	
	public static void main(String[] args) {
		new MiddleBoss();
	}

}
