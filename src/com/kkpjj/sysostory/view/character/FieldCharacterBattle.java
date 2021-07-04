package com.kkpjj.sysostory.view.character;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.IconView;

import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.battle.BattlePage;
import com.kkpjj.sysostory.view.story.OpSubPage;
import javax.swing.SwingConstants;
import java.awt.Button;

public class FieldCharacterBattle extends JPanel {
	private JFrame mf;
	private JPanel mainPanel;
	private JPanel fieldJPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;
	private JLabel fieldJLabel;
	private Image Image;
	private JPanel chPanel;
	private JLabel chLabel;
	private Image chImage;
	private JLabel monsterLabel;

	
	

	public FieldCharacterBattle(JFrame mf) {

		this.mf = mf;
		this.mainPanel = this;

		mainPanel = new JPanel(); // 메인 패널
		mainPanel.setBounds(0, 0, 800, 600); 																// 메인 패널 사이즈
		mainPanel.setLayout(null);

		this.fieldJPanel = new JPanel(); // 필드 패널
		fieldJPanel.setBounds(0, 0, 800, 400); 																// 필드 패널 사이즈
		fieldJPanel.setLayout(null);

		Image = new ImageIcon("images/Field1.png").getImage().getScaledInstance(800, 400, 0); 				// 필드 이미지 생성해서 넣어준거
		chImage = new ImageIcon("images/battle_chr.png").getImage().getScaledInstance(100, 100, 0);

		fieldJLabel = new JLabel(new ImageIcon(Image)); 														// 필드 이미지 필드 라벨에 넣어준거
		fieldJLabel.setBounds(0, 0, 800, 400);
//		fieldJPanel.setLayout(null);
		chLabel = new JLabel(new ImageIcon(chImage));
		chLabel.setBounds(100, 150, 100, 100);

		



		fieldJPanel.add(chLabel);
		fieldJPanel.add(fieldJLabel);													 	// 필드 라벨을 필드 패널에 넣어준거
		mainPanel.add(fieldJPanel); 														// 필드 패널을 메인패널에 넣어준거


		
		
		JButton setJbutton = new JButton(new ImageIcon("images/optionbutton.png"));				//설정 버튼 생성과 동시에 이미지넣기
		setJbutton.setBounds(765, 0, 35, 35);
		fieldJLabel.add(setJbutton);															//필드 라벨에 넣어주기

		
		

		
		JLabel monsterLabel = new JLabel(new ImageIcon("images/monster.png"));										// 버튼으로 만드려고햇는데 버튼은 이미지가 버튼 이미지까지 나와서 라벨에 이미지 넣음
		monsterLabel.setBounds(600, 330, 60, 60);	
		fieldJLabel.add(monsterLabel);	
	
		JLabel monsterLabel2 = new JLabel(new ImageIcon("images/monster2.png"));										// 버튼으로 만드려고햇는데 버튼은 이미지가 버튼 이미지까지 나와서 라벨에 이미지 넣음
		monsterLabel2.setBounds(530, 330, 60, 60);	
		fieldJLabel.add(monsterLabel2);	
		
		JLabel monsterLabel3 = new JLabel(new ImageIcon("images/monster3.png"));										// 버튼으로 만드려고햇는데 버튼은 이미지가 버튼 이미지까지 나와서 라벨에 이미지 넣음
		monsterLabel3.setBounds(440, 330, 60, 60);	
		fieldJLabel.add(monsterLabel3);	
		
	
		
		
		
		mf.getContentPane().add(mainPanel); 										// 메인 패널을 메인 프레임에 넣어준거
//		mf.getContentPane().add(monsterLabel2);
		monsterLabel.addMouseListener(new MyMouseAdapter()); 							// 라벨에 마우스 리스너 이벤트 생성
		monsterLabel2.addMouseListener(new MyMouseAdapter()); 							// 라벨에 마우스 리스너 이벤트 생성
		monsterLabel3.addMouseListener(new MyMouseAdapter());							// 라벨에 마우스 리스너 이벤트 생성
		
	}

	private class MyMouseAdapter extends MouseAdapter { 									// 마우스 클릭시 전투 패널로 넘어감

		@Override
		public void mouseReleased(MouseEvent e) {
			ViewUtil.changePanel(mf, fieldJPanel, new BattlePage(mf));
			mainPanel.setVisible(false);
			
		}
	
	}

//	private class MyMouseAdapter2 extends MouseAdapter { 									// 마우스 클릭시 전투 패널로 넘어감
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			ViewUtil.changePanel(mf, fieldJPanel, new BattlePage(mf));
//		}
//	}
//			private class MyMouseAdapter3 extends MouseAdapter { 									// 마우스 클릭시 전투 패널로 넘어감
//
//				@Override
//				public void mouseClicked(MouseEvent e) {
//					ViewUtil.changePanel(mf, mainPanel, new BattlePage(mf));
//				}
//	}
}