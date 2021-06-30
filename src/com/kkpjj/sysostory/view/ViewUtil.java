package com.kkpjj.sysostory.view;

import javax.swing.JPanel;

import com.kkpjj.sysostory.view.op.OpMainFrame;

public class ViewUtil {
	
	public static void changePanel(OpMainFrame mf, JPanel op, JPanel np) {
		mf.remove(op);
		mf.add(np);
		mf.repaint();
		mf.revalidate();
	}
}
