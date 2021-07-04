package com.kkpjj.sysostory.view.battle;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BattleController;

// 전투메뉴 배경 추가, 레이아웃 설정, 전투 세부메뉴(버튼) 추가

public class BattleMenu extends JPanel {

	private BattleController bc;
	private Font font;
	private JButton attackMenu;
	private JButton skillMenu;
	private JButton potionMenu;
	private JButton runMenu;
	JPanel subMenu;
	private JButton subMenu1;
	private JButton subMenu2;
	private JButton subMenu3;
	private JButton subMenu4;
	private String[] subMenuName;
	private String subMenuName1;
	private String subMenuName2;
	private String subMenuName3;
	private String subMenuName4;
	private String attackType;
	
	// 전투메뉴 배경 추가
	Image battleMenuBg = new ImageIcon("images/battle/battle_menu.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(battleMenuBg, 0, 0, getWidth(), getHeight(), this);
	}

	public BattleMenu(BattleController bc) {
		this.bc = bc;
		this.attackType = "attack";
		this.subMenuName = new String[] {"기본 공격1", "기본 공격2", "기본 공격3", "기본 공격4"}; 

		initMenuPanel();
		// 전투메뉴 추가
		createMenu();
		selectMenu();
		createSubMenu();
		selectSubMenu(bc, attackType, subMenuName);
	}

	private void initMenuPanel() {
		this.font = new Font("둥근모꼴", Font.PLAIN, 16);
		this.setBounds(290, 80, 220, 240);
		this.setLayout(null);
		this.setOpaque(false);
	}

	private void createMenu() {
		// 전투메뉴 추가
		this.attackMenu = new AttackMenu();
		attackMenu.setBounds(24, 20, 31, 31);
		this.skillMenu = new SkillMenu();
		skillMenu.setBounds(71, 20, 31, 31);
		this.potionMenu = new PotionMenu();
		potionMenu.setBounds(118, 20, 31, 31);
		this.runMenu = new RunMenu();
		runMenu.setBounds(165, 20, 31, 31);

		this.add(attackMenu);
		this.add(skillMenu);
		this.add(potionMenu);
		this.add(runMenu);
	}
	
	private void selectMenu() {
		attackMenu.addActionListener(new SelectMenu(this, subMenu, "attack"));
		skillMenu.addActionListener(new SelectMenu(this, subMenu, "skill"));
		potionMenu.addActionListener(new SelectMenu(this, subMenu, "potion"));
		runMenu.addActionListener(new SelectMenu(this, subMenu, "run"));
	}

	private void createSubMenu() {
		// 전투 세부메뉴 설정
		this.subMenu = new JPanel();
		subMenu.setBounds(24, 60, 170, 155);
		subMenu.setLayout(null);
		subMenu.setOpaque(false);

		this.subMenu1 = new JButton();
		subMenu1.setBounds(0, 0, 170, 35);
		subMenu1.setForeground(Color.WHITE);
		subMenu1.setBackground(Color.BLACK);
		subMenu1.setFont(font);

		this.subMenu2 = new JButton();
		subMenu2.setBounds(0, 40, 170, 35);
		subMenu2.setForeground(Color.WHITE);
		subMenu2.setBackground(Color.BLACK);
		subMenu2.setFont(font);

		this.subMenu3 = new JButton();
		subMenu3.setBounds(0, 80, 170, 35);
		subMenu3.setForeground(Color.WHITE);
		subMenu3.setBackground(Color.BLACK);
		subMenu3.setFont(font);

		this.subMenu4 = new JButton();
		subMenu4.setBounds(0, 120, 170, 35);
		subMenu4.setForeground(Color.WHITE);
		subMenu4.setBackground(Color.BLACK);
		subMenu4.setFont(font);
		
		subMenu.add(subMenu1);
		subMenu.add(subMenu2);
		subMenu.add(subMenu3);
		subMenu.add(subMenu4);

		this.add(subMenu);
	}
	
	private void selectSubMenu(BattleController bc, String attackType, String[] subMenuName) {
		subMenu1.addActionListener(new SelectSubMenu(bc, attackType, subMenuName[0]));
		subMenu2.addActionListener(new SelectSubMenu(bc, attackType, subMenuName[1]));
		subMenu3.addActionListener(new SelectSubMenu(bc, attackType, subMenuName[2]));
		subMenu4.addActionListener(new SelectSubMenu(bc, attackType, subMenuName[3]));
	}

