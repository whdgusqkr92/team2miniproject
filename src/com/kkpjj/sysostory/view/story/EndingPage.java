package com.kkpjj.sysostory.view.story;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kkpjj.sysostory.controller.StoryController;
import com.kkpjj.sysostory.model.dto.StoryDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.boss.FinalBossEvent;


public class EndingPage extends JPanel {
	private JFrame mf;
	private JPanel mainpanel;
	private JPanel mainpanel2;
	private JTextArea textArea;
	private StoryDTO storyDTO;
	private StoryController storyController;
	
	public EndingPage(JFrame mf) {
		this.mf = mf;
		this.mainpanel = this;
		
		
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
		Image bossface = new ImageIcon("images/text/Bossface_M.png").getImage().getScaledInstance(200, 180, 0);
		
		JLabel bossLabel = new JLabel(new ImageIcon(bossface));
		bossLabel.setBounds(650, 110, 150, 143);
		mainpanel.add(bossLabel);
		bossLabel.setVisible(false);
		
		mainpanel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				EndingPage2(mf);
			}
		});
		
		
		
//		EndingPage2(mf);
	}

		
	public void EndingPage2(JFrame mf) {

		this.mf = mf;
		this.mainpanel = this;
		
		Image field = new ImageIcon("Images/story/엔딩크레딧.PNG").getImage().getScaledInstance(800, 200, 0);
		mainpanel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(field,0,0,800,420,this);
			}
		};
		
		storyController = new StoryController();
		storyDTO = new StoryDTO();

		mainpanel.setBounds(0, 0, 800, 600);
		mainpanel.setLayout(null);
		mf.getContentPane().add(mainpanel); 
		
		JLabel label = new JLabel();

		label.setBounds(50, 50, 600, 300);
		label.setOpaque(false);
		label.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		
		mainpanel.add(label);
		mf.add(mainpanel);
		
		storyDTO.setChapTitle("오프닝");

		List<StoryDTO> ending = storyController.selectTitleStory(storyDTO.getChapTitle());
		
		String endingSc = "<html>";
		for(int i = 0; i < ending.size(); i++ ) {

			endingSc += (ending.get(i).getChapScript()+"<br>"); 
		}
			endingSc += "</html>";
		
		label.setText(endingSc);
		
		//여기서 다음 화면이 안넘어가지네..
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
			ViewUtil.changePanel(mf, mainpanel, new FinalBossEvent(mf));
		}
	}

}
