package com.kkpjj.sysostory.view.battle;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BattleController;

public class BattleSubMenu extends JPanel {

	protected JPanel monPanel;
	protected JButton subMenu1;
	protected JButton subMenu2;
	protected JButton subMenu3;
	protected JButton subMenu4;
	private Font font;
	private String subMenuName1;
	private String subMenuName2;
	private String subMenuName3;
	private String subMenuName4;
	
	public BattleSubMenu() {
//		ViewUtil.changePanel(battleMenu, this, new BattleSubMenu(battleMenu));

		init();
		createSubMenu();
	}

	private void init() {
		this.setBounds(24, 60, 170, 155);
		this.setLayout(null);
		this.setOpaque(false);
		this.setVisible(false);
		this.font = new Font("둥근모꼴", Font.PLAIN, 16);
	}

	private void createSubMenu() {
		// 전투 세부메뉴 설정
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
		
		addSubMenu();
	}
	
	private void addSubMenu() {
		this.add(subMenu1);
		this.add(subMenu2);
		this.add(subMenu3);
		this.add(subMenu4);
	}

	public void selectSubMenu(String attackType) {
		switch(attackType) {
			case "normal" : attackSubMenu(); break;
			case "skill" : skillSubMenu(); break;
			case "potion" : potionSubMenu(); break;
			case "run" : runSubMenu(); break;
			default : System.out.println("알 수 없는 오류가 발생했습니다.");
		}
	}

	public void attackSubMenu() {
		this.setVisible(true);
		
		this.subMenuName1 = "기본 공격1";
		this.subMenuName2 = "기본 공격2";
		this.subMenuName3 = "기본 공격3";
		this.subMenuName4 = "기본 공격4";

		this.subMenu1.setText(subMenuName1);
		this.subMenu2.setText(subMenuName2);
		this.subMenu3.setText(subMenuName3);
		this.subMenu4.setText(subMenuName4);

//		subMenu1.addActionListener(new attackAction(subMenuName1));
//		subMenu2.addActionListener(new attackAction(subMenuName2));
//		subMenu3.addActionListener(new attackAction(subMenuName3));
//		subMenu4.addActionListener(new attackAction(subMenuName4));
	}

	public void skillSubMenu() {
		this.setVisible(true);

		this.subMenuName1 = "스킬 공격1";
		this.subMenuName2 = "스킬 공격2";
		this.subMenuName3 = "스킬 공격3";
		this.subMenuName4 = "스킬 공격4";

		this.add(subMenu1);
		this.add(subMenu2);
		this.add(subMenu3);
		this.add(subMenu4);

		this.subMenu1.setText(subMenuName1);
		this.subMenu2.setText(subMenuName2);
		this.subMenu3.setText(subMenuName3);
		this.subMenu4.setText(subMenuName4);

//		subMenu1.addActionListener(new attackAction(subMenuName1));
//		subMenu2.addActionListener(new attackAction(subMenuName2));
//		subMenu3.addActionListener(new attackAction(subMenuName3));
//		subMenu4.addActionListener(new attackAction(subMenuName4));
	}

	public void potionSubMenu() {
		this.setVisible(true);

		this.subMenuName1 = "아이템사용";

		this.subMenu1.setText(subMenuName1);

		this.add(subMenu1);

//		subMenu1.addActionListener(new attackAction(subMenuName1));
	}

	public void runSubMenu() {
		this.setVisible(true);

		this.subMenuName1 = "도망가기";

		this.subMenu1.setText(subMenuName1);

		this.add(subMenu1);

		subMenu1.addActionListener(new attackAction());
	}
}

class attackAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

//		System.out.println(attackName);
	}
}