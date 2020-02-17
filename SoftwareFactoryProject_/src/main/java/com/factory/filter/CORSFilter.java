package com.factory.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * - 过滤层 - CORSFilter类
 * @author south wind
 * @version v1.0 2020年2月16日 下午3:00:24
 * - 表/功能：
 */

//注释，即未使用：	/@Component
public class CORSFilter implements Filter {
	
	private static Logger log = Logger.getLogger(CORSFilter.class);
	
	/*		解决跨域方法 - 3、采用过滤器的方式							
	 * 		成功
	 * 																	*/
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		log.debug("进入过滤器：CORSFilter - doFilter");
		
        HttpServletResponse res = (HttpServletResponse) response;
        res.addHeader("Access-Control-Allow-Credentials", "true");
        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        res.addHeader("Access-Control-Allow-Headers", "Content-Type,X-CAF-Authorization-Token,sessionToken,X-TOKEN");
        if (((HttpServletRequest) request).getMethod().equals("OPTIONS")) {
            response.getWriter().println("ok");
            return;
        }
        chain.doFilter(request, response);
	}
	
    @Override
    public void destroy() {
    }
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }													//				*/
	
}
