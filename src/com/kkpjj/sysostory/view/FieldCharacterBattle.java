package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FieldCharacterBattle extends JPanel {
   private JFrame mf;
   private JPanel mainPanel;
   private JPanel statusPanel;
   private JPanel mapPanel;



   public FieldCharacterBattle(JFrame mf) {

	   this.mf = mf;
	   
	   

	   	mainPanel = new JPanel();
	   	mainPanel.setBounds(0, 0, 800, 420);

      
      

      
      //--------------------------배경 필드 패널 만들기------------------------------   
//      Image field = new ImageIcon("Images/field.png").getImage().getScaledInstance(800, 200, 0);
//         
//      mainPanel = new JPanel() {
//         public void paintComponent(Graphics g) {
//            g.drawImage(field,0,0,800,420,this);
//            }
//         };
//         
//         mainPanel.setBounds(0, 0, 800, 420);
//         mainPanel.setLayout(null);
//      mf.add(mainPanel); // 생성한 패널 프레임에 추가
   
//   class Mypanel extends JPanel {
//      
//      
//      FieldCharacterBattle fi = new FieldCharacterBattle();  
//      
//      
//      Image chr = new ImageIcon("images/battle_chr.png").getImage(); 
//      
//      public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         g.drawImage(chr,100,100 ,getWidth(), getHeight(), this );                                                         //무한 실행됨
//         
//      }
//      
//   }
   }

}