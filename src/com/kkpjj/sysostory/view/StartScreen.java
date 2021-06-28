package com.kkpjj.sysostory.view;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StartScreen extends JFrame {
	
	private JFrame mf;
	private JPanel loginPanel;

	
	public StartScreen() {
		mf = new JFrame();
		mf.setTitle("syso Story");
		mf.setSize(800, 600);
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setLayout(null);
		
		loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 800, 600);
		
		Image background = new ImageIcon("images/StartScreen.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);

		JPanel idPanel = new JPanel();						/* id 패널 */
		idPanel.setLayout(null);
		JLabel idLabel = new JLabel("ID");					/* id 라벨 */
		idLabel.setBounds(30, 10, 36, 42);
		idLabel.setFont(new Font("굴림", Font.PLAIN, 36));
		idPanel.add(idLabel);
		idPanel.setBounds(200, 230, 100, 50);
		
		JPanel pwdPanel = new JPanel();						/* pwd 패널 */
		pwdPanel.setLayout(null);
		JLabel pwdLabel = new JLabel("PWD");				/* pwd 라벨 */
		pwdLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		pwdLabel.setBounds(17, 8, 68, 36);
		pwdPanel.add(pwdLabel);
		pwdPanel.setBounds(200, 300, 100, 50);
		
		JTextField idText = new JTextField(12);				/* id 입력란 */
		idText.setFont(new Font("굴림", Font.PLAIN, 30));
		idText.setBounds(320, 230, 300, 50);
		
		JPasswordField pwdText = new JPasswordField(20);	/* pwd 입력란 */
		pwdText.setFont(new Font("굴림", Font.PLAIN, 30));
		pwdText.setBounds(320, 300, 300, 50);
		
		JPanel idTextPanel = new JPanel();
		idTextPanel.setBounds(320, 230, 300, 50);
		
		JPanel pwdTextPanel = new JPanel();
		pwdTextPanel.setBounds(320, 300, 300, 50);
		
				
		loginPanel.add(label);
		loginPanel.add(idText);
		loginPanel.add(pwdText);
		
				
		mf.getContentPane().add(idTextPanel);
		mf.getContentPane().add(pwdTextPanel);
		mf.getContentPane().add(idPanel);
		mf.getContentPane().add(pwdPanel);
		mf.getContentPane().add(loginPanel);
		
		JButton loginButton = new JButton("로그인");
		loginButton.setBounds(235, 390, 150, 50);
		loginPanel.add(loginButton);
		
		JButton joinButton = new JButton("회원가입");
		joinButton.setBounds(435, 390, 150, 50);
		loginPanel.add(joinButton);
		
		JButton btnNewButton = new JButton("ID 찾기");
		btnNewButton.setBounds(285, 450, 100, 25);
		loginPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PWD 찾기");
		btnNewButton_1.setBounds(435, 450, 100, 25);
		loginPanel.add(btnNewButton_1);
		
		
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}
