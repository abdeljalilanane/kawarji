/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.metier;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wael Mallek
 */
public class MyConnection {
    
    private  static  Connection conn;
    private static final String url= "jdbc:mysql://localhost:3306/";
    private static final String dbName = "java";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String userName = "root";
    private static final String password = "";
    
    private MyConnection(){
        try {
            Class.forName(driver);
                   conn = DriverManager.getConnection(url + dbName, userName, password);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
                Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
          
           
    
    }
    public static  Connection getInstance(){
    if(conn==null)
        new MyConnection();
    return  conn;
    }
}
