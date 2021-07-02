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


		new BossDieText(mf);
		




		new CharacterView(mf);

		



		new FieldCharacterBattle(mf);
		


		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

