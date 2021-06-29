package com.kkpjj.sysostory.view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

class SubMenu extends JPanel {
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;

	public SubMenu() {
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(24, 60, 170, 155);

		button1 = new JButton();
		button1.setBounds(0, 0, 170, 35);
		button1.setBackground(Color.BLACK);
		button1.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
		button2 = new JButton();
		button2.setBounds(0, 40, 170, 35);
		button2.setBackground(Color.BLACK);
		button2.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
		button3 = new JButton();
		button3.setBounds(0, 80, 170, 35);
		button3.setBackground(Color.BLACK);
		button3.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
		button4 = new JButton();
		button4.setBounds(0, 120, 170, 35);
		button4.setBackground(Color.BLACK);
		button4.setFont(new Font("둥근모꼴", Font.PLAIN, 16));

		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
	}
}

class AttackButton extends SubMenu {
	public AttackButton() {
		button1.setText("기본 공격");
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
	}
}
class SkillButton extends SubMenu {
	public SkillButton() {
		button1.setText("스킬 공격1");
		button2.setText("스킬 공격2");
		button3.setText("스킬 공격3");
		button4.setText("스킬 공격4");
	}
}
class PotionButton extends SubMenu {
	public PotionButton() {
		button1.setText("HP 물약");
		button2.setText("MP 물약");
		button3.setVisible(false);
		button4.setVisible(false);
	}
}
class RunButton extends SubMenu {
	public RunButton() {
		button1.setText("기본 공격");
		button2.setVisible(false);
		button3.setVisible(false);
		button4.setVisible(false);
	}
}