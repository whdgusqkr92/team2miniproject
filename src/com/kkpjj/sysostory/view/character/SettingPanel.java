package com.kkpjj.sysostory.view.character;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.sound.midi.Soundbank;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.run.Application;
import com.kkpjj.sysostory.view.MainFrame;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.member.StartScreen;


public class SettingPanel extends JPanel {

	
	private CharacterDTO chr;
	private JFrame mf;
	private JPanel mainpanel;
	
	Image field = new ImageIcon("Images/field/설정페이지.png").getImage().getScaledInstance(800, 200, 0);

	public SettingPanel(JFrame mf) {
		this.mf = mf;
		this.mainpanel = this;

		mainpanel.setBounds(0, 0, 800, 400);
		mainpanel.setLayout(null);
		mf.add(mainpanel);

//		JButton saveBtn = new JButton("저장하기");
//		saveBtn.setBounds(250, 70, 292, 47);
//		mainpanel.add(saveBtn);

		JButton logOutBtn = new JButton("로그아웃");
		logOutBtn.setBounds(250, 130, 292, 47);
		mainpanel.add(logOutBtn);

		JButton bgmOn = new JButton("배경음 on");
		bgmOn.setBounds(250, 190, 146, 47);
		mainpanel.add(bgmOn);

		JButton bgmOff = new JButton("배경음 off");
		bgmOff.setBounds(400, 190, 145, 47);
		mainpanel.add(bgmOff);

//		JButton effbtnOn = new JButton("효과음 on");
//		effbtnOn.setBounds(250, 270, 146, 47);
//		mainpanel.add(effbtnOn);
//
//		JButton effbtnOff = new JButton("효과음off");
//		effbtnOff.setBounds(400, 270, 145, 47);
//		mainpanel.add(effbtnOff);

		JButton backbtn = new JButton("돌아가기");
		backbtn.setBounds(250, 330, 292, 47);
		mainpanel.add(backbtn);

//		saveBtn.addMouseListener(new SaveBtn());
		logOutBtn.addMouseListener(new LogOutBtn());
		bgmOn.addMouseListener(new BgmOn());
		bgmOff.addMouseListener(new BgmOff());
		
//		effbtnOn.addMouseListener(new EffbtnOn()); 안해
//		effbtnOff.addMouseListener(new EffbtnOff());
		backbtn.addMouseListener(new Backbtn());
		//			logOutBtn
		//			bgmbtn
		//			effbtn
		//			backbtn

	}
	
	public void paintComponent(Graphics g) {
		
		g.drawImage(field,0,0,800,420,this);
		
	}

	//-----------버튼 누르면 세이브 되게 하기
//		private class SaveBtn extends MouseAdapter {
//			@Override
//			public void mousePressed(MouseEvent e) {
//				
//			
//			}
//		}
			//-----------버튼 누르면 로그아웃 되게 하기
		private class LogOutBtn extends MouseAdapter {
			@Override
			public void mousePressed(MouseEvent e) {	
				ViewUtil.changePanel(mf, mainpanel, new StartScreen(mf));
				
			}
		}
			//-----------버튼 누르면 배경음 켜기			
		public class BgmOn extends MouseAdapter {
			@Override
			public void mousePressed(MouseEvent e) {
				boolean ison = true;
				Sound.sound();
//				MainFrame.sound();
			}
		}
			//-----------버튼 누르면 배경음 끄기	
		private class BgmOff extends MouseAdapter {
			@Override
			public void mousePressed(MouseEvent e) {
				
				Sound.soundStop();
//				MainFrame.soundStop();
						
			}
		}
//			-----------버튼 누르면 효과음 되게 하기   	 
//		private class EffbtnOn extends MouseAdapter {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
////				Sound.effSound();
//				 
//		        몰라 안돼 안해
//			}
//		}
//		private class EffbtnOff extends MouseAdapter {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
////				Sound.soundStop();
//			}
//		}
			//-----------버튼 누르면 돌아가게 되게 하기	
		private class Backbtn extends MouseAdapter {
			@Override
			public void mousePressed(MouseEvent e) {
				
			ViewUtil.changePanel(mf, mainpanel, new FieldCharacterBattle(mf, null, chr));
			
			
			}
			
		}
}

