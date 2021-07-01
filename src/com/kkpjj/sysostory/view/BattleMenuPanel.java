package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BattleController;

// 전투메뉴 배경 추가, 레이아웃 설정, 전투 세부메뉴(버튼) 추가

public class BattleMenuPanel extends JPanel {

	private JButton attackMenu;
	private JButton skillMenu;
	private JButton potionMenu;
	private JButton runMenu;
	private String selectMenu;

	public BattleMenuPanel() {
		this.setBounds(290, 80, 220, 240);
		this.setLayout(null);
		this.setOpaque(false);

		// 전투 메뉴 추가
		JPanel battleMenu = new JPanel();
		battleMenu.setBounds(24, 20, 172, 31);
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
		attackMenu.addActionListener(new SelectAttackMenu());
		skillMenu.addActionListener(new SelectSkillMenu());
		potionMenu.addActionListener(new SelectPotionMenu());
		runMenu.addActionListener(new SelectRunMenu());
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
	}
}

class SelectSkillMenu implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String selectMenu = "skill";
	}
}

class SelectPotionMenu implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String selectMenu = "potion";
	}
}

class SelectRunMenu implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String selectMenu = "run";
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