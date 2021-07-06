package com.kkpjj.sysostory.controller;


import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.model.service.BossAttService;
import com.kkpjj.sysostory.view.boss.BossSkillEffect;

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
		
	}

	public void attFinalBoss() { //int Code
		
		MonsterDTO monsterDTO = new MonsterDTO();
		
		int monCode = 3;
		monsterDTO = bossAttService.attBoss(monCode);
		System.out.println(monsterDTO);
		
		int ranAtt = (int) (Math.random()*100)+1 ;
		
		int nomalAtt = monsterDTO.getMonAtt(); //일반공격
		int spAtt = monsterDTO.getSkillAtt();  //스킬공격계수
		int damege = nomalAtt * ( 1 + spAtt); // 스킬 데미지
		
		int chrHp = chr.getChrHp();
		
//		new BossSkillEffect(mf).finalSkill1();//
//		new BossSkillEffect(mf).middleSkill1();
		
		
		System.out.println(ranAtt);
		if(monCode == 3) {
			
			if(!(monsterDTO.getMonHp() == 0)) {
				
				if(ranAtt > 0 && ranAtt < 10 ) {      		//100프로일단 설정해놓음
					new BossSkillEffect(mf).finalSkill2();
					new BossSkillEffect(mf).setVisible(false);
					//약간 속도 늦춰주면 좋을듯. 이펙트가 다 끝나고 체력이 닳게
					chrHp = chr.getChrHp() - damege;
						
					}else if(ranAtt == 10) {			//1프로
						new BossSkillEffect(mf).finalSkill3();
						new BossSkillEffect(mf).setVisible(false);
						chrHp = chr.getChrHp() - damege;
						
					}else if(ranAtt >10 && ranAtt <= 200 ) {  //10프로
						new BossSkillEffect(mf).finalSkill1();
						new BossSkillEffect(mf).setVisible(false);
						chrHp = chr.getChrHp() - damege;
						
					}else { 				 			//나머지 일반공격
						chrHp = chr.getChrHp() - monsterDTO.getMonAtt();
					}
			
				}
		}
	}
	
	
	public void attMiddleBoss() { //int Code
		
		MonsterDTO monsterDTO = new MonsterDTO();
		
		int monCode = 3;
		monsterDTO = bossAttService.attBoss(monCode);
		System.out.println(monsterDTO);
		
		int ranAtt = (int) (Math.random()*10)+1 ;
		
		int nomalAtt = monsterDTO.getMonAtt(); //일반공격
		int spAtt = monsterDTO.getSkillAtt();  //스킬공격계수
		int damege = nomalAtt * ( 1 + spAtt); // 스킬 데미지
		
		int chrHp = chr.getChrHp();
		
//		new BossSkillEffect(mf).finalSkill1();//
		
		
		System.out.println(ranAtt);
		if(monCode == 3) {
			
			
			if(!(monsterDTO.getMonHp() == 0)) {
				if(ranAtt > 0 && ranAtt <= 3 ) {      
					System.out.println("1번사용");
					new BossSkillEffect(mf).middleSkill1();
					new BossSkillEffect(mf).setVisible(false);
					chrHp = chr.getChrHp() - damege;
						
					}else if(ranAtt >3 && ranAtt <= 7 ) {  
						System.out.println("2번사용");
						new BossSkillEffect(mf).middleSkill2();
						new BossSkillEffect(mf).setVisible(false);
						chrHp = chr.getChrHp() - damege;
					}else { 				 			
						chrHp = chr.getChrHp() - monsterDTO.getMonAtt();
						System.out.println("기본공격사용");
					}
			
				}
		}
//	}
	new Thread(new Runnable() {
		public void run() {
			int cnt = 0;
			while(true) {
				
			try {
				Thread.sleep(1000);
				cnt++;
				if(cnt==2) {
					attMiddleBoss();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}).start();
	}
}
