package com.kkpjj.sysostory.view.character;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kkpjj.sysostory.controller.CharacterController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.view.ViewUtil;

public class CharacterView extends JPanel{
	
	private JFrame mf;

	private CharacterDTO chrDTO;
	private CharacterController cc;
	
	private JPanel chrPanel;
	
	public CharacterView(JFrame mf, CharacterDTO chrDTO) {
		
		this.mf = mf;
		this.chrDTO = chrDTO;
		
		cc = new CharacterController();
		
		// 하단 정보 패널 호출
		new StatusPanel(mf, chrDTO);
		
		/* -------------- 캐릭터 정보 테스트 ----------------- */
		
//		int userNo = 4;		// 사용자 번호
//		int chrCode = 2;	// 캐릭터 코드
//		
//		chrDTO.setChrCode(chrCode);
//		chrDTO.setUserNo(userNo);
		
//		System.out.println(cc.selectCharacterInfo(chrDTO.getChrCode(), chrDTO.getUserNo()));
		
//		System.out.println("공격력 : " + chr.getChrAtt());
//		System.out.println("방어력 : " + chr.getChrDef());
//		System.out.println("닉네임 : " + chr.getChrName());
		
//		CharacterDTO chr = cc.selectCharacterInfo(chrDTO.getUserNo(), chrDTO.getChrCode());		
		
		// ------------------------------------------------------------
		
		
		// 캐릭터 정보 패널 선언 및 생성
		chrPanel = new JPanel();
		chrPanel.setBounds(0, 0, 800, 420);
		mf.getContentPane().add(chrPanel);
		chrPanel.setLayout(null);
		
		// 나가기 버튼 추가
		JButton backButton = new JButton(new ImageIcon("images/character/exit.png"));
		backButton.setBounds(720, 10, 50, 50);
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUtil.changePanel(mf, chrPanel, new VillageView(mf, chrDTO)); // 마을 페이지로 넘어가는거
				chrPanel.setVisible(false);

			}
		
		});
		chrPanel.add(backButton);
		
		
		// 캐릭터 정보창 패널 생성
		JLabel chrPanelName = new JLabel();
		chrPanelName.setBounds(70, 5, 300, 50);
		chrPanelName.setFont(new Font("둥근모꼴", Font.PLAIN, 35));
		chrPanelName.setForeground(Color.white);
		chrPanelName.setText("캐릭터 정보");
		chrPanel.add(chrPanelName);
		
		// 닉네임 라벨 생성
		JLabel nickname = new JLabel();
		nickname.setBounds(30, 180, 300, 50);
		nickname.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		nickname.setForeground(Color.white);
		nickname.setText("이름     " + chrDTO.getChrName());
		chrPanel.add(nickname);
		
		// 칭호 라벨 생성
		JLabel title = new JLabel();
		title.setBounds(30, 220, 300, 50);
		title.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		title.setForeground(Color.white);
		title.setText("칭호     " + titleYN(chrDTO));
		chrPanel.add(title);
		
		// 장착한 무기 라벨 생성
		JLabel equipWeapon = new JLabel();
		equipWeapon.setBounds(30, 260, 300, 50);
		equipWeapon.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		equipWeapon.setForeground(Color.white);
		equipWeapon.setText("무기     " + chrDTO.getChrEquipWeapon());
		chrPanel.add(equipWeapon);
		
		// 장착한 방어구 라벨 생성
		JLabel equipArmor = new JLabel();
		equipArmor.setBounds(30, 300, 300, 50);
		equipArmor.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		equipArmor.setForeground(Color.white);
		equipArmor.setText("방어구   " + chrDTO.getChrEquipArmor());
		chrPanel.add(equipArmor);
		
		// 레벨 라벨 생성
		JLabel level = new JLabel();
		level.setBounds(400, 50, 300, 50);
		level.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		level.setForeground(Color.white);
		level.setText("레벨          " + chrDTO.getChrLevel());
		chrPanel.add(level);
		
		// 현재 HP, 최대 HP 라벨 생성
		JLabel hpInfo = new JLabel();
		hpInfo.setBounds(400, 100, 400, 50);
		hpInfo.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		hpInfo.setForeground(Color.white);
		hpInfo.setText("체력      ");
		chrPanel.add(hpInfo);
		
		JLabel hp = new JLabel();
		hp.setBounds(300, 100, 400, 50);
		hp.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		hp.setForeground(Color.white);
		hp.setText(chrDTO.getChrHp() + " /  " + chrDTO.getChrMaxHp());
		hp.setHorizontalAlignment(hp.RIGHT);
		chrPanel.add(hp);
		
		// 현재 MP, 최대 MP 라벨 생성
		JLabel mpInfo = new JLabel();
		mpInfo.setBounds(400, 150, 400, 50);
		mpInfo.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		mpInfo.setForeground(Color.white);
		mpInfo.setText("기력       ");
		chrPanel.add(mpInfo);
		
		JLabel mp = new JLabel();
		mp.setBounds(300, 150, 400, 50);
		mp.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		mp.setForeground(Color.white);
		mp.setText(chrDTO.getChrMp() + " /  " + chrDTO.getChrMaxMp());
		mp.setHorizontalAlignment(mp.RIGHT);
		chrPanel.add(mp);
		
		
		// 현재 경험치, 레벨업 조건 경험치 라벨 생성
		JLabel expInfo = new JLabel();
		expInfo.setBounds(400, 200, 400, 50);
		expInfo.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		expInfo.setForeground(Color.white);
		expInfo.setText("경험치      ");
		chrPanel.add(expInfo);
		
		JLabel exp = new JLabel();
		exp.setBounds(300, 200, 400, 50);
		exp.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		exp.setForeground(Color.white);
		exp.setText(chrDTO.getChrExp() + " /  " + chrDTO.getChrMaxExp());
		exp.setHorizontalAlignment(exp.RIGHT);
		chrPanel.add(exp);
	
		// 공격력 라벨 생성
		JLabel att = new JLabel();
		att.setBounds(400, 250, 300, 50);
		att.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		att.setForeground(Color.white);
		att.setText("공격력       " + chrDTO.getChrAtt());
		chrPanel.add(att);
		
		// 방어력 라벨 생성
		JLabel def = new JLabel();
		def.setBounds(400, 300, 300, 50);
		def.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		def.setForeground(Color.white);
		def.setText("방어력       " + chrDTO.getChrDef());
		chrPanel.add(def);
		

		// 캐릭터 정보 배경 추가
		Image ChrInfoBg = new ImageIcon("images/character/characterWindow.png").getImage();
		JLabel bg = new JLabel(new ImageIcon(ChrInfoBg));
		bg.setBounds(2, 2, 795, 415);
		

		// 캐릭터 이미지 추가
		Image ChrProfileImg = new ImageIcon("images/character/sysoIcon.png").getImage();
		JLabel ChrProfile = new JLabel(new ImageIcon(ChrProfileImg));
		ChrProfile.setBounds(100, 50, 136, 136);
		
		chrPanel.add(ChrProfile);
		chrPanel.add(bg); 			// 캐릭터 이미지가 안나와서 순서 변경
		
	}
	
	
	// 칭호를 장착하지 않은 경우 '없음'으로 출력하게 하는 메소드
	public String titleYN(CharacterDTO chr) {
		
		String title = "";  
		title = chr.getChrEquipTitle();
		
		if(chr.getChrEquipTitle() == null) {
			title = "없음";
		}
		return title;
	}

}
