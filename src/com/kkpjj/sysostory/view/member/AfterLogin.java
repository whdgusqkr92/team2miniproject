package com.kkpjj.sysostory.view.member;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.kkpjj.sysostory.view.StartScreen;
import com.kkpjj.sysostory.view.user.NickName;

import javax.swing.JButton;
import java.awt.Font;

public class AfterLogin extends JFrame{

	public AfterLogin() {
		JFrame mf = new JFrame();
		mf.setSize(800, 600);
		mf.setLocationRelativeTo(null);
		mf.setTitle("syso Story");
		
		JPanel panel = new JPanel();
		
		Image background = new ImageIcon("images/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);
		mf.getContentPane().setLayout(null);
		
		
		JButton playNewButton = new JButton("새로 하기");				/* 새로 하기 버튼 */
		playNewButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		playNewButton.setBounds(200, 130, 400, 80);
		mf.getContentPane().add(playNewButton);
		
		playNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new NickName();
				infoBox("닉네임을 입력해주세요.","캐릭터 생성");
			}
		});
		
		JButton btnNewButton_1 = new JButton("이어 하기");				/* 이어 하기 버튼 */
		btnNewButton_1.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		btnNewButton_1.setBounds(200, 240, 400, 80);
		mf.getContentPane().add(btnNewButton_1);
		
		JButton logoutButton = new JButton("로그아웃");				/* 로그아웃 버튼 */
		logoutButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		logoutButton.setBounds(275, 360, 250, 60);
		mf.getContentPane().add(logoutButton);
		
		logoutButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				mf.setVisible(false);
				new StartScreen();
				infoBox("로그아웃 되었습니다.","로그아웃");
				
			}
		});
		
		JButton btnNewButton_3 = new JButton("회원탈퇴");				/* 회원탈퇴 버튼 */
		btnNewButton_3.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		btnNewButton_3.setBounds(340, 480, 130, 40);
		mf.getContentPane().add(btnNewButton_3);
		
		
		mf.getContentPane().add(label);
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void infoBox(String infoMessage, String titleBar){
		JOptionPane.showMessageDialog(null, infoMessage, /*"InfoBox: " +*/ titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
	
}
