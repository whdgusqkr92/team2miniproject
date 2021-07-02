package com.kkpjj.sysostory.view.op;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.VillageView;

public class OpSubPage extends JPanel {
	
	private JFrame mf;
	private JPanel panel1;
	
	public OpSubPage(JFrame mf) {
//		this.setSize(300, 200);
//		this.setBackground(Color.YELLOW);
		this.mf = mf;
		
		panel1 = new JPanel();
		panel1.setBounds(0, 0, 800, 600);
		mf.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		Image bg = new ImageIcon("images/StartScreen2.png").getImage();
		JLabel label= new JLabel(new ImageIcon(bg));
		label.setBounds(0, 0, 800, 600);
		panel1.add(label);
		
		this.addMouseListener(new MyMouseAdapter());
		
	}
	
	private class MyMouseAdapter extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			 ViewUtil.changePanel(mf, panel1, new VillageView(mf));
		}
	}
}
