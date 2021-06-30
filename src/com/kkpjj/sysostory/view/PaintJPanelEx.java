package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintJPanelEx extends JFrame {
	
	PaintJPanelEx() {
		setTitle("paintComponent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(250,250);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLUE);
		
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50);
		}
	}
	public static void main(String[] args) {
		new PaintJPanelEx();
	}
}
