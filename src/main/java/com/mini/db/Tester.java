package com.mini.db;

import java.sql.*;

public class Tester {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.fdbc.Driver");
            Connection conn = DriverManager
                    .getConnection("jdbc:mariadb://localhost:3306/demo?user=user&password=a131419c");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM drinks");
            while (rs.next()){
                int id = rs.getInt("id");
                String name =rs.getString("name");
                int price = rs.getInt("price");
                System.out.println(id + "/"+name +"/"+price);
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }



    }
}
