package com.kkpjj.sysostory.view.story;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.kkpjj.sysostory.controller.StoryController;
import com.kkpjj.sysostory.model.dto.StoryDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.boss.FinalBossEvent;


public class EndingPage extends JPanel {
	private JFrame mf;
	private JPanel mainpanel;
	private JTextArea textArea;
	private StoryDTO storyDTO;
	private StoryController storyController;
	
	
	public EndingPage(JFrame mf) {
	
		this.mf = mf;
		this.mainpanel = this;
		
		
		storyController = new StoryController();
		storyDTO = new StoryDTO();
		
		mainpanel.setBounds(0, 0, 800, 600);
		mainpanel.setLayout(null);
		mf.getContentPane().add(mainpanel); //
		
		
		
		
		
//		JLabel textbox = new JLabel();
//		textbox.setBounds(50, 50, 700, 500);
//		textbox.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		
//		textbox.setText(storyController.selectStoryContents(storyDTO.getStoryCode()));
	
//		for(int storyCode = 1; storyCode < 3; storyCode ++) {
		
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(50, 50, 700, 500);
		textArea.setOpaque(false);
		textArea.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		mainpanel.add(textArea);
		mf.add(mainpanel);
		
//		String storyTitle = "엔딩";
		
//		System.out.println(storyCode);
//		storyDTO.setStoryCode(storyCode);
//		textArea.setText(storyController.selectStoryContents(storyDTO.getStoryCode()));

//		System.out.println(storyTitle);
		
		//nullpoint에러뜸에러뜸에러뜸에러뜸에러뜸에러뜸
		storyDTO.setChapTitle("엔딩");
		textArea.setText(storyController.selectTitleStory(storyDTO.getChapTitle()));

//				break;
//			}
		
		mainpanel.addMouseListener(new MyMouseAdapter());
	}
	
	
	
	
	
	Image background = new ImageIcon("Images/story/엔딩크레딧.PNG").getImage().getScaledInstance(800, 200, 0);
			
	public void paintComponent(Graphics g) {

		g.drawImage(background,0,0,800,420,this);
		}
		
private class MyMouseAdapter extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			 ViewUtil.changePanel(mf, mainpanel, new FinalBossEvent(mf));
		}
	}

	
	
	
	
}
