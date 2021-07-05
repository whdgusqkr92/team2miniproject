





package com.kkpjj.sysostory.view.skill;

import java.awt.Font;
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


import com.kkpjj.sysostory.controller.SkillController;


public class SkillList extends JPanel {

	
	private JPanel mainPanel;
	private JPanel skilUpPanel;
	private JPanel skillListPanel;
	private JPanel skilExPanel;
	private JLabel mainLabel;
	private SkillController sc;
	private JFrame mf;
	private int skillCode; 
	private String skillScript;
	
	public SkillList(JFrame mf) {
		this.mf = mf;
		
		
	
		
		mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 800, 600);
		
		skilUpPanel = new JPanel();
		skilUpPanel.setBounds(50, 20, 700, 45);
		
		skillListPanel = new JPanel();
		skillListPanel.setBounds(50, 100, 700, 300);
		
		skilExPanel = new JPanel();
		skilExPanel.setBounds(50, 420, 700, 100);
		
		Font font = new Font("궁서 보통", Font.BOLD,30);		
		
		this.sc = new SkillController();
		
		/*-----------------------------------이미지 선언부-----------------------------------------*/
		
		Image mainImage = new ImageIcon("images/skill/스킬 목록 배경.png").getImage().getScaledInstance(800, 600, 0);
		
		Image SkilUpImage = new ImageIcon("images/skill/스킬 상단배경.png").getImage().getScaledInstance(700, 45, 0);
		skilUpPanel.setLayout(null);
		
		Image SkilListImage = new ImageIcon("images/skill/스킬리스트.png").getImage().getScaledInstance(700, 300, 0);
		
		Image exImage = new ImageIcon("images/skill/스킬설명창.png").getImage().getScaledInstance(700, 100, 0);
		skilExPanel.setLayout(null);
		
		/*-------------------------------라벨 생성 ---------------------------------------*/
		
		mainLabel = new JLabel(new ImageIcon(mainImage));
		mainLabel.setBounds(0, 0, 800, 600);
		
		JLabel skilUpLabel = new JLabel(new ImageIcon(SkilUpImage));
		skilUpLabel.setBounds(50, 20, 700, 45);
		
		JLabel skilUpTextLabel = new JLabel("스킬 목록");
		skilUpTextLabel.setBounds(325, 30, 200, 30);
		
		JLabel skillListLabel = new JLabel(new ImageIcon(SkilListImage));
		skillListLabel.setBounds(45, 100, 700, 300);
		
		JLabel skilExLabel = new JLabel(new ImageIcon(exImage));
		skilExLabel.setBounds(45, 420, 700, 100);
		
		JLabel skilExTextLabel = new JLabel();
		skilExTextLabel.setBounds(0, 0, 700, 100);
		
		/*-------------------------------버튼 생성 ---------------------------------------*/
		
		JButton backButton = new JButton(new ImageIcon("images/skill/도망가기.png"));
		backButton.setBounds(745, 20, 35, 35);
		
		
		JButton skillButton1 = new JButton(new ImageIcon("images/skill/얼음스킬.png"));
		skillButton1.setBounds(65, 115, 140, 115);
		skillButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String skillScript = sc.selectSkillScript(skillCode);
				skilExTextLabel.setText(skillScript);
//				skilExTextLabel.setText("야이~~~~~~~~~~~");
			}
		});
		
		JButton skillButton2 = new JButton(new ImageIcon("images/skill/파이어블링크아이콘.png"));
		skillButton2.setBounds(240, 115, 140, 115);
		
		JButton skillButton3 = new JButton(new ImageIcon("images/skill/회축아이콘.png"));
		skillButton3.setBounds(415, 115, 140, 115);
		
		JButton skillButton4 = new JButton(new ImageIcon("images/skill/페어리턴아이콘.png"));
		skillButton4.setBounds(590, 115, 140, 115);
		
		JButton skillButton5 = new JButton(new ImageIcon("images/skill/플레임볼텍스아이콘.png"));
		skillButton5.setBounds(65, 267, 140, 115);
		
		JButton skillButton6 = new JButton(new ImageIcon("images/skill/도망가기.png"));
		skillButton6.setBounds(240, 267, 140, 115);
		
		JButton skillButton7 = new JButton(new ImageIcon("images/skill/도망가기.png"));
		skillButton7.setBounds(415, 267, 140, 115);
		
		JButton skillButton8 = new JButton(new ImageIcon("images/skill/괴력난신.png"));
		skillButton8.setBounds(590, 267, 140, 115);
//		
//		backButton.addMouseListener(new MyMouseAdapter());
		
	
		
		
		/*-------------------------------버튼 넣어주는 곳---------------------------------------*/
		
		mainLabel.add(backButton);
		mainLabel.add(skillButton1);
		mainLabel.add(skillButton2);
		mainLabel.add(skillButton3);
		mainLabel.add(skillButton4);
		mainLabel.add(skillButton5);
		mainLabel.add(skillButton6);
		mainLabel.add(skillButton7);
		mainLabel.add(skillButton8);
		
		/*-------------------------------패널들 넣어주는 곳---------------------------------------*/
		
		skilExLabel.add(skilExTextLabel);
		mainPanel.setLayout(null);
		mainPanel.setLayout(null);
		skilUpTextLabel.setFont(font);	
		mainLabel.add(skilUpTextLabel);
		mainLabel.add(skilUpLabel);
		mainLabel.add(skillListLabel);
		mainLabel.add(skilExLabel);
		
		mainPanel.add(mainLabel);
		mainPanel.add(mainLabel);
		
		mainPanel.add(skilUpPanel);
		mainPanel.add(skillListPanel);
		skillListPanel.setLayout(null);
//		skillListPanel.setLayout(null);
		mainPanel.add(skilExPanel);
		
//		JButton btnNewButton = new JButton("New button");
//		btnNewButton.setBounds(235, 35, 97, 23);
//		mainLabel.add(btnNewButton);
//		btnNewButton.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//					
//			}
//		});
		mf.getContentPane().setLayout(null);
		
		
		
		
		mf.getContentPane().add(mainPanel);
		
	
	
	
	}


//	private class MyMouseAdapter extends MouseAdapter { 									// 마우스 클릭시 전투 패널로 넘어감
//
//		@Override
//		public void mouseClick(MouseEvent e) {
//			
//			
//		}
//	
	}

//}






