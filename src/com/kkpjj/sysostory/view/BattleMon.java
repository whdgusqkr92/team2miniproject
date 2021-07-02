package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.kkpjj.sysostory.controller.BattleController;

// 몬스터 레이아웃 설정, 위치 설정
public class BattleMon extends JPanel {

	private String monImgAddress1;
	private String monImgAddress2;
	private JPanel firstMon;
	private JPanel secondMon;
	private JPanel thirdMon;
	private JPanel fourthMon;
	protected JButton selectFirstMon;
	protected JButton selectSecondMon;
	protected JButton selectThirdMon;
	protected JButton selectFourthMon;

	public BattleMon() {
		
		init();
		
		// 전투에 등장할 몬스터 선택
		Map<String, String> monList = new HashMap<>();
		monList.put("빨간슬라임", "images/mon_red_slime.png");
		monList.put("노란슬라임", "images/mon_yellow_slime.png");
		// 몬스터 정보 호출
		this.monImgAddress1 = monList.get("빨간슬라임");
		this.monImgAddress2 = monList.get("노란슬라임");
		
		createMonster();
	}

	private void init() {
		this.setBounds(550, 60, 200, 300);
		this.setLayout(null);
		this.setOpaque(false);
	}
	
	private void createMonster() {
		// 몬스터 생성
		this.firstMon = new Monster(monImgAddress1);
		firstMon.setBounds(0, 0, 64, 28);
		this.secondMon = new Monster(monImgAddress2);
		secondMon.setBounds(25, 84, 64, 28);
		this.thirdMon = new Monster(monImgAddress1);
		thirdMon.setBounds(25, 168, 64, 28);
		this.fourthMon = new Monster(monImgAddress2);
		fourthMon.setBounds(0, 252, 64, 28);
		// 몬스터 선택 버튼 생성
		this.selectFirstMon = new JButton();
		selectFirstMon.setBounds(firstMon.getBounds());
		selectFirstMon.setBorderPainted(false);
		selectFirstMon.setContentAreaFilled(false);
		this.selectSecondMon = new JButton();
		selectSecondMon.setBounds(secondMon.getBounds());
		selectSecondMon.setBorderPainted(false);
		selectSecondMon.setContentAreaFilled(false);
		this.selectThirdMon = new JButton();
		selectThirdMon.setBounds(thirdMon.getBounds());
		selectThirdMon.setBorderPainted(false);
		selectThirdMon.setContentAreaFilled(false);
		this.selectFourthMon = new JButton();
		selectFourthMon.setBounds(fourthMon.getBounds());
		selectFourthMon.setBorderPainted(false);
		selectFourthMon.setContentAreaFilled(false);
		
		addMonster();
	}

	private void addMonster() {
		this.add(firstMon);
		this.add(secondMon);
		this.add(thirdMon);
		this.add(fourthMon);
		
		this.add(selectFirstMon);
		this.add(selectSecondMon);
		this.add(selectThirdMon);
		this.add(selectFourthMon);
	}
}

// 몬스터 이미지 추가
class Monster extends JPanel {
	Image mon;
	
	public Monster(String monImgAddress) {
		this.mon = new ImageIcon(monImgAddress).getImage();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

// 공격 몬스터 표시 및 선택
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
//		BattleController bc = new BattleController();
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
