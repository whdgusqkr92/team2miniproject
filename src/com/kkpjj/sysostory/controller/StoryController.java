package com.kkpjj.sysostory.controller;

import com.kkpjj.sysostory.model.dto.StoryDTO;
import com.kkpjj.sysostory.model.service.StoryService;

public class StoryController {
	
	private StoryService storyService;
	StoryDTO storyDTO = null;
	
	public StoryController() {
		this.storyService = new StoryService();
		this.storyDTO = new StoryDTO();
	}
	
	
	// 스토리 코드에 대한 스토리 내용 조회용 메소드
	public String selectStoryContents(int storyCode) {
		
		StoryDTO story = storyService.selectStoryContent(storyCode);
		
		// OpMainPage.java 뷰 페이지로 전달해야 됨
		String result = story.getChapScript();
		
		return result;
		
	}

//스토리 타이틀 ending에 대한 스크립트 쫙 뽑고 싶은데 안되네 nullpoint에러뜸
	public String selectTitleStory(String chapTitle) {
		StoryDTO story = storyService.selectTitleStory(chapTitle);
		
		// OpMainPage.java 뷰 페이지로 전달해야 됨
		String result = story.getChapScript();
		return result;
	}
	
}
