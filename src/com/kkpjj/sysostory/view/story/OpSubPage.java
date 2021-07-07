package com.kkpjj.sysostory.view.story;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.StoryController;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.StoryDTO;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.character.VillageView;

public class OpSubPage extends JPanel {
	
	private JFrame mf;
	private JPanel panel1;
	private StoryDTO storyDTO;
	private CharacterDTO chr;
	private StoryController storyController;
	
	public OpSubPage(JFrame mf) {
		this.mf = mf;
		
		storyController = new StoryController();
		storyDTO = new StoryDTO();
		
		panel1 = new JPanel();
		panel1.setBounds(0, 0, 800, 600);
		mf.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		Image bg = new ImageIcon("images/story/openingBg1.png").getImage();
		JLabel label= new JLabel(new ImageIcon(bg));
		label.setBounds(0, 0, 800, 600);
		
		
		//-------------------- 스토리 정보 출력 확인용---------------------
		
		int skillCode = 2;		// 2번의 스토리 정보
		
		storyDTO.setStoryCode(skillCode);
		System.out.println(storyController.selectStoryContents(storyDTO.getStoryCode()));
//		label1.setText(storyController.selectStoryContents(storyDTO.getStoryCode()));
		
		JLabel label2 = new JLabel();
		label2.setBounds(50, 50, 700, 500);
		label2.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		
		label2.setText(storyController.selectStoryContents(storyDTO.getStoryCode()));

		panel1.add(label2);
		panel1.add(label);
		
		
		mf.add(this);
		
		panel1.addMouseListener(new MyMouseAdapter());
		
	}
	
	private class MyMouseAdapter extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			 ViewUtil.changePanel(mf, panel1, new VillageView(mf, chr));
		}
	}
}
