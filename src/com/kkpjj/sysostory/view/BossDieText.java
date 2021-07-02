package com.kkpjj.sysostory.view;

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

import com.kkpjj.sysostory.model.dto.CharaDTO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;

public class BossDieText extends JPanel {
	
	private JFrame mf;
	private JPanel mainpanel;
	
	private JLabel textLabel;
	private JLabel textLabel2;
	private JButton btn;
//	private StoryList code;
	
	public BossDieText(JFrame mf, JPanel mainpanel) {
	
		
		this.mf = mf;
		this.mainpanel = mainpanel ;
		
	}



			public void CharaDie() {
				
				
				btn = new JButton("YOU DIE");
				btn.setBounds(300, 80, 150, 150);
				mainpanel.add(btn);
				
				Image chrDieText = new ImageIcon("images/chrDieText.png").getImage().getScaledInstance(650, 250, 0);
				textLabel = new JLabel(new ImageIcon(chrDieText));
				textLabel.setBounds(0, 251, 792, 143);
				mainpanel.add(textLabel);
				
				btn.addMouseListener(new BattleActionListener());

				btn.setVisible(true);
			
			}
				
		
//			Image bossDieText = new ImageIcon("images/bossDieText.png").getImage().getScaledInstance(680, 200, 0);
//			textLabel2 = new JLabel(new ImageIcon(bossDieText));
//			textLabel2.setBounds(0, 251, 792, 143);
//			mainpanel.add(textLabel2);
			private class BattleActionListener extends MouseAdapter {
				
				public BattleActionListener() {
		// TODO Auto-generated constructor stub
	}

				@Override
				public void mouseClicked(MouseEvent e) {
					
					ViewUtil.changePanel(mf, mainpanel, new BossTurn(mf));
				
						}
					}
				}
