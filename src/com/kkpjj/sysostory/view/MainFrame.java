package com.kkpjj.sysostory.view;

import javax.swing.JFrame;

import com.kkpjj.sysostory.test.RpgGame;

public class MainFrame extends JFrame {

	private JFrame mf;

	public MainFrame() {
		
		mf = new JFrame();

		mf.setSize(805, 620);
		mf.setLayout(null);
		mf.setTitle("sysoStory");

//		new BattlePage(mf);
//		new SkillList(mf);
		new CharacterView(mf);
//		new VillageView(mf);
//		new RpgGame(mf);
//		mf.add(new RpgGame(mf));
//		new StatusPanel(mf);
		

		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

