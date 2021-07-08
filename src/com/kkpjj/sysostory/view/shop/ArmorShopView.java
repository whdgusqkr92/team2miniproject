package com.kkpjj.sysostory.view.shop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.view.MainFrame;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.character.VillageView;

public class ArmorShopView extends JPanel {
	
	private JFrame mf;
	
	private CharacterDTO chr;
	private InventoryDTO inven;
	
	private JPanel shopPanel;

	public ArmorShopView(JFrame mf, InventoryDTO inven, CharacterDTO chr) {
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
		Image dealerImg = new ImageIcon("images/npc/방어구상인.png").getImage();
		JLabel dealerLabel = new JLabel(new ImageIcon(dealerImg));
		dealerLabel.setBounds(15, 20, 370, 80);
		dealerLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 20));
		dealerLabel.setForeground(Color.white);
		dealerLabel.setText(" 튼튼한 방어구들이 여기 있다네!");
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

	}

}
