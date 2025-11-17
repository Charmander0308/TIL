package com.ssafy.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    public MyListener() {
    	
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext context = sce.getServletContext();
    	
    	System.out.println("웹 어플리케이션 시작할 때 호출2");
    	System.out.println(context.getInitParameter("welcome"));
    	
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("웹 어플리케이션 종료할 때 호출2");
    }
	
}
