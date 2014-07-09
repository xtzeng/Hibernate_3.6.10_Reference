package com.trail.neutral.action;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Result;
import com.trail.neutral.action.base.BaseAction;
import com.trail.neutral.service.HelloService;

@Controller("helloAction")
@Scope("prototype")
public class HelloAction extends BaseAction{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="helloService")
	private HelloService helloService;
	
	/**
	 */
	private static final long serialVersionUID = 1L;

	public Result test() {
		helloService.hi();
		logger.info("hello,this is a test");
		return dispatch("/jsp/test.jsp");
	}
	
}
