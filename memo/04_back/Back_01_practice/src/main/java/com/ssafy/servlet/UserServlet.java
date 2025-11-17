package com.ssafy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.dto.Person;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	static List<Person> memory = new ArrayList<>();
	
	private static final long serialVersionUID = 1L;
	
//	@Override
//		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			doProcess(req, resp);
//		}
//	
//	@Override
//		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			//회원가입 요청이 왔다!
//			doProcess(req, resp);
//		}
//	
//	private void doProcess(HttpServletRequest req, HttpServletResponse resp) {
//		String act = req.getParameter("act");
//		//act: 등록, 조회, 수정, 삭제, ...
//	}
		
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String act = request.getParameter("act");
		switch (act) {
		case "regist":
			doRegist(request, response);
			break;
		case "getlist":
			doList(request, response);
			break;
		default:
			break;
		}
	}
	
	private void doList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<head>");
		writer.append("<title>회원정보</title>");
		writer.append("</head>");
		writer.append("<body>");
		writer.append("<h2>회원 목록</h2>");
		writer.append("<ul>");
		if(memory.size() > 0) {
			for(int i=0; i<memory.size(); i++) {
				writer.append("<li>");
				writer.append(memory.get(i).getName());
				writer.append("</li>");
			}
		} else {
			writer.append("<li>등록된 사람이 한명도 없다 </li>");
		}
		writer.append("</ul>");
		writer.append("</body>");
		writer.append("</html>");
	}

	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//회원 정보를 꺼내자~~
		//getParameter에는 key 값이 들어온다. (name 이라는 속성값)
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
		
		Person p = new Person(name, age, gender, hobbies);
		
		memory.add(p);
		
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<head>");
		writer.append("<title>등록정보</title>");
		writer.append("</head>");
		writer.append("<body>");
		writer.append("<h2>등록된 사람 정보</h2>");
		writer.append(p.toString());
		writer.append("</body>");
		writer.append("</html>");
		
	}
}
