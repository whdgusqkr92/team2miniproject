package com.kkpjj.sysostory.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kkpjj.sysostory.view.character.SettingPanel;

public class ViewUtil {
	
	public static void changePanel(JFrame mf, JPanel op, JPanel np) {
		mf.remove(op);
		mf.add(np);
		mf.repaint();
		mf.revalidate();
	}
	
	public static void changePanel(JFrame mf, JLabel op, JPanel np) {
		mf.remove(op);
		mf.add(np);
		mf.repaint();
		mf.revalidate();
	}

}

