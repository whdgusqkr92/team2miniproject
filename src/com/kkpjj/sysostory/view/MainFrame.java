package com.kkpjj.sysostory.view;

import javax.swing.JFrame;


public class MainFrame extends JFrame {

	private JFrame mf;

	public MainFrame() {
		
		mf = new JFrame();

		mf.setTitle("sysoStory");
		mf.setSize(800, 600);
		mf.setLayout(null);
		

//		new VillageView(mf);
//		new BattlePage(mf);
		new com.kkpjj.sysostory.view.story.OpMainPage(mf);

		mf.setLocationRelativeTo(null);
		mf.setResizable(true);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
