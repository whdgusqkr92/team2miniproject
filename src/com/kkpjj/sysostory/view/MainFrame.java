package com.kkpjj.sysostory.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.view.op.OpMainFrame;
import com.kkpjj.sysostory.view.op.OpMainPage;

public class MainFrame extends JFrame {
	
	private JFrame mf;
	private JPanel mainPanel;
	private JPanel monPanel;
	private JPanel chrPanel;
	private JPanel battleMenuPanel;
	
	
	

	public MainFrame() {
		mf = new JFrame();
		
		mf.setSize(800, 600);
		mf.setLayout(null);
		mf.setTitle("sysoStory");


//		new BattlePage(mf);
//		new OpMainPage(mf);
		new CharacterView(mf);


		new BattlePage(mf);
		

		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
