package com.kkpjj.sysostory.controller;


import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.model.dto.CharaDTO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.model.service.BossAttService;
import com.kkpjj.sysostory.view.boss.BossSkillEffect;

public class BossAttController extends JPanel{

	private BossAttService bossAttService;
//	private MonsterDTO monsterDTO;
	private CharaDTO chr;
	private int skill1;
	private int skill2;
	private int skill3;
	private JFrame mf;
	private JPanel mainpanel;
	
	
	public BossAttController(JFrame mf) {
		this.mf = mf;
		this.mainpanel = this;
		this.chr = new CharaDTO();	
		this.bossAttService = new BossAttService();
						
		
	}

	public void attBoss() { //int Code
		
		MonsterDTO monsterDTO = new MonsterDTO();
		
		int monCode = 3;
		monsterDTO = bossAttService.attBoss(monCode);
		System.out.println(monsterDTO);
		
		int ranAtt = (int) (Math.random()*100)+1 ;
		
		int nomalAtt = monsterDTO.getMonAtt(); //일반공격
		int spAtt = monsterDTO.getSkillAtt();  //스킬공격계수
		int damege = nomalAtt * ( 1 + spAtt); // 스킬 데미지
		
		int chrHp = chr.getChrHp();
		
		new BossSkillEffect(mf).skill2();//
		
		
		System.out.println(ranAtt);
		if(!(monsterDTO.getMonHp() == 0)) {
			
			if(monCode == 3) {
				
				
				if(ranAtt > 0 && ranAtt < 10 ) {      		//10프로
					new BossSkillEffect(mf).skill2();
					//약간 속도 늦춰주면 좋을듯. 이펙트가 다 끝나고 체력이 닳게
					chrHp = chr.getChrHp() - damege;
						
					}else if(ranAtt == 10) {			//1프로
						new BossSkillEffect(mf).skill3();
						chrHp = chr.getChrHp() - damege;
						
					}else if(ranAtt >10 && ranAtt <= 20 ) {  //10프로
						new BossSkillEffect(mf).skill1();
						chrHp = chr.getChrHp() - damege;
						
					}else { 				 			//나머지 일반공격
						chrHp = chr.getChrHp() - monsterDTO.getMonAtt();
					}
			
				}
		}
	}
}
