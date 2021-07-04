package com.kkpjj.sysostory.model.service;

import java.sql.Connection;
import java.util.List;

import com.kkpjj.sysostory.model.dao.StoryDAO;
import com.kkpjj.sysostory.model.dto.StoryDTO;

import static com.kkpjj.common.JDBCTemplate.close;

import static com.kkpjj.common.JDBCTemplate.getConnection;

public class StoryService {

	StoryDAO storyDAO = new StoryDAO();

	public StoryDTO selectStoryContent(int storyCode) {

		Connection con = getConnection();

		StoryDTO storyContent = storyDAO.selectStoryContent(con, storyCode); 

		close(con);

		return storyContent;
	}

	public List<StoryDTO> selectTitleStory(String chapTitle) {

		Connection con = getConnection();

		List<StoryDTO> storyContent = storyDAO.selectTitleStory(con, chapTitle); 

		close(con);

		return storyContent;

	}


}
