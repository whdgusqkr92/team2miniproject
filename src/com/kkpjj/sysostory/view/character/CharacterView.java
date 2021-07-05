package com.kkpjj.sysostory.view.character;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kkpjj.sysostory.controller.CharacterController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.view.ViewUtil;

public class CharacterView extends JPanel implements KeyListener{
	
	private JFrame mf;
	private ImageIcon status = null;
	private ImageIcon map = null;
	private ImageIcon characterWindow = null;
	private ImageIcon sysoIcon = null;
	private ImageIcon exit = null;
	private CharacterDTO chrDTO;
	private CharacterController cc;
	
	private JPanel chrPanel;

	private JTextField tf;
	
	public CharacterView(JFrame mf, CharacterDTO chrDTO) {
		
		this.mf = mf;
		this.chrDTO = chrDTO;
		
		cc = new CharacterController();
		
		/* -------------- 캐릭터 정보 테스트 ----------------- */
		
		int userNo = 1;		// 사용자 번호
		int chrCode = 2;	// 캐릭터 코드
		
		chrDTO.setChrCode(chrCode);
		chrDTO.setUserNo(userNo);
		
//		System.out.println(cc.selectCharacterInfo(chrDTO.getChrCode(), chrDTO.getUserNo()));

		CharacterDTO chr = cc.selectCharacterInfo(chrDTO.getChrCode(), chrDTO.getUserNo());
		
//		System.out.println("공격력 : " + chr.getChrAtt());
//		System.out.println("방어력 : " + chr.getChrDef());
//		System.out.println("닉네임 : " + chr.getChrName());
		
		// ------------------------------------------------------------
		
		
		// 캐릭터 정보 패널 선언 및 생성
		chrPanel = new JPanel();
		chrPanel.setBounds(0, 0, 800, 420);
		mf.getContentPane().add(chrPanel);
		chrPanel.setLayout(null);
		
		// 닉네임 닉네임 라벨 생성
		JLabel nickname = new JLabel();
		nickname.setBounds(50, 50, 200, 50);
		nickname.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		nickname.setText(chr.getChrName());
		
		// 장착한 무기 라벨 생성
		// 장착한 방어구 라벨 생성
		// 레벨 라벨 생성
		// 현재 HP 라벨 생성
		// 최대 HP 라벨 생성
		// 현재 MP 라벨 생성
		// 최대 MP 라벨 생성
		// 현재 경험치 라벨 생성
		// 레벨업 조건 경험치 라벨 생성
		// 공격력 라벨 생성
		// 방어력 라벨 생성
		// 칭호 라벨 생성
		
		
		chrPanel.add(nickname);

		
		
		
		
//		JLabel label = new JLabel();
//		label.setBounds(50, 50, 700, 300);
//		label.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
//		
//		label.setText(cc.selectCharacterInfo(chrDTO.getChrCode(), chrDTO.getUserNo()));
		
		
//		System.out.println(chrDTO.getChrLevel());
//		System.out.println(chrDTO.getChrHp());
//		System.out.println(chrDTO.getChrMp());
		
		
		// 캐릭터 정보 창, 나가기 버튼
//		JPanel charInfoPanel = new JPanel();
//		charInfoPanel.setBounds(0, 0, 800, 410);
//		mf.getContentPane().add(charInfoPanel);
//		charInfoPanel.setLayout(null);
//
//		JPanel characterInfo = new JPanel();
//		characterInfo.setBounds(12, 0, 780, 410);
//		charInfoPanel.add(characterInfo);
//		
//		JPanel characterProfile = new JPanel();
//		characterProfile.setBounds(88, 50, 136, 136);
//		charInfoPanel.add(characterProfile);
//		
//		Image itemWindowBg = new ImageIcon("images/character/characterWindow.png").getImage();
//		JLabel label3= new JLabel(new ImageIcon(itemWindowBg));
//		label3.setBounds(398, 10, 50, 50);
//		charInfoPanel.add(label3);
//		
//		// 캐릭터 이미지
//		status = new ImageIcon("images/character/status.png");
//		map = new ImageIcon("images/character/map.png");
//		characterWindow = new ImageIcon("images/character/characterWindow.png");
//		sysoIcon = new ImageIcon("images/character/sysoIcon.png");
//		exit = new ImageIcon("images/character/exit.png");
//		
//		
//		// 캐릭터 상태
//		JPanel panel1 = new JPanel() {
//			
//			public void paintComponent(Graphics g) {
//				g.drawImage(status.getImage(), 0, 0, 560, 180, null);  // 이미지 원본 크기
//			}
//		};
//		
//		panel1.setBounds(0, 420, 560, 180);
//		
//		// 캐릭터 맵 정보
//		JPanel panel2 = new JPanel() {
//			
//			public void paintComponent(Graphics g) {
//				g.drawImage(map.getImage(), 0, 0, 240, 180, null);
//			}
//		};
//		
//		panel2.setBounds(560, 420, 240, 180);
//		
//		// 캐릭터 정보창
//		JPanel panel3 = new JPanel() {
//			
//			public void paintComponent(Graphics g) {
//				g.drawImage(characterWindow.getImage(), 0, 0, 800, 410, null);
//			}
//		};
//		
//		panel3.setBounds(12, 0, 780, 410);
//		
//		// 나가기 버튼
//		JButton exitButton = new JButton();
//		exitButton.setBounds(720, 15, 50, 50);
//		exitButton.setIcon(new ImageIcon("images/character/exit.png"));
//		mf.add(exitButton);
//		
//		
//		exitButton.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ViewUtil.changePanel(mf, new CharacterView(mf), new VillageView(mf));
//				exitButton.setVisible(false);
//			}
//		});
		
		
//		
//		
//		// 캐릭터 프로필사진
//		JPanel panel4 = new JPanel() {
//			
//			public void paintComponent(Graphics g) {
//				g.drawImage(sysoIcon.getImage(), 0, 0, 136, 136, null);
//			}
//		};
//		
//		panel4.setBounds(88, 50, 136, 136);
//		
//		mf.add(panel1);
//		mf.add(panel2);
//		mf.add(panel4);
//		mf.add(panel3);
//		mf.setVisible(true);
//		mf.setResizable(false);
	}
	
	public void display(String s, KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		// 키보드 이벤트 출력값 확인용
		System.out.println("CharacterView에서 키보드 입력값 : " + keyCode);
		
		if(e.getKeyCode() == 69) {
			ViewUtil.changePanel(mf, this, new VillageView(mf, chrDTO));
			this.setVisible(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		this.display("keyPressed", e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
