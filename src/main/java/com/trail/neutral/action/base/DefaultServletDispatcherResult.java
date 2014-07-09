package com.trail.neutral.action.base;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

@SuppressWarnings("serial")
public class DefaultServletDispatcherResult extends ServletDispatcherResult {

    @Override
    public void execute(ActionInvocation invocation) throws Exception {
        ActionProxy actionProxy = invocation.getProxy();
        String location = String.format("/%s.tiles", actionProxy.getActionName());
        //System.out.println(location);
        super.doExecute(location, invocation);
    }
}
