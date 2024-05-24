package com.example.demo;

import java.io.IOException;

public class HelloServlet extends HttpServlet. {
public HelloServlet() {
	System.out.println("===> HelloServlet 객체 생성");
}

protected void doGet (HttpServletRequest. request,
		HttpServletRespones response) throws ServletException, IOException {
	System.out.println("doGet() 메소드 호출");
}
}
