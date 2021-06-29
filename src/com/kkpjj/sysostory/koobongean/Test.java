package com.kkpjj.sysostory.koobongean;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Test extends JFrame {

	private JPanel jpanel;
	
	Image field = new ImageIcon("Images/field.png").getImage().getScaledInstance(800, 200, 0);
	Image text1 = new ImageIcon("images/text.png").getImage().getScaledInstance(800, 200, 0);
	Image text2 = new ImageIcon("images/hp.png").getImage().getScaledInstance(800, 200, 0);

	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	
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
		//프레임 같음
		setBounds(300, 75, 810, 630);
		jpanel = new JPanel();
		setContentPane(jpanel);
		jpanel.setLayout(null);
		//첫번째패널
		JPanel panel = new JPanel() {
			public void paintComponent(Graphics g) {
				
				g.drawImage(field,0,0,800,560,this);
				
			}
		};
		
		panel.setBounds(0, 0, 792, 407);
		jpanel.add(panel);
		panel.setLayout(null);
		//대화창 이미지
		JLabel lblNewLabel = new JLabel(new ImageIcon(text1));
		lblNewLabel.setBounds(0, 251, 792, 143);
		panel.add(lblNewLabel);
		
		//버튼
		JButton btnNewButton = new JButton("다음");
		btnNewButton.setBounds(717, 300, 75, 57);
		panel.add(btnNewButton);
		//두번째패널
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 792, 407);
		jpanel.add(panel_1);
		panel_1.setLayout(null);
		//두번째패널의 대화상자
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(0, 251, 792, 143);
		panel_1.add(textArea_1);
		panel.setLayout(null);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				btnNewButton.setVisible(false);
			}
		});
//		panel.addKeyListener(new KeyAdapter() {
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				if(e.getKeyChar() =='z') {
//					lblNewLabel.setVisible(false);
//				}
//				
//			}
//		});
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}