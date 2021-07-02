package com.kkpjj.sysostory.model.dto;

public class StoryDTO implements java.io.Serializable {
	
//	STORY_CODE	NUMBER
//	CHAP_TITLE	VARCHAR2(20 BYTE)
//	CHAP_SCRIPT	VARCHAR2(150 BYTE)
								
	
	private int storyCode;
	private String chapTitle;
	private String chapScript;
	
	public StoryDTO() {
		
	}

	public StoryDTO(int storyCode, String chapTitle, String chapScript) {
		super();
		this.storyCode = storyCode;
		this.chapTitle = chapTitle;
		this.chapScript = chapScript;
	}

	public int getStoryCode() {
		return storyCode;
	}

	public String getChapTitle() {
		return chapTitle;
	}

	public String getChapScript() {
		return chapScript;
	}

	public void setStoryCode(int storyCode) {
		this.storyCode = storyCode;
	}

	public void setChapTitle(String chapTitle) {
		this.chapTitle = chapTitle;
	}

	public void setChapScript(String chapScript) {
		this.chapScript = chapScript;
	}

	@Override
	public String toString() {
		return "StoryDTO [storyCode=" + storyCode + ", chapTitle=" + chapTitle + ", chapScript=" + chapScript + "]";
	}
	
}
