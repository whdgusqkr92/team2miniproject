package com.kkpjj.sysostory.model.dto;

public class SkillDTO implements java.io.Serializable{
	
	
// 스킬명 적어야함!!!//
//	
//	SKILL_CODE	NUMBER	No		1	스킬코드
//	SKILL_NAME	VARCHAR2(20 BYTE)	No		2	스킬명
//	SKILL_ATT	NUMBER	No		3	스킬공격력
//	MP_CONSUM	NUMBER	No		4	스킬MP소모량
//	SKILL_OPEN_LV	NUMBER	No		5	스킬개방레벨
//	SKILL_SCRIPT	VARCHAR2(150 BYTE)	No		6	스킬설명
	
	private int skillCode;			//스킬코드
	private String skillName;		//스킬명
	private int skillAtt;			//스킬공격력
	private int mpConsum;			//스킬MP소모량
	private int skillOpenLv;		//스킬개방레벨
	private String skillScript;		//스킬설명


 public  SkillDTO (){}


public SkillDTO(int skillCode, String skillName, int skillAtt, int mpConsum, int skillOpenLv, String skillScript) {
	super();
	this.skillCode = skillCode;
	this.skillName = skillName;
	this.skillAtt = skillAtt;
	this.mpConsum = mpConsum;
	this.skillOpenLv = skillOpenLv;
	this.skillScript = skillScript;
}


public int getSkillCode() {
	return skillCode;
}


public void setSkillCode(int skillCode) {
	this.skillCode = skillCode;
}


public String getSkillName() {
	return skillName;
}


public void setSkillName(String skillName) {
	this.skillName = skillName;
}


public int getSkillAtt() {
	return skillAtt;
}


public void setSkillAtt(int skillAtt) {
	this.skillAtt = skillAtt;
}


public int getMpConsum() {
	return mpConsum;
}


public void setMpConsum(int mpConsum) {
	this.mpConsum = mpConsum;
}


public int getSkillOpenLv() {
	return skillOpenLv;
}


public void setSkillOpenLv(int skillOpenLv) {
	this.skillOpenLv = skillOpenLv;
}


public String getSkillScript() {
	return skillScript;
}


public void setSkillScript(String skillScript) {
	this.skillScript = skillScript;
}


@Override
public String toString() {
	return "SkillDTO [skillCode=" + skillCode + ", skillName=" + skillName + ", skillAtt=" + skillAtt + ", mpConsum="
			+ mpConsum + ", skillOpenLv=" + skillOpenLv + ", skillScript=" + skillScript + "]";
}


}