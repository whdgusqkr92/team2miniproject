package com.kkpjj.sysostory.controller;

import com.kkpjj.sysostory.model.dto.SkillDTO;
import com.kkpjj.sysostory.model.service.SkillService;

public class SkillController {

	private SkillService skillService;
	SkillDTO skillDTO= null;
	
	public SkillController() {
		this.skillService = new SkillService();
		this.skillDTO = new SkillDTO();
		
	}
	
	public String selectSkillScript(int skillCode) {
		
		SkillDTO skill = skillService.selectSkillScript(skillCode);
		
		String skillScript = skill.getSkillScript();
		
		
		System.out.println(skillScript);
		
		
		
//		String result = skill.getSkillScript();						// 스킬설명을 가져온다
		
		return skillScript;
	}
	
public int selectSkillOpenLv(int skillCode) {
		
		SkillDTO skill = skillService.selectSkillScript(skillCode);
		
		
		int skillOpenLv = skill.getSkillOpenLv();
		
		System.out.println(skillOpenLv);
		
		
		
//		String result = skill.getSkillScript();						// 스킬설명을 가져온다
		
		return skillOpenLv;
	}

	private String addSkillScript(String skillScript) {
	
		return null;
	}
	private String selectSkillOpen(int skillOpenLv) {
		
		return null;
	}
	
	
}
