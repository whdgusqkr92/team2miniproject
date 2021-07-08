package com.kkpjj.sysostory.view.character;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.model.dto.SkillDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.battle.BattlePage;
import com.kkpjj.sysostory.view.boss.FinalBossEvent;
import com.kkpjj.sysostory.view.boss.MiddleBossEvent;
import com.kkpjj.sysostory.view.inventory.InventoryView;
import com.kkpjj.sysostory.view.skill.SkillList;

public class FieldCharacterBattle extends JPanel  {
	
	/*---------------------------전역 변수--------------------------------*/
	private JFrame mf;								
	private JPanel mainPanel;
	private JPanel fieldJPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;
	private JLabel fieldJLabel;
	private Image Image;
	private JPanel chPanel;
	private JLabel chLabel;
	private Image chImage;
	private JLabel monsterLabel;
	

	private CharacterDTO characterDTO;
	private InventoryDTO inventoryDTO;
	
	private SkillDTO skillDTO;

	public FieldCharacterBattle(JFrame mf, InventoryDTO inventoryDTO, CharacterDTO characterDTO) {

		this.mf = mf;
	
		this.mainPanel = this;

		this.characterDTO = characterDTO;
		this.inventoryDTO = inventoryDTO;

		mainPanel = new JPanel(); // 메인 패널
		mainPanel.setBounds(0, 0, 800, 600); // 메인 패널 사이즈
		mainPanel.setLayout(null);

		this.fieldJPanel = new JPanel(); // 필드 패널
		fieldJPanel.setBounds(0, 0, 800, 400); // 필드 패널 사이즈
		fieldJPanel.setLayout(null);

		Image = new ImageIcon("images/field/Field1.png").getImage().getScaledInstance(800, 400, 0); // 필드 이미지 생성해서 넣어준거
		chImage = new ImageIcon("images/battle/battle_chr.png").getImage().getScaledInstance(100, 100, 0);

		fieldJLabel = new JLabel(new ImageIcon(Image)); // 필드 이미지 필드 라벨에 넣어준거
		fieldJLabel.setBounds(0, 0, 800, 400);
		//		fieldJPanel.setLayout(null);
		chLabel = new JLabel(new ImageIcon(chImage)); // 필드 캐릭터 필드 라벨에 넣기
		chLabel.setBounds(100, 150, 100, 100);

		

		fieldJPanel.add(chLabel);
		fieldJPanel.add(fieldJLabel); // 필드 라벨을 필드 패널에 넣어준거
		mainPanel.add(fieldJPanel); // 필드 패널을 메인패널에 넣어준거
		

		/*-------------------------------버튼 생성 ---------------------------------------*/

		JButton setJbutton = new JButton(new ImageIcon("images/skill/설정.png")); // 설정 버튼 생성과 동시에 이미지넣기
		setJbutton.setBounds(750, 1, 35, 35);
		fieldJLabel.add(setJbutton); // 필드 라벨에 넣어주기

		JButton inventoryButton = new JButton(new ImageIcon("images/skill/가방.png")); // 인벤토리 버튼
		inventoryButton.setBounds(360, 1, 35, 35);
		fieldJLabel.add(inventoryButton);

		JButton skillButton = new JButton(new ImageIcon("images/skill/스킬북1.png"));  //스킬 버튼
		skillButton.setBounds(395, 1, 35, 35);
		fieldJLabel.add(skillButton);

		JButton AchievementsButton = new JButton(new ImageIcon("images/skill/업적.png")); // 업적 버튼
		AchievementsButton.setBounds(430, 1, 35, 35);
		fieldJLabel.add(AchievementsButton);
		/*-------------------------------라벨 생성 ---------------------------------------*/

		JLabel monsterLabel = new JLabel(new ImageIcon("images/monster.png")); // 버튼으로 만드려고햇는데 버튼은 이미지가 버튼 이미지까지 나와서 라벨에
		// 이미지 넣음
		monsterLabel.setBounds(700, 315, 60, 60);
		fieldJLabel.add(monsterLabel);

		JLabel monsterLabel2 = new JLabel(new ImageIcon("images/skill/monster2.png")); // 버튼으로 만드려고햇는데 버튼은 이미지가 버튼 이미지까지 나와서
		// 라벨에 이미지 넣음
		monsterLabel2.setBounds(500, 280, 110, 110);
		fieldJLabel.add(monsterLabel2);

		JLabel monsterLabel3 = new JLabel(new ImageIcon("images/monster3.png")); // 버튼으로 만드려고햇는데 버튼은 이미지가 버튼 이미지까지 나와서
		// 라벨에 이미지 넣음
		monsterLabel3.setBounds(387, 50, 60, 60);
		fieldJLabel.add(monsterLabel3);

		Image villageImage = new ImageIcon("images/skill/뒤패널로이동.png").getImage().getScaledInstance(50, 50, 0);

		JLabel villageLabel = new JLabel(new ImageIcon(villageImage));					//뒤로가기 라벨
		villageLabel.setBounds(0, 170, 60, 60);
		fieldJLabel.add(villageLabel);

		mf.getContentPane().add(mainPanel);

		/*-------------------------------라벨,버튼에 마우스 리스너 이벤트 생성 ---------------------------------------*/


		//		tf = new JTextField();
		//		this.add(tf);
		// 메인 패널을 메인 프레임에 넣어준거
		//		mf.getContentPane().add(monsterLabel2);
		monsterLabel.addMouseListener(new Monster1()); // 라벨에 마우스 리스너 이벤트 생성
		monsterLabel2.addMouseListener(new midBossMonster()); // 라벨에 마우스 리스너 이벤트 생성
		monsterLabel3.addMouseListener(new FinalBossMonster()); // 라벨에 마우스 리스너 이벤트 생성
		setJbutton.addMouseListener(new SetChange());									//설정창 연결 
		villageLabel.addMouseListener(new VillageChange());								//백 버튼하면 마을로
				inventoryButton.addMouseListener(new InventoryChange());						// 인벤토리 연결 아직 안됨
				skillButton.addMouseListener(new SkillChange());
		//		AchievementsButton.addMouseListener(new AchievementsChange());
		//		fieldJLabel.addKeyListener(new SkillChange());

	}

