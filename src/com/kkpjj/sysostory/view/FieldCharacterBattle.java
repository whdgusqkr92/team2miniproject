package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.view.op.OpSubPage;

public class FieldCharacterBattle extends JPanel {
	private JFrame mf;
	private JPanel mainPanel;
	private JPanel feildJPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;
	private JLabel feildJLabel;
	private Image feildImage;
	private JPanel chPanel;
	private JLabel chLabel;
	private Image chImage;

	public FieldCharacterBattle(JFrame mf) {

		this.mf = mf;
		this.mainPanel = this;

		mainPanel = new JPanel();										//메인 패널
		mainPanel.setBounds(0, 0, 800, 600);							//메인 패널 사이즈
		mainPanel.setLayout(null);
		
		feildJPanel = new JPanel();										//필드 패널
		feildJPanel.setBounds(0, 0, 800, 400);							//필드 패널 사이즈
//		feildJPanel.setLayout(null);
		
		feildImage = new ImageIcon("images/battle_bg.png").getImage().getScaledInstance(800, 400, 0);			//필드 이미지 생성해서 넣어준거
		chImage = new ImageIcon("images/battle_chr.png").getImage().getScaledInstance(100, 100, 0);
		
		feildJLabel = new JLabel(new ImageIcon(feildImage));													//필드 이미지 필드 라벨에 넣어준거
		feildJLabel.setBounds(0, 0, 800, 400);
		feildJPanel.setLayout(null);
		chLabel = new JLabel(new ImageIcon(chImage));
		chLabel.setBounds(100, 150, 100, 100);
		
		feildJPanel.add(chLabel);
		feildJPanel.add(feildJLabel);																			//필드 라벨을 필드 패널에 넣어준거
		mainPanel.add(feildJPanel);																				//필드 패널을 메인패널에 넣어준거
		mf.getContentPane().add(mainPanel);																						//메인 패널을 메인 프레임에 넣어준거
		mainPanel.addMouseListener(new MyMouseAdapter());														//메인 패널 마우스 리스너 이벤트 생성
	}

	private class MyMouseAdapter extends MouseAdapter {								//마우스 클릭시 전투 패널로 넘어감

		@Override
		public void mouseClicked(MouseEvent e) {
			ViewUtil.changePanel(mf, mainPanel, new BattlePage(mf));
		}
	}
}