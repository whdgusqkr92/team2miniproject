package com.kkpjj.sysostory.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.kkpjj.sysostory.model.dto.StoryDTO;

import static com.kkpjj.common.JDBCTemplate.close;

public class StoryDAO {
	
	private Properties prop;
	
	public StoryDAO() {
		this.prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/syso-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public StoryDTO selectStoryContent(Connection con, int storyCode) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		StoryDTO story = null;
		
		String query = prop.getProperty("selectStory");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, storyCode);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				story = new StoryDTO();
				story.setChapScript(rset.getString("CHAP_SCRIPT"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return story;
	}
	
}