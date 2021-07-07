package com.kkpjj.sysostory.view.character;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.CharacterController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;

public class StatusPanel extends JPanel {
	
	private JFrame mf;
	
	private CharacterDTO chrDTO;
	private CharacterController cc;
	
	private JPanel statusPanel;
	private JPanel mapPanel;
	
	public StatusPanel(JFrame mf, CharacterDTO chrDTO) {
		
		this.mf = mf;
		this.chrDTO = chrDTO;
		
		cc = new CharacterController();
		
		/* ------------------ 캐릭터 정보 DB에서 가져오기 ------------------ */
//		chrDTO = new CharacterDTO();
		
		
//		chrDTO.setChrCode(chrCode);
//		chrDTO.setUserNo(userNo);

		chrDTO = cc.selectCharacterInfo(chrDTO.getUserNo(), chrDTO.getChrCode());
		
		// 하단 상태 패널
		statusPanel = new JPanel();
		statusPanel.setBounds(0, 380, 560, 180);
		mf.getContentPane().add(statusPanel);
		statusPanel.setLayout(null);
		
		// 하단 맵 정보 패널
		mapPanel = new JPanel();
		mapPanel.setBounds(543, 380, 240, 180);
		mf.getContentPane().add(mapPanel);
		mapPanel.setLayout(null);
		
		
		/* ----------------- 캐릭터 정보 하단에 출력 ----------------------- */
		
		// 이름 라벨 생성
		JLabel nickname1 = new JLabel();
		nickname1.setBounds(40, 25, 200, 50);
		nickname1.setFont(new Font("둥근모꼴", Font.PLAIN, 27));
		nickname1.setForeground(Color.white);
		nickname1.setText(chrDTO.getChrName());
		statusPanel.add(nickname1);
		
		
		// 레벨 라벨 생성
		JLabel level = new JLabel();
		level.setBounds(40, 90, 200, 50);
		level.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		level.setForeground(Color.orange);
		level.setText("Lv. " + chrDTO.getChrLevel());
		statusPanel.add(level);
		
		
		// 현재 HP, 최대 HP 라벨 생성
		JLabel hpInfo = new JLabel();
		hpInfo.setBounds(200, 20, 400, 50);
		hpInfo.setFont(new Font("둥근모꼴", Font.PLAIN, 28));
		hpInfo.setForeground(Color.red);
		hpInfo.setText("체력     ");
		statusPanel.add(hpInfo);
		
		JLabel hp = new JLabel();
		hp.setBounds(100, 20, 400, 50);
		hp.setFont(new Font("둥근모꼴", Font.PLAIN, 28));
		hp.setForeground(Color.red);
		hp.setText(chrDTO.getChrHp() + " /  " + chrDTO.getChrMaxHp());
		hp.setHorizontalAlignment(hp.RIGHT);
		statusPanel.add(hp);
		
		
		// 현재 MP, 최대 MP 라벨 생성
		JLabel mpInfo = new JLabel();
		mpInfo.setBounds(200, 60, 400, 50);
		mpInfo.setFont(new Font("둥근모꼴", Font.PLAIN, 28));
		mpInfo.setForeground(Color.cyan);
		mpInfo.setText("기력     ");
		statusPanel.add(mpInfo);
		
		JLabel mp = new JLabel();
		mp.setBounds(100, 60, 400, 50);
		mp.setFont(new Font("둥근모꼴", Font.PLAIN, 28));
		mp.setForeground(Color.cyan);
		mp.setText(chrDTO.getChrMp() + " /  " + chrDTO.getChrMaxMp());
		mp.setHorizontalAlignment(mp.RIGHT);
		statusPanel.add(mp);
		
		
		// 현재 경험치, 레벨업 조건 경험치 라벨 생성
		JLabel expInfo = new JLabel();
		expInfo.setBounds(200, 100, 400, 50);
		expInfo.setFont(new Font("둥근모꼴", Font.PLAIN, 28));
		expInfo.setForeground(Color.green);
		expInfo.setText("경험치     "); 
		statusPanel.add(expInfo);
		
		
		JLabel exp = new JLabel();
		exp.setBounds(100, 100, 400, 50);
		exp.setFont(new Font("둥근모꼴", Font.PLAIN, 28));
		exp.setForeground(Color.green);
		exp.setText(chrDTO.getChrExp() + " /  " + chrDTO.getChrMaxExp());
		exp.setHorizontalAlignment(exp.RIGHT);
		statusPanel.add(exp);
		
		
		// 소지한 골드 라벨 생성
		JLabel goldInfo = new JLabel();
		goldInfo.setBounds(0, 40, 200, 50);
		goldInfo.setFont(new Font("둥근모꼴", Font.PLAIN, 28));
		goldInfo.setForeground(Color.yellow);
		goldInfo.setText("소지한 돈");
		goldInfo.setHorizontalAlignment(goldInfo.RIGHT);
		mapPanel.add(goldInfo);
		

		JLabel gold = new JLabel();
		gold.setBounds(0, 80, 200, 50);
		gold.setFont(new Font("둥근모꼴", Font.PLAIN, 28));
		gold.setForeground(Color.yellow);
		gold.setText(chrDTO.getChrGold() + " G");
		gold.setHorizontalAlignment(gold.RIGHT);
		mapPanel.add(gold);

		
		/* -------------------- 하단 배경 이미지 추가 ---------------------- */
		
		// 상태 이미지
		Image statusBg = new ImageIcon("images/character/status.png").getImage();
		JLabel label1 = new JLabel(new ImageIcon(statusBg));
		label1.setBounds(0, 0, 560, 180);

		// 맵 정보 이미지
		Image mapBg = new ImageIcon("images/character/map.png").getImage();
		JLabel label2 = new JLabel(new ImageIcon(mapBg));
		label2.setBounds(0, 0, 240, 180);
		
		statusPanel.add(label1);
		mapPanel.add(label2);

		
		/* ----------------------------------------------------------------- */
		

		

		

		
		
		
	}
}
