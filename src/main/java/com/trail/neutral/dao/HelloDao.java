package com.trail.neutral.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void save() {
		logger.info("save...");
	}
}
