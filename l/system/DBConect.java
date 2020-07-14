/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.sql.*;
/**
 *
 * @author aashirbad JAY
 */
public class DBConect {
    static Connection cn;
    public static Connection dbConn() throws Exception 
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","cool");      
        return cn;
    }
    public static void main(String arh[])
    {
        try{
            
            System.out.println(dbConn());
            if(dbConn() != null)
            {
                System.out.println("Connected");
            }
            else
            {
                System.err.println("Not Connceted");
            }
            
        }catch( Exception e)
        {
            
        }
    }
}
    
