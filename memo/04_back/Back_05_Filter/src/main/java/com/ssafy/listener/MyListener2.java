package com.ssafy.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyListener2 implements ServletContextListener {

    public MyListener2() {
    	
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("웹 어플리케이션 시작할 때 호출");
    	
    	
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("웹 어플리케이션 종료할 때 호출");
    }
	
}
