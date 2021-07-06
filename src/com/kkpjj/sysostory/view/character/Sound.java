package com.kkpjj.sysostory.view.character;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {
	
	private static Clip clip;
	
	public static void sound(){
		
		File file = new File("images/text/bgm.wav");
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.loop(Clip.LOOP_CONTINUOUSLY);   //창이 닫히기 전 무한 루프
			clip.loop(30);  //루프 30번 
			clip.start();
			
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
	}
	
	
	
		public static void battlesound(){
			
			File file = new File("images/text/MIDDA008.MID");
			try {
				clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(file));
//				clip.loop(Clip.LOOP_CONTINUOUSLY);   //창이 닫히기 전 무한 루프
				clip.loop(30);  //루프 30번 
				clip.start();
				
			} catch (LineUnavailableException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedAudioFileException e) {
				e.printStackTrace();
			}

		}
	
	
	public static void soundStop() {
		clip.stop();
		
//		clip.start();
	}
	
	public static void effSound(){
		
		File file = new File("images/text/eff1.wav");
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
//			clip.loop(Clip.LOOP_CONTINUOUSLY);   //창이 닫히기 전 무한 루프
			clip.loop(4);  //루프 30번 
			clip.start();
			
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		}

		}
	
	
	
	
}
