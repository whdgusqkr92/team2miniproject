package com.kkpjj.sysostory.view.inventory;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.InventoryController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.EquipDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.model.dto.WeaponDTO;
import com.kkpjj.sysostory.view.MainFrame;

public class InventoryView extends JPanel {
	
	private JFrame mf;
	private InventoryView mainPage;
	private Image img;
	private Image img2;
	private CharacterDTO equip;
	private InventoryController ic;

	public InventoryView(JFrame mf, InventoryDTO inven, CharacterDTO equip) {

		ic = new InventoryController();

		int[][] invenNum = new int[3][12];		// 무기, 방어구, 물약의 12개 인벤토리 공간 선언, 할당
		
		for(int i = 0; i < invenNum.length; i++) {
			for(int j = 0; j < invenNum[i].length; j++) {
				invenNum[i][j] = 0;
			}
		}

//		for(int i = 0; i < 10; i++) {
//	
//			if(invenNum[i] >= 1 && invenNum[i] < 4) {
//				if (equip.geteWeaponNum() == invenNum[i]) {
//					invenE[i] = 1;
//				}
//			} else if (invenNum[i] >= 4 && invenNum[i] < 8) {
//				if (equip.geteArmorNum() == invenNum[i]) {
//					invenE[i] = 1;
//				}
//			} else if (invenNum[i] >= 8 && invenNum[i] < 12) {
//				if (equip.geteASCNum() == invenNum[i]) {
//					invenE[i] = 1;
//				}
//			}
//
//		}

		System.out.println(equip);
		this.setBounds(0, 0, 1200, 800);
		this.mf = mf;
		this.mainPage = this;

		WeaponDTO w = new WeaponDTO();
		

		JLabel label = new JLabel(new ImageIcon());
		this.img = new ImageIcon("image/shop/inven_bg.PNG").getImage().getScaledInstance(1200, 800, 0);
		label.setIcon(new ImageIcon(img));


		JLabel labelIcon = new JLabel(new ImageIcon());
		this.img2 = new ImageIcon("image/shop/hat1.PNG").getImage().getScaledInstance(90, 90, 0);
		labelIcon.setIcon(new ImageIcon(img2));


		JButton buttonExit = new JButton(new ImageIcon("image/shop/buttonExit.PNG"));	
		JButton buttonCancle = new JButton(new ImageIcon("image/shop/cancle.PNG"));

		JButton buttonMyItem1 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven1() +".PNG"));
		JButton buttonMyItem2 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven2() +".PNG"));
		JButton buttonMyItem3 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven3() +".PNG"));
		JButton buttonMyItem4 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven4() +".PNG"));
		JButton buttonMyItem5 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven5() +".PNG"));
		JButton buttonMyItem6 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven6() +".PNG"));
		JButton buttonMyItem7 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven7() +".PNG"));
		JButton buttonMyItem8 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven8() +".PNG"));
		JButton buttonMyItem9 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven9() +".PNG"));
		JButton buttonMyItem10 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven10() +".PNG"));
		JButton buttonMyItem11 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven11() +".PNG"));
		JButton buttonMyItem12 = new JButton(new ImageIcon("image/shop/item/" + inven.getInven12() +".PNG"));

		Font font = new Font("맑은 고딕", Font.PLAIN, 30);

		buttonExit.setBounds(1000, 690, 190, 65);

		buttonMyItem1.setBounds(120, 90, 90, 90);
		buttonMyItem2.setBounds(245, 90, 90, 90);
		buttonMyItem3.setBounds(120, 222, 90, 90);
		buttonMyItem4.setBounds(245, 222, 90, 90);
		buttonMyItem5.setBounds(120, 354, 90, 90);
		buttonMyItem6.setBounds(245, 354, 90, 90);
		buttonMyItem7.setBounds(120, 486, 90, 90);
		buttonMyItem8.setBounds(245, 486, 90, 90);
		buttonMyItem9.setBounds(120, 618, 90, 90);
		buttonMyItem10.setBounds(245, 618, 90, 90);
		buttonMyItem10.setBounds(245, 618, 90, 90);
		buttonMyItem10.setBounds(245, 618, 90, 90);

//		Font font = new Font("둥근모꼴", Font.PLAIN, 20);
	
	}
}
