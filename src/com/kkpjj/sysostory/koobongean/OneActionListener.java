package com.kkpjj.sysostory.koobongean;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class OneActionListener implements ActionListener {
	private JLabel textLabel;
	private JLabel textLabel2;
	
	private JButton btn;
	@Override
	public void actionPerformed(ActionEvent e) {
			textLabel.setVisible(false);
			textLabel2.setVisible(true);
			btn.setVisible(false);
	
	};
	}
