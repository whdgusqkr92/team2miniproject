package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class SubMenu extends JPanel {
	private SubMenu subMenu;
	protected JPanel monPanel;
	protected JButton button1;
	protected JButton button2;
	protected JButton button3;
	protected JButton button4;
	protected String attackType;
	protected String attackName;
	
	public SubMenu() {
		this.subMenu = this;
		this.setBounds(24, 60, 170, 155);
		this.setLayout(null);
		this.setOpaque(false);

		Font font = new Font("둥근모꼴", Font.PLAIN, 16);
		
		// 몬스터 생성
		monPanel = new BattleMonPanel();
		
		// 전투 세부메뉴 설정
		button1 = new JButton();
		button1.setBounds(0, 0, 170, 35);
		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.BLACK);
		button1.setFont(font);
		
		button2 = new JButton();
		button2.setBounds(0, 40, 170, 35);
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.BLACK);
		button2.setFont(font);
		
		button3 = new JButton();
		button3.setBounds(0, 80, 170, 35);
		button3.setForeground(Color.WHITE);
		button3.setBackground(Color.BLACK);
		button3.setFont(font);
		
		button4 = new JButton();
		button4.setBounds(0, 120, 170, 35);
		button4.setForeground(Color.WHITE);
		button4.setBackground(Color.BLACK);
		button4.setFont(font);

		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		
	}
}

class AttackButton extends SubMenu {
		
	public AttackButton(JFrame mf) {
		super();
		button1.setText("기본 공격");
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
		
		mf.add(monPanel);
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				attackType = "normal";
				attackName = "기본 공격";
//				BattlePage().monpanel.selectMon(attackType, attackName, mon);;
			}
		});
	}
}

class SkillButton extends SubMenu {
	
	public SkillButton(JFrame mf) {
		super();
		button1.setText("스킬 공격1");
		button2.setText("스킬 공격2");
		button3.setText("스킬 공격3");
		button4.setText("스킬 공격4");
		
		mf.add(monPanel);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				attackType = "skill";
				attackName = "스킬 공격1";
			}
		});

		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				attackType = "skill";
				attackName = "스킬 공격2";
				new BattleSelectMon();
			}
		});
		
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				attackType = "skill";
				attackName = "스킬 공격3";
				new BattleSelectMon();
			}
		});
		
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				attackType = "skill";
				attackName = "스킬 공격4";
				new BattleSelectMon();
			}
		});
	}
}

class PotionButton extends SubMenu {
	
	public PotionButton(JFrame mf) {
		super();
		button1.setText("HP 물약");
		button2.setText("MP 물약");
		button3.setVisible(false);
		button4.setVisible(false);
		
		mf.add(monPanel);

	}
}

class RunButton extends SubMenu {
	
	public RunButton(JFrame mf) {
		super();
		button1.setText("도망가기");
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
		
		mf.add(monPanel);
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				ViewUtil.changePanel(mf, , new SubPage());
			}
		});
	}
}