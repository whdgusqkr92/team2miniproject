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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import com.kkpjj.sysostory.controller.MemberController;
import com.kkpjj.sysostory.model.dto.MemberDTO;

public class StartScreen extends JFrame {

	private JFrame mf;
	private JPanel loginPanel;
	private MemberDTO memberDTO;

	
	
	public StartScreen() {
		mf = new JFrame();
		mf.setTitle("syso Story");
		mf.setSize(800, 600);
		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.getContentPane().setLayout(null);

		loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 800, 600);

		Image background = new ImageIcon("images/StartScreen.png").getImage().getScaledInstance(800, 600, 0);
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
		idText.setDocument((new JTextFieldLimit(12))); /* ID 입력 갯수 제한 */
		idText.setBounds(320, 230, 300, 50);						
		idText.setFont(new Font("굴림", Font.PLAIN, 30));

		JPasswordField pwdText = new JPasswordField(20);				/* pwd 입력란 */
		//		JTextField pwdText = new JTextField(12);
		pwdText.setFont(new Font("굴림", Font.PLAIN, 30));
		pwdText.setBounds(320, 300, 300, 50);
		

		JButton loginButton = new JButton("로그인");						/* 로그인 버튼 */
		loginButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		loginButton.setBounds(235, 390, 150, 50);
		loginButton.setLayout(null);

		loginButton.addActionListener(new ActionListener() {

			MemberController memController = new MemberController();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(idText.getText().length() > 0 && pwdText.getPassword().length > 0) {
					int result = memController.Login(idText, pwdText);

					if (result > 0) { // 로그인 성공시, 화면이동 처리 코드
						mf.setVisible(false); 
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
				new JoinPage();
				mf.setVisible(false);
			}
		});

		JButton findIdButton = new JButton("ID 찾기");					/* 아이디 찾기 버튼 */
		findIdButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		findIdButton.setBounds(265, 450, 120, 25);

		findIdButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FindIdView();
				mf.setVisible(false);
			}
		});

		JButton findPwdButton = new JButton("PWD 찾기");					/* 비밀번호 찾기 버튼 */
		findPwdButton.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		findPwdButton.setBounds(435, 450, 130, 25);

		findPwdButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FindPwdView();
				mf.setVisible(false);
			}
		});

		JButton ManagerButton = new JButton();							/* 관리자모드 접속 버튼 */
		ManagerButton.setBounds(755, 0, 40, 41);

		Image optionButton = new ImageIcon("images/optionbutton2.png").getImage().getScaledInstance(35, 35, 0);
		JLabel option = new JLabel(new ImageIcon(optionButton));		/* 관리자모드 접속 아이콘 */
		option.setLayout(null);
		option.setBounds(0, 0, 35, 35);
		
		

		ManagerButton.add(option);
		mf.getContentPane().add(ManagerButton);
		mf.getContentPane().add(idPanel);
		mf.getContentPane().add(idText);
		mf.getContentPane().add(pwdPanel);
		mf.getContentPane().add(pwdText);
		mf.getContentPane().add(loginButton);
		mf.getContentPane().add(joinButton);
		mf.getContentPane().add(findIdButton);
		mf.getContentPane().add(findPwdButton);
		mf.getContentPane().add(label);


		mf.setVisible(true);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);


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


