package com.trail.neutral.dao.base;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


@Repository("baseDao")
public class BaseDao extends HibernateDaoSupport{

	private SessionFactory sessionFactory;


	@Autowired  
    public void setSessionFactoryOverride(SessionFactory sessionFactory)  {   
        super.setSessionFactory(sessionFactory);   
    }  
	
}
