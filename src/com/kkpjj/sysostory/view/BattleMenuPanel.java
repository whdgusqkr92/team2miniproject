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

import com.kkpjj.sysostory.controller.BattleController;

// 전투메뉴 배경 추가, 레이아웃 설정, 전투 세부메뉴(버튼) 추가

public class BattleMenuPanel extends JPanel {

	private String attackType;

	public BattleMenuPanel() {
		this.setBounds(290, 80, 220, 240);
		this.setLayout(null);
		this.setOpaque(false);

		// 전투 메뉴 추가
		JPanel battleMenu = new BattleMenu();
		battleMenu.setBounds(24, 20, 196, 31);
		battleMenu.setLayout(null);
		battleMenu.setOpaque(false);

		JButton attackMenu = new AttackMenu();
		attackMenu.setBounds(0, 0, 31, 31);
		JButton skillMenu = new SkillMenu();
		skillMenu.setBounds(47, 0, 31, 31);
		JButton potionMenu = new PotionMenu();
		potionMenu.setBounds(94, 0, 31, 31);
		JButton runMenu = new RunMenu();
		runMenu.setBounds(141, 0, 31, 31);

		battleMenu.add(attackMenu);
		battleMenu.add(skillMenu);
		battleMenu.add(potionMenu);
		battleMenu.add(runMenu);

		this.add(battleMenu);

		// 메뉴 선택 시 화면 전환
		attackMenu.addActionListener(new SelectMenu(this, "normal"));
		skillMenu.addActionListener(new SelectMenu(this, "skill"));
		potionMenu.addActionListener(new SelectMenu(this, "potion"));
		runMenu.addActionListener(new SelectMenu(this, "run"));

	}

	// 전투메뉴 배경 추가
	Image battleMenuBg = new ImageIcon("images/battle_menu.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(battleMenuBg, 0, 0, getWidth(), getHeight(), this);
	}
}

class SelectMenu implements ActionListener {
	
	BattleMenuPanel battleMenuPanel;
	String attackType;

	SelectMenu(BattleMenuPanel battleMenuPanel, String attackType) {
		this.battleMenuPanel = battleMenuPanel;
		this.attackType = attackType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BattleSubMenu subMenu = new BattleSubMenu(battleMenuPanel, attackType);
		subMenu.selectSubMenu(attackType);
	}
}

class BattleMenu extends JPanel {

	Image battleMenuBg = new ImageIcon("images/battle_menu.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(battleMenuBg, 0, 0, getWidth(), getHeight(), this);
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