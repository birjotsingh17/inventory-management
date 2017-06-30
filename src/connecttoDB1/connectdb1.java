/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connecttoDB1;
import java.sql.Connection;
import java.sql.DriverManager;

public class connectdb1
{
    
    public static String userName = "root";
    public static String password = "";
    public static String url = "jdbc:mysql://localhost/inventry"; //student name of database
    public static String driver = "com.mysql.jdbc.Driver";
    public static Connection conn=null; //tells about connection
    static{
        try{
            Class.forName(driver); //forname fpass driver to front end file
            conn= DriverManager.getConnection(url, userName, password);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static Connection getConnection(){
        return conn;
    }}