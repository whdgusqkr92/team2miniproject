package com.kkpjj.sysostory.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewUtil {
	
	public static void changePanel(JFrame mf, JPanel op, JPanel np) {
		mf.remove(op);
		mf.add(np);
		mf.repaint();
		mf.revalidate();
	}
	
//	public static void changePanel(JPanel panel, JPanel op, JPanel np) {
//		panel.remove(op);
//		panel.add(np);
//		panel.repaint();
//		panel.revalidate();
//	}
}
