package com.kkpjj.sysostory.controller;


import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.model.dto.CharaDTO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.model.service.BossAttService;
import com.kkpjj.sysostory.view.boss.BossSkillResultView;

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
		int monCode = 99;
		
		
		monsterDTO = bossAttService.attBoss(monCode);
		System.out.println(monsterDTO);
		
		int ranAtt = (int) (Math.random()*10)+1 ;
		
//		int nomalAtt = monsterDTO.getMonAtt(); //일반공격
//		int spAtt = monsterDTO.getSkillAtt();  //스킬공격계수
		
		new BossSkillResultView(mf).skill2();
		
		if(!(chr.getChrHp() == 0)) {
			if(monCode == 99) {
				if(ranAtt > 0 && ranAtt < 2 ) {
					new BossSkillResultView(mf).skill1(mf);       //되긴되는데 패널이 아래로 꺼짐 mf하면 안되는듯
						}else if(ranAtt > 2 && ranAtt < 3) {
								}
				
			
			
				}
		}
//			int damege = monster * 100;
			//기본공격력  *( 1 + 스킬계수 ) = 스킬데미지
			
			
	}
}
