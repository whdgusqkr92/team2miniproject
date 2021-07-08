package com.kkpjj.sysostory.view.battle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.kkpjj.sysostory.controller.BattleController;
import com.kkpjj.sysostory.model.dto.MonsterDTO;

// 전투 메인화면 레이아웃 설정, 캐릭터, 몬스터 생성, 배경 추가
public class BattleMon extends JPanel {

	private BattleController bc;
	private String monImgAddress1;
	private String monImgAddress2;
	private String monImgAddress3;             //
	private Monster firstMon;
	private Monster secondMon;
	private Monster thirdMon;
	private Monster fourthMon;
	private JButton selectFirstMon;
	private JButton selectSecondMon;
	private JButton selectThirdMon;
	private JButton selectFourthMon;
	private JPanel battlePage;

	public BattleMon(JPanel battlePage, BattleController bc, MonsterDTO monsterDTO) {
		this.battlePage = battlePage;
		this.bc = bc;
		// 몬스터 레이아웃 설정
		initMonPanel();
		// 전투에 등장할 몬스터 선택
		appearMonInfo();
		// 몬스터 레이아웃 및 위치 설정 후 패널에 추가
		createMon();
	}

	private void initMonPanel() {
		this.setBounds(550, 60, 200, 300);
		this.setLayout(null);
		this.setOpaque(false);
	}

	private void appearMonInfo() {
		// 등장몬스터 정보 호출 (from MonDTO? / monCode)
		Map<String, String> monList = new HashMap<>();
		monList.put("빨간슬라임", "images/monster/mon_red_slime.png");
		monList.put("노란슬라임", "images/monster/mon_yellow_slime.png");
		monList.put("야스오네", "images/text/BossFace_M.png");

		this.monImgAddress1 = monList.get("빨간슬라임");
		this.monImgAddress2 = monList.get("노란슬라임");
		this.monImgAddress3 = monList.get("야스오네");
	}

	private void createMon() {
		// 몬스터 생성
		this.firstMon = new Monster(monImgAddress1);
		firstMon.setBounds(0, 126, 64, 28);
		firstMon.setBorderPainted(false);
//		this.secondMon = new Monster(monImgAddress2);
//		secondMon.setBounds(25, 84, 64, 28);
//		secondMon.setBorderPainted(false);
//		this.thirdMon = new Monster(monImgAddress1);
//		thirdMon.setBounds(25, 168, 64, 28);
//		thirdMon.setBorderPainted(false);
//		this.fourthMon = new Monster(monImgAddress2);
//		fourthMon.setBounds(0, 252, 64, 28);
//		fourthMon.setBorderPainted(false);

		// 몬스터 선택 버튼 생성
		this.selectFirstMon = new JButton();
		selectFirstMon.setBounds(firstMon.getBounds());
		selectFirstMon.setBorderPainted(false);
		selectFirstMon.setContentAreaFilled(false);
//
//		this.selectSecondMon = new JButton();
//		selectSecondMon.setBounds(secondMon.getBounds());
//		selectSecondMon.setBorderPainted(false);
//		selectSecondMon.setContentAreaFilled(false);
//
//		this.selectThirdMon = new JButton();
//		selectThirdMon.setBounds(thirdMon.getBounds());
//		selectThirdMon.setBorderPainted(false);
//		selectThirdMon.setContentAreaFilled(false);
//
//		this.selectFourthMon = new JButton();
//		selectFourthMon.setBounds(fourthMon.getBounds());
//		selectFourthMon.setBorderPainted(false);
//		selectFourthMon.setContentAreaFilled(false);

		this.add(selectFirstMon);
//		this.add(selectSecondMon);
//		this.add(selectThirdMon);
//		this.add(selectFourthMon);

		this.add(firstMon);
//		this.add(secondMon);
//		this.add(thirdMon);
//		this.add(fourthMon);
	}

	public void selectMon() {
		selectFirstMon.addMouseListener(new MyMouseListener(selectFirstMon, 1, 99));
//		selectSecondMon.addMouseListener(new MyMouseListener(selectSecondMon, 2, 2));
//		selectThirdMon.addMouseListener(new MyMouseListener(selectThirdMon, 3, 1));
//		selectFourthMon.addMouseListener(new MyMouseListener(selectFourthMon, 4, 2));
	}

	// 공격 몬스터 표시 및 선택
	class MyMouseListener extends MouseAdapter {

		private JButton selectMon;
		private int selectMonNo;
		private int selectMonCode;

		public MyMouseListener(JButton selectMon, int selectMonPlace, int selectMonCode) {
			this.selectMon = selectMon;
			this.selectMonNo = selectMonPlace;
			this.selectMonCode = selectMonCode;
			
			selectFirstMon.setVisible(true);
//			selectSecondMon.setVisible(true);
//			selectThirdMon.setVisible(true);
//			selectFourthMon.setVisible(true);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			selectFirstMon.setVisible(false);
//			selectSecondMon.setVisible(false);
//			selectThirdMon.setVisible(false);
//			selectFourthMon.setVisible(false);

			bc.characterAttack(selectMonNo, selectMonCode);
			battlePage.repaint();
			battlePage.revalidate();
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			selectMon.setBorderPainted(true);
			selectMon.setBorder(new LineBorder(Color.RED, 3));
			battlePage.repaint();
			battlePage.revalidate();
		}

		@Override
		public void mouseExited(MouseEvent e) {
			selectMon.setBorderPainted(false);
		}
	}

	// 몬스터 이미지 추가
	class Monster extends JButton {
		Image mon;

		public Monster(String monImgAddress) {
			this.mon = new ImageIcon(monImgAddress).getImage();
		}

		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);

		}
	}
}