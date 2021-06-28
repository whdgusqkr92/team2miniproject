package com.kkpjj.sysostory.koobongean;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame {

	private JPanel jpanel;
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	
	Image text1 = new ImageIcon("images/text.png").getImage().getScaledInstance(800, 200, 0);
	Image text2 = new ImageIcon("images/hp.png").getImage().getScaledInstance(800, 200, 0);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setBounds(300, 75, 810, 630);
		jpanel = new JPanel();
		setContentPane(jpanel);
		jpanel.setLayout(null);
		
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 792, 407);
		jpanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(text1));
		lblNewLabel.setBounds(0, 251, 792, 143);
		panel.add(lblNewLabel);
		
		
//		setFocusable(false);//초점흐리게
		//누르면 다음화면 왜 안나오니 
//		panel.addKeyListener(new KeyAdapter() {
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				setFocusable(true);
////				if (e.getKeyChar() == 'z') {
////					label1.setBackground(Color.black);
//					int a = (int) (Math.random() * 256); // red 성분
//					int b = (int) (Math.random() * 256); // green 성분
//					int c = (int) (Math.random() * 256); 
//					if (e.getKeyChar() == '\n') {
////						label1.setText("r :" +a + "g :" + b+ "b :" +c);
////						panel.setBackground(new Color(a,b,c));
//						label2 = new JLabel(new ImageIcon(text2));
//						
//					}
//				}
//			});
		setVisible(true);
//		panel.requestFocus();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}