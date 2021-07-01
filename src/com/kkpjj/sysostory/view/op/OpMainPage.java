package com.kkpjj.sysostory.view.op;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.view.MainFrame;
import com.kkpjj.sysostory.view.ViewUtil;

public class OpMainPage extends JPanel {
	
	private JFrame mf;
	private OpMainPage omp;
	
	public OpMainPage(JFrame mf) {
		this.mf = mf;
		this.omp = this;	
		
		this.addMouseListener(new MyMouseAdapter());
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 800, 600);
		mf.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		Image bg = new ImageIcon("images/openingBg1.png").getImage();
		JLabel label= new JLabel(new ImageIcon(bg));
		label.setBounds(0, 0, 800, 600);
		panel1.add(label);
		
//		this.setBackground(Color.BLUE);
//		this.setSize(800, 600);
		
		mf.add(this);
		
	}
	
	private class MyMouseAdapter extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			 ViewUtil.changePanel(mf, omp, new OpSubPage(mf));
		}
	}

}

