package com.kkpjj.sysostory.view.skill;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.CharacterController;
import com.kkpjj.sysostory.controller.SkillController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.model.dto.SkillDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.battle.BattlePage;
import com.kkpjj.sysostory.view.character.FieldCharacterBattle;
import com.kkpjj.sysostory.view.character.VillageView;

public class SkillList extends JPanel {

	private static final FieldCharacterBattle String = null;
	private JFrame mf;
	private JPanel mainPanel;
	private JPanel skilUpPanel;
	private JPanel skillListPanel;
	private JPanel skilExPanel;
	private JLabel mainLabel;
	private SkillController sc;
	private CharacterController cc;
	private InventoryDTO inventoryDTO;
	private CharacterDTO characterDTO;
	private SkillDTO skillDTO;
	private int skillCode;
	private int userNo;
	private int chrCode;
	private int skillOpenLv;
	private int chLv;
	private String skillScript;

	public SkillList(JFrame mf, CharacterDTO characterDTO, SkillDTO skillDTO) {

		this.mf = mf;
		this.characterDTO = characterDTO;
		this.skillDTO = skillDTO;

		this.chLv = characterDTO.getChrLevel();
		
//		int skillOpenLv = sc.selectSkillOpenLv(skillCode);			//넣으면 오류남 필요없을듯
//		String skillScript = sc.selectSkillScript(skillCode);

		mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 800, 600);

		skilUpPanel = new JPanel();
		skilUpPanel.setBounds(50, 20, 700, 30);

		skillListPanel = new JPanel();
		skillListPanel.setBounds(50, 100, 700, 230);

		skilExPanel = new JPanel();
		skilExPanel.setBounds(50, 320, 700, 75);

		Font font = new Font("궁서 보통", Font.BOLD, 30);
		Font font2 = new Font("궁서 보통", Font.BOLD, 13);

		this.sc = new SkillController();
		this.cc = new CharacterController();
		/*-----------------------------------이미지 선언부-----------------------------------------*/

		Image mainImage = new ImageIcon("images/skill/스킬 목록 배경.png").getImage().getScaledInstance(800, 600, 0);

		Image SkilUpImage = new ImageIcon("images/skill/스킬 상단배경.png").getImage().getScaledInstance(700, 30, 0);
		skilUpPanel.setLayout(null);

		Image SkilListImage = new ImageIcon("images/skill/스킬리스트.png").getImage().getScaledInstance(700, 230, 0);

		Image exImage = new ImageIcon("images/skill/스킬설명창.png").getImage().getScaledInstance(700, 75, 0);
		skilExPanel.setLayout(null);

		/*-------------------------------라벨 생성 ---------------------------------------*/

		mainLabel = new JLabel(new ImageIcon(mainImage));
		mainLabel.setBounds(0, 0, 800, 600);

		JLabel skilUpLabel = new JLabel(new ImageIcon(SkilUpImage));
		skilUpLabel.setBounds(50, 20, 700, 30);

		JLabel skilUpTextLabel = new JLabel("스킬 목록");
		skilUpTextLabel.setBounds(325, 20, 200, 30);

		JLabel skillListLabel = new JLabel(new ImageIcon(SkilListImage));
		skillListLabel.setBounds(45, 60, 700, 230);

		JLabel skilExLabel = new JLabel(new ImageIcon(exImage));
		skilExLabel.setBounds(45, 300, 700, 75);

		JLabel skilExTextLabel = new JLabel();
		skilExTextLabel.setBounds(0, 0, 700, 75);

		/*-------------------------------버튼 생성 ---------------------------------------*/

