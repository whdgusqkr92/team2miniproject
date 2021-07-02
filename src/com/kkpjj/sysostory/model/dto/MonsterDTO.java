package com.kkpjj.sysostory.model.dto;

public class MonsterDTO implements java.io.Serializable {
	
	private int monCode;
	private String monName;
	private int monHp;
	private int monAtt;
	private int skillAtt;
	private int monDef;
	private int monExp;
	private int dropGold;
	
	public MonsterDTO() {}

	public MonsterDTO(int monCode, String monName, int monHp, int monAtt, int skillAtt, int monDef, int monExp,
			int dropGold) {
		super();
		this.monCode = monCode;
		this.monName = monName;
		this.monHp = monHp;
		this.monAtt = monAtt;
		this.skillAtt = skillAtt;
		this.monDef = monDef;
		this.monExp = monExp;
		this.dropGold = dropGold;
	}

	public int getMonCode() {
		return monCode;
	}

	public void setMonCode(int monCode) {
		this.monCode = monCode;
	}

	public String getMonName() {
		return monName;
	}

	public void setMonName(String monName) {
		this.monName = monName;
	}

	public int getMonHp() {
		return monHp;
	}

	public void setMonHp(int monHp) {
		this.monHp = monHp;
	}

	public int getMonAtt() {
		return monAtt;
	}

	public void setMonAtt(int monAtt) {
		this.monAtt = monAtt;
	}

	public int getSkillAtt() {
		return skillAtt;
	}

	public void setSkillAtt(int skillAtt) {
		this.skillAtt = skillAtt;
	}

	public int getMonDef() {
		return monDef;
	}

	public void setMonDef(int monDef) {
		this.monDef = monDef;
	}

	public int getMonExp() {
		return monExp;
	}

	public void setMonExp(int monExp) {
		this.monExp = monExp;
	}

	public int getDropGold() {
		return dropGold;
	}

	public void setDropGold(int dropGold) {
		this.dropGold = dropGold;
	}

	@Override
	public String toString() {
		return "MonsterDTO [monCode=" + monCode + ", monName=" + monName + ", monHp=" + monHp + ", monAtt=" + monAtt
				+ ", skillAtt=" + skillAtt + ", monDef=" + monDef + ", monExp=" + monExp + ", dropGold=" + dropGold
				+ "]";
	}
	
	
}
