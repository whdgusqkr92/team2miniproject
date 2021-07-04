package com.kkpjj.sysostory.view;

import javax.swing.JFrame;

import com.kkpjj.sysostory.view.boss.BossSkillResultView;
import com.kkpjj.sysostory.view.boss.FinalBoss;
import com.kkpjj.sysostory.view.character.VillageView;
import com.kkpjj.sysostory.view.story.OpMainPage;

public class MainFrame extends JFrame {

	private JFrame mf;

	public MainFrame() {
		
		mf = new JFrame();

		mf.setTitle("sysoStory");
		mf.setSize(800, 600);
		mf.setLayout(null);
		
		new FinalBoss(mf);
//		new VillageView(mf);
//		new BattlePage(mf);

		mf.setLocationRelativeTo(null);
		mf.setResizable(true);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
