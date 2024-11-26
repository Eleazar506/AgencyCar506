
package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    public static String nameBd="agencynew";
    public static  String user = "postgres";
    public static  String password="zapatin04";
    public static String url="jdbc:postgresql://localhost:5432/";
    public static Statement s;
    public static Connection conexion ;
    
    
    
    
    public static void conectaBd(){
        try{
            conexion = DriverManager.getConnection(url+nameBd, user, password);
            s = conexion.createStatement();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static ResultSet querys(String query){
        ResultSet rs=null;
        try{
            rs=s.executeQuery(query);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        return rs;    
    }
    
    public static void closeBd(){
        try{
            s.close();
        }catch(Exception e){
            System.out.println("");
        }
    }
    
    
}
