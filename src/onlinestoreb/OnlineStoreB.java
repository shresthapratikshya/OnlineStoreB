/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package onlinestoreb;
import java.sql.*;

/**
 *
 * @author student
 */
public class OnlineStoreB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306:/OnlineStoreB","pratikshya","root");
       Statement statement=connection.createStatement();
       ResultSet resultSet=statement.executeQuery("select * from products");
        System.out.println("Name\t\tPrice\t\tStock");
        while(resultSet.next()){
            System.out.println(resultSet.getString(3)+"\t\tRs" + resultSet.getString(4)+"\t\t"+resultSet.getString(7)+resultSet.getString(6));
       
        }
        connection.close();
       
    }
    
}
