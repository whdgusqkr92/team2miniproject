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
import com.kkpjj.sysostory.model.dto.MemberDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.story.OpMainPage;

public class NickName extends JPanel{
	
	private JFrame mf;
	private MemberDTO memberDTO;
	
	public NickName(JFrame mf, String idText, MemberDTO memberDTO) {
		this.memberDTO = memberDTO;
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		panel.setLayout(null);
		
		Image background = new ImageIcon("images/login/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);

		Image window = new ImageIcon("images/character/characterWindow.png").getImage().getScaledInstance(500, 200, 0);
		JLabel windowLabel = new JLabel(new ImageIcon(window));			/* 닉네임 창 */
		windowLabel.setBounds(150, 200, 500, 200);
		windowLabel.setLayout(null);
		
		JLabel nickNameLabel = new JLabel("닉네임 : "); 					
		nickNameLabel.setForeground(Color.WHITE);						/* 닉네임 라벨 창 */
		nickNameLabel.setBounds(215, 249, 120, 25);
		nickNameLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));

		JTextField nicknameText = new JTextField(); 									
		nicknameText.setForeground(Color.BLACK);
		nicknameText.setFont(new Font("둥근모꼴", Font.PLAIN, 24));			/* 닉네임 입력 란 */
		nicknameText.setBounds(330, 238, 260, 50);
		nicknameText.setColumns(10);

		JButton createNicknameButton = new JButton("확인");						
		createNicknameButton.setForeground(Color.BLACK);						/* 닉네임 확인 버튼 */
		createNicknameButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		createNicknameButton.setBounds(310, 314, 150, 50);
		
		createNicknameButton.addActionListener(new ActionListener() {
			
			LoginController loginController = new LoginController();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(nicknameText.getText().length() > 0) {
					int result = loginController.createNickname(nicknameText.getText(),idText, memberDTO);
					System.out.println("아이디퉥스트" + idText);
//						System.out.println(nicknameText.getText());
					if(result > 0) {
						ViewUtil.changePanel(mf, panel, new OpMainPage(mf, idText, memberDTO));
					} else {
//						infoBox("중복된 닉네임으로 사용이 불가능합니다.", "중복검사");
					} 
				}
			}
		});
		

	
		panel.add(createNicknameButton);
		panel.add(nicknameText);
		panel.add(nickNameLabel);
		label.add(windowLabel);
		panel.add(label);
		mf.getContentPane().add(panel);
		

		

	}
	/* 경고 다이얼로그 팝업 */
	public static void infoBox(String infoMessage, String titleBar){
		JOptionPane.showMessageDialog(null, infoMessage, /*"InfoBox: " +*/ titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
}
