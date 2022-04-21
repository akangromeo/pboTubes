/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.DriverManager; 
import java.sql.SQLException; 

/**
 *
 * @author DEAN AGNIA
 */
public class DLR {
private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getDLR(){
        if (koneksi ==null){
            try{
                //Connection con = DriverManager.getConnection("jdbc:mysql:localhost:3306/login");
                //Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/Login";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user, password);
                System.out.println("Connection Sukses");   
            }catch (SQLException ex){
                System.out.println("g konek");
            }
        }
        return koneksi;
    }
    
}
    

