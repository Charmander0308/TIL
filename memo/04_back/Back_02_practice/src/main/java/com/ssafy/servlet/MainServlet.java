package com.ssafy.servlet;

import java.io.IOException;
import java.util.List;

import com.ssafy.dto.Person;
import com.ssafy.manager.PersonManager;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//GET, POST PUT, DELETE, ...
	
	
	private PersonManager manager = PersonManager.getManager();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(request.getMethod());
//		System.out.println(request.getContextPath());
		String act = request.getParameter("act");
		
		switch (act) {
		case "regist":
			doRegist(request, response);
			break;
		case "list":			
			doList(request, response);
			break;
		default:
			break;
		}
	}
	
	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Person> pList = manager.getList();
		
		request.setAttribute("pList", pList);
		
		request.getRequestDispatcher("/WEB-INF/13_list.jsp").forward(request, response);
	}

	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
		
		Person p = new Person(name, age, gender, hobbies);
		
		manager.getManager().add(p);
		
		//12_result.jsp로 보내겠다
		request.setAttribute("person", p);
		
		//1. 포워딩 방식으로 해보즈아~~
//		RequestDispatcher disp = request.getRequestDispatcher("/12_result.jsp");
//		disp.forward(request, response);
		//이렇게도 가능(1회성이니까)
//		RequestDispatcher disp = request.getRequestDispatcher().forward(request, response);
		
		//2. 리다이렉트 방식으로 해보즈아
//		response.sendRedirect("/12_result.jsp");	//포워딩을 할 때는 문제가 없었다!
//		response.sendRedirect(request.getContextPath() + "/12_result.jsp");
		response.sendRedirect("https://edu.ssafy.com");
		
	}
	
	
	
}
