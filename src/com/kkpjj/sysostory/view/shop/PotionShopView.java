package com.kkpjj.sysostory.view.shop;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.view.MainFrame;

public class PotionShopView extends JPanel {
	
	private JFrame mf;
	private JPanel potionShopPanel;
	private Image img;
	
	public PotionShopView(MainFrame mf) {
		this.mf = mf;
//		potionShopPanel = new JPanel();
//		potionShopPanel.setBounds(0, 0, 800, 420);
//		potionShopPanel.setLayout(null);
//		
//		
//		JButton exitButton = new JButton();
//		exitButton.setBounds(750, 0, 45, 45);
//		exitButton.setIcon(new ImageIcon("imagess/exit.png"));
//		potionShopPanel.add(exitButton);
		
		JLabel label = new JLabel(new ImageIcon());
		this.img = new ImageIcon("images/item/shopBg.png").getImage().getScaledInstance(400, 420, 0);
		label.setIcon(new ImageIcon(img));
		
		JLabel labelIcon = new JLabel(new ImageIcon());

		Image img2 = new ImageIcon("images/shop/infoBoard.PNG").getImage().getScaledInstance(300, 615, 0);
		labelIcon.setIcon(new ImageIcon(img2));

		JButton buttonExit = new JButton(new ImageIcon("imagess/exit.png"));
		JButton buttonItem1 = new JButton(new ImageIcon("images/item/potion/p1.png"));
		JButton buttonItem2 = new JButton(new ImageIcon("images/item/potion/p2.png"));
		JButton buttonItem3 = new JButton(new ImageIcon("images/item/potion/p3.png"));
		JButton buttonItem4 = new JButton(new ImageIcon("images/item/potion/p4.png"));
		JButton buttonItem5 = new JButton(new ImageIcon("images/item/potion/p5.png"));

		buttonExit.setBounds(750, 10, 50, 50);
		buttonItem1.setBounds(50, 100, 35, 35);
		buttonItem2.setBounds(100, 100, 35, 35);
		buttonItem3.setBounds(150, 100, 35, 35);
		buttonItem4.setBounds(200, 100, 35, 35);
		buttonItem5.setBounds(250, 100, 35, 35);

		
	}
	

}

