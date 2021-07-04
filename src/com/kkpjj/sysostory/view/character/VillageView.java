package com.kkpjj.sysostory.view.character;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.view.MainFrame;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.shop.ArmorDealer;
import com.kkpjj.sysostory.view.shop.ArmorShopView;
import com.kkpjj.sysostory.view.shop.PotionDealer;
import com.kkpjj.sysostory.view.shop.PotionShopView;
import com.kkpjj.sysostory.view.shop.WeaponDealer;
import com.kkpjj.sysostory.view.shop.WeaponShopView;

public class VillageView extends JPanel {
	
	private JFrame mf;
	private JPanel chrPanel;
	private JPanel posionShopPanel;
	private JPanel weaponShopPanel;
	private JPanel armorShopPanel;

	public VillageView(JFrame mf) {
		
		this.mf = mf;
		// 마을화면 레이아웃 설정
		init();
		// 상인 생성 후 프레임에 추가
		createComponent();
		addComponents();
		// 프레임에 마을 메인화면 추가
		this.mf.add(this);
		
		posionShopPanel.addMouseListener(new MyMouseAdapter());
		weaponShopPanel.addMouseListener(new MyMouseAdapter());
		armorShopPanel.addMouseListener(new MyMouseAdapter());
	}
	
	private void init() {
		this.setBounds(0, 0, 800, 420);
		this.setLayout(null);
		this.setOpaque(false);
	}
	
	private void createComponent() {
		// 주인공 캐릭터 생성
		chrPanel = new chrView();
		// 물약상인 생성
		posionShopPanel = new PotionDealer();
		// 무기상인 생성
		weaponShopPanel = new WeaponDealer();
		// 방어구상인 생성
		armorShopPanel = new ArmorDealer();
		
	}

	private void addComponents() {
		this.add(chrPanel);
		this.add(posionShopPanel);
		this.add(weaponShopPanel);
		this.add(armorShopPanel);
	}
	
	// 배경화면 추가
//	Image bg = new ImageIcon("images/village.png").getImage().getScaledInstance(800, 420, 0);
//	
//	@Override
//	public void paintComponent(Graphics g) {
//		g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
//	}
	
	
	// 상인 클릭 시, 상점 목록 클래스로 전환
	private class MyMouseAdapter extends MouseAdapter {
		
		private JFrame mf;
		
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource() == posionShopPanel) {
//				ViewUtil.changePanel(mf, posionShopPanel, new PotionShopView((MainFrame) mf));
			} else if(e.getSource() == weaponShopPanel) {
				ViewUtil.changePanel(mf, weaponShopPanel, new WeaponShopView());
			} else if(e.getSource() == armorShopPanel) {
				ViewUtil.changePanel(mf, armorShopPanel, new ArmorShopView());
			}
		}
	}
	
}















