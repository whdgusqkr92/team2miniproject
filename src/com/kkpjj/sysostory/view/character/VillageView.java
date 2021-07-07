package com.kkpjj.sysostory.view.character;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.shop.ArmorDealer;
import com.kkpjj.sysostory.view.shop.ArmorShopView;
import com.kkpjj.sysostory.view.shop.PotionDealer;
import com.kkpjj.sysostory.view.shop.PotionShopView;
import com.kkpjj.sysostory.view.shop.WeaponDealer;
import com.kkpjj.sysostory.view.shop.WeaponShopView;

public class VillageView extends JPanel implements KeyListener {
	
	private JFrame mf;
	private JPanel chrPanel;
	private JPanel posionShopPanel;
	private JPanel weaponShopPanel;
	private JPanel armorShopPanel;
	private JPanel moveFieldPanel;
	
	private CharacterDTO chr; 
	private InventoryDTO inven;
	
	private JTextField tf;

	
	public VillageView(JFrame mf, CharacterDTO chr) {
	
	
		// 마을화면 레이아웃 설정
		this.mf = mf;
		
		this.chr = chr;
		
//		chr = new CharacterDTO();
		
		// 하단 정보 패널 호출
		new StatusPanel(mf, chr);
		
		init();
		// 상인, 화살표 생성 후 프레임에 추가
		createComponent();
		addComponents();
		// 프레임에 마을 메인화면 추가
		this.mf.add(this);
		
		posionShopPanel.addMouseListener(new MyMouseAdapter(this));
		weaponShopPanel.addMouseListener(new MyMouseAdapter(this));
		armorShopPanel.addMouseListener(new MyMouseAdapter(this));
		moveFieldPanel.addMouseListener(new MyMouseAdapter(this));
		
		// 키보드 이벤트 호출
		tf.addKeyListener(this);
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
		posionShopPanel = new PotionDealer(mf);
		// 무기상인 생성
		weaponShopPanel = new WeaponDealer(mf);
		// 방어구상인 생성
		armorShopPanel = new ArmorDealer(mf);
		// 화살표 생성
		moveFieldPanel = new MoveField(mf);
		
		// 캐릭터 키보드 이벤트 생성
		tf = new JTextField();
		
		this.setVisible(true);
		
	}
	
	// 각 생성한 컴포넌트들에 대해 add
	private void addComponents() {
		this.add(tf);
		this.add(chrPanel);
		this.add(posionShopPanel);
		this.add(weaponShopPanel);
		this.add(armorShopPanel);
		this.add(moveFieldPanel);
		
	}
	
//	 배경화면 추가
	Image bg = new ImageIcon("images/field/village.png").getImage().getScaledInstance(800, 420, 0);
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
	}
	
	
	// 상인 클릭 시, 상점 목록 클래스로 전환
	private class MyMouseAdapter extends MouseAdapter {
		
		private VillageView villageView;
		
		public MyMouseAdapter(VillageView villageView) {
			this.villageView = villageView;
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			if(e.getSource() == posionShopPanel) {
				ViewUtil.changePanel(mf, villageView, new PotionShopView(mf));
			} else if(e.getSource() == weaponShopPanel) {
				ViewUtil.changePanel(mf, villageView, new WeaponShopView(mf));
			} else if(e.getSource() == armorShopPanel) {
				ViewUtil.changePanel(mf, villageView, new ArmorShopView(mf));
			} else if(e.getSource() == moveFieldPanel) {
				ViewUtil.changePanel(mf, villageView, new FieldCharacterBattle(mf, inven, chr));
			}
		}
	}
	
	public void display(String s, KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		// 키보드 이벤트 출력값 확인용
		System.out.println("VillageView에서 키보드 입력값 : " + keyCode);
		
		if(e.getKeyCode() == 69) {
			ViewUtil.changePanel(mf, this, new CharacterView(mf, chr));
			this.setVisible(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		this.display("keyPressed", e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
}