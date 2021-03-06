package com.kkpjj.sysostory.view.member;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

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

import com.kkpjj.sysostory.controller.LoginController;
import com.kkpjj.sysostory.controller.MemberController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MemberDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.admin.loginAdminView;

public class StartScreen extends JPanel {

	private JFrame mf;
	private JPanel loginPanel;
	private MemberDTO memberDTO;
	private String idText;

	
	
	public StartScreen(JFrame mf) {
		memberDTO = new MemberDTO();
		LoginController lc = new LoginController();
		lc.searchAllMember();
		loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 800, 600);
		loginPanel.setLayout(null);

		Image background = new ImageIcon("images/login/StartScreen.png").getImage().getScaledInstance(800, 600, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 800, 600);

		JPanel idPanel = new JPanel();									/* id 패널 */
		idPanel.setLayout(null);
		JLabel idLabel = new JLabel("ID");								/* id 라벨 */
		idLabel.setBounds(30, 5, 36, 42);
		idLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		idPanel.add(idLabel);
		idPanel.setBounds(200, 230, 100, 50);

		JPanel pwdPanel = new JPanel();									/* pwd 패널 */
		pwdPanel.setLayout(null);
		JLabel pwdLabel = new JLabel("PWD");							/* pwd 라벨 */
		pwdLabel.setFont(new Font("둥근모꼴", Font.PLAIN, 30));
		pwdLabel.setBounds(25, 5, 68, 36);
		pwdPanel.add(pwdLabel);
		pwdPanel.setBounds(200, 300, 100, 50);

		JTextField idText = new JTextField();/* id 입력란 */
		idText.setDocument((new JTextFieldLimit(12))); 
		idText.setBounds(320, 230, 300, 50);						
		idText.setFont(new Font("굴림", Font.PLAIN, 30));

		JPasswordField pwdText = new JPasswordField(20);				/* pwd 입력란 */
		pwdText.setFont(new Font("굴림", Font.PLAIN, 30));
		pwdText.setBounds(320, 300, 300, 50);
		

		JButton loginButton = new JButton("로그인");						/* 로그인 버튼 */
		loginButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		loginButton.setBounds(235, 390, 150, 50);
		loginButton.setLayout(null);

		loginButton.addActionListener(new ActionListener() {

			MemberController memController = new MemberController();
			LoginController loginController = new LoginController();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(idText.getText().length() > 0 && pwdText.getPassword().length > 0) {
					int result = memController.Login(idText, pwdText);
					
					if (result > 0) { // 로그인 성공시, 화면이동 처리 코드
						CharacterDTO charDTO = loginController.searchCharacterInfo(idText.getText());
						ViewUtil.changePanel(mf, loginPanel, new AfterLogin(mf, idText.getText(), memberDTO, charDTO));
					} else {
						infoBox("아이디와 패스워드를 확인하여주세요.", "message");
					}

				}else {
					System.out.print("아이디 및 패스워드를 입력하여 주세요.");
				}
			}
		});


		JButton joinButton = new JButton("회원가입");						/* 회원가입 버튼 */
		joinButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		joinButton.setBounds(435, 390, 150, 50);

		joinButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ViewUtil.changePanel(mf, loginPanel, new JoinPage(mf));
				
				
			}
		});

		JButton findIdButton = new JButton("ID 찾기");					/* 아이디 찾기 버튼 */
		findIdButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		findIdButton.setBounds(265, 450, 120, 25);

		findIdButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUtil.changePanel(mf, loginPanel, new FindIdView(mf));
			}
		});

		JButton findPwdButton = new JButton("PWD 찾기");					/* 비밀번호 찾기 버튼 */
		findPwdButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		findPwdButton.setBounds(435, 450, 130, 25);

		findPwdButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUtil.changePanel(mf, loginPanel, new FindPwdView(mf));
			}
		});

		JButton ManagerButton = new JButton();							/* 관리자모드 접속 버튼 */
		ManagerButton.setBounds(755, 0, 40, 41);
		
		ManagerButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUtil.changePanel(mf, loginPanel, new loginAdminView(mf));				
			}
		});

		Image optionButton = new ImageIcon("images/login/optionbutton2.png").getImage().getScaledInstance(35, 35, 0);
		JLabel option = new JLabel(new ImageIcon(optionButton));		/* 관리자모드 접속 아이콘 */
		option.setLayout(null);
		option.setBounds(0, 0, 35, 35);
		
		

		ManagerButton.add(option);
		loginPanel.add(ManagerButton);
		loginPanel.add(idPanel);
		loginPanel.add(idText);
		loginPanel.add(pwdPanel);
		loginPanel.add(pwdText);
		loginPanel.add(loginButton);
		loginPanel.add(joinButton);
		loginPanel.add(findIdButton);
		loginPanel.add(findPwdButton);
		loginPanel.add(label);
		mf.add(loginPanel);

	}

	/* 경고 다이얼로그 팝업 */
	public static void infoBox(String infoMessage, String titleBar){
		JOptionPane.showMessageDialog(null, infoMessage, /*"InfoBox: " +*/ titleBar, JOptionPane.INFORMATION_MESSAGE);
	}

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


