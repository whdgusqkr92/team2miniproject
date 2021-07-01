package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SkillList extends JPanel {
																	//따로 클래스 만들어서 상속 받아도 될듯?
	private JPanel SkillListPanel;					//  다 뜯어 고치자 집가서!!		
	private JPanel skilUpPanel;
	private JPanel skilListPanel;
	private JPanel skilExPanel;
	private JLabel skilExLabel1;
		
	
	



	public SkillList() {
		
		 MainFrame mf = new  MainFrame();

//		mf = new JFrame();							//메인 프레임
//		mf.setSize(800, 600);						//메인 프레임 사이즈
//		mf.getContentPane().setLayout(null);		//
//		mf.setTitle("sysoStory");					//메인 프레임 타이틀 이름

		SkillListPanel = new MainPanel();								//메인 패널  밑에 인터페이스 패널 빼고
		SkillListPanel.setBounds(0, 0, 800, 600);						//메인 패널 사이즈

		skilUpPanel = new JPanel();									//스킬 창 상단부 패널
		skilUpPanel.setBounds(50, 20, 700, 43);						//사이즈

		skilListPanel = new JPanel();								//스킬 목록 리스트 패널
		skilListPanel.setBounds(50, 100, 700, 300);

		skilExPanel = new JPanel();									//스킬 설명 패널 스킬 목록 버튼 누르면 스킬설명 패널에서 스킬 설명이 나오게 구현
		skilExPanel.setBounds(50, 420, 700, 100);

		skilExLabel1 = new JLabel();								//스킬 설명 라벨
		skilExLabel1.setBounds(0, 0, 700, 100);
		
		Image exImage = new ImageIcon("images/스킬설명창.png").getImage().getScaledInstance(700, 100, 0);
		skilExPanel.setLayout(null);
		JLabel skilexLabel = new JLabel(new ImageIcon(exImage));
		skilexLabel.setBounds(0, 0, 700, 100);
		skilExPanel.add(skilexLabel);
		
		
		
		
		
	
		
		
		
		skilExPanel.add(skilExLabel1);
		SkillListPanel.add(skilUpPanel);									//상단바 패널을 메인패널에 담아준다
		SkillListPanel.add(skilListPanel);								//스킬 목록리스트 패널을 메인 패널에 담아준다
		SkillListPanel.add(skilExPanel);									//스킬 설명 패널을 메인 패널에 담아준다
		
		
		mf.getContentPane().add(SkillListPanel);

//		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
//		JLabel label2 = new JLabel(new ImageIcon(mapBg));

//		Image SkilExPanel = new ImageIcon("").getImage().getScaledInstance(700, 200, 0);					//스킬 화면 나오면 텍스트 출력 가림
//		skilExPanel.setLayout(null);
		
		JButton skilUpButton = new JButton(new ImageIcon("images/도망가기.png"));
		skilUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}

		});
		skilUpButton.setBounds(660, 5, 35, 35);
		skilUpPanel.add(skilUpButton);

		Image SkilUpPanel1 = new ImageIcon("images/스킬 상단배경.png").getImage().getScaledInstance(700, 200, 0);
		skilUpPanel.setLayout(null);
		JLabel skilUpLabel11 = new JLabel(new ImageIcon(SkilUpPanel1));
		skilUpLabel11.setBounds(0, 0, 700, 45);
		skilUpPanel.add(skilUpLabel11);

		JButton btnNewButton = new JButton(new ImageIcon("images/정권.png"));
		btnNewButton.setBounds(11, 25, 50, 50);
		skilListPanel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				JLabel jlabel = new JLabel();
//				jlabel.setText("나도 아프다");
//				jlabel.setBounds(0, 0, 100, 100);
//				jlabel.setOpaque(true);
//				skilExPanel.add(jlabel);
//				skilExPanel.setVisible(true);
				
				

