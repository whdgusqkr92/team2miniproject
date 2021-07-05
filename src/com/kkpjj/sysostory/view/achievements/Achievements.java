package com.kkpjj.sysostory.view.achievements;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Achievements extends JPanel{

	private JFrame mf;
	private JPanel mainPanel;
	private JPanel skilUpPanel;
	private JPanel skillListPanel;
	private JPanel skilExPanel;
	private JLabel mainLabel; 
	
	public Achievements(JFrame mf) {
		mf = mf;
	

	mainPanel = new JPanel(); // 메인 패널
	mainPanel.setBounds(0, 0, 800, 600); 																// 메인 패널 사이즈

	
	skilUpPanel = new JPanel();
	skilUpPanel.setBounds(50, 20, 700, 45);
	
	skillListPanel = new JPanel();
	skillListPanel.setBounds(50, 100, 700, 300);
	
	skilExPanel = new JPanel();
	skilExPanel.setBounds(50, 420, 700, 100);
	
	Font font = new Font("궁서 보통", Font.BOLD,30);	
	
	/*-----------------------------------이미지 선언부-----------------------------------------*/
	
	Image mainImage = new ImageIcon("images/skill/스킬 목록 배경.png").getImage().getScaledInstance(800, 600, 0);
	mainPanel.setLayout(null);
	
	Image SkilUpImage = new ImageIcon("images/skill/스킬 상단배경.png").getImage().getScaledInstance(700, 45, 0);
	skilUpPanel.setLayout(null);
	
	Image SkilListImage = new ImageIcon("images/skill/업적2.png").getImage().getScaledInstance(700, 300, 0);
	
	Image exImage = new ImageIcon("images/skill/스킬설명창.png").getImage().getScaledInstance(700, 100, 0);
	skilExPanel.setLayout(null);
	
	/*-------------------------------라벨 생성 ---------------------------------------*/
	
	JLabel mainLabel = new JLabel(new ImageIcon(mainImage));
	mainLabel.setBounds(0, 0, 800, 600);
	
	JLabel skilUpLabel = new JLabel(new ImageIcon(SkilUpImage));
	skilUpLabel.setBounds(50, 20, 700, 45);
	
	JLabel skilUpTextLabel = new JLabel("업적 리스트");
	skilUpTextLabel.setBounds(325, 30, 200, 30);
	
	JLabel skillListLabel = new JLabel(new ImageIcon(SkilListImage));
	skillListLabel.setBounds(45, 100, 700, 300);
	
	JLabel skilExLabel = new JLabel(new ImageIcon(exImage));
	skilExLabel.setBounds(45, 420, 700, 100);
	
	
	/*-------------------------------버튼 생성 ---------------------------------------*/
	
	JButton backButton = new JButton(new ImageIcon("images/skill/도망가기.png"));
	backButton.setBounds(745, 20, 35, 35);
	
	/*-------------------------------패널들 넣어주는 곳---------------------------------------*/
	mainPanel.setLayout(null);
	
	skilUpTextLabel.setFont(font);
	
	mainLabel.add(skilUpTextLabel);
	mainLabel.add(skilUpLabel);
	mainLabel.add(skillListLabel);
	mainLabel.add(skilExLabel);
	mainLabel.add(backButton);
	mainPanel.add(mainLabel);
	
	
	mf.getContentPane().add(mainPanel);
	
	}
	
	
}
