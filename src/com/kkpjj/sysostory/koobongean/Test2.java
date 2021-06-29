package com.kkpjj.sysostory.koobongean;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test2 extends JFrame {
	
	JLabel jl;
	Container c1 = getContentPane();
	public Test2() {
		c1.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("색상변경");
		setSize(330, 300);
		 
		jl = new JLabel("<ENTER> 키를 누르면 배경 색상이 바뀝니다.");
		c1.add(jl);
		setFocusable(false);
		c1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setFocusable(true);
				int a = (int) (Math.random() * 256); // red 성분
				int b = (int) (Math.random() * 256); // green 성분
				int c = (int) (Math.random() * 256); 
				if (e.getKeyChar() == 'z') {
					jl.setText("r :" +a + "g :" + b+ "b :" +c);
					c1.setBackground(new Color(a,b,c));
				}
			}
		});
		setVisible(true);
		c1.requestFocus();
	}
		public static void main(String[] args) {
			new Test2();

		}

	}



