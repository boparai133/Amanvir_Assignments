package com.learn.automation.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnection {

	public SqlConnection() {
		// TODO Auto-generated constructor stub
	}
	
	static String hostname = "localhost";
	static int port = 3306;
	static String username = "root";
	static String password = "root";
	static String dbqaautomation = "qaautomation";
	static String dbclassicmodels = "classicmodels";
	//static String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + databaseName ;

	public static void main(String[] args) {		 
       GetStudents(dbqaautomation);
       GetOffices(dbclassicmodels);       
	}
	
	static void GetStudents(String dbname) {
		
		String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbname ;
		 // SQL query to execute
        String query = "SELECT * from student"; // Change this to your table name
        
        // Establishing the com.learn.automation.database connection
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the com.learn.automation.database!");
            
            // Perform com.learn.automation.database operations here
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
         // Displaying the results
            while (resultSet.next()) {
                // Assuming the table has two columns named "column1" and "column2"
                int column1Value = resultSet.getInt("StudentId");
                String column2Value = resultSet.getString("Firstname");
                String column3Value = resultSet.getString("Lastname");
                System.out.println("StudentId: " + column1Value + ", Firstname: " + column2Value + ", Lastname: " + column3Value);
            }
             
            // Close the connection
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.out.println("Connection to the com.learn.automation.database failed: " + e.getMessage());
        }
		
	}
	
	static void GetOffices(String dbname) {
		String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbname ;
		 // SQL query to execute
       String query = "SELECT * from offices"; // Change this to your table name
       
       // Establishing the com.learn.automation.database connection
       try {
           Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
           System.out.println("Connected to the com.learn.automation.database!");
           
           // Perform com.learn.automation.database operations here
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(query);
           
        // Displaying the results
           while (resultSet.next()) {
               // Assuming the table has two columns named "column1" and "column2"
               int column1Value = resultSet.getInt("officecode");
               String column2Value = resultSet.getString("city");
               String column3Value = resultSet.getString("state");
               System.out.println("officecode: " + column1Value + ", city: " + column2Value + ", state: " + column3Value);
           }
            
           // Close the connection
           connection.close();
           System.out.println("Connection closed.");
       } catch (SQLException e) {
           System.out.println("Connection to the com.learn.automation.database failed: " + e.getMessage());
       }
		
	}
	 
	

}
