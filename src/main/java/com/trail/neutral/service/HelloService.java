package com.trail.neutral.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.trail.neutral.dao.HelloDao;

@Service("helloService")
public class HelloService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="helloDao")
	private HelloDao helloDao;
	
	public void hi() {
		
		helloDao.save();
		logger.info("hello this is in service");
	}
}
