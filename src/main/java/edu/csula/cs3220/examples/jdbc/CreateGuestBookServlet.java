package edu.csula.cs3220.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.List;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/jdbc/guestbook/create")
public class CreateGuestBookServlet extends HttpServlet {
    public void init () throws ServletException {
        // load driver
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch( ClassNotFoundException e ) {
            throw new ServletException( e );
        }
    }

	public void doGet( HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jdbc/guestbook-add.jsp")
        .forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("name");
	    String comment = request.getParameter("comment");

        Connection c = null;
        try {
            String url = "jdbc:mysql://localhost/cs3220_test";
            String username = "root";
            String password = "";

            // CS3 server example
            // String url = "jdbc:mysql://localhost/cs3220xstu25";
            // String username = "cs3220xstu25";
            // String password = "password";

            c = DriverManager.getConnection( url, username, password );
            Statement stmt = c.createStatement();

            PreparedStatement pstmt = c.prepareStatement("INSERT INTO guestbook (name, message) VALUES (?, ?)");
            pstmt.setString(1, name);
            pstmt.setString(2, comment);
            pstmt.executeUpdate();

            c.close();
        } catch( SQLException e ) {
            throw new ServletException( e );
        } finally {
            try
            {
                if( c != null ) c.close();
            }
            catch( SQLException e )
            {
                throw new ServletException( e );
            }
        }
        response.sendRedirect("../guestbook");
	}
}
