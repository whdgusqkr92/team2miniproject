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

public class BossAttController extends JPanel{

	private BossAttService bossAttService;
	private CharacterDTO chr;
	private MonsterDTO mon;
	private JFrame mf;
	private JPanel mainpanel;
	private JPanel battlePage;


	public BossAttController(JPanel battlePage, CharacterDTO chrDTO) {
//		this.mf = mf;
		this.mainpanel = this;
		this.battlePage = battlePage;
		this.chr = chrDTO;
//		this.chr = new CharacterDTO();	
		this.bossAttService = new BossAttService();
		//		
		battlePage.add(mainpanel);
	}

	public void attFinalBoss() { //int Code


		MonsterDTO monsterDTO = new MonsterDTO();

		int monCode = 3;
		monsterDTO = bossAttService.attBoss(monCode);
		System.out.println(monsterDTO);

		int ranAtt = (int) (Math.random()*10)+1 ;

		int nomalAtt = monsterDTO.getMonAtt(); //일반공격
		double spAtt = monsterDTO.getSkillAtt();  //스킬공격계수
		int damege = (int) (nomalAtt * ( 1 + spAtt)); // 스킬 데미지

		int chrHp = chr.getChrHp();

		System.out.println(ranAtt);
		if(monCode == 3) {

			if(!(monsterDTO.getMonHp() == 0)) {

				if(ranAtt > 0 && ranAtt < 4 ) {      		//100프로일단 설정해놓음
					new BossSkillEffect(battlePage).finalSkill2();
					new BossSkillEffect(battlePage).setVisible(false);

					chrHp = chr.getChrHp() - damege;

				}else if(ranAtt > 3 && ranAtt < 6) {			//1프로
					new BossSkillEffect(battlePage).finalSkill3();
					new BossSkillEffect(battlePage).setVisible(false);
					chrHp = chr.getChrHp() - damege;

				}else if(ranAtt >5 && ranAtt < 8 ) {  //10프로
					new BossSkillEffect(battlePage).finalSkill1();
					new BossSkillEffect(battlePage).setVisible(false);
					chrHp = chr.getChrHp() - damege;

				}else { 				 			//나머지 일반공격
					chrHp = chr.getChrHp() - monsterDTO.getMonAtt();
				}
			}
		}
	}


	public void attMiddleBoss(MonsterDTO mon) { //int Code

//		MonsterDTO monsterDTO = new MonsterDTO();

		int monCode = 3;
		mon = bossAttService.attBoss(monCode);
//		System.out.println(monsterDTO);

		int ranAtt = (int) (Math.random()*10)+1 ;

//				int nomalAtt = mon.getMonAtt(); //일반공격
//				double spAtt = mon.getSkillAtt();  //스킬공격계수
//				double damege = nomalAtt * ( 1 + spAtt); // 스킬 데미지

//		int chrHp = chr.getChrHp();

		System.out.println(ranAtt);
//		if(monCode == 3) {


			if(!(mon.getMonHp() == 0)) {
				if(ranAtt > 0 && ranAtt <= 2 ) { // 1,2      
					System.out.println("1번사용");
					new BossSkillEffect(battlePage).middleSkill1();
					new BossSkillEffect(battlePage).setVisible(false);
//								chrHp = (int) (chr.getChrHp() - damege);
					Sound.effSound();

				}else if(ranAtt >2 && ranAtt <= 4 ) {  //3,4
					System.out.println("2번사용");
					new BossSkillEffect(battlePage).middleSkill2();
					new BossSkillEffect(battlePage).setVisible(false);
//								chrHp = (int) (chr.getChrHp() - damege);
					Sound.effSound();
				}else { 				 			
//					chrHp = chr.getChrHp() - mon.getMonAtt();
					System.out.println("기본공격사용");
				}

			}
//		}
		//	}


		//확인용 2초에 한번씩 공격(동작)하는 기능
//		new Thread(new Runnable() {
//			public void run() {
//				int cnt = 0;
//				while(true) {
//
//					try {
//						Thread.sleep(1000);
//						cnt++;
//						if(cnt==2) {
//							//					attFinalBoss();
//							attMiddleBoss();
//						}
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}).start();
	}
	//}
}

