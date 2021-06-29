package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

// 몬스터 레이아웃 설정, 위치 설정
public class BattleMonPanel extends JPanel {

	protected static JPanel firstMon;
	protected static JPanel secondMon;
	protected static JPanel thirdMon;
	protected static JPanel fourthMon;

	public BattleMonPanel() {
		this.setLayout(null);
		this.setOpaque(false);

		firstMon= new FirstMon();
		firstMon.setBounds(0, 0, 64, 28);
		secondMon = new SecondMon();
		secondMon.setBounds(25, 84, 64, 28);
		thirdMon = new ThirdMon();
		thirdMon.setBounds(25, 168, 64, 28);
		fourthMon = new FourthMon();
		fourthMon.setBounds(0, 252, 64, 28);
		
		JButton selectFirstMon = new JButton();
		selectFirstMon.setBounds(firstMon.getBounds());
		selectFirstMon.setBorderPainted(false);
		selectFirstMon.setContentAreaFilled(false);

		selectFirstMon.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				selectFirstMon.setBorderPainted(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				selectFirstMon.setBorderPainted(true);
				selectFirstMon.setBorder(new LineBorder(Color.RED, 3));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		JButton selectSecondMon = new JButton();
		selectSecondMon.setBounds(secondMon.getBounds());
		JButton selectThirdMon = new JButton();
		selectThirdMon.setBounds(thirdMon.getBounds());
		JButton selectFourthMon = new JButton();
		selectFourthMon.setBounds(fourthMon.getBounds());
		
		this.add(selectFirstMon);
		this.add(firstMon);
		this.add(secondMon);
		this.add(thirdMon);
		this.add(fourthMon);
	}
	
	public List<Rectangle> monPosition() {
		List<Rectangle> mon = new ArrayList<>();
		mon.add(firstMon.getBounds());
		mon.add(secondMon.getBounds());
		mon.add(thirdMon.getBounds());
		mon.add(fourthMon.getBounds());
		
		return mon;
	}
}

// 몬스터 이미지 추가
class FirstMon extends JPanel {

	Image mon = new ImageIcon("images/mon_yellow_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class SecondMon extends JPanel {

	Image mon = new ImageIcon("images/mon_red_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class ThirdMon extends JPanel {

	Image mon = new ImageIcon("images/mon_yellow_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class FourthMon extends JPanel {

	Image mon = new ImageIcon("images/mon_red_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}