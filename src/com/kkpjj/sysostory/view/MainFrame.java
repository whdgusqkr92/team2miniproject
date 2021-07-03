package com.kkpjj.sysostory.view;

import javax.swing.JFrame;

import com.kkpjj.sysostory.view.ResultView.BossSkillResultView;
import com.kkpjj.sysostory.view.op.OpMainPage;

public class MainFrame extends JFrame {

	private JFrame mf;

	public MainFrame() {
		
		mf = new JFrame();
		
//		new FinalBoss(mf);
		
			new BossSkillResultView(mf).skill2();
		
		mf.setTitle("sysoStory");
		mf.setSize(800, 600);
		mf.setLayout(null);
		


		mf.setLocationRelativeTo(null);
		mf.setResizable(true);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
