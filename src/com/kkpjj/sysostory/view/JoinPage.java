package com.kkpjj.sysostory.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class JoinPage extends JFrame{

	private JFrame mf;
	private JTextField idText;
	private JTextField pwdText;
	private JTextField nameText;
	private JTextField emailText;
	
	public JoinPage() {	
		JFrame mf = new JFrame();
		mf.setSize(800, 600);
		mf.setLocationRelativeTo(null);
		mf.setTitle("syso Story");
		
		JPanel panel = new JPanel();
		
		Image background = new ImageIcon("images/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);
		mf.setLayout(null);
		
		JPanel idPanel = new JPanel();								/* ID 패널 */
		idPanel.setBounds(200, 100, 80, 45);
		idPanel.setBackground(Color.GRAY);
		mf.getContentPane().add(idPanel);
		idPanel.setLayout(null);
		
		JLabel idLabel = new JLabel("ID");							/* ID 라벨 */
		idLabel.setBounds(31, 12, 21, 24);
		idLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		idPanel.add(idLabel);
		
		idText = new JTextField();									/* ID 입력란 */
		idText.setBounds(300, 100, 300, 45);
		mf.getContentPane().add(idText);
		idText.setColumns(12);
		
		JPanel pwdPanel = new JPanel();								/* pwd 패널 */
		pwdPanel.setBounds(200, 180, 80, 45);
		pwdPanel.setBackground(Color.GRAY);
		mf.getContentPane().add(pwdPanel);
		pwdPanel.setLayout(null);
		
		JLabel pwdLabel = new JLabel("PWD");						/* pwd 라벨 */
		pwdLabel.setBounds(20, 10, 42, 24);
		pwdLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		pwdPanel.add(pwdLabel);
		
		pwdText = new JTextField();									/* pwd 입력란 */
		pwdText.setBounds(300, 180, 300, 45);
		mf.getContentPane().add(pwdText);
		pwdText.setColumns(12);
		
		JPanel namePanel = new JPanel();							/* name 패널 */
		namePanel.setBounds(200, 260, 80, 45);
		namePanel.setBackground(Color.GRAY);
		mf.getContentPane().add(namePanel);
		namePanel.setLayout(null);
		
		JLabel nameLabel = new JLabel("이름");						/* name 라벨 */
		nameLabel.setBounds(20, 10, 40, 24);
		nameLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		namePanel.add(nameLabel);
		
		nameText = new JTextField();								/* name 입력란 */
		nameText.setBounds(300, 260, 300, 45);
		mf.getContentPane().add(nameText);
		nameText.setColumns(5);
		
		JPanel emailPanel = new JPanel();							/* email 패널 */
		emailPanel.setBounds(200, 340, 80, 45);
		emailPanel.setBackground(Color.GRAY);
		mf.getContentPane().add(emailPanel);
		emailPanel.setLayout(null);
		
		JLabel emailLabel = new JLabel("이메일");						/* email 라벨 */
		emailLabel.setBounds(10, 10, 60, 24);
		emailLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		emailPanel.add(emailLabel);
		
		emailText = new JTextField();								/* email 입력란 */
		emailText.setBounds(300, 340, 300, 45);
		mf.getContentPane().add(emailText);
		emailText.setColumns(10);
		
		JButton btnNewButton = new JButton("회원가입");				/* 회원가입 버튼 */
		btnNewButton.setBounds(250, 410, 130, 50);
		mf.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("뒤로가기");				/* 뒤로가기 버튼 */
		btnNewButton_1.setBounds(420, 410, 130, 50);
		mf.getContentPane().add(btnNewButton_1);
		
		
		mf.add(label);
		
		
		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
