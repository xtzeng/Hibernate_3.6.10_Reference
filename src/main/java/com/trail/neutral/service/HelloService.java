package com.trail.neutral.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.trail.neutral.dao.HelloDao;
import com.trail.neutral.dao.TestDao;
import com.trail.neutral.pojos.Cat;

@Service("helloService")
public class HelloService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="helloDao")
	private HelloDao helloDao;
	
	@Resource(name="testDao")
	private TestDao testDao;
	
	public void hi() {
		
		helloDao.save();
		Cat cat = new Cat();
		cat.setName("秘密");
		testDao.getHibernateTemplate().save(cat);
		logger.info("hello this is in service");
	}
}
