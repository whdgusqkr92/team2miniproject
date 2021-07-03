package com.kkpjj.sysostory.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private JFrame mf;

	public MainFrame() {
		
		mf = new JFrame();
		
//		new FinalBoss(mf);
		new MiddleBoss(mf);
		
		mf.setSize(800, 600);
		mf.setLayout(null);
		mf.setTitle("sysoStory");

		
		mf.setLocationRelativeTo(null);
		mf.setResizable(true);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
