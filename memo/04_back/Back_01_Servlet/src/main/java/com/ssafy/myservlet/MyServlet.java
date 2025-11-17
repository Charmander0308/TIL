package com.ssafy.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//단순한 클래스야 -> 서블릿으로 바꿔야한다!
public class MyServlet extends HttpServlet{
	//객체직렬화를 위한 UID 설정하지 않아서 노란줄 일뿐
	
	//doXXXXX 한개는 존재해야한다!
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;characterset=UTF-8");
		PrintWriter writer = response.getWriter();
//		writer.write("<html>");
//		writer.write("<head>");
//		writer.write("<title>Hello! SSAFY!</title>");
//		writer.write("</head>");
//		writer.write("<body>");
//		writer.write("<h1>Hello! Servlet!</h1>");
//		writer.write("<p>Hello! SSAFY</p>");
//		writer.write("</body>");
//		writer.write("</html>");
		
		//Java 15 버전에 나온 Block String
		writer.write("""
		<html>
		  <head><title>Hello! SSAFY!</title></head>
		  <body>
		    <h1>Hello! Servlet1!</h1>
		  </body>
		</html>
		""");
	}
}
