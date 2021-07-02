package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BattleController;

public class BattleSubMenu extends JPanel {

	private JPanel subMenuPanel;
	protected JPanel monPanel;
	protected JButton button1;
	protected JButton button2;
	protected JButton button3;
	protected JButton button4;
	private Font font;
	private String subMenu1;
	private String subMenu2;
	private String subMenu3;
	private String subMenu4;

	public BattleSubMenu() {
		this.subMenuPanel = new JPanel();
		subMenuPanel.setBounds(24, 60, 170, 155);
		subMenuPanel.setLayout(null);
		subMenuPanel.setOpaque(false);
		this.font = new Font("둥근모꼴", Font.PLAIN, 16);

		// 전투 세부메뉴 설정
		this.button1 = new JButton();
		button1.setBounds(0, 0, 170, 35);
		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.BLACK);
		button1.setFont(font);

		this.button2 = new JButton();
		button2.setBounds(0, 40, 170, 35);
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.BLACK);
		button2.setFont(font);

		this.button3 = new JButton();
		button3.setBounds(0, 80, 170, 35);
		button3.setForeground(Color.WHITE);
		button3.setBackground(Color.BLACK);
		button3.setFont(font);

		this.button4 = new JButton();
		button4.setBounds(0, 120, 170, 35);
		button4.setForeground(Color.WHITE);
		button4.setBackground(Color.BLACK);
		button4.setFont(font);

	}

	public JPanel selectSubMenu(String attackType) {
		switch(attackType) {
			case "normal" : attackSubMenu(); break;
			case "skill" : skillSubMenu(); break;
			case "potion" : potionSubMenu(); break;
			case "run" : runSubMenu(); break;
			default : System.out.println("알 수 없는 오류가 발생했습니다.");
		}
		return null;
	}

	public void attackSubMenu() {

		this.subMenu1 = "기본 공격1";
		this.subMenu2 = "기본 공격2";
		this.subMenu3 = "기본 공격3";
		this.subMenu4 = "기본 공격4";
		
		subMenuPanel.add(button1);
//		subMenuPanel.add(button2);
//		subMenuPanel.add(button3);
//		subMenuPanel.add(button4);

		this.button1.setText(subMenu1);
		this.button2.setText(subMenu2);
		this.button3.setText(subMenu3);
		this.button4.setText(subMenu4);

		button1.addActionListener(new attackAction(subMenu1));
		button2.addActionListener(new attackAction(subMenu2));
		button3.addActionListener(new attackAction(subMenu3));
		button4.addActionListener(new attackAction(subMenu4));
	}

	public void skillSubMenu() {

		this.subMenu1 = "스킬 공격1";
		this.subMenu2 = "스킬 공격2";
		this.subMenu3 = "스킬 공격3";
		this.subMenu4 = "스킬 공격4";
		
		subMenuPanel.add(button1);
		subMenuPanel.add(button2);
		subMenuPanel.add(button3);
		subMenuPanel.add(button4);

		this.button1.setText(subMenu1);
		this.button2.setText(subMenu2);
		this.button3.setText(subMenu3);
		this.button4.setText(subMenu4);

		button1.addActionListener(new attackAction(subMenu1));
		button2.addActionListener(new attackAction(subMenu2));
		button3.addActionListener(new attackAction(subMenu3));
		button4.addActionListener(new attackAction(subMenu4));

	}

	public void potionSubMenu() {

		this.subMenu1 = "아이템사용";

		this.button1.setText(subMenu1);

		subMenuPanel.add(button1);

		button1.addActionListener(new attackAction(subMenu1));

	}

	public void runSubMenu() {

		this.subMenu1 = "도망가기";

		this.button1.setText(subMenu1);
		
		subMenuPanel.add(button1);

		button1.addActionListener(new attackAction(subMenu1));

	}
}

class attackAction implements ActionListener {

	private String attackName;

	attackAction(String attackName) {
		this.attackName = attackName;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(attackName);
	}	
}