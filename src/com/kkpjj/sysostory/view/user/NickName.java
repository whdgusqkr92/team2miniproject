package com.kkpjj.sysostory.view.user;

import java.awt.Color;
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
import javax.swing.JTextField;

import com.kkpjj.sysostory.controller.LoginController;

public class NickName extends JFrame{

	public NickName() {

		JFrame mf = new JFrame();
		mf.setBounds(0, 0, 800,600);
		mf.setLocationRelativeTo(null);
		mf.setTitle("syso Story");
		mf.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		Image background = new ImageIcon("images/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);


		Image window = new ImageIcon("images/characterWindow.png").getImage().getScaledInstance(500, 200, 0);
		JLabel windowLabel = new JLabel(new ImageIcon(window));			/* 닉네임 창 */
		windowLabel.setBounds(150, 200, 500, 200);
		windowLabel.setLayout(null);
		mf.getContentPane().add(windowLabel);

		JLabel nickNameLabel = new JLabel("닉네임 : "); 					
		nickNameLabel.setForeground(Color.WHITE);						/* 닉네임 라벨 창 */
		nickNameLabel.setBounds(80, 65, 120, 25);
		windowLabel.add(nickNameLabel);
		nickNameLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));

		JTextField nicknameText = new JTextField(); 									
		nicknameText.setForeground(Color.BLACK);
		nicknameText.setFont(new Font("둥근모꼴", Font.PLAIN, 24));			/* 닉네임 입력 란 */
		nicknameText.setBounds(195, 54, 260, 50);
		windowLabel.add(nicknameText);
		nicknameText.setColumns(10);

		JButton createNicknameButton = new JButton("확인");						
		createNicknameButton.setForeground(Color.BLACK);						/* 닉네임 확인 버튼 */
		createNicknameButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		createNicknameButton.setBounds(175, 130, 150, 50);
		windowLabel.add(createNicknameButton);

		createNicknameButton.addActionListener(new ActionListener() {

			LoginController loginController = new LoginController();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(nicknameText.getText().length() > 0) {
					int result = loginController.createNickname(nicknameText);
						
					if(result > 0) {
						mf.setVisible(false);
					} else {
//						infoBox("중복된 닉네임으로 사용이 불가능합니다.", "중복검사");
					}
				}
			}
		});
		mf.getContentPane().add(label);


		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	/* 경고 다이얼로그 팝업 */
	public static void infoBox(String infoMessage, String titleBar){
		JOptionPane.showMessageDialog(null, infoMessage, /*"InfoBox: " +*/ titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
}
