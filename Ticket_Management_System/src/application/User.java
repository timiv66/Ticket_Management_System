package application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	
	final String DB_URL = "jdbc:mysql://localhost:3306/propertysystem";
	final String DB_USER = "root";  // Use your MySQL username
	final String DB_PASSWORD = "Dadman223!";  // Use your MySQL password

	private String userID, name, username, password, department;
	private int num_of_active_tickets, num_of_completed_tickets;

	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getNum_of_active_tickets() {
		return num_of_active_tickets;
	}

	public void setNum_of_active_tickets(int num_of_active_tickets) {
		this.num_of_active_tickets = num_of_active_tickets;
	}

	public int getNum_of_completed_tickets() {
		return num_of_completed_tickets;
	}

	public void setNum_of_completed_tickets(int num_of_completed_tickets) {
		this.num_of_completed_tickets = num_of_completed_tickets;
	}
	
	//Method that adds new user to the database
	public void addUsertoDB(String name, String username, String password, String department) {
		
	}
}
