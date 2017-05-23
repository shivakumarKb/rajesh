package com.mccoy;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.BasicConfigurator;
public class DServlet extends HttpServlet {
	  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    int accno=Integer.parseInt(request.getParameter("accno"));
	    String name=request.getParameter("nme");
	    int bal=Integer.parseInt(request.getParameter("bal"));
	   int result=Test.Login(name, accno, bal) ;
	   if(result==1)
		{
			out.println("inserted");
		}
		else
		{
			out.println("try next time");
		}		  
	        
	}
}