package com.kkpjj.sysostory.view.character;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusPanel extends JPanel {
	
	private JFrame mf;
	private JPanel statusPanel;
	private JPanel mapPanel;
	
	public StatusPanel(JFrame mf) {
		
		// 하단 상태 패널
		statusPanel = new JPanel();
		statusPanel.setBounds(0, 420, 560, 180);
		
		// 하단 맵 정보 패널
		mapPanel = new JPanel();
		mapPanel.setBounds(560, 420, 240, 180);
		
		// 상태 이미지
		Image statusBg = new ImageIcon("images/status.png").getImage().getScaledInstance(560, 180, 0);
		JLabel label1 = new JLabel(new ImageIcon(statusBg));

		// 맵 정보 이미지
		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
		JLabel label2 = new JLabel(new ImageIcon(mapBg));

		statusPanel.add(label1);
		mapPanel.add(label2);

		mf.add(statusPanel);
		mf.add(mapPanel);
	}
}
