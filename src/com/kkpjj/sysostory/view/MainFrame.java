package com.kkpjj.sysostory.view;

import javax.swing.JFrame;

import com.kkpjj.sysostory.view.character.FieldCharacterBattle;
import com.kkpjj.sysostory.view.character.VillageView;
import com.kkpjj.sysostory.view.skill.Skill;
import com.kkpjj.sysostory.view.skill.SkillList;

public class MainFrame extends JFrame {

	private JFrame mf;

	public MainFrame() {
		
		mf = new JFrame();

		mf.setTitle("sysoStory");
		mf.setSize(800, 600);
		mf.setLayout(null);
		
//    new StartScreen();
//    new FieldCharacterBattle(mf);
//		new VillageView(mf);
//		new Skill();
//		new SkillList(mf);
		new FieldCharacterBattle(mf);
		
		mf.setLocationRelativeTo(null);
		mf.setResizable(true);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
