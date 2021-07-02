package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

// 전투메뉴 배경 추가, 레이아웃 설정, 전투 세부메뉴(버튼) 추가

public class BattleMenu extends JPanel {

	private Font font;
	private JButton attackMenu;
	private JButton skillMenu;
	private JButton potionMenu;
	private JButton runMenu;
	private JButton subMenu1;
	private JButton subMenu2;
	private JButton subMenu3;
	private JButton subMenu4;
	private String[] subMenu;
	private String[] subMenuName;
	private String subMenuName1;
	private String subMenuName2;
	private String subMenuName3;
	private String subMenuName4;
	private String attackType;

	public BattleMenu() {
		initMenuPanel();
		createMenu();

		// 메뉴 선택 시 화면 전환
		attackMenu.addActionListener(new SelectAttackMenu());
		skillMenu.addActionListener(new SelectSkillMenu());
		potionMenu.addActionListener(new SelectPotionMenu());
		runMenu.addActionListener(new SelectRunMenu());
	}

	private void initMenuPanel() {
		this.font = new Font("둥근모꼴", Font.PLAIN, 16);
		this.setBounds(290, 80, 220, 240);
		this.setLayout(null);
		this.setOpaque(false);
	}

	private void createMenu() {
		// 전투 메뉴 추가
		this.attackMenu = new AttackMenu();
		attackMenu.setBounds(24, 20, 31, 31);
		this.skillMenu = new SkillMenu();
		skillMenu.setBounds(71, 20, 31, 31);
		this.potionMenu = new PotionMenu();
		potionMenu.setBounds(118, 20, 31, 31);
		this.runMenu = new RunMenu();
		runMenu.setBounds(165, 20, 31, 31);

		// 전투 세부메뉴 설정
		this.subMenu1 = new JButton();
		subMenu1.setBounds(24, 60, 170, 35);
		subMenu1.setForeground(Color.WHITE);
		subMenu1.setBackground(Color.BLACK);
		subMenu1.setFont(font);

		this.subMenu2 = new JButton();
		subMenu2.setBounds(24, 100, 170, 35);
		subMenu2.setForeground(Color.WHITE);
		subMenu2.setBackground(Color.BLACK);
		subMenu2.setFont(font);

		this.subMenu3 = new JButton();
		subMenu3.setBounds(24, 140, 170, 35);
		subMenu3.setForeground(Color.WHITE);
		subMenu3.setBackground(Color.BLACK);
		subMenu3.setFont(font);

		this.subMenu4 = new JButton();
		subMenu4.setBounds(24, 180, 170, 35);
		subMenu4.setForeground(Color.WHITE);
		subMenu4.setBackground(Color.BLACK);
		subMenu4.setFont(font);

		addMenu();
		attackSubMenu();
	}

	private void addMenu() {
		this.add(attackMenu);
		this.add(skillMenu);
		this.add(potionMenu);
		this.add(runMenu);

		this.add(subMenu1);
		this.add(subMenu2);
		this.add(subMenu3);
		this.add(subMenu4);

	}

	private void attackSubMenu() {
		this.attackType = "기본 공격";
		
		this.subMenu = new String[4];
		this.subMenuName = new String[] {"기본 공격1", "기본 공격2", "기본 공격3", "기본 공격4"};
		
		subMenuName1 = subMenuName[0];
		subMenuName2 = subMenuName[1];
		subMenuName3 = subMenuName[2];
		subMenuName4 = subMenuName[3];

		this.subMenu1.setText(subMenuName1);
		this.subMenu2.setText(subMenuName2);
		this.subMenu3.setText(subMenuName3);
		this.subMenu4.setText(subMenuName4);

//		subMenu1.addActionListener(new attackAction(subMenuName1));
//		subMenu2.addActionListener(new attackAction(subMenuName2));
//		subMenu3.addActionListener(new attackAction(subMenuName3));
//		subMenu4.addActionListener(new attackAction(subMenuName4));		
	}
	
