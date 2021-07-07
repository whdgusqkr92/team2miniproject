package com.kkpjj.sysostory.view.member;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import com.kkpjj.sysostory.controller.MemberController;
import com.kkpjj.sysostory.view.ViewUtil;

public class JoinPage extends JPanel{

	private JFrame mf;
	private JTextField idText;
	private JPasswordField pwdText;
	private JTextField nameText;
	private JTextField emailText;
	
	
	public JoinPage(JFrame mf) {	
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		panel.setLayout(null);
		
		Image background = new ImageIcon("images/login/StartScreen2.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);
		
		JPanel idPanel = new JPanel();								/* ID 패널 */
		idPanel.setBounds(200, 100, 80, 45);
		idPanel.setBackground(Color.LIGHT_GRAY);
		idPanel.setLayout(null);
		
		JLabel idLabel = new JLabel("ID");							/* ID 라벨 */
		idLabel.setBounds(27, 12, 25, 24);
		idLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		idPanel.add(idLabel);
		
		idText = new JTextField();									
		idText.setFont(new Font("둥근모꼴", Font.PLAIN, 20));			/* ID 입력란 */
		idText.setBounds(300, 100, 300, 45);
		idText.setColumns(12);
		
		JPanel pwdPanel = new JPanel();								/* pwd 패널 */
		pwdPanel.setBounds(200, 180, 80, 45);
		pwdPanel.setBackground(Color.LIGHT_GRAY);
		pwdPanel.setLayout(null);
		
		JLabel pwdLabel = new JLabel("PWD");						/* pwd 라벨 */
		pwdLabel.setBounds(20, 10, 42, 24);
		pwdLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		pwdPanel.add(pwdLabel);
		
		pwdText = new JPasswordField();	
		pwdText.setFont(new Font("둥근모꼴", Font.PLAIN, 20));			/* pwd 입력란 */
		pwdText.setBounds(300, 180, 300, 45);
		pwdText.setColumns(12);
		
		JPanel namePanel = new JPanel();							/* name 패널 */
		namePanel.setBounds(200, 260, 80, 45);
		namePanel.setBackground(Color.LIGHT_GRAY);
		namePanel.setLayout(null);
		
		JLabel nameLabel = new JLabel("이름");						/* name 라벨 */
		nameLabel.setBounds(15, 10, 50, 24);
		nameLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		namePanel.add(nameLabel);
		
		nameText = new JTextField();								
		nameText.setFont(new Font("둥근모꼴", Font.PLAIN, 20));		/* name 입력란 */
		nameText.setBounds(300, 260, 300, 45);
		nameText.setColumns(5);
		
		JPanel emailPanel = new JPanel();							/* email 패널 */
		emailPanel.setBounds(200, 340, 80, 45);
		emailPanel.setBackground(Color.LIGHT_GRAY);
		emailPanel.setLayout(null);
		
		JLabel emailLabel = new JLabel("이메일");						/* email 라벨 */
		emailLabel.setBounds(5, 10, 75, 24);
		emailLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		emailPanel.add(emailLabel);
		
		emailText = new JTextField();								
		emailText.setFont(new Font("둥근모꼴", Font.PLAIN, 20));		/* email 입력란 */
		emailText.setBounds(300, 340, 300, 45);
		emailText.setColumns(10);
		
		JButton joinButton = new JButton("회원가입");				
		joinButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));	/* 회원가입 버튼 */
		joinButton.setBounds(250, 410, 130, 50);
		
		MemberController memController = new MemberController();
		joinButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pwdString = new String(pwdText.getPassword());
				infoBox("회원가입을 완료 하셨습니다.", "회원가입 완료");
				ViewUtil.changePanel(mf, panel, new StartScreen(mf));
				
				Map<String,String> joinMap = new HashMap<>();
				joinMap.put("id", idText.getText());
				joinMap.put("pwd", pwdString);
				joinMap.put("name", nameText.getText());
				joinMap.put("email", emailText.getText());
				memController.InputMember(joinMap);
				
				
			}
		});
		
		JButton backButton = new JButton("뒤로가기");				
		backButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));		/* 뒤로가기 버튼 */
		backButton.setBounds(420, 410, 130, 50);
		
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ViewUtil.changePanel(mf, panel, new StartScreen(mf));
			}
		});
		
		panel.add(backButton);
		panel.add(joinButton);
		panel.add(emailPanel);
		panel.add(emailText);
		panel.add(namePanel);
		panel.add(nameText);
		panel.add(pwdPanel);
		panel.add(pwdText);
		panel.add(idPanel);
		panel.add(idText);
		panel.add(label);
		mf.add(panel);
		
		
		
	}
	/* JTextField 입력수 제한 */
	class JTextFieldLimit extends PlainDocument {
		private int limit;
		private boolean toUppercase = false;
		
		JTextFieldLimit(int limit) {
			super();
			this.limit = limit;
		}
		
		JTextFieldLimit(int limit, boolean upper) {
			super();
			this.limit = limit;
			this.toUppercase = upper;
		}
		
		public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
			if (str == null) {
				return;
			}
			
			if ( (getLength() + str.length()) <= limit) {
				if (toUppercase) {
					str = str.toUpperCase();
				}
				super.insertString(offset, str, attr);
			}
		}	
	}
	public static void infoBox(String infoMessage, String titleBar){
		JOptionPane.showMessageDialog(null, infoMessage, /*"InfoBox: " +*/ titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
}

