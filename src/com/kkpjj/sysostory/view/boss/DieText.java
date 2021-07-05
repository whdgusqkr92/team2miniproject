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

public class DieText extends JPanel {
	
	private JFrame mf;
	private JPanel mainpanel;
	
	private JLabel textLabel;
	private JLabel textLabel2;
	private JButton btn;
	
	public DieText(JFrame mf, JPanel mainpanel) {
	
		
		this.mf = mf;
		this.mainpanel = mainpanel ;
		
	}
			public void CharaDie() {
				
				Image GameOver = new ImageIcon("images/text/GameOver.png").getImage().getScaledInstance(400, 200, 0);
				textLabel2 = new JLabel(new ImageIcon(GameOver));
				textLabel2.setBounds(200, 0, 400, 200);
				mainpanel.add(textLabel2);
				
				
				
				Image chrDieText = new ImageIcon("images/text/chrDieText.png").getImage().getScaledInstance(650, 180, 0);
				textLabel = new JLabel(new ImageIcon(chrDieText));
				textLabel.setBounds(0, 251, 792, 143);
				mainpanel.add(textLabel);
				
				textLabel2.addMouseListener(new BattleActionListener());
			}
				
			private class BattleActionListener extends MouseAdapter {
				public BattleActionListener() {
	}

				@Override
				public void mouseClicked(MouseEvent e) {
					
					ViewUtil.changePanel(mf, mainpanel, new MiddleBossEvent(mf));
				
						}
					}
				}