	void attackSubMenu(BattleMenu battleMenu, String attackType) {
		this.attackType = attackType;
		this.subMenuName = new String[] {"기본 공격1", "기본 공격2", "기본 공격3", "기본 공격4"};

		this.subMenu1.setText(subMenuName[0]);
		this.subMenu2.setText(subMenuName[1]);
		this.subMenu3.setText(subMenuName[2]);
		this.subMenu4.setText(subMenuName[3]);
				
		subMenu1.removeActionListener(new SelectSubMenu(bc, attackType, subMenuName[0]));
		subMenu2.removeActionListener(new SelectSubMenu(bc, attackType, subMenuName[1]));
		subMenu3.removeActionListener(new SelectSubMenu(bc, attackType, subMenuName[2]));
		subMenu4.removeActionListener(new SelectSubMenu(bc, attackType, subMenuName[3]));
		
		selectSubMenu(bc, attackType, subMenuName);
	}

	void skillSubMenu(BattleMenu battleMenu, String attackType) {
		this.attackType = attackType;
		this.subMenuName = new String[] {"스킬 공격1", "스킬 공격2", "스킬 공격3", "스킬 공격4"};

		subMenuName1 = subMenuName[0];
		subMenuName2 = subMenuName[1];
		subMenuName3 = subMenuName[2];
		subMenuName4 = subMenuName[3];

		this.subMenu1.setText(subMenuName1);
		this.subMenu2.setText(subMenuName2);
		this.subMenu3.setText(subMenuName3);
		this.subMenu4.setText(subMenuName4);
		
//		subMenu1.addActionListener(new SelectSubMenu(bc, attackType, subMenuName1));
//		subMenu2.addActionListener(new SelectSubMenu(bc, attackType, subMenuName2));
//		subMenu3.addActionListener(new SelectSubMenu(bc, attackType, subMenuName3));
//		subMenu4.addActionListener(new SelectSubMenu(bc, attackType, subMenuName4));
		selectSubMenu(bc, attackType, subMenuName);
	}

	void potionSubMenu(BattleMenu battleMenu, String attackType) {
		this.attackType = attackType;
		this.subMenuName = new String[] {"아이템 사용"};

		subMenu2.setVisible(false);
		subMenu3.setVisible(false);
		subMenu4.setVisible(false);

		subMenuName1 = subMenuName[0];

		this.subMenu1.setText(subMenuName1);
		
		subMenu1.addActionListener(new SelectSubMenu(bc, attackType, subMenuName1));
		selectSubMenu(bc, attackType, subMenuName);
	}

	void runSubMenu(BattleMenu battleMenu, String attackType) {
		this.attackType = attackType;
		this.subMenuName = new String[] {"도망가기"};

		subMenu2.setVisible(false);
		subMenu3.setVisible(false);
		subMenu4.setVisible(false);

		subMenuName1 = subMenuName[0];

		this.subMenu1.setText(subMenuName1);
		
		subMenu1.addActionListener(new SelectSubMenu(bc, attackType, subMenuName1));
		selectSubMenu(bc, attackType, subMenuName);
	}
}

class SelectMenu implements ActionListener {

	private BattleMenu battleMenu;
	private JPanel subMenu;
	private String attackType;

	public SelectMenu(BattleMenu battleMenu, JPanel subMenu, String attackType) {
		this.battleMenu = battleMenu;
		this.subMenu = subMenu;
		this.attackType = attackType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(subMenu != null) {
			battleMenu.remove(subMenu);
		}
		System.out.println(battleMenu.subMenu);
		
		switch(attackType) {
			case "attack" : battleMenu.attackSubMenu(battleMenu, attackType); break;
			case "skill" : battleMenu.skillSubMenu(battleMenu, attackType); break;
			case "potion" : battleMenu.potionSubMenu(battleMenu, attackType); break;
			case "run" : battleMenu.runSubMenu(battleMenu, attackType); break;
			default : System.out.println("메뉴 선택 오류"); break;
		}
		
		battleMenu.repaint();
		battleMenu.revalidate();


	}
}

class SelectSubMenu implements ActionListener {

	private BattleController bc;
	private String attackType;
	private String subMenuName;

	SelectSubMenu(BattleController bc, String attackType, String subMenuName) {
		this.bc = bc;
		this.attackType = attackType;
		this.subMenuName = subMenuName;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 동작!");
//		bc.selectSubMenu(attackType, subMenuName);
	}
}

// 메뉴 이미지 추가
class AttackMenu extends JButton {

	Image attackMenuIcon = new ImageIcon("images/battle/battle_attack_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(attackMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}

class SkillMenu extends JButton {

	Image skillMenuIcon = new ImageIcon("images/battle/battle_skill_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(skillMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}

class PotionMenu extends JButton {

	Image potionMenuIcon = new ImageIcon("images/battle/battle_potion_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(potionMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}

class RunMenu extends JButton {

	Image runMenuIcon = new ImageIcon("images/battle/battle_run_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(runMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}