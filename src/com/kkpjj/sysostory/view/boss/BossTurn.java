package com.kkpjj.sysostory.view.boss;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BattleController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;


public class BossTurn extends JPanel{

	private JFrame mf;
	private JPanel mainpanel;
	private JLabel skillLabel;
	private JLabel bossLabel;
	private CharacterDTO characterDTO;
	private InventoryDTO inventoryDTO;


	public BossTurn(JFrame mf, CharacterDTO characterDTO, InventoryDTO inventoryDTO) {
		this.mf = mf;
		this.mainpanel = this;
		this.characterDTO = characterDTO;
		this.inventoryDTO = inventoryDTO;
		
		Middboss();
	}

	//--------------------------배경 필드 패널 만들기------------------------------	



	Image field = new ImageIcon("Images/field/field.png").getImage().getScaledInstance(800, 200, 0);
	@Override
	public void paintComponent(Graphics g) {

		g.drawImage(field,0,0,800,400,this);
	}
			public void Middboss() {


		mainpanel.setBounds(0, 0, 800, 400);
		mainpanel.setLayout(null);
		mf.add(mainpanel); // 생성한 패널 프레임에 추가

		Image bossface = new ImageIcon("images/text/Bossface_M.png").getImage().getScaledInstance(200, 180, 0);
		bossLabel = new JLabel(new ImageIcon(bossface));
		bossLabel.setBounds(650, 110, 150, 143);
		mainpanel.add(bossLabel);
		BattleController bc = new BattleController(mf, mainpanel, characterDTO, inventoryDTO);
		bc.createChr();
		bc.createMenu();
		
		}
		
}