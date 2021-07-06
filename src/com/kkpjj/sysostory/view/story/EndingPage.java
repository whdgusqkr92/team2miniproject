package com.kkpjj.sysostory.view.story;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.StoryController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.StoryDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.character.FieldCharacterBattle;
import com.kkpjj.sysostory.view.character.VillageView;


public class EndingPage extends JPanel {
	private JFrame mf;
	private JPanel mainpanel;
	private JPanel mainpanel2;
//	private JTextArea textArea;
	private JLabel textLabel;
	private JLabel textLabel2;
	
	private StoryDTO storyDTO;
	private StoryController storyController;
	private CharacterDTO characterDTO;
	
	public EndingPage(JFrame mf, CharacterDTO characterDTO) {
		this.mf = mf;
		this.mainpanel = this;
		this.characterDTO = characterDTO;
		
		
		Image field = new ImageIcon("Images/field/FinalBossField.png").getImage().getScaledInstance(800, 200, 0);
		mainpanel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(field,0,0,800,420,this);
			}
		};
		
		mainpanel.setBounds(0, 0, 800, 420);
		mainpanel.setLayout(null);
		mf.add(mainpanel); // 생성한 패널 프레임에 추가

		//---------------------------주인공 얼굴------------------------------------
		Image chara = new ImageIcon("images/text/주인공.png").getImage().getScaledInstance(100, 100, 0);
		JLabel charaLabel = new JLabel(new ImageIcon(chara));
		charaLabel.setBounds(0, 180, 100, 100);
		mainpanel.add(charaLabel);
		Image bossface = new ImageIcon("images/text/bossDie.png").getImage().getScaledInstance(200, 180, 0);
		
		JLabel bossLabel = new JLabel(new ImageIcon(bossface));
		bossLabel.setBounds(650, 230, 150, 143);
		mainpanel.add(bossLabel);
		
		//-------------------------대화 이미지1 출력------------------------------------------------	
		Image text1 = new ImageIcon("images/text/내가지다니.png").getImage().getScaledInstance(600, 300, 0);
		textLabel = new JLabel(new ImageIcon(text1));
		textLabel.setBounds(0, 251, 792, 200);
		mainpanel.add(textLabel);
				
		//-------------------------대화 이미지 2출력--------------------------------------------------
		Image text2 = new ImageIcon("images/text/세상을구했다.png").getImage().getScaledInstance(600, 220, 0);
		textLabel2 = new JLabel(new ImageIcon(text2));
		textLabel2.setBounds(0, 251, 792, 150);
		mainpanel.add(textLabel2);
		textLabel2.setVisible(false);
		
		textLabel.addMouseListener(new OneActionListener());
		textLabel2.addMouseListener(new TwoActionListener());
		
		
		
//		mainpanel.addMouseListener(new MouseAdapter() {
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				EndingPage2(mf);
//			}
//		});
//		
	}
		
	
	private class OneActionListener extends MouseAdapter {
		
		@Override
		public void mousePressed(MouseEvent e) {
			
			textLabel.setVisible(false);
			textLabel2.setVisible(true);
		}
	}
	
	
	private class TwoActionListener extends MouseAdapter {
		
		@Override
		public void mousePressed(MouseEvent e) {
//			textLabel2.setVisible(false);
			EndingPage2(mf);
			mainpanel.setVisible(false);
		}
	}
	
	
	public void EndingPage2(JFrame mf) {

		this.mf = mf;
		this.mainpanel2 = this;
		
		Image field = new ImageIcon("Images/story/엔딩크레딧.PNG").getImage().getScaledInstance(800, 200, 0);
		mainpanel2 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(field,0,0,800,420,this);
			}
		};
		
		storyController = new StoryController();
		storyDTO = new StoryDTO();

		mainpanel2.setBounds(0, 0, 800, 600);
		mainpanel2.setLayout(null);
		mf.getContentPane().add(mainpanel2); 
		
		JLabel label = new JLabel();

		label.setBounds(50, 50, 600, 300);
		label.setOpaque(false);
		label.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		
		mainpanel2.add(label);
		mf.add(mainpanel2);
		
		storyDTO.setChapTitle("엔딩");

		List<StoryDTO> ending = storyController.selectTitleStory(storyDTO.getChapTitle());
		
		String endingSc = "<html>";
		for(int i = 0; i < ending.size(); i++ ) {

			endingSc += (ending.get(i).getChapScript()+"<br>"); 
		}
			endingSc += "</html>";
		
		label.setText(endingSc);
		label.addMouseListener(new MyMouseAdapter());
	
	}

//	Image background = new ImageIcon("Images/story/엔딩크레딧.PNG").getImage().getScaledInstance(800, 200, 0);
//
//	public void paintComponent(Graphics g) {
//
//		g.drawImage(background,0,0,800,420,this);
//	}
	
	
	private class MyMouseAdapter extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			ViewUtil.changePanel(mf, mainpanel2, new FieldCharacterBattle(mf, null, characterDTO));
			
		}
	}

}
