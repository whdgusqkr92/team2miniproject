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
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BattleController;

// 전투메뉴 배경 추가, 레이아웃 설정, 전투 세부메뉴(버튼) 추가
public class BattleMenu extends JPanel {

	// 전투메뉴 배경 추가
	Image battleMenuBg = new ImageIcon("images/battle/battle_menu.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(battleMenuBg, 0, 0, getWidth(), getHeight(), this);
	}

	private BattleController bc;
	private JPanel menuPanel;
	private JButton attackMenu;
	private JButton skillMenu;
	private JButton itemMenu;
	private JButton runMenu;
	private JPanel subMenuPanel;
	private JButton subMenu1;
	private JButton subMenu2;
	private JButton subMenu3;
	private JButton subMenu4;
	private Font font;
	private String[] subMenuName;
	private String selectSubMenuName;
	private String attackType;
	public int selectSubMenuNo;
	private String selectMenuName;

	public BattleMenu(BattleController bc) {
		this.bc = bc;
		this.attackType = "attack";
		this.subMenuName = new String[] {"기본 공격1", "기본 공격2", "기본 공격3", "기본 공격4"};
		this.selectSubMenuName = "기본 공격1";
		
		initMenuPanel();
		createMenu();
		createSubMenu();
		addActionMenu();
	}

	private void initMenuPanel() {
		this.font = new Font("둥근모꼴", Font.PLAIN, 16);
		this.setBounds(290, 80, 220, 240);
		this.setLayout(null);
		this.setOpaque(false);
	}

	private void createMenu() {
		// 전투메뉴 추가
		this.menuPanel = new JPanel();
		menuPanel.setBounds(30, 20, 170, 31);
		menuPanel.setLayout(null);
		menuPanel.setOpaque(false);

		this.attackMenu = new JButton(new ImageIcon("images/battle/battle_attack_icon.png"));
		attackMenu.setBounds(0, 0, 31, 31);
		this.skillMenu = new JButton(new ImageIcon("images/battle/battle_skill_icon.png"));
		skillMenu.setBounds(43, 0, 31, 31);
		this.itemMenu = new JButton(new ImageIcon("images/battle/battle_item_icon.png"));
		itemMenu.setBounds(86, 0, 31, 31);
		this.runMenu = new JButton(new ImageIcon("images/battle/battle_run_icon.png"));
		runMenu.setBounds(129, 0, 31, 31);

		menuPanel.add(attackMenu);
		menuPanel.add(skillMenu);
		menuPanel.add(itemMenu);
		menuPanel.add(runMenu);

		this.add(menuPanel);
	}

	private void createSubMenu() {
		// 전투 세부메뉴 설정
		this.subMenuPanel = new JPanel();
		subMenuPanel.setBounds(25, 60, 170, 155);
		subMenuPanel.setLayout(null);
		subMenuPanel.setOpaque(false);
		subMenuPanel.setVisible(false);

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

		subMenuPanel.add(subMenu1);
		subMenuPanel.add(subMenu2);
		subMenuPanel.add(subMenu3);
		subMenuPanel.add(subMenu4);

		this.add(subMenuPanel);
	}

	private void addActionMenu() {
		attackMenu.addActionListener(new SelectMenu("attack"));
		skillMenu.addActionListener(new SelectMenu("skill"));
		itemMenu.addActionListener(new SelectMenu("item"));
		runMenu.addActionListener(new SelectMenu("run"));

		addActionSubMenu();
	}

	private void addActionSubMenu() {
		subMenu1.addActionListener(new SelectSubMenu(0));
		subMenu2.addActionListener(new SelectSubMenu(1));
		subMenu3.addActionListener(new SelectSubMenu(2));
		subMenu4.addActionListener(new SelectSubMenu(3));
	}

	class SelectMenu implements ActionListener {
		
		private String attackType;
		
		private SelectMenu(String attackType) {
			this.attackType = attackType;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			subMenuPanel.setVisible(true);
			BattleMenu.this.attackType = attackType;
			
			switch(attackType) {
				case "attack" : attackSubMenu(); break;
				case "skill" : skillSubMenu(); break;
				case "item" : itemSubMenu(); break;
				case "run" : runSubMenu(); break;
				default : System.out.println("메뉴 선택 Error"); break;
			}
		}

		private void attackSubMenu() {
			subMenuName = new String[] {"기본 공격1", "기본 공격2", "기본 공격3", "기본 공격4"};

			subMenu2.setVisible(true);
			subMenu3.setVisible(true);
			subMenu4.setVisible(true);

			subMenu1.setText(subMenuName[0]);
			subMenu2.setText(subMenuName[1]);
			subMenu3.setText(subMenuName[2]);
			subMenu4.setText(subMenuName[3]);
		}

		private void skillSubMenu() {
			subMenuName = new String[] {"스킬 공격1", "스킬 공격2", "스킬 공격3", "스킬 공격4"};

			subMenu2.setVisible(true);
			subMenu3.setVisible(true);
			subMenu4.setVisible(true);

			subMenu1.setText(subMenuName[0]);
			subMenu2.setText(subMenuName[1]);
			subMenu3.setText(subMenuName[2]);
			subMenu4.setText(subMenuName[3]);
		}

		private void itemSubMenu() {
			subMenuName = new String[] {"아이템 사용"};

			subMenu2.setVisible(false);
			subMenu3.setVisible(false);
			subMenu4.setVisible(false);

			subMenu1.setText(subMenuName[0]);
		}

		private void runSubMenu() {
			subMenuName = new String[] {"도망가기"};

			subMenu2.setVisible(false);
			subMenu3.setVisible(false);
			subMenu4.setVisible(false);

			subMenu1.setText(subMenuName[0]);
		}
	}

	class SelectSubMenu implements ActionListener {
		
		private int selectSubMenuNo;

		SelectSubMenu(int selectSubMenuNo) {
			this.selectSubMenuNo = selectSubMenuNo;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			selectSubMenuName = subMenuName[selectSubMenuNo];
			bc.selectAction(attackType, selectSubMenuName);
			
			setVisible(false);
		}
	}
}
