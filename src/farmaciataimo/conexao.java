/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmaciataimo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author H.Chirico
 */
public class conexao {
    
    static Connection con;
    static String driver= "com.mysql.cj.jdbc.Driver";
    static String url= "jdbc:mysql://localhost/farmaciataimo";
    static String user="root";
    static String pass="";
    
    
    public static Connection getconnection() throws Exception{
   if(con==null){
       Class.forName(driver);
       con=(Connection) DriverManager.getConnection(url, user, pass);
      
   }   
return con;   
    }
    
}
