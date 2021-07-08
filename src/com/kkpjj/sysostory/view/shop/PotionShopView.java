package com.kkpjj.sysostory.view.shop;

import java.awt.Color;
import java.awt.Font;
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

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.character.VillageView;

public class PotionShopView extends JPanel {
	
	private JFrame mf;
	
	private CharacterDTO chr;
	private InventoryDTO inven;
	
	private JPanel shopPanel;
	
	
	public PotionShopView(JFrame mf, InventoryDTO inven, CharacterDTO chr) {
		
		this.mf = mf;
		this.inven = inven;
		this.chr = chr;
		
		// 상점 패널 선언 및 생성
		shopPanel = new JPanel();
		shopPanel.setBounds(0, 0, 800, 420);
		mf.getContentPane().add(shopPanel);
		shopPanel.setLayout(null);
		
		// 나가기 버튼 추가
		JButton backButton = new JButton(new ImageIcon("images/item/exit.png"));
		backButton.setBounds(720, 10, 50, 50);
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUtil.changePanel(mf, shopPanel, new VillageView(mf, chr)); // 마을 페이지로 넘어가는거
				shopPanel.setVisible(false);

			}
		
		});
		shopPanel.add(backButton);
		
		/*--------------------------------상점 목록-------------------------------*/
		
		// 상인 이미지 추가
		Image dealerImg = new ImageIcon("images/npc/물약상인.png").getImage();
		JLabel dealerLabel = new JLabel(new ImageIcon(dealerImg));
		dealerLabel.setBounds(15, 20, 170, 80);
		dealerLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 20));
		dealerLabel.setForeground(Color.white);
		dealerLabel.setText(" 어서옵쇼!");
		shopPanel.add(dealerLabel);
		
		// 캐릭터 이미지 추가
		Image chrImg = new ImageIcon("images/character/캐릭터정면.png").getImage();
		JLabel chrLabel = new JLabel(new ImageIcon(chrImg));
		chrLabel.setBounds(520, 20, 50, 80);
		shopPanel.add(chrLabel);
		
		// 상점 슬롯 배경 추가
		Image shopListBg = new ImageIcon("images/npc/shopList.png").getImage();
		JLabel listBg = new JLabel(new ImageIcon(shopListBg));
		listBg.setBounds(20, 120, 250, 240);
		shopPanel.add(listBg);
		
		// 인벤토리 슬롯 배경 추가
		Image invenBg = new ImageIcon("images/npc/shopList.png").getImage();
		JLabel invenlistBg = new JLabel(new ImageIcon(invenBg));
		invenlistBg.setBounds(520, 120, 250, 240);
		shopPanel.add(invenlistBg);
		
		// 인벤토리 배경 추가
		Image shopBg = new ImageIcon("images/npc/shopWindow.png").getImage();
		JLabel bg = new JLabel(new ImageIcon(shopBg));
		bg.setBounds(2, 2, 795, 415);
		shopPanel.add(bg);
		
		/*-------------------------------------------------------------------------*/
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 상점 슬롯 배경 추가
//		Image shopListBg = new ImageIcon("images/npc/shopList.png").getImage();
//		JLabel listBg = new JLabel(new ImageIcon(shopListBg));
//		listBg.setBounds(20, 120, 250, 240);
//		shopPanel.add(listBg);
//		
//		// 인벤토리 배경 추가
//		Image shopBg = new ImageIcon("images/npc/shopWindow.png").getImage();
//		JLabel bg = new JLabel(new ImageIcon(shopBg));
//		bg.setBounds(2, 2, 795, 415);
//		shopPanel.add(bg);
		

		
//		// 아이템 설명창 추가
//		Image exImage = new ImageIcon("images/item/아이템설명창.png").getImage().getScaledInstance(700, 100, 0);
//		JLabel exitem = new JLabel(new ImageIcon(exImage));
//		exitem.setBounds(150, 305, 500, 100);
//		invenPanel.add(exitem);
		
	
		
//		potionShopPanel = new JPanel();
//		potionShopPanel.setBounds(0, 0, 800, 420);
//		potionShopPanel.setLayout(null);
//		
//		
//		JButton exitButton = new JButton();
//		exitButton.setBounds(750, 0, 45, 45);
//		exitButton.setIcon(new ImageIcon("imagess/exit.png"));
//		potionShopPanel.add(exitButton);
		
//		tf = new JTextField();
//		this.add(tf);
//		this.setVisible(true);
//		tf.addKeyListener(this);
//			
//		JLabel label = new JLabel(new ImageIcon());
//		this.img = new ImageIcon("images/item/shopBg.png").getImage().getScaledInstance(400, 420, 0);
//		label.setIcon(new ImageIcon(img));
//		
//		JLabel labelIcon = new JLabel(new ImageIcon());
//
//		Image img2 = new ImageIcon("images/shop/infoBoard.PNG").getImage().getScaledInstance(300, 615, 0);
//		labelIcon.setIcon(new ImageIcon(img2));
//
//		JButton buttonExit = new JButton(new ImageIcon("imagess/exit.png"));
//		JButton buttonItem1 = new JButton(new ImageIcon("images/item/potion/p1.png"));
//		JButton buttonItem2 = new JButton(new ImageIcon("images/item/potion/p2.png"));
//		JButton buttonItem3 = new JButton(new ImageIcon("images/item/potion/p3.png"));
//		JButton buttonItem4 = new JButton(new ImageIcon("images/item/potion/p4.png"));
//		JButton buttonItem5 = new JButton(new ImageIcon("images/item/potion/p5.png"));
//
//		buttonExit.setBounds(750, 10, 50, 50);
//		buttonItem1.setBounds(50, 100, 35, 35);
//		buttonItem2.setBounds(100, 100, 35, 35);
//		buttonItem3.setBounds(150, 100, 35, 35);
//		buttonItem4.setBounds(200, 100, 35, 35);
//		buttonItem5.setBounds(250, 100, 35, 35);

		
	}
	

	

}