//				skilExPanel.setName("정권 아프다");
//				skilExPanel.(btnNewButton.setText("정권아프다!"));
//				btnNewButton.setText("정권아프다!");
			
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("정권 : 주먹으로 가격하는 정통파 공격기술로 그만큼 안정감이 좋다 ");						//택스트 넘어가짐
//				skilExPanel.add(skilExLabel1);
//				

			}
		});

		JButton btnNewButton1 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton1.setBounds(81, 25, 50, 50);
		skilListPanel.add(btnNewButton1);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("할퀴기 : 대상으로 지목된 적에게 얼굴을 할퀴어 공격합니다.");	
			}
		});

		JButton btnNewButton2 = new JButton(new ImageIcon("images/돌려차기.png"));
		btnNewButton2.setBounds(150, 25, 50, 50);
		skilListPanel.add(btnNewButton2);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("돌려차기 : 파워를 중시하는 동작 큰 차기공격 틈이 많은게 흠");
			}
		});

		JButton btnNewButton3 = new JButton(new ImageIcon("images/목 후리기.png"));
		btnNewButton3.setBounds(220, 25, 50, 50);
		skilListPanel.add(btnNewButton3);
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("목후리기 : 적에 목을 친다");
			}
		});

		JButton btnNewButton4 = new JButton(new ImageIcon("images/불 스킬Lv.1.png"));
		btnNewButton4.setBounds(290, 25, 50, 50);
		skilListPanel.add(btnNewButton4);
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("파이어볼 : 적에게 불을 날려 불태운다");
				
			}
		});

		JButton btnNewButton5 = new JButton(new ImageIcon("images/얼음 스킬Lv.1.png"));
		btnNewButton5.setBounds(360, 25, 50, 50);
		skilListPanel.add(btnNewButton5);
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("아이스볼 : 적에게 아이스볼을 날려 얼린다");
			}
		});

		JButton btnNewButton6 = new JButton(new ImageIcon("images/번개 스킬Lv.1.png"));
		btnNewButton6.setBounds(430, 25, 50, 50);
		skilListPanel.add(btnNewButton6);
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("라이트닝 볼트 : 적에게 라이트닝 볼트를 날려 감전 시킨다");
			}
		});

		JButton btnNewButton7 = new JButton(new ImageIcon("images/불 스킬Lv.2.png"));
		btnNewButton7.setBounds(499, 25, 50, 50);
		skilListPanel.add(btnNewButton7);
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("파이어볼Lv2 : 적에게 불을 날려 불태운다");
			}
		});

		JButton btnNewButton8 = new JButton(new ImageIcon("images/얼음 스킬Lv.2.png"));
		btnNewButton8.setBounds(569, 25, 50, 50);
		skilListPanel.add(btnNewButton8);
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("아이스볼Lv2 : 적에게 아이스볼을 날려 얼린다");
			}
		});

		JButton btnNewButton9 = new JButton(new ImageIcon("images/돌려차기.png"));
		btnNewButton9.setBounds(639, 25, 50, 50);
		skilListPanel.add(btnNewButton9);
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("다리후리기 : 서 있는 적을 넘어뜨리는 기술로 공중의 적은 효과가 없다");
			}
		});

		JButton btnNewButton10 = new JButton(new ImageIcon("images/스킬공격.png"));
		btnNewButton10.setBounds(11, 127, 50, 50);
		skilListPanel.add(btnNewButton10);
		btnNewButton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("호격권 : 기모아 사용하는 강력한 펀치공격 명중률이 높다");
			}
		});

		JButton btnNewButton11 = new JButton(new ImageIcon("images/스킬공격.png"));
		btnNewButton11.setBounds(81, 127, 50, 50);
		skilListPanel.add(btnNewButton11);
		btnNewButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("맹호비상각 : 잽싸게 점프해서 그대로 차기 공격 명중률은 낮다");
			}
		});

		JButton btnNewButton12 = new JButton(new ImageIcon("images/스킬공격.png"));
		btnNewButton12.setBounds(151, 127, 50, 50);
		skilListPanel.add(btnNewButton12);
		btnNewButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("폭전축 : 공중에서 호를 그리며 회전차기 틈은 많지만 효과적인 공격이다");
			}
		});

		JButton btnNewButton13 = new JButton(new ImageIcon("images/스킬공격.png"));
		btnNewButton13.setBounds(220, 127, 50, 50);
		skilListPanel.add(btnNewButton13);
		btnNewButton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("맹호스폐셜 : 때리고 차는 연속 공격기이다");
			}
		});

		JButton btnNewButton14 = new JButton(new ImageIcon("images/스킬공격.png"));
		btnNewButton14.setBounds(290, 127, 50, 50);
		skilListPanel.add(btnNewButton14);
		btnNewButton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("비기 맹호광파참 : 신성한 빛의 검으로 악을 멸하는 기술 파괴력이 강력하다");
			}
		});

		JButton btnNewButton15 = new JButton(new ImageIcon("images/스킬공격2.png"));
		btnNewButton15.setBounds(360, 127, 50, 50);
		skilListPanel.add(btnNewButton15);
		btnNewButton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("맹호난무 : 잽싸게 여러번 적 적체를 공격해 충격을 주는 기술");
			}
		});

		JButton btnNewButton16 = new JButton(new ImageIcon("images/스킬공격2.png"));
		btnNewButton16.setBounds(430, 127, 50, 50);
		skilListPanel.add(btnNewButton16);
		btnNewButton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("맹호의 울부짖음 : 우렁찬 소리로 위협해 주눅시키는 전체공격기 동물에게 효과가 크다");
			}
		});

		JButton btnNewButton17 = new JButton(new ImageIcon("images/스킬공격2.png"));
		btnNewButton17.setBounds(499, 127, 50, 50);
		skilListPanel.add(btnNewButton17);
		btnNewButton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("호포권 : 기를 모은 뢰격탄을 전 전체에게 공격! 공격속도는 느리다");
			}
		});

		JButton btnNewButton18 = new JButton(new ImageIcon("images/스킬공격2.png"));
		btnNewButton18.setBounds(569, 127, 50, 50);
		skilListPanel.add(btnNewButton18);
		btnNewButton18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("맹호룬룬권 : 가벼운 스텝으로 가뿐히 적 전체를 공격해 큰 데미지를 준다");
			}
		});

		JButton btnNewButton19 = new JButton(new ImageIcon("images/스킬공격2.png"));
		btnNewButton19.setBounds(639, 127, 50, 50);
		skilListPanel.add(btnNewButton19);
		btnNewButton19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(skilexLabel);
				skilExLabel1.setText("비기 맹호유성각 : 계속 별똥별을 뿌리며 연속으로 날아차는 기술");
			}
		});

		Image SkilListPanel = new ImageIcon("images/스킬목록.png").getImage().getScaledInstance(700, 300, 0);
		skilListPanel.setLayout(null);
		JLabel SkilListLabel = new JLabel(new ImageIcon(SkilListPanel));
		SkilListLabel.setBounds(0, 0, 700, 300);
		skilListPanel.add(SkilListLabel);

		