		JButton backButton = new JButton(new ImageIcon("images/skill/도망가기.png"));
		backButton.setBounds(745, 20, 35, 35);
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewUtil.changePanel(mf, mainPanel, new VillageView(mf, characterDTO)); // 배틀 페이지로 넘어가는거
				mainPanel.setVisible(false);

			}

		});
		JButton skillButton1 = new JButton(new ImageIcon("images/skill/flameCharge.png"));
		skillButton1.setBounds(65, 70, 140, 95);
		skillButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				skillCode = 1;
				int skillOpenLv = sc.selectSkillOpenLv(skillCode);
				String skillScript = sc.selectSkillScript(skillCode);
				if (skillOpenLv <= chLv) {
					skilExTextLabel.setText("OpenLv" + skillOpenLv + " flameCharge : " +  skillScript ); // 해금 부분
				} else {

					skilExTextLabel.setText("당신은 현재 " + chLv + "Lv입니다 OpenLv은 " + skillOpenLv +"입니다.");
				}
			}
		});

		JButton skillButton2 = new JButton(new ImageIcon("images/skill/fireFlash.png"));
		skillButton2.setBounds(240, 70, 140, 95);
		skillButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				skillCode = 2;
				int skillOpenLv = sc.selectSkillOpenLv(skillCode);
				String skillScript = sc.selectSkillScript(skillCode);
				if (skillOpenLv <= chLv) {
					skilExTextLabel.setText("OpenLv" + skillOpenLv + " fireFlash : " +  skillScript ); // 해금 부분
				} else {

					skilExTextLabel.setText("당신은 현재 " + chLv + "Lv입니다 OpenLv은 " + skillOpenLv +"입니다.");
				}
			}
		});

		JButton skillButton3 = new JButton(new ImageIcon("images/skill/turning.png"));
		skillButton3.setBounds(415, 70, 140, 95);
		skillButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				skillCode = 3;
				int skillOpenLv = sc.selectSkillOpenLv(skillCode);
				String skillScript = sc.selectSkillScript(skillCode);
				if (skillOpenLv <= chLv) {
					skilExTextLabel.setText("OpenLv" + skillOpenLv + " turning : " +  skillScript ); // 해금 부분
				} else {

					skilExTextLabel.setText("당신은 현재 " + chLv + "Lv입니다 OpenLv은 " + skillOpenLv +"입니다.");
				}
			}

		});

		JButton skillButton4 = new JButton(new ImageIcon("images/skill/fairyTurn.png"));
		skillButton4.setBounds(590, 70, 140, 95);
		skillButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				skillCode = 4;
				int skillOpenLv = sc.selectSkillOpenLv(skillCode);
				String skillScript = sc.selectSkillScript(skillCode);
				if (skillOpenLv <= chLv) {
					skilExTextLabel.setText("OpenLv" + skillOpenLv + " fairyTurn : " +  skillScript ); // 해금 부분
				} else {

					skilExTextLabel.setText("당신은 현재 " + chLv + "Lv입니다 OpenLv은 " + skillOpenLv +"입니다.");
				}
			}

		});
		JButton skillButton5 = new JButton(new ImageIcon("images/skill/flameVortex.png"));
		skillButton5.setBounds(65, 180, 140, 95);
		skillButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				skillCode = 5;
				int skillOpenLv = sc.selectSkillOpenLv(skillCode);
				String skillScript = sc.selectSkillScript(skillCode);
			
				
				if (skillOpenLv <= chLv) {
					skilExTextLabel.setText("OpenLv" + skillOpenLv + " flameVortex : " + skillScript ); // 해금 부분
				} else {

					skilExTextLabel.setText("당신은 현재 " + chLv + "Lv입니다 OpenLv은 " + skillOpenLv +"입니다.");
				}
			}

		});
		JButton skillButton6 = new JButton(new ImageIcon("images/skill/maDongSeok.png"));
		skillButton6.setBounds(240, 180, 140, 95);
		skillButton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				skillCode = 6;
				int skillOpenLv = sc.selectSkillOpenLv(skillCode);
				String skillScript = sc.selectSkillScript(skillCode);
				
				if (skillOpenLv <= chLv) {
					skilExTextLabel.setText("OpenLv" + skillOpenLv + " maDongSeok : " +  skillScript ); // 해금 부분
				} else {

					skilExTextLabel.setText("당신은 현재 " + chLv + "Lv입니다 OpenLv은 " + skillOpenLv +"입니다.");
				}
			}

		});
		JButton skillButton7 = new JButton(new ImageIcon("images/skill/hairLossBeam.png"));
		skillButton7.setBounds(415, 180, 140, 95);
		skillButton7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				skillCode = 7;
				int skillOpenLv = sc.selectSkillOpenLv(skillCode);
				String skillScript = sc.selectSkillScript(skillCode);
				
				if (skillOpenLv <= chLv) {
					skilExTextLabel.setText("OpenLv" + skillOpenLv + " hairLossBeam : " +  skillScript ); // 해금 부분
				} else {

					skilExTextLabel.setText("당신은 현재 " + chLv + "Lv입니다 OpenLv은 " + skillOpenLv +"입니다.");
				}
			}

		});
		JButton skillButton8 = new JButton(new ImageIcon("images/skill/wrathOfGods.png"));
		skillButton8.setBounds(590, 180, 140, 95);
		skillButton8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				skillCode = 8;
				int skillOpenLv = sc.selectSkillOpenLv(skillCode);
				String skillScript = sc.selectSkillScript(skillCode);
				if (skillOpenLv <= chLv) {
					skilExTextLabel.setText("OpenLv" + skillOpenLv + " wrathOfGods : " +  skillScript ); // 해금 부분
				} else {

					skilExTextLabel.setText("당신은 현재 " + chLv + "Lv입니다 OpenLv은 " + skillOpenLv +"입니다.");
				}
			}

		});

		/*-------------------------------버튼 넣어주는 곳---------------------------------------*/

		mainLabel.add(backButton);
		mainLabel.add(skillButton1);
		mainLabel.add(skillButton2);
		mainLabel.add(skillButton3);
		mainLabel.add(skillButton4);
		mainLabel.add(skillButton5);
		mainLabel.add(skillButton6);
		mainLabel.add(skillButton7);
		mainLabel.add(skillButton8);

		/*-------------------------------패널들 넣어주는 곳---------------------------------------*/
		skilUpTextLabel.setFont(font);
		skilExTextLabel.setFont(font2);

		/*-------------------------------폰트 넣어주는 곳---------------------------------------*/

		skilExLabel.add(skilExTextLabel);
		mainPanel.setLayout(null);

		mainLabel.add(skilUpTextLabel);
		mainLabel.add(skilUpLabel);
		mainLabel.add(skillListLabel);
		mainLabel.add(skilExLabel);

		mainPanel.add(mainLabel);

		mainPanel.add(skilUpPanel);
		mainPanel.add(skillListPanel);
		skillListPanel.setLayout(null);

		mainPanel.add(skilExPanel);

		mf.getContentPane().setLayout(null);

		mf.getContentPane().add(mainPanel);

	}
}

