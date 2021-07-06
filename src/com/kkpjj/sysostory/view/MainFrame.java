package com.kkpjj.sysostory.view;

import javax.swing.JFrame;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.view.boss.BossTurn;
import com.kkpjj.sysostory.view.character.FieldCharacterBattle;
import com.kkpjj.sysostory.view.character.GameScreen;
import com.kkpjj.sysostory.view.member.StartScreen;
import com.kkpjj.sysostory.view.story.EndingPage;

public class MainFrame extends JFrame {

	private JFrame mf;
	private CharacterDTO chr;

	public MainFrame() {
		
		mf = new JFrame();
		chr = new CharacterDTO();

		mf.setTitle("sysoStory");
		mf.setSize(800, 600);
		mf.setLayout(null);
		

		//new EndingPage(mf);
		
//		new StartScreen(mf);
		new FieldCharacterBattle(mf, chr);
		
//		new BossTurn(mf);

		mf.setLocationRelativeTo(null);
		mf.setResizable(true);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
}
