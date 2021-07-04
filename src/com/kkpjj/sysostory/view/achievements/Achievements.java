package com.kkpjj.sysostory.view.achievements;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Achievements {

	private JFrame mf;
	private JPanel mainPanel;
	private JPanel fieldJPanel;
	
	
	
	
	public Achievements(JFrame mf) {
	this.mf = mf;
	

	mainPanel = new JPanel(); // 메인 패널
	mainPanel.setBounds(0, 0, 800, 600); 																// 메인 패널 사이즈
	mainPanel.setLayout(null);

	fieldJPanel = new JPanel(); // 필드 패널
	fieldJPanel.setBounds(0, 0, 800, 400); 																// 필드 패널 사이즈
	fieldJPanel.setLayout(null);

	
	
	
	
	}
	
	
}
