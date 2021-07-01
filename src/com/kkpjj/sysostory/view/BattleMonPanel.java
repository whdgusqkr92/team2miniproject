package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.kkpjj.sysostory.controller.BattleController;

// 몬스터 레이아웃 설정, 위치 설정
public class BattleMonPanel extends JPanel {

	private JPanel firstMon;
	private JPanel secondMon;
	private JPanel thirdMon;
	private JPanel fourthMon;
	protected JButton selectFirstMon;
	protected JButton selectSecondMon;
	protected JButton selectThirdMon;
	protected JButton selectFourthMon;

	public BattleMonPanel() {
		this.setBounds(550, 60, 200, 300);
		this.setLayout(null);
		this.setOpaque(false);

		firstMon= new FirstMon();
		firstMon.setBounds(0, 0, 64, 28);
		secondMon = new SecondMon();
		secondMon.setBounds(25, 84, 64, 28);
		thirdMon = new ThirdMon();
		thirdMon.setBounds(25, 168, 64, 28);
		fourthMon = new FourthMon();
		fourthMon.setBounds(0, 252, 64, 28);

		selectFirstMon = new JButton();
		selectFirstMon.setBounds(firstMon.getBounds());
		selectSecondMon = new JButton();
		selectSecondMon.setBounds(secondMon.getBounds());
		selectThirdMon = new JButton();
		selectThirdMon.setBounds(thirdMon.getBounds());
		selectFourthMon = new JButton();
		selectFourthMon.setBounds(fourthMon.getBounds());

		this.add(firstMon);
		this.add(secondMon);
		this.add(thirdMon);
		this.add(fourthMon);
	}

//	public void attackAction(String attackType, String attackName) {
//		
//		selectFirstMon.addMouseListener(new MyMouseListener(attackType, attackName, selectFirstMon, 1));
//		selectSecondMon.addMouseListener(new MyMouseListener(attackType, attackName, selectSecondMon, 2));
//		selectThirdMon.addMouseListener(new MyMouseListener(attackType, attackName, selectThirdMon, 3));
//		selectFourthMon.addMouseListener(new MyMouseListener(attackType, attackName, selectFourthMon, 4));
//
//		this.add(selectFirstMon);
//		this.add(selectSecondMon);
//		this.add(selectThirdMon);
//		this.add(selectFourthMon);
//	}


//		public List<Rectangle> monPosition() {
	//		List<Rectangle> mon = new ArrayList<>();
	//		mon.add(firstMon.getBounds());
	//		mon.add(secondMon.getBounds());
	//		mon.add(thirdMon.getBounds());
	//		mon.add(fourthMon.getBounds());
	//
	//		return mon;
	//	}
}

// 몬스터 이미지 추가
class FirstMon extends JPanel {

	Image mon = new ImageIcon("images/mon_yellow_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class SecondMon extends JPanel {

	Image mon = new ImageIcon("images/mon_red_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class ThirdMon extends JPanel {

	Image mon = new ImageIcon("images/mon_yellow_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class FourthMon extends JPanel {

	Image mon = new ImageIcon("images/mon_red_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class MyMouseListener implements MouseListener {

	private String attackType;
	private String attackName;
	private JButton selectMon;
	private int selectMonNo;

	public MyMouseListener(String attackType, String attackName, JButton selectMon, int i) {
		this.attackType = attackType;
		this.attackName = attackName;		
		this.selectMon = selectMon;
		this.selectMonNo = i;
		this.selectMon.setBorderPainted(false);
		this.selectMon.setContentAreaFilled(false);
//		BattleController.characterAttack(selectMon, );
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		BattleController bc = new BattleController();
//		bc.characterAttack(attackType, attackName, selectMon);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		selectMon.setBorderPainted(true);
		selectMon.setBorder(new LineBorder(Color.RED, 3));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		selectMon.setBorderPainted(false);
	}
}
