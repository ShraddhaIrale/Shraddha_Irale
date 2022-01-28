package com.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductidConnect {

	 protected static Connection initializeDatabase()
		        throws SQLException, ClassNotFoundException
		    {
		        // Initialize all the information regarding
		        // Database Connection
		        String dbDriver = "com.mysql.jdbc.Driver";
		        String dbURL = "jdbc:mysql:// localhost:3306/db_world";
		        // Database name to access
		        String dbName = "db_world";
		        String dbUsername = "root";
		        String dbPassword = "root";
		  
		        Class.forName(dbDriver);
		        Connection con = DriverManager.getConnection(dbURL + dbName,  dbUsername,  dbPassword);
		        return con;
		    }

}
