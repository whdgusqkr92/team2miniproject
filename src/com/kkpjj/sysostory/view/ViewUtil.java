package com.kkpjj.sysostory.view;

import javax.swing.JPanel;

public class ViewUtil {
	
	public static void changePanel(MainFrame mf, JPanel op, JPanel np) {
		mf.remove(op);
		mf.add(np);
		mf.repaint();
		mf.revalidate();
	}
}
