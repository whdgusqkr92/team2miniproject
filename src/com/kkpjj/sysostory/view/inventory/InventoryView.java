package com.kkpjj.sysostory.view.inventory;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.InventoryController;
import com.kkpjj.sysostory.controller.SkillController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.EquipDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.model.dto.WeaponDTO;
import com.kkpjj.sysostory.view.MainFrame;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.character.VillageView;

public class InventoryView extends JPanel {
	
	private JFrame mf;
	private InventoryView mainPage;
	private Image img;
	private Image img2;
	private CharacterDTO equip;
	private InventoryController ic;

	public InventoryView(JFrame mf, InventoryDTO inven, CharacterDTO equip) {

		this.mf = mf;
		
		
//		mainPanel = new JPanel();
//		mainPanel.setBounds(0, 0, 800, 600);
//
//		skilUpPanel = new JPanel();
//		skilUpPanel.setBounds(50, 20, 700, 45);
//
//		skillListPanel = new JPanel();
//		skillListPanel.setBounds(50, 100, 700, 300);
//
//		skilExPanel = new JPanel();
//		skilExPanel.setBounds(50, 420, 700, 100);
//
//		Font font = new Font("궁서 보통", Font.BOLD, 30);
//		Font font2 = new Font("궁서 보통", Font.BOLD, 15);
//		
//		this.sc = new SkillController();
//
//		/*-----------------------------------이미지 선언부-----------------------------------------*/
//
//		Image mainImage = new ImageIcon("images/skill/스킬 목록 배경.png").getImage().getScaledInstance(800, 600, 0);
//
//		Image SkilUpImage = new ImageIcon("images/skill/스킬 상단배경.png").getImage().getScaledInstance(700, 45, 0);
//		skilUpPanel.setLayout(null);
//
//		Image SkilListImage = new ImageIcon("images/skill/스킬리스트.png").getImage().getScaledInstance(700, 300, 0);
//
//		Image exImage = new ImageIcon("images/skill/스킬설명창.png").getImage().getScaledInstance(700, 100, 0);
//		skilExPanel.setLayout(null);
//
//		/*-------------------------------라벨 생성 ---------------------------------------*/
//
//		mainLabel = new JLabel(new ImageIcon(mainImage));
//		mainLabel.setBounds(0, 0, 800, 600);
//
//		JLabel skilUpLabel = new JLabel(new ImageIcon(SkilUpImage));
//		skilUpLabel.setBounds(50, 20, 700, 45);
//
//		JLabel skilUpTextLabel = new JLabel("스킬 목록");
//		skilUpTextLabel.setBounds(325, 30, 200, 30);
//
//		JLabel skillListLabel = new JLabel(new ImageIcon(SkilListImage));
//		skillListLabel.setBounds(45, 100, 700, 300);
//
//		JLabel skilExLabel = new JLabel(new ImageIcon(exImage));
//		skilExLabel.setBounds(45, 420, 700, 100);
//
//		JLabel skilExTextLabel = new JLabel();
//		skilExTextLabel.setBounds(0, 0, 700, 100);
//
//		/*-------------------------------버튼 생성 ---------------------------------------*/
//
//		JButton backButton = new JButton(new ImageIcon("images/skill/도망가기.png"));
//		backButton.setBounds(745, 20, 35, 35);
//		backButton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ViewUtil.changePanel(mf, mainPanel, new VillageView(mf, chr)); // 배틀 페이지로 넘어가는거
//				mainPanel.setVisible(false);
//
//			}
//		
//		});
//		JButton skillButton1 = new JButton(new ImageIcon("images/skill/플레임차지아이콘.png"));
//		skillButton1.setBounds(65, 115, 140, 115);
//		skillButton1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				skillCode = 1;
//				String skillScript = sc.selectSkillScript(skillCode);
//				skilExTextLabel.setText(skillScript);
//			}
//		});
//
//		JButton skillButton2 = new JButton(new ImageIcon("images/skill/파이어블링크아이콘.png"));
//		skillButton2.setBounds(240, 115, 140, 115);
//		skillButton2.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				skillCode = 2;
//				String skillScript = sc.selectSkillScript(skillCode);
//				skilExTextLabel.setText(skillScript);
//			}
//		});
//
//		JButton skillButton3 = new JButton(new ImageIcon("images/skill/회축아이콘.png"));
//		skillButton3.setBounds(415, 115, 140, 115);
//		skillButton3.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				skillCode = 3;
//				String skillScript = sc.selectSkillScript(skillCode);
//				skilExTextLabel.setText(skillScript);
//			}
//
//		});
//
//		JButton skillButton4 = new JButton(new ImageIcon("images/skill/페어리턴아이콘.png"));
//		skillButton4.setBounds(590, 115, 140, 115);
//		skillButton4.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				skillCode = 4;
//				String skillScript = sc.selectSkillScript(skillCode);
//				skilExTextLabel.setText(skillScript);
//			}
//
//		});
//		JButton skillButton5 = new JButton(new ImageIcon("images/skill/플레임볼텍스아이콘.png"));
//		skillButton5.setBounds(65, 267, 140, 115);
//		skillButton5.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				skillCode = 5;
//				String skillScript = sc.selectSkillScript(skillCode);
//				skilExTextLabel.setText(skillScript);
//			}
//
//		});
//		JButton skillButton6 = new JButton(new ImageIcon("images/skill/마블리.png"));
//		skillButton6.setBounds(240, 267, 140, 115);
//		skillButton6.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				skillCode = 6;
//				String skillScript = sc.selectSkillScript(skillCode);
//				skilExTextLabel.setText(skillScript);
//			}
//
//		});
//		JButton skillButton7 = new JButton(new ImageIcon("images/skill/탈모빔.png"));
//		skillButton7.setBounds(415, 267, 140, 115);
//		skillButton7.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				skillCode = 7;
//				String skillScript = sc.selectSkillScript(skillCode);
//				skilExTextLabel.setText(skillScript);
//			}
//
//		});
//		JButton skillButton8 = new JButton(new ImageIcon("images/skill/괴력난신.png"));
//		skillButton8.setBounds(590, 267, 140, 115);
//		skillButton8.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				skillCode = 8;
//				String skillScript = sc.selectSkillScript(skillCode);
//				skilExTextLabel.setText(skillScript);
//			}
//
//		});
//
//		/*-------------------------------버튼 넣어주는 곳---------------------------------------*/
//
//
//		mainLabel.add(backButton);
//		mainLabel.add(skillButton1);
//		mainLabel.add(skillButton2);
//		mainLabel.add(skillButton3);
//		mainLabel.add(skillButton4);
//		mainLabel.add(skillButton5);
//		mainLabel.add(skillButton6);
//		mainLabel.add(skillButton7);
//		mainLabel.add(skillButton8);
//
//		/*-------------------------------패널들 넣어주는 곳---------------------------------------*/
//		skilUpTextLabel.setFont(font);
//		skilExTextLabel.setFont(font2);
//		
//		
//		/*-------------------------------폰트 넣어주는 곳---------------------------------------*/
//
//		skilExLabel.add(skilExTextLabel);
//		mainPanel.setLayout(null);
//		
//		mainLabel.add(skilUpTextLabel);
//		mainLabel.add(skilUpLabel);
//		mainLabel.add(skillListLabel);
//		mainLabel.add(skilExLabel);
//
//		mainPanel.add(mainLabel);
//
//		mainPanel.add(skilUpPanel);
//		mainPanel.add(skillListPanel);
//		skillListPanel.setLayout(null);
//
//		mainPanel.add(skilExPanel);
//
//		mf.getContentPane().setLayout(null);
//
//		mf.getContentPane().add(mainPanel);
		
		
		
		
		
		
		
//		ic = new InventoryController();
		
//
//		int[][] invenNum = new int[3][12];		// 무기, 방어구, 물약의 12개 인벤토리 공간 선언, 할당
//		
//		for(int i = 0; i < invenNum.length; i++) {
//			for(int j = 0; j < invenNum[i].length; j++) {
//				invenNum[i][j] = 0;
//			}
//		}
//
////		for(int i = 0; i < 10; i++) {
////	
////			if(invenNum[i] >= 1 && invenNum[i] < 4) {
////				if (equip.geteWeaponNum() == invenNum[i]) {
////					invenE[i] = 1;
////				}
////			} else if (invenNum[i] >= 4 && invenNum[i] < 8) {
////				if (equip.geteArmorNum() == invenNum[i]) {
////					invenE[i] = 1;
////				}
////			} else if (invenNum[i] >= 8 && invenNum[i] < 12) {
////				if (equip.geteASCNum() == invenNum[i]) {
////					invenE[i] = 1;
////				}
////			}
////
////		}
//
//		System.out.println(equip);
//		this.setBounds(0, 0, 1200, 800);
//		this.mf = mf;
//		this.mainPage = this;
//
//		WeaponDTO w = new WeaponDTO();
//		
//
//		JLabel label = new JLabel(new ImageIcon());
//		this.img = new ImageIcon("image/shop/inven_bg.PNG").getImage().getScaledInstance(1200, 800, 0);
//		label.setIcon(new ImageIcon(img));
//
//
//		JLabel labelIcon = new JLabel(new ImageIcon());
//		this.img2 = new ImageIcon("image/shop/hat1.PNG").getImage().getScaledInstance(90, 90, 0);
//		labelIcon.setIcon(new ImageIcon(img2));
//
//
//		JButton buttonExit = new JButton(new ImageIcon("image/shop/buttonExit.PNG"));	
//		JButton buttonCancle = new JButton(new ImageIcon("image/shop/cancle.PNG"));
//
//		JButton buttonMyItem1 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven1() +".PNG"));
//		JButton buttonMyItem2 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven2() +".PNG"));
//		JButton buttonMyItem3 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven3() +".PNG"));
//		JButton buttonMyItem4 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven4() +".PNG"));
//		JButton buttonMyItem5 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven5() +".PNG"));
//		JButton buttonMyItem6 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven6() +".PNG"));
//		JButton buttonMyItem7 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven7() +".PNG"));
//		JButton buttonMyItem8 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven8() +".PNG"));
//		JButton buttonMyItem9 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven9() +".PNG"));
//		JButton buttonMyItem10 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven10() +".PNG"));
//		JButton buttonMyItem11 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven11() +".PNG"));
//		JButton buttonMyItem12 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven12() +".PNG"));
//
//		Font font = new Font("맑은 고딕", Font.PLAIN, 30);
//
//		buttonExit.setBounds(1000, 690, 190, 65);
//
//		buttonMyItem1.setBounds(120, 90, 90, 90);
//		buttonMyItem2.setBounds(245, 90, 90, 90);
//		buttonMyItem3.setBounds(120, 222, 90, 90);
//		buttonMyItem4.setBounds(245, 222, 90, 90);
//		buttonMyItem5.setBounds(120, 354, 90, 90);
//		buttonMyItem6.setBounds(245, 354, 90, 90);
//		buttonMyItem7.setBounds(120, 486, 90, 90);
//		buttonMyItem8.setBounds(245, 486, 90, 90);
//		buttonMyItem9.setBounds(120, 618, 90, 90);
//		buttonMyItem10.setBounds(245, 618, 90, 90);
//		buttonMyItem10.setBounds(245, 618, 90, 90);
//		buttonMyItem10.setBounds(245, 618, 90, 90);
//
////		Font font = new Font("둥근모꼴", Font.PLAIN, 20);
	
	}
}
