package com.coffee.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FirstFilter
 */
@WebFilter("/*")
public class FirstFilter implements Filter {

    public FirstFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter start");
		Map<String, String[]> map=request.getParameterMap();
		 Iterator<String> keys = map.keySet().iterator();
	   String key=null;
	   String[] values=null;
	    while (keys.hasNext()) {
			key =  keys.next();
			values=map.get(key);
			System.out.println("key:"+key+" values:"+new String(Arrays.toString(values).getBytes("iso-8859-1"),"utf-8"));		
	}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter init");
	}

}
