package com.kkpjj.sysostory.view;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import com.kkpjj.sysostory.model.dto.CharacterDTO;

import com.kkpjj.sysostory.view.member.StartScreen;
import com.kkpjj.sysostory.view.skill.SkillList;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.view.boss.BossTurn;

import com.kkpjj.sysostory.view.battle.BattlePage;

import com.kkpjj.sysostory.view.character.FieldCharacterBattle;
import com.kkpjj.sysostory.view.character.Sound;




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


//		mf.add(new StartScreen(mf));
		



		new FieldCharacterBattle(mf, inventoryDTO, characterDTO);
		




//		new SkillList(mf);



		mf.setLocationRelativeTo(null);
		mf.setResizable(true);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
//	private static Clip clip;
//	
//	public static void sound(){
//		
//		File file = new File("images/text/bgm.wav");
//		try {
//			clip = AudioSystem.getClip();
//			clip.open(AudioSystem.getAudioInputStream(file));
//			clip.loop(Clip.LOOP_CONTINUOUSLY);   //창이 닫히기 전 무한 루프
//			clip.loop(30);  //루프 30번 
//			clip.start();
//			
//		} catch (LineUnavailableException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedAudioFileException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	
//		public static void battlesound(){
//			
//			File file = new File("images/text/MIDDA008.MID");
//			try {
//				clip = AudioSystem.getClip();
//				clip.open(AudioSystem.getAudioInputStream(file));
////				clip.loop(Clip.LOOP_CONTINUOUSLY);   //창이 닫히기 전 무한 루프
//				clip.loop(30);  //루프 30번 
//				clip.start();
//				
//			} catch (LineUnavailableException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (UnsupportedAudioFileException e) {
//				e.printStackTrace();
//			}
//
//		}
//	
//	
//	public static void soundStop() {
//		clip.stop();
//		
//	}
//	
//	public static void effSound(){
//		
//		File file = new File("images/text/eff1.wav");
//		try {
//			clip = AudioSystem.getClip();
//			clip.open(AudioSystem.getAudioInputStream(file));
////			clip.loop(Clip.LOOP_CONTINUOUSLY);   //창이 닫히기 전 무한 루프
//			clip.loop(4);  //루프 30번 
//			clip.start();
//			
//		} catch (LineUnavailableException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnsupportedAudioFileException e) {
//			e.printStackTrace();
//		}
//
//		}



	
	
	
	
}
