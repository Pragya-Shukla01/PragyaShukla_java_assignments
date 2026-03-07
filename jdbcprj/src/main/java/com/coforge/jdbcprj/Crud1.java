package com.coforge.jdbcprj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Crud1 {

    

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
     
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        String url = "jdbc:mysql://localhost:3306/cfgdb";
        String uname = "root";
        String password = "root";
        Connection con= DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");
        System.out.println("enter choice");
        Scanner sc =new Scanner(System.in);
        int choice=sc.nextInt();
        
        while (true) {
            System.out.println("\n===== USERS CRUD MENU =====");
            System.out.println("1. Insert User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. View All Users");
            System.out.println("5. View User By ID");
            System.out.println("6. Exit");
            System.out.print("Enter the operation to perform: ");

            switch (choice) {
                case 1: InsertUser(); break;
                case 2: UpdateUser(); break;
                case 3: DeleteUser(); break;
                case 4: SelectAllUsers(); break;
                case 5: SelectUserById(); break;
                case 6:
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void InsertUser() throws SQLException  {
        Scanner sc =new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/cfgdb";
        String uname = "root";
        String password = "root";
        Connection con= DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");
        System.out.println("\n--- Insert User ---");

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password1 = sc.nextLine();

        System.out.print("Enter userid (int): ");
        int userid = Integer.parseInt(sc.nextLine().trim());

        String query = "INSERT INTO user(username, password, userid) VALUES (?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, username);
        ps.setString(2, password1);
        ps.setInt(3, userid);

        int rows = ps.executeUpdate();
        System.out.println(rows + " row inserted");
    }

public static void UpdateUser() throws SQLException {
	   Scanner sc =new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/cfgdb";
    String uname = "root";
    String password = "root";
    Connection con= DriverManager.getConnection(url,uname,password);
    System.out.println("Connection Established");
        System.out.println("\n--- Update User ---");
        
        System.out.print("Enter new username: ");
        String username = sc.nextLine();

        System.out.print("Enter userid to update: ");
        int userid = Integer.parseInt(sc.nextLine().trim());

        

        System.out.print("Enter new password: ");
        String password2 = sc.nextLine();

        String query = "UPDATE user SET username=?, password=? WHERE userid=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, username);
        ps.setString(2, password2);
        ps.setInt(3, userid);

        int rows = ps.executeUpdate();
        System.out.println(rows + " row updated");
    }

public static void DeleteUser() throws SQLException {
	   Scanner sc =new Scanner(System.in);
	    String url = "jdbc:mysql://localhost:3306/cfgdb";
	    String uname = "root";
	    String password = "root";
	    Connection con= DriverManager.getConnection(url,uname,password);
	    System.out.println("Connection Established");
	
       System.out.println("\n--- Delete User ---");

       System.out.print("Enter userid to delete: ");
       int userid = Integer.parseInt(sc.nextLine().trim());

       String query = "DELETE FROM users WHERE userid=?";
       PreparedStatement ps = con.prepareStatement(query);
       ps.setInt(1, userid);

       int rows = ps.executeUpdate();
       System.out.println(rows + " row deleted");
   }

public static void SelectAllUsers() throws SQLException{
	  Scanner sc =new Scanner(System.in);
	    String url = "jdbc:mysql://localhost:3306/cfgdb";
	    String uname = "root";
	    String password = "root";
	    Connection con= DriverManager.getConnection(url,uname,password);
	    System.out.println("Connection Established");
	   System.out.println("\n--- All Users ---");

	        String query = "SELECT username, password, userid FROM user ORDER BY userid";
	        PreparedStatement ps = con.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();

	        boolean any = false;
	        while (rs.next()) {
	            any = true;
	            System.out.println(
	                rs.getString("username") + "  " +
	                rs.getString("password") + "  " +
	                rs.getInt("userid")
	            );
	        }
	        if (!any) {
	            System.out.println("(no rows)");
	        }
	    }

public static void SelectUserById() throws SQLException {
	 Scanner sc =new Scanner(System.in);
	    String url = "jdbc:mysql://localhost:3306/cfgdb";
	    String uname = "root";
	    String password = "root";
	    Connection con= DriverManager.getConnection(url,uname,password);
	    System.out.println("Connection Established");
	
	 System.out.println("\n--- User By ID ---");

	    System.out.print("Enter userid: ");
	    int userid = Integer.parseInt(sc.nextLine().trim());

	    String query = "SELECT username, password, userid FROM user WHERE userid=?";
	    PreparedStatement ps = con.prepareStatement(query);
	    ps.setInt(1, userid);

	    ResultSet rs = ps.executeQuery();

	    if (rs.next()) {
	        System.out.println(
	            rs.getString("username") + "  " +
	            rs.getString("password") + "  " +
	            rs.getInt("userid")
	        );
	    } else {
	        System.out.println("No user found");
	    }

}


}