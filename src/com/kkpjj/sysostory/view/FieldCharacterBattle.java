package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FieldCharacterBattle extends JFrame {
	private JFrame mf;
	private JPanel mainPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;



	public FieldCharacterBattle() {

		mf = new JFrame();
		mf.setTitle("sysoStory");

		mf.setBounds(0, 0, 800, 600);
		mf.getContentPane().setLayout(null);

//		mainPanel = new JPanel();
//		mainPanel.setBounds(0, 0, 800, 420);
//
//		statusPanel = new JPanel();
//		statusPanel.setBounds(0, 420, 560, 180);
//
//		mapPanel = new JPanel();
//		mapPanel.setBounds(560, 420, 240, 180);



//			Image SkilListPanel = new ImageIcon("images/스킬목록.png").getImage().getScaledInstance(700, 300, 0);
//			skilListPanel.setLayout(null);
//			JLabel SkilListLabel = new JLabel(new ImageIcon(SkilListPanel));
//			SkilListLabel.setBounds(0, 0, 700, 300);
//			skilListPanel.add(SkilListLabel);
//		Image chImage = new ImageIcon("images/battle_chr.png").getImage().getScaledInstance(400, 200, 0);					//캐릭터 이미지
//		JLabel chImageLabel = new JLabel(new ImageIcon(chImage));
//		chImageLabel.setBounds(0, 0, 100, 100);
		
		

//		Image fieldImage = new ImageIcon("images/battle_bg.png").getImage().getScaledInstance(800, 420, 0);					//필드 맵 이미지
//		JLabel fieldImageLabel = new JLabel(new ImageIcon(fieldImage));
//		fieldImageLabel.setBounds(0, 0, 100, 100);
//		
//		fieldImageLabel.add(chImage);
//		
//		
		
//		mainPanel.add(chImageLabel);
//		mainPanel.add(fieldImageLabel);
//
//		mf.getContentPane().add(mainPanel);
//		mf.getContentPane().add(statusPanel);
//		mf.getContentPane().add(mapPanel);
//	
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setContentPane(new Mypanel());
		
		//--------------------------배경 필드 패널 만들기------------------------------	
		Image field = new ImageIcon("Images/field.png").getImage().getScaledInstance(800, 200, 0);
			
		mainPanel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(field,0,0,800,420,this);
				}
			};
			

		}

			mainPanel.setBounds(0, 0, 800, 420);
			mainPanel.setLayout(null);
		mf.add(mainPanel); // 생성한 패널 프레임에 추가
	}
//	class Mypanel extends JPanel {
//		
//		
//		FieldCharacterBattle fi = new FieldCharacterBattle();  
//		
//		
//		Image chr = new ImageIcon("images/battle_chr.png").getImage(); 
//		
//		public void paintComponent(Graphics g) {
//			super.paintComponent(g);
//			g.drawImage(chr,100,100 ,getWidth(), getHeight(), this );																			//무한 실행됨
//			
//		}
//		
//	}
	public static void main(String[] args) {
		new FieldCharacterBattle();

	}
}