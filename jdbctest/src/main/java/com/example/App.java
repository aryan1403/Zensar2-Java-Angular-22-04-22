package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register the Driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            String name = "Veer";
            String query = "insert into test1 values('"+ name+ "', 13, 1234);";
            PreparedStatement ps = con.prepareStatement(query);

            ps.execute();
            // ResultSet rs = ps.executeQuery();

            // System.out.println("Names :-");
            /* while(rs.next()) {
                System.out.println(rs.getString("name"));
            } */

            con.close();
        } catch(SQLException | ClassNotFoundException se) {
            System.out.println(se.getMessage());
        }
    }
}
