
package com.kkpjj.sysostory.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private JFrame mf;

	public MainFrame() {
		mf = new JFrame();

		mf.setSize(800, 600);
		mf.setLayout(null);
		mf.setTitle("sysoStory");

//		new BattlePage(mf);
//		new BossSkill(mf);
//		new SkillList(mf);
		new FieldCharacterBattle(mf);
		
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

