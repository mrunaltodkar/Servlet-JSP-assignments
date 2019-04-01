package com.capgemini.newspaper.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/getNews" }, loadOnStartup = 1)
public class NewsPaperController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewsPaperController() {
        
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String path = request.getParameter("paper");
		
		if (path.equals("toi")) {
			response.sendRedirect("http://www.timesofindia.com");
		}

		else if (path.equals("eco")) {
			response.sendRedirect("https://economictimes.indiatimes.com/");
		}

		else if (path.equals("mata")) {
			response.sendRedirect("https://maharashtratimes.indiatimes.com/");
		}

		else if (path.equals("dna")) {
			response.sendRedirect("https://www.dnaindia.com/");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
