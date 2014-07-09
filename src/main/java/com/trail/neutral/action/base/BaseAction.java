package com.trail.neutral.action.base;


import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Result;

public class BaseAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	protected Result dispatch(String location) {
		return new ServletDispatcherResult(location);
	}

	protected Result dispatch() {
		return new DefaultServletDispatcherResult();
	}
	
	protected Result tilesDispatch() {
		return new TilesServletDispatcherResult();
	}
	
	protected Result redirect(String location) {
		return new RedirectResult(location);
	}

	protected Result text(String text) {
		return new TextResult(text);
	}

    protected Result validateResult() {
        return dispatch("/commons/validate-result.jsp");
    }

    protected Result json(Object responseObject) {
        return new JSONResult(responseObject);
    }
	
	

}