//		Image statusBg = new ImageIcon("images/status.png").getImage().getScaledInstance(560, 180, 0);
//		statusPanel.setLayout(null);
//		JLabel statusBglabel1 = new JLabel(new ImageIcon(statusBg));
//		statusBglabel1.setBounds(0, 0, 560, 150);
//		statusPanel.add(statusBglabel1);
//
//		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
//		mapPanel.setLayout(null);
//		JLabel mapBglabel2 = new JLabel(new ImageIcon(mapBg));
//		mapBglabel2.setBounds(0, 0, 240, 150);
//		mapPanel.add(mapBglabel2);

//		mf.setLocationRelativeTo(null);
//		mf.setResizable(false);
//		mf.setVisible(true);
//		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		
	}

	class MainPanel extends JPanel {

		Image bg = new ImageIcon("images/스킬 목록 배경.png").getImage().getScaledInstance(800, 600, 0);

		public MainPanel() {
			this.setLayout(null);
			this.setOpaque(false);

		}

		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
		}
	}
//	public static void main(String[] args) {
//		new SkillList();
//	}
}

//	class skilUpPanel extends JPanel {
//		Image sp = new ImageIcon("images/스킬 상단부 배경.png").getImage().getScaledInstance(500, 600, 0);
//
//		public skilUpPanel() {
//			this.setLayout(null);
//			this.setOpaque(false);
//		}
//
//		@Override
//		public void paintComponent(Graphics g) {
//			g.drawImage(sp, 500, 500, getWidth(), getHeight(), this);
//		}
//	}

////캐릭터 이미지 추가, 레이아웃 설정
//public class skilListPanel extends JPanel {
//
//		Image chr = new ImageIcon("images/battle_chr.png").getImage();
//		
//		public skilListPanel() {
//			this.setLayout(null);
//			this.setOpaque(false);
//		}
//		
//		@Override
//		public void paintComponent(Graphics g) {
//			g.drawImage(chr, 0, 0, getWidth(), getHeight(), this);
//		}
//	}
