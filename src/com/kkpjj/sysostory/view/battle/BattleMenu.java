package com.kkpjj.sysostory.view.battle;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BattleController;

// 전투메뉴 배경 추가, 레이아웃 설정, 전투 세부메뉴(버튼) 추가
public class BattleMenu extends JPanel {

	// 전투메뉴 배경 추가
	Image battleMenuBg = new ImageIcon("images/battle/battle_menu.png").getImage();
	private JPanel menuPanel;
	private ButtonGroup groupMenu;
	private JButton attackMenu;
	private JButton skillMenu;
	private JButton itemMenu;
	private JButton runMenu;
	private JPanel subMenuPanel;
	private ButtonGroup groupSubMenu;
	private JButton subMenu1;
	private JButton subMenu2;
	private JButton subMenu3;
	private JButton subMenu4;
	private Font font;
	private String attackType;
	private String[] subMenuName;

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(battleMenuBg, 0, 0, getWidth(), getHeight(), this);
	}

	public BattleMenu(BattleController bc) {
		initMenuPanel();
		createMenu();
		createSubMenu();
	}

	private void initMenuPanel() {
		this.font = new Font("둥근모꼴", Font.PLAIN, 16);
		this.setBounds(290, 80, 220, 240);
		this.setLayout(null);
		this.setOpaque(false);
	}

	public void createMenu() {
		// 전투메뉴 추가
		this.menuPanel = new JPanel();
		menuPanel.setBounds(30, 20, 170, 31);
		menuPanel.setLayout(null);
		menuPanel.setOpaque(false);

		this.groupMenu = new ButtonGroup();

		this.attackMenu = new AttackMenu();
		attackMenu.setBounds(0, 0, 31, 31);
		this.skillMenu = new SkillMenu();
		skillMenu.setBounds(43, 0, 31, 31);
		this.itemMenu = new ItemMenu();
		itemMenu.setBounds(86, 0, 31, 31);
		this.runMenu = new RunMenu();
		runMenu.setBounds(129, 0, 31, 31);

		groupMenu.add(attackMenu);
		groupMenu.add(skillMenu);
		groupMenu.add(itemMenu);
		groupMenu.add(runMenu);

		menuPanel.add(attackMenu);
		menuPanel.add(skillMenu);
		menuPanel.add(itemMenu);
		menuPanel.add(runMenu);

		this.add(menuPanel);
	}

	public void createSubMenu() {
		// 전투 세부메뉴 설정
		this.subMenuPanel = new JPanel();
		subMenuPanel.setBounds(25, 60, 170, 155);
		subMenuPanel.setLayout(null);
		subMenuPanel.setOpaque(false);
		subMenuPanel.setVisible(false);

		this.groupSubMenu = new ButtonGroup();

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

		groupSubMenu.add(subMenu1);
		groupSubMenu.add(subMenu2);
		groupSubMenu.add(subMenu3);
		groupSubMenu.add(subMenu4);

		subMenuPanel.add(subMenu1);
		subMenuPanel.add(subMenu2);
		subMenuPanel.add(subMenu3);
		subMenuPanel.add(subMenu4);

		this.add(subMenuPanel);
	}

	private void addActionMenu() {
		attackMenu.addActionListener(new SelectMenu(this, subMenuPanel, "attack"));
	}


	class SelectMenu implements ActionListener {
		private BattleMenu battleMenu;
		private JPanel subMenuPanel;
		private String attackType;

		public SelectMenu(BattleMenu battleMenu, JPanel subMenuPanel, String attackType) {
			this.battleMenu = battleMenu;
			this.subMenuPanel = subMenuPanel;
			this.attackType = attackType;
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			subMenuPanel.setVisible(true);
			
			switch(attackType) {
				case "attack" : attackSubMenu(battleMenu); break;
	//			case "skill" : skillSubMenu(battleMenu, attackType); break;
	//			case "item" : itemSubMenu(battleMenu, attackType); break;
	//			case "run" : runSubMenu(battleMenu, attackType); break;
				default : System.out.println("메뉴 선택 오류"); break;
			}

			battleMenu.repaint();
			battleMenu.revalidate();
		}
		
		private void attackSubMenu(BattleMenu battleMenu) {
			subMenuName = new String[] {"기본 공격1", "기본 공격2", "기본 공격3", "기본 공격4"};

			subMenu2.setVisible(true);
			subMenu3.setVisible(true);
			subMenu4.setVisible(true);

			subMenu1.setText(subMenuName[0]);
			subMenu2.setText(subMenuName[1]);
			subMenu3.setText(subMenuName[2]);
			subMenu4.setText(subMenuName[3]);
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

	class ItemMenu extends JButton {
		Image itemMenuIcon = new ImageIcon("images/battle/battle_item_icon.png").getImage();

		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(itemMenuIcon, 0, 0, getWidth(), getHeight(), this);
		}
	}

	class RunMenu extends JButton {
		Image runMenuIcon = new ImageIcon("images/battle/battle_run_icon.png").getImage();

		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(runMenuIcon, 0, 0, getWidth(), getHeight(), this);
		}
	}
}