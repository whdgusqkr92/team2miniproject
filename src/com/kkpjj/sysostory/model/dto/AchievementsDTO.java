package com.kkpjj.sysostory.model.dto;

public class AchievementsDTO implements java.io.Serializable{

	
	
//	ACH_CODE	NUMBER	No		1	업적코드
//	ACH_NAME	VARCHAR2(20 BYTE)	No		2	업적명
//	ACH_CLR_SCRIPT	VARCHAR2(150 BYTE)	No		3	달성조건내용
//	ACH_CLR_CONDITION	NUMBER	No		4	업적달성조건
	
	
	private int achCode;					//업적코드
	private String achName;					//업적명
	private String achClrScript;			//달성조건내용
	private int achClrCondition;			//업적달성조건
	
	
	AchievementsDTO(){}


	public AchievementsDTO(int achCode, String achName, String achClrScript, int achClrCondition) {
		super();
		this.achCode = achCode;
		this.achName = achName;
		this.achClrScript = achClrScript;
		this.achClrCondition = achClrCondition;
	}


	public int getAchCode() {
		return achCode;
	}


	public void setAchCode(int achCode) {
		this.achCode = achCode;
	}


	public String getAchName() {
		return achName;
	}


	public void setAchName(String achName) {
		this.achName = achName;
	}


	public String getAchClrScript() {
		return achClrScript;
	}


	public void setAchClrScript(String achClrScript) {
		this.achClrScript = achClrScript;
	}


	public int getAchClrCondition() {
		return achClrCondition;
	}


	public void setAchClrCondition(int achClrCondition) {
		this.achClrCondition = achClrCondition;
	}


	@Override
	public String toString() {
		return "AchievementsDTO [achCode=" + achCode + ", achName=" + achName + ", achClrScript=" + achClrScript
				+ ", achClrCondition=" + achClrCondition + "]";
	}
	
	
	
	
}
