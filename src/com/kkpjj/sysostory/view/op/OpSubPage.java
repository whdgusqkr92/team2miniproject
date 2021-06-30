package com.kkpjj.sysostory.view.op;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpSubPage extends JPanel {
	
	private OpMainFrame omf;
	private OpMainPage omp;
	
	public OpSubPage() {
//		this.setSize(300, 200);
//		this.setBackground(Color.YELLOW);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 800, 410);
		omf.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		Image bg = new ImageIcon("images/StartScreen2.png").getImage();
		JLabel label= new JLabel(new ImageIcon(bg));
		label.setBounds(0, 0, 800, 600);
		panel1.add(label);
		
	}
}
