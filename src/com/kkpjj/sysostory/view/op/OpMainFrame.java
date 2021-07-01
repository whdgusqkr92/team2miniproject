package com.kkpjj.sysostory.view.op;

import javax.swing.JFrame;

public class OpMainFrame extends JFrame {
	
	public OpMainFrame() {
		this.setSize(800, 600);
		
		new OpMainPage(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
