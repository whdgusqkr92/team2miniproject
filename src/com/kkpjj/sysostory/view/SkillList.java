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

public class SkillList extends JFrame  {

	private JFrame mf;
	private JPanel mainPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;
	private JPanel skilUpPanel;
	private JPanel skilListPanel;
	private JPanel skilExPanel;

	TextField tf1;

	private JLabel skilExLabel1;

	public SkillList() {
		tf1 = new TextField();

		mf = new JFrame();
		mf.setSize(800, 600);
		mf.getContentPane().setLayout(null);
		mf.setTitle("sysoStory");

		mainPanel = new MainPanel();
		mainPanel.setBounds(0, 0, 800, 420);

		skilUpPanel = new JPanel();
		skilUpPanel.setBounds(50, 20, 700, 43);

		skilListPanel = new JPanel();
		skilListPanel.setBounds(50, 100, 700, 200);

		skilExPanel = new JPanel();
		skilExPanel.setBounds(50, 330, 700, 65);

		skilExLabel1 = new JLabel();
		skilExLabel1.setBounds(0, 0, 600, 50);

		statusPanel = new JPanel();
		statusPanel.setBounds(0, 420, 560, 150);

		mapPanel = new JPanel();
		mapPanel.setBounds(560, 420, 240, 150);

		mainPanel.add(skilUpPanel);
		mainPanel.add(skilListPanel);
		mainPanel.add(skilExPanel);

		mf.getContentPane().add(mainPanel);
		mf.getContentPane().add(statusPanel);
		mf.getContentPane().add(mapPanel);

//		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
//		JLabel label2 = new JLabel(new ImageIcon(mapBg));

		Image SkilExPanel = new ImageIcon("").getImage().getScaledInstance(700, 200, 0);	//스킬 화면 나오면 텍스트 출력 가림
		skilExPanel.setLayout(null);
		JLabel SkilExLabel = new JLabel(new ImageIcon(SkilExPanel));
		SkilExLabel.setBounds(0, 0, 700, 65);

		skilExPanel.add(SkilExLabel);
		
		JButton skilUpButton = new JButton(new ImageIcon("images/도망가기.png"));
		skilUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}

		});
		skilUpButton.setBounds(660, 5, 35, 35);
		skilUpPanel.add(skilUpButton);

		Image SkilUpPanel = new ImageIcon("images/스킬 상단부 배경1.png").getImage().getScaledInstance(700, 200, 0);
		skilUpPanel.setLayout(null);
		JLabel skilUpLabel1 = new JLabel(new ImageIcon(SkilUpPanel));
		skilUpLabel1.setBounds(0, 0, 700, 45);
		skilUpPanel.add(skilUpLabel1);

		JButton btnNewButton = new JButton(new ImageIcon("images/정권.png"));
		btnNewButton.setBounds(10, 35, 50, 50);
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
			
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText("정권 아프다");						//택스트 넘어가짐
//				skilExPanel.add(skilExLabel1);
//				

			}
		});

		JButton btnNewButton1 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton1.setBounds(80, 35, 50, 50);
		skilListPanel.add(btnNewButton1);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText("할퀴기 아프다");	
			}
		});

		JButton btnNewButton2 = new JButton(new ImageIcon("images/돌려차기.png"));
		btnNewButton2.setBounds(150, 35, 50, 50);
		skilListPanel.add(btnNewButton2);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText("돌려차기 아프다");
			}
		});

		JButton btnNewButton3 = new JButton(new ImageIcon("images/목 후리기.png"));
		btnNewButton3.setBounds(220, 35, 50, 50);
		skilListPanel.add(btnNewButton3);
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText("목후리기 아프다");
			}
		});

		JButton btnNewButton4 = new JButton(new ImageIcon("images/불 스킬Lv.1.png"));
		btnNewButton4.setBounds(290, 35, 50, 50);
		skilListPanel.add(btnNewButton4);
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
				
			}
		});

		JButton btnNewButton5 = new JButton(new ImageIcon("images/얼음 스킬Lv.1.png"));
		btnNewButton5.setBounds(360, 35, 50, 50);
		skilListPanel.add(btnNewButton5);
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton6 = new JButton(new ImageIcon("images/번개 스킬Lv.1.png"));
		btnNewButton6.setBounds(430, 35, 50, 50);
		skilListPanel.add(btnNewButton6);
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton7 = new JButton(new ImageIcon("images/불 스킬Lv.2.png"));
		btnNewButton7.setBounds(500, 35, 50, 50);
		skilListPanel.add(btnNewButton7);
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton8 = new JButton(new ImageIcon("images/번개 스킬Lv.2.png"));
		btnNewButton8.setBounds(570, 35, 50, 50);
		skilListPanel.add(btnNewButton8);
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton9 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton9.setBounds(640, 35, 50, 50);
		skilListPanel.add(btnNewButton9);
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton10 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton10.setBounds(10, 115, 50, 50);
		skilListPanel.add(btnNewButton10);
		btnNewButton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton11 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton11.setBounds(80, 115, 50, 50);
		skilListPanel.add(btnNewButton11);
		btnNewButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton12 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton12.setBounds(150, 115, 50, 50);
		skilListPanel.add(btnNewButton12);
		btnNewButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton13 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton13.setBounds(220, 115, 50, 50);
		skilListPanel.add(btnNewButton13);
		btnNewButton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton14 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton14.setBounds(290, 115, 50, 50);
		skilListPanel.add(btnNewButton14);
		btnNewButton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton15 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton15.setBounds(360, 115, 50, 50);
		skilListPanel.add(btnNewButton15);
		btnNewButton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton16 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton16.setBounds(430, 115, 50, 50);
		skilListPanel.add(btnNewButton16);
		btnNewButton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton17 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton17.setBounds(500, 115, 50, 50);
		skilListPanel.add(btnNewButton17);
		btnNewButton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton18 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton18.setBounds(570, 115, 50, 50);
		skilListPanel.add(btnNewButton18);
		btnNewButton18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		JButton btnNewButton19 = new JButton(new ImageIcon("images/할퀴기.png"));
		btnNewButton19.setBounds(640, 115, 50, 50);
		skilListPanel.add(btnNewButton19);
		btnNewButton19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skilExPanel.add(SkilExLabel);
				SkilExLabel.setText(" 아프다");
			}
		});

		Image SkilListPanel = new ImageIcon("images/스킬 상단부 배경1.png").getImage().getScaledInstance(700, 200, 0);
		skilListPanel.setLayout(null);
		JLabel SkilListLabel = new JLabel(new ImageIcon(SkilListPanel));
		SkilListLabel.setBounds(0, 0, 700, 200);
		skilListPanel.add(SkilListLabel);

		

		Image statusBg = new ImageIcon("images/status.png").getImage().getScaledInstance(560, 180, 0);
		statusPanel.setLayout(null);
		JLabel statusBglabel1 = new JLabel(new ImageIcon(statusBg));
		statusBglabel1.setBounds(0, 0, 560, 150);
		statusPanel.add(statusBglabel1);

		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
		mapPanel.setLayout(null);
		JLabel mapBglabel2 = new JLabel(new ImageIcon(mapBg));
		mapBglabel2.setBounds(0, 0, 240, 150);
		mapPanel.add(mapBglabel2);

		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);

		class MainPanel extends JPanel {

			Image bg = new ImageIcon("images/status.png").getImage().getScaledInstance(800, 420, 0);

			public MainPanel() {
				this.setLayout(null);
				this.setOpaque(false);

			}

			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
			}
		}

	}

	public static void main(String[] args) {
		new SkillList();
	}
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
