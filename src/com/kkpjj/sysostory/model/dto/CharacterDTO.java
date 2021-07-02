package com.kkpjj.sysostory.model.dto;

public class CharacterDTO implements java.io.Serializable{
	 
	private int chrCode;
	private int userNo;
	private String chrName;
	private int chrHp;
	private int chrMp;
	private int chrExp;
	private int chrLevel;
	private int chrGold;
	private int maxHp;
	private int maxMp;
	private int maxExp;
	private int chrAtt;
	private int chrDef;
	private char sfx;
	private char bgm;
	private String equipTitle;
	private String equipWeapon;
	private String equipArmor;
	
	public CharacterDTO() {}

	public CharacterDTO(int chrCode, int userNo, String chrName, int chrHp, int chrMp, int chrExp, int chrLevel,
			int chrGold, int maxHp, int maxMp, int maxExp, int chrAtt, int chrDef, char sfx, char bgm,
			String equipTitle, String equipWeapon, String equipArmor) {
		super();
		this.chrCode = chrCode;
		this.userNo = userNo;
		this.chrName = chrName;
		this.chrHp = chrHp;
		this.chrMp = chrMp;
		this.chrExp = chrExp;
		this.chrLevel = chrLevel;
		this.chrGold = chrGold;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.maxExp = maxExp;
		this.chrAtt = chrAtt;
		this.chrDef = chrDef;
		this.sfx = sfx;
		this.bgm = bgm;
		this.equipTitle = equipTitle;
		this.equipWeapon = equipWeapon;
		this.equipArmor = equipArmor;
	}

	public int getChrCode() {
		return chrCode;
	}

	public void setChrCode(int chrCode) {
		this.chrCode = chrCode;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getChrName() {
		return chrName;
	}

	public void setChrName(String chrName) {
		this.chrName = chrName;
	}

	public int getChrHp() {
		return chrHp;
	}

	public void setChrHp(int chrHp) {
		this.chrHp = chrHp;
	}

	public int getChrMp() {
		return chrMp;
	}

	public void setChrMp(int chrMp) {
		this.chrMp = chrMp;
	}

	public int getChrExp() {
		return chrExp;
	}

	public void setChrExp(int chrExp) {
		this.chrExp = chrExp;
	}

	public int getChrLevel() {
		return chrLevel;
	}

	public void setChrLevel(int chrLevel) {
		this.chrLevel = chrLevel;
	}

	public int getChrGold() {
		return chrGold;
	}

	public void setChrGold(int chrGold) {
		this.chrGold = chrGold;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

	public int getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}

	public int getChrAtt() {
		return chrAtt;
	}

	public void setChrAtt(int chrAtt) {
		this.chrAtt = chrAtt;
	}

	public int getChrDef() {
		return chrDef;
	}

	public void setChrDef(int chrDef) {
		this.chrDef = chrDef;
	}

	public char getSfx() {
		return sfx;
	}

	public void setSfx(char sfx) {
		this.sfx = sfx;
	}

	public char getBgm() {
		return bgm;
	}

	public void setBgm(char bgm) {
		this.bgm = bgm;
	}

	public String getEquipTitle() {
		return equipTitle;
	}

	public void setEquipTitle(String equipTitle) {
		this.equipTitle = equipTitle;
	}

	public String getEquipWeapon() {
		return equipWeapon;
	}

	public void setEquipWeapon(String equipWeapon) {
		this.equipWeapon = equipWeapon;
	}

	public String getEquipArmor() {
		return equipArmor;
	}

	public void setEquipArmor(String equipArmor) {
		this.equipArmor = equipArmor;
	}

	@Override
	public String toString() {
		return "CharacterDTO [chrCode=" + chrCode + ", userNo=" + userNo + ", chrName=" + chrName + ", chrHp=" + chrHp
				+ ", chrMp=" + chrMp + ", chrExp=" + chrExp + ", chrLevel=" + chrLevel + ", chrGold=" + chrGold
				+ ", maxHp=" + maxHp + ", maxMp=" + maxMp + ", maxExp=" + maxExp + ", chrAtt=" + chrAtt + ", chrDef="
				+ chrDef + ", sfx=" + sfx + ", bgm=" + bgm + ", equipTitle=" + equipTitle + ", equipWeapon="
				+ equipWeapon + ", equipArmor=" + equipArmor + "]";
	}
	
}
