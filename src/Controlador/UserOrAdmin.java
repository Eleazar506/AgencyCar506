
package Controlador;

import Modelo.Conexion; //Importamos la capa modelo
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author chay
 */
public class UserOrAdmin {
    public static Conexion conn = new Conexion();
    private static ArrayList adminOuser = new ArrayList();
    
    
    public static ArrayList verificaAdmin(String user, String password){
        adminOuser.clear();
       // String query="SELECT nameuser, contrasenia FROM administradores WHERE nameuser='"+user+"' AND contrasenia='"+password+"';";
   
        ResultSet rs=conn.queryusers("administradores",user,password);
        if(rs!=null){
            try{
                while(rs.next()==true){
                    adminOuser.addLast(rs.getString("nameuser"));
                    adminOuser.addLast(rs.getString("contrasenia"));
                    
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al consultar");
            }
        }
        return adminOuser;
        
    }
    
    public static ArrayList verificaConta(String user, String password){
          adminOuser.clear();
       // String query="SELECT nameuser, contrasenia FROM contadores WHERE nameuser='"+user+"' AND contrasenia='"+password+"';";
   
        ResultSet rs=conn.queryusers("contadores",user,password);
        if(rs!=null){
            try{
                while(rs.next()==true){
                    adminOuser.addLast(rs.getString("nameuser"));
                    adminOuser.addLast(rs.getString("contrasenia"));
                    
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error al consultar");
            }
        }
        return adminOuser;
    }
}
