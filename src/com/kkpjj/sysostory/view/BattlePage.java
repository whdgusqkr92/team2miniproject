package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BattlePage extends JFrame {

	private JFrame mf;
	private JPanel mainPanel;
	private JPanel monPanel;
	private JPanel chrPanel;
	private JPanel battleMenuPanel;
	//	private JPanel statusPanel;
	//	private JPanel mapPanel;

	public BattlePage() {

		mf = new JFrame();

		mf.setBounds(300, 75, 800, 600);
		mf.setLayout(null);

		mainPanel = new MainPanel();
		mainPanel.setBounds(0, 0, 800, 420);
		mainPanel.setLayout(null);

		chrPanel = new ChrPanel();
		chrPanel.setBounds(150, 178, 64, 64);
		monPanel = new MonPanel();
		monPanel.setBounds(525, 60, 200, 300);
		battleMenuPanel = new BattleMenuPanel();
		battleMenuPanel.setBounds(290, 80, 220, 240);


		mainPanel.add(chrPanel);
		mainPanel.add(monPanel);
		mainPanel.add(battleMenuPanel);

		mf.add(mainPanel);

		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

class MainPanel extends JPanel {

	Image bg = new ImageIcon("images/battle_bg.png").getImage().getScaledInstance(800, 420, 0);

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
	}
}

class ChrPanel extends JPanel {

	Image chr = new ImageIcon("images/battle_chr.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(chr, 0, 0, getWidth(), getHeight(), this);
	}
}

class MonPanel extends JPanel {

	public MonPanel() {

		this.setLayout(null);
		this.setOpaque(false);

		JPanel firstMonPanel = new FirstMonPanel();
		firstMonPanel.setBounds(0, 0, 64, 28);
		JPanel secondMonPanel = new SecondMonPanel();
		secondMonPanel.setBounds(25, 84, 64, 28);
		JPanel thirdMonPanel = new ThirdMonPanel();
		thirdMonPanel.setBounds(25, 168, 64, 28);
		JPanel fourthMonPanel = new FourthMonPanel();
		fourthMonPanel.setBounds(0, 252, 64, 28);

		this.add(firstMonPanel);
		this.add(secondMonPanel);
		this.add(thirdMonPanel);
		this.add(fourthMonPanel);
	}
}

class FirstMonPanel extends JPanel {

	Image firstMon = new ImageIcon("images/mon_yellow_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(firstMon, 0, 0, getWidth(), getHeight(), this);
	}
}

class SecondMonPanel extends JPanel {

	Image secondMon = new ImageIcon("images/mon_red_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(secondMon, 0, 0, getWidth(), getHeight(), this);
	}
}

class ThirdMonPanel extends JPanel {

	Image thirdMon = new ImageIcon("images/mon_yellow_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(thirdMon, 0, 0, getWidth(), getHeight(), this);
	}
}

class FourthMonPanel extends JPanel {

	Image fourthMon = new ImageIcon("images/mon_red_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(fourthMon, 0, 0, getWidth(), getHeight(), this);
	}
}

class BattleMenuPanel extends JPanel {

	Image battleMenuBg = new ImageIcon("images/battle_menu.png").getImage();

	public BattleMenuPanel() {

		this.setLayout(null);
		this.setOpaque(false);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("행동 선택 : ");
//		String msg = sc.nextLine();
		
		JButton attackMenu = new AttackMenu();
		attackMenu.setBounds(24, 20, 31, 31);
		JButton skillMenu = new SkillMenu();
		skillMenu.setBounds(71, 20, 31, 31);
		JButton potionMenu = new PotionMenu();
		potionMenu.setBounds(118, 20, 31, 31);
		JButton runMenu = new RunMenu();
		runMenu.setBounds(165, 20, 31, 31);
		JPanel subMenu = new SubMenu();
		subMenu.setBounds(24, 60, 180, 200);
		
//		switch(msg) {
//		case "attack" 
//		}

		this.add(attackMenu);
		this.add(skillMenu);
		this.add(potionMenu);
		this.add(runMenu);
		this.add(subMenu);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(battleMenuBg, 0, 0, getWidth(), getHeight(), this);
	}
}

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

class SubMenu extends JPanel {

	public SubMenu() {
		this.setLayout(null);
		this.setOpaque(false);
		
		JButton button1 = new JButton();
		button1.setBounds(0, 0, 170, 35);
		button1.setBackground(Color.BLACK);
		JButton button2 = new JButton();
		button2.setBounds(0, 40, 170, 35);
		button2.setBackground(Color.BLACK);
		JButton button3 = new JButton();
		button3.setBounds(0, 80, 170, 35);
		button3.setBackground(Color.BLACK);
		JButton button4 = new JButton();
		button4.setBounds(0, 120, 170, 35);
		button4.setBackground(Color.BLACK);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		
	}
}

class AttackSubMenu extends SubMenu {
	
}

class SkillSubMenu extends SubMenu {
	
}

class PotionSubMenu extends SubMenu {

}

class RunSubMenu extends SubMenu {

}
