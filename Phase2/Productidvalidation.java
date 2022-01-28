package com.ecommerce;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.sun.corba.se.pept.transport.Connection;

/**
 * Servlet implementation class Productidvalidation
 */
@WebServlet("/Productidvalidation")
public class Productidvalidation extends HttpServlet {
	private String jdbcUsername;
    private String jdbcPassword;
    private java.sql.Connection jdbcConnection;
	private String jdbcURL;
     
    public Productidvalidation(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
     
    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection( jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
     
    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
		public Productidsetails getproduct(int Id) throws SQLException {
			Productidsetails pro = null;
	        String sql = "SELECT * FROM product WHERE id = ?";
	         
	        connect();
	         
	        java.sql.PreparedStatement statement = jdbcConnection.prepareStatement(sql);
	        statement.setInt(1, Id);
	         
	        java.sql.ResultSet resultSet = statement.executeQuery();
	         
	        if (resultSet.next()) {
	            String id = resultSet.getString("productId");
	            String name = resultSet.getString("productName");
	            double price = resultSet.getDouble("price");
	             
	            pro = new Productidsetails(productId, productName, price);
	        }
	         
	        resultSet.close();
	        statement.close();
	         
	        return pro;
	    }	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