	/*-------------------------------버튼 이벤트 ---------------------------------------*/

	private class Monster1 extends MouseAdapter { // 마우스 클릭시 전투 패널로 넘어감

		@Override
		public void mouseReleased(MouseEvent e) {
			ViewUtil.changePanel(mf, fieldJPanel, new BattlePage(mf, inventoryDTO, characterDTO)); // 배틀 페이지로 넘어가는거
			mainPanel.setVisible(false);

		}
	}

	private class midBossMonster extends MouseAdapter { // 마우스 클릭시 전투 패널로 넘어감

		@Override
		public void mouseReleased(MouseEvent e) {
			ViewUtil.changePanel(mf, fieldJPanel, new MiddleBossEvent(mf,characterDTO, inventoryDTO)); // 배틀 페이지로 넘어가는거
			mainPanel.setVisible(false);

		}
	}

	private class FinalBossMonster extends MouseAdapter { // 마우스 클릭시 전투 패널로 넘어감

		@Override
		public void mouseReleased(MouseEvent e) {
			ViewUtil.changePanel(mf, fieldJPanel, new FinalBossEvent(mf, characterDTO, inventoryDTO)); // 배틀 페이지로 넘어가는거
			mainPanel.setVisible(false);

		}
	}

	private class SetChange extends MouseAdapter {

		@Override
		public void mouseReleased(MouseEvent e) {
			ViewUtil.changePanel(mf, fieldJPanel, new SettingPanel(mf));						//설정 창 만들면 넣기!!
			mainPanel.setVisible(false);

		}
	}

	private class VillageChange extends MouseAdapter { // 마을 라벨 누르면 마을로 패널 변경

		@Override
		public void mouseReleased(MouseEvent e) {
			ViewUtil.changePanel(mf, fieldJPanel, new VillageView(mf, characterDTO));
			mainPanel.setVisible(false);
			
		}
	}
	private class SkillChange extends MouseAdapter { // 마을 라벨 누르면 마을로 패널 변경

		@Override
		public void mouseReleased(MouseEvent e) {
			ViewUtil.changePanel(mf, fieldJPanel, new SkillList(mf, characterDTO , skillDTO));
			mainPanel.setVisible(false);
			
			
		}
	}

	
		private class InventoryChange extends MouseAdapter { 									// //인벤토리 버튼
	
			@Override																					
			public void mouseReleased(MouseEvent e) {								
				ViewUtil.changePanel(mf, fieldJPanel, new InventoryView(mf, inventoryDTO, characterDTO));						//설정 페이지 넘어가는거 아직 설정 안함 new 부분 수정해야함
				mainPanel.setVisible(false);
				
			}
		}

}
	//	private class AchievementsChange extends MouseAdapter { // 업적 버튼
	//
	//		@Override
	//		public void mouseReleased(MouseEvent e) {
	//			ViewUtil.changePanel(mf, fieldJPanel, new Achievements(mf)); // 설정 페이지 넘어가는거 아직 설정 안함 new 부분 수정해야함
	//			mainPanel.setVisible(false);
	//
	//		}
	//	}

	

	

