package com.kkpjj.sysostory.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class AchievementsDAO {

	private Properties prop;

	public AchievementsDAO() {
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
}
