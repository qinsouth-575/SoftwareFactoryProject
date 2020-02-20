package com.factory.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CommonIntercepter implements HandlerInterceptor{
	
	private static Logger log = Logger.getLogger(CommonIntercepter.class);

	/**
     *	预处理回调方法，实现处理器的预处理
     * 	返回值：true表示继续流程；false表示流程中断，不会继续调用其他的拦截器或处理器
     */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.debug("CommonIntercepter -    preHandle    - 当前拦截地址为：" + request.getRequestURI());
		//允许跨域,不能放在postHandle内
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		if (request.getMethod().equals("OPTIONS")) {
			response.addHeader("Access-Control-Allow-Methods", "GET,HEAD,POST,PUT,DELETE,TRACE,OPTIONS,PATCH");
			response.addHeader("Access-Control-Allow-Headers", "Content-Type, Accept, Authorization");
		}
		
		return true;
	}
	
	/**
     *	后处理回调方法，实现处理器（controller）的后处理，但在渲染视图之前
     *	此时我们可以通过modelAndView对模型数据进行处理或对视图进行处理
     */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		log.debug("CommonIntercepter -    postHandle   - 当前拦截地址为：" + request.getRequestURI());
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	/**
     *	整个请求处理完毕回调方法，即在视图渲染完毕时回调，
     *	如性能监控中我们可以在此记录结束时间并输出消耗时间，
     *	还可以进行一些资源清理，类似于try-catch-finally中的finally，
     *	但仅调用处理器执行链中
     */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		log.debug("CommonIntercepter - afterCompletion - 当前拦截地址为：" + request.getRequestURI());
		
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
