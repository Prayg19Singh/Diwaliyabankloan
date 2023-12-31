package com.jtc4.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="random", urlPatterns="/form.action")
public class RegisterServlet extends HttpServlet{
	public void init(ServletConfig sc) {
		
	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		// collect the data
		String name1=req.getParameter("fname");
		String mail=req.getParameter("email");
		String fone=req.getParameter("phone");
		String gend=req.getParameter("gender");
		String time=req.getParameter("timings");
		String other=req.getParameter("remarks");
		String Courses[]=req.getParameterValues("mycourses");
		System.out.println("\n********");
		System.out.println(time);
		System.out.println(name1);
		System.out.println(mail);
		System.out.println(fone);
		System.out.println(gend);
		System.out.println(other);
		for(String c:Courses) {
			System.out.println(c);
		}
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<h3> Your Registration is Successful</h3>");
		out.print("<h4> PrayagNS </h4>");
		out.print("<h4> 10:00AM-12:00PM </h4>");
		out.print("<h4> pryag@gmail </h4>");
		out.print("<h4> 7676899543 </h4>");
		out.print("<h4> male </h4>");
		out.print("<h4> better than previous </h4>");
		out.print("<h4> Java and Web Developer </h4>");
	}
	public void destroy() {
		
	}
}
