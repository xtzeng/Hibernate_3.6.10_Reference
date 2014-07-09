package com.trail.neutral.dao;


import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.trail.neutral.pojos.Cat;

@Repository("helloDao")
public class HelloDao extends HibernateDaoSupport{

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	public void save() {
		
		
		Session session = this.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Cat cat = new Cat();
		cat.setName("喵喵");
		session.save(cat);
		session.getTransaction().commit();
		logger.info("save...");
	}
}
