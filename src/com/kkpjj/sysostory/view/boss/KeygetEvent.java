//package com.kkpjj.sysostory.view.boss;
//
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//import com.kkpjj.sysostory.view.ViewUtil;
//
//
//public class KeygetEvent extends JPanel{
//
//	private JFrame mf;
//	private JPanel mainpanel;
//	private JLabel keyBox;
//	private JLabel textLabel;
//	
//	public KeygetEvent(JFrame mf) {
//		
//		this.mf = mf;
//		this.mainpanel = this;
//		
//		Image field = new ImageIcon("Images/field/field.png").getImage().getScaledInstance(800, 200, 0);
//		
//		mainpanel = new JPanel() {
//			public void paintComponent(Graphics g) {
//				g.drawImage(field,0,0,800,420,this);
//				}
//			};
//			
//		mainpanel.setBounds(0, 0, 800, 420);
//		mainpanel.setLayout(null);
//		mf.add(mainpanel);
//		
//		
//		Image boxImage = new ImageIcon("images/text/열쇠상자.png").getImage().getScaledInstance(200, 180, 0);
//		keyBox = new JLabel(new ImageIcon(boxImage));
//		keyBox.setBounds(650, 110, 150, 143);
//		mainpanel.add(keyBox);
////		keyBox.setVisible(false);
//		
//		Image text1 = new ImageIcon("images/text/상자를찾았다.png").getImage().getScaledInstance(600, 250, 0);
//		textLabel = new JLabel(new ImageIcon(text1));
//		textLabel.setBounds(100, 150, 600, 250);
//		mainpanel.add(textLabel);
//		
//		keyBox.addMouseListener(new OpenTheBox());
//	}
//	
//	private class OpenTheBox extends MouseAdapter {
//		
//		
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			
////			textLabel.setVisible(false);
//			
//			
//			
//		}
//	}
//}
