package com.kkpjj.sysostory.controller;


import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.model.service.BossAttService;
import com.kkpjj.sysostory.run.Application;
import com.kkpjj.sysostory.view.MainFrame;
import com.kkpjj.sysostory.view.boss.BossSkillEffect;
import com.kkpjj.sysostory.view.character.Sound;
import com.kkpjj.sysostory.view.character.SettingPanel.BgmOn;

public class BossAttController extends JPanel{

	private BossAttService bossAttService;
//	private MonsterDTO monsterDTO;
	private CharacterDTO chr;
	private int skill1;
	private int skill2;
	private int skill3;
	private JFrame mf;
	private JPanel mainpanel;
	
	
	public BossAttController(JFrame mf) {
		this.mf = mf;
		this.mainpanel = this;
		this.chr = new CharacterDTO();	
		this.bossAttService = new BossAttService();
//		
		mf.add(mainpanel);
		
//		MainFrame.battlesound();
	}

	public void attFinalBoss() { //int Code

		
		MonsterDTO monsterDTO = new MonsterDTO();
		
		int monCode = 3;
		monsterDTO = bossAttService.attBoss(monCode);
		System.out.println(monsterDTO);
		
		int ranAtt = (int) (Math.random()*10)+1 ;
		
		int nomalAtt = monsterDTO.getMonAtt(); //일반공격
		double spAtt = monsterDTO.getSkillAtt();  //스킬공격계수
		double damege = nomalAtt * ( 1 + spAtt); // 스킬 데미지
		
		double chrHp = chr.getChrHp();
		
		System.out.println(ranAtt);
		if(monCode == 3) {
			
			if(!(monsterDTO.getMonHp() == 0)) {
				
				if(ranAtt > 0 && ranAtt < 4 ) {      		//100프로일단 설정해놓음
					new BossSkillEffect(mf).finalSkill2();
					new BossSkillEffect(mf).setVisible(false);
					
					chrHp = chr.getChrHp() - damege;
						
					}else if(ranAtt > 3 && ranAtt < 6) {			//1프로
						new BossSkillEffect(mf).finalSkill3();
						new BossSkillEffect(mf).setVisible(false);
						chrHp = chr.getChrHp() - damege;
						
					}else if(ranAtt >5 && ranAtt < 8 ) {  //10프로
						new BossSkillEffect(mf).finalSkill1();
						new BossSkillEffect(mf).setVisible(false);
						chrHp = chr.getChrHp() - damege;
						
					}else { 				 			//나머지 일반공격
						chrHp = chr.getChrHp() - monsterDTO.getMonAtt();
					}
				
				new Thread(new Runnable() {
					public void run() {
						int cnt = 0;
						while(true) {
							
						try {
							Thread.sleep(1000);
							cnt++;
							if(cnt==4) {
								attFinalBoss();
//								attMiddleBoss();
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						}
					}
				}).start();
			}
		}
	}
	
	
	public void attMiddleBoss() { //int Code
		
		MonsterDTO monsterDTO = new MonsterDTO();
		
		int monCode = 3;
		monsterDTO = bossAttService.attBoss(monCode);
		System.out.println(monsterDTO);
		
		int ranAtt = (int) (Math.random()*10)+1 ;
		
//		int nomalAtt = monsterDTO.getMonAtt(); //일반공격
//		int spAtt = monsterDTO.getSkillAtt();  //스킬공격계수
//		int damege = nomalAtt * ( 1 + spAtt); // 스킬 데미지
		
		int chrHp = chr.getChrHp();
		
		System.out.println(ranAtt);
		if(monCode == 3) {
			
			
			if(!(monsterDTO.getMonHp() == 0)) {
				if(ranAtt > 0 && ranAtt <= 3 ) {      
					System.out.println("1번사용");
					new BossSkillEffect(mf).middleSkill1();
					new BossSkillEffect(mf).setVisible(false);
//					chrHp = chr.getChrHp() - damege;
					Sound.effSound();
						
					}else if(ranAtt >3 && ranAtt <= 7 ) {  
						System.out.println("2번사용");
						new BossSkillEffect(mf).middleSkill2();
						new BossSkillEffect(mf).setVisible(false);
//						chrHp = chr.getChrHp() - damege;
						Sound.effSound();
					}else { 				 			
						chrHp = chr.getChrHp() - monsterDTO.getMonAtt();
						System.out.println("기본공격사용");
					}
			
				}
		}
//	}
		
		
		//확인용 2초에 한번씩 공격(동작)하는 기능
	new Thread(new Runnable() {
		public void run() {
			int cnt = 0;
			while(true) {
				
			try {
				Thread.sleep(1000);
				cnt++;
				if(cnt==2) {
//					attFinalBoss();
					attMiddleBoss();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}).start();
	}
//}
}
