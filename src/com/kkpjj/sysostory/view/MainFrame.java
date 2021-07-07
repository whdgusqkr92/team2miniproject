package com.kkpjj.sysostory.view;

import javax.swing.JFrame;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.view.boss.MiddleBossEvent;
import com.kkpjj.sysostory.view.member.StartScreen;

import com.kkpjj.sysostory.model.dto.InventoryDTO;


public class MainFrame extends JFrame {

	private JFrame mf;
	private CharacterDTO chr;
	private InventoryDTO inventoryDTO;
	private CharacterDTO characterDTO;

	public MainFrame() {
		
		mf = new JFrame();
		chr = new CharacterDTO();

		mf.setTitle("sysoStory");
		mf.setSize(800, 600);
		mf.setLayout(null);



		new StartScreen(mf);
//		new MiddleBossEvent(mf, characterDTO, inventoryDTO);
//		new MiddleBossEvent(mf);
//		new FinalBossEvent(mf);
//		new EndingPage(mf, characterDTO);




//		mf.add(new CharacterView(mf, chr));
//		new FieldCharacterBattle(mf, inventoryDTO, characterDTO);
		
//		new FieldCharacterBattle(mf, inventoryDTO, characterDTO);
//		new SkillList(mf);
//		new Skill(mf);
		



		mf.setLocationRelativeTo(null);
		mf.setResizable(true);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	



	
	
	
	
}