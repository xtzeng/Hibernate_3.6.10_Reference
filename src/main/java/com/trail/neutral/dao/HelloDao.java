package com.trail.neutral.dao;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.trail.neutral.pojos.Cat;

@Repository("helloDao")
public class HelloDao {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	public void save() {
		
		
		Cat cat = new Cat();
		cat.setName("喵喵");
		this.hibernateTemplate.save(cat);
		logger.info("save...");
	}
}