	private void skillSubMenu() {
		this.attackType = "스킬 공격";
		
		this.subMenu = new String[4];
		this.subMenuName = new String[] {"스킬 공격1", "스킬 공격2", "스킬 공격3", "스킬 공격4"};
		
		subMenuName1 = subMenuName[0];
		subMenuName2 = subMenuName[1];
		subMenuName3 = subMenuName[2];
		subMenuName4 = subMenuName[3];

		this.subMenu1.setText(subMenuName1);
		this.subMenu2.setText(subMenuName2);
		this.subMenu3.setText(subMenuName3);
		this.subMenu4.setText(subMenuName4);

//		subMenu1.addActionListener(new skillAction(subMenuName1));
//		subMenu2.addActionListener(new skillAction(subMenuName2));
//		subMenu3.addActionListener(new attackAction(subMenuName3));
//		subMenu4.addActionListener(new attackAction(subMenuName4));		
	}
	
	private void potionSubMenu() {
		this.attackType = "기본 공격";
		
		this.subMenu = new String[4];
		this.subMenuName = new String[] {"기본 공격1", "기본 공격2", "기본 공격3", "기본 공격4"};
		
		subMenuName1 = subMenuName[0];
		subMenuName2 = subMenuName[1];
		subMenuName3 = subMenuName[2];
		subMenuName4 = subMenuName[3];

		this.subMenu1.setText(subMenuName1);
		this.subMenu2.setText(subMenuName2);
		this.subMenu3.setText(subMenuName3);
		this.subMenu4.setText(subMenuName4);

//		subMenu1.addActionListener(new attackAction(subMenuName1));
//		subMenu2.addActionListener(new attackAction(subMenuName2));
//		subMenu3.addActionListener(new attackAction(subMenuName3));
//		subMenu4.addActionListener(new attackAction(subMenuName4));		
	}
	
	private void runSubMenu() {
		this.attackType = "기본 공격";
		
		this.subMenu = new String[4];
		this.subMenuName = new String[] {"기본 공격1", "기본 공격2", "기본 공격3", "기본 공격4"};
		
		subMenuName1 = subMenuName[0];
		subMenuName2 = subMenuName[1];
		subMenuName3 = subMenuName[2];
		subMenuName4 = subMenuName[3];

		this.subMenu1.setText(subMenuName1);
		this.subMenu2.setText(subMenuName2);
		this.subMenu3.setText(subMenuName3);
		this.subMenu4.setText(subMenuName4);

//		subMenu1.addActionListener(new attackAction(subMenuName1));
//		subMenu2.addActionListener(new attackAction(subMenuName2));
//		subMenu3.addActionListener(new attackAction(subMenuName3));
//		subMenu4.addActionListener(new attackAction(subMenuName4));		
	}
	
	// 전투메뉴 배경 추가
	Image battleMenuBg = new ImageIcon("images/battle_menu.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(battleMenuBg, 0, 0, getWidth(), getHeight(), this);
	}
}

class SelectAttackMenu implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String selectMenu = "normal";
		System.out.println(selectMenu);
		//		BattleSubMenu battleSubMenu = new BattleSubMenu();
		//		battleSubMenu.selectSubMenu(selectMenu);
	}
}

class SelectSkillMenu implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String selectMenu = "skill";
		System.out.println(selectMenu);
		//		new BattleSubMenu(selectMenu);
	}
}

class SelectPotionMenu implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String selectMenu = "potion";
		System.out.println(selectMenu);
		//		BattleSubMenu new BattleSubMenu();
		//		selectSubMenu(selectMenu);
	}
}

class SelectRunMenu implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String selectMenu = "run";
		System.out.println(selectMenu);
	}
}

// 메뉴 이미지 추가
class AttackMenu extends JButton {

	Image attackMenuIcon = new ImageIcon("images/battle_attack_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(attackMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}

class SkillMenu extends JButton {

	Image skillMenuIcon = new ImageIcon("images/battle_skill_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(skillMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}

class PotionMenu extends JButton {

	Image potionMenuIcon = new ImageIcon("images/battle_potion_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(potionMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}

class RunMenu extends JButton {

	Image runMenuIcon = new ImageIcon("images/battle_run_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(runMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}