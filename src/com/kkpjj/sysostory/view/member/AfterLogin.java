package com.kkpjj.sysostory.view.member;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import com.kkpjj.sysostory.controller.LoginController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MemberDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.character.VillageView;
import com.kkpjj.sysostory.view.user.NickName;

public class AfterLogin extends JPanel{
	private JFrame mf;
	private String idText;
	private MemberDTO memberDTO;
	private CharacterDTO characterDTO;
	
	public AfterLogin(JFrame mf, String idText, MemberDTO memberDTO, CharacterDTO charDTO) {
		this.memberDTO = memberDTO;
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		panel.setLayout(null);
		
		Image background = new ImageIcon("images/login/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);
		
		
		JButton playNewButton = new JButton("새로 하기");				/* 새로 하기 버튼 */
		playNewButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		playNewButton.setBounds(200, 130, 400, 80);
		
		playNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUtil.changePanel(mf, panel, new NickName(mf, idText, memberDTO));
				infoBox("닉네임을 입력해주세요.","닉네임 생성");
			}
		});
		
		JButton palyLoadButton = new JButton("이어 하기");				/* 이어 하기 버튼 */
		palyLoadButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		palyLoadButton.setBounds(200, 240, 400, 80);
		
		palyLoadButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				ViewUtil.changePanel(mf, panel, new VillageView(mf, charDTO));
			}
		});

		

		JButton logoutButton = new JButton("로그아웃");				/* 로그아웃 버튼 */
		logoutButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		logoutButton.setBounds(275, 360, 250, 60);
		
		logoutButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				ViewUtil.changePanel(mf, panel, new StartScreen(mf));
				infoBox("로그아웃 되었습니다.","로그아웃");
				
			}
		});
		
		JButton resignButton = new JButton("회원탈퇴");				/* 회원탈퇴 버튼 */
		resignButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		resignButton.setBounds(340, 480, 130, 40);
		
		
		panel.add(resignButton);
		panel.add(logoutButton);
		panel.add(palyLoadButton);
		panel.add(playNewButton);
		panel.add(label);
		mf.add(panel);
		
	}
	public static void infoBox(String infoMessage, String titleBar){
		JOptionPane.showMessageDialog(null, infoMessage, /*"InfoBox: " +*/ titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
	
}
