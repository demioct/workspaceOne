package com.demioct.springcloud.zuulfilter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class MyFilter extends ZuulFilter {
	
	private final Logger logger = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public String filterType() {
		//定义filter的类型，有pre、route、post、error四种
		return "pre";
	}

	@Override
	public int filterOrder() {
		//定义filter的顺序，数字越小表示顺序越高，越先执行
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		//表示是否需要执行该filter，true表示执行，false表示不执行
		return false;
	}

	@Override
	public Object run() {
		//filter需要执行的具体操作
		 RequestContext ctx = RequestContext.getCurrentContext();
	        HttpServletRequest request = ctx.getRequest();

	        logger.info("--->>> TokenFilter {},{}", request.getMethod(), request.getRequestURL().toString());

	        String token = request.getParameter("token");// 获取请求的参数

	        if (StringUtils.isNotBlank(token)) {
	            ctx.setSendZuulResponse(true); //对请求进行路由
	            ctx.setResponseStatusCode(200);
	            ctx.set("isSuccess", true);
	            return null;
	        } else {
	            ctx.setSendZuulResponse(false); //不对其进行路由
	            ctx.setResponseStatusCode(400);
	            ctx.setResponseBody("token is empty");
	            ctx.set("isSuccess", false);
	            return null;
	        }
	}
}
