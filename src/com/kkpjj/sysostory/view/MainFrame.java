package com.kkpjj.sysostory.view;

import javax.swing.JFrame;

import com.kkpjj.sysostory.controller.BossAttController;
import com.kkpjj.sysostory.view.battle.BattleMenu;
import com.kkpjj.sysostory.view.battle.BattlePage;
import com.kkpjj.sysostory.view.boss.BossTurn;
import com.kkpjj.sysostory.view.story.EndingPage;
import com.kkpjj.sysostory.view.story.OpMainPage;




public class MainFrame extends JFrame {

	
	private JFrame mf;

	public MainFrame() {
		
		mf = new JFrame();

		mf.setTitle("sysoStory");
		mf.setSize(800, 600);
		mf.setLayout(null);
		
		new OpMainPage(mf);

		mf.setLocationRelativeTo(null);
		mf.setResizable(true);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
