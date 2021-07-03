package com.kkpjj.sysostory.view.member;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ResignedCheck extends JFrame{

	public ResignedCheck() {

		
		JFrame mf = new JFrame();
		mf.setSize(800, 600);
		mf.setLocationRelativeTo(null);
		mf.setTitle("syso Story");
		
		Image background = new ImageIcon("images/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));			/* 게임 배경 화면 */
		label.setForeground(Color.WHITE);
		label.setBounds(0, 0, 800, 600);
		mf.getContentPane().setLayout(null);
		
		Image window = new ImageIcon("images/characterWindow.png").getImage().getScaledInstance(500, 200, 0);
		JLabel windowLabel = new JLabel(new ImageIcon(window));			/* 회원탈퇴 예 아니오 선택 창 */
		windowLabel.setBounds(150, 200, 500, 200);
		windowLabel.setLayout(null);
		
		JLabel resignedLabel = new JLabel("탈퇴되었습니다.");						/* 회원탈퇴  라벨 */
		resignedLabel.setForeground(Color.WHITE);
		resignedLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		resignedLabel.setBounds(310, 250, 300, 30);
		
		JButton checkButton = new JButton("확인");							/* 예 버틀 */
		checkButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		checkButton.setBounds(340, 310, 100, 50);
		mf.getContentPane().add(checkButton);
		
		
		mf.getContentPane().add(resignedLabel);
		mf.getContentPane().add(windowLabel);
		mf.getContentPane().add(label);
		
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
}
