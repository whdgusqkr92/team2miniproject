package com.kkpjj.sysostory.view.boss;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.character.VillageView;

public class DieText extends JPanel {
	
	private JFrame mf;
	private JPanel mainpanel;
	
	private JLabel textLabel;
	private JLabel textLabel2;
	private JLabel bossLabel;
	
	private JButton btn;
	
	public DieText(JFrame mf, JPanel mainpanel) {
	
		
		this.mf = mf;
		this.mainpanel = mainpanel ;
		
	}
			public void charaDie() {
				
				Image GameOver = new ImageIcon("images/text/GameOver.png").getImage().getScaledInstance(400, 200, 0);
				textLabel2 = new JLabel(new ImageIcon(GameOver));
				textLabel2.setBounds(200, 0, 400, 200);
				mainpanel.add(textLabel2);
				
				
				Image chrDieText = new ImageIcon("images/text/chrDieText.png").getImage().getScaledInstance(650, 180, 0);
				textLabel = new JLabel(new ImageIcon(chrDieText));
				textLabel.setBounds(0, 251, 792, 143);
				mainpanel.add(textLabel);
				
				textLabel2.addMouseListener(new RestartActionListener());
			}
			
			public void middleDie() {
				
//				Image bossface = new ImageIcon("images/text/야스오쓰러짐이미지.png").getImage().getScaledInstance(200, 180, 0);
//				bossLabel = new JLabel(new ImageIcon(bossface));
//				bossLabel.setBounds(650, 110, 150, 143);
//				mainpanel.add(bossLabel);
//				bossLabel.setVisible(true);
				Image bossDieText = new ImageIcon("images/text/야스오죽음텍스트.png").getImage().getScaledInstance(600, 300, 0);
				textLabel = new JLabel(new ImageIcon(bossDieText));
				textLabel.setBounds(0, 230, 792, 200);
				mainpanel.add(textLabel);
				
				textLabel.addMouseListener(new RestartActionListener());
				
			}
				
			private class RestartActionListener extends MouseAdapter {
	
				@Override
				public void mouseClicked(MouseEvent e) {
					
					ViewUtil.changePanel(mf, mainpanel, new VillageView(mf)); //여기에 마을or필드 부르면됨.
				
						}
					}
			
//			private class BoxActionListener extends MouseAdapter {
//				
//				@Override
//				public void mouseClicked(MouseEvent e) {
//					
//					
//					ViewUtil.changePanel(mf, mainpanel, new (mf)); //
//				
//						}
//					}
			
				}
