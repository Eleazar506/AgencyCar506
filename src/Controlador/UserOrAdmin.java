
package Controlador;

import Modelo.Conexion; //Importamos la capa modelo
import static Modelo.Conexion.queryInventary;
import Vista.Inventario;
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
    
    public static Object[] consultaInv(){
       //Object [] inv1 = {}; 
       int cont=0;
        Object [] inv = {};
        ResultSet rs=queryInventary();
        try{
            while(rs.next()==true){
                inv = new Object[]{rs.getString("id"),rs.getString("tipo"),rs.getString("descripcion"),
                    rs.getString("cantidad"),rs.getString("marca"),rs.getString("modelo"),rs.getString("num_serie"),
                    rs.getString("precio"),rs.getString("nombre")};
                  Inventario.modeloInventario.addRow(inv);
                  Inventario.tableInventario.setModel(Inventario.modeloInventario);
            }
            return inv;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return inv;
    }
    
    public static void deleteCar(int idcar){
        boolean b=Conexion.querydelete("automovil",idcar);
        if(b){
            Inventario.btnConsulta.doClick();
        }
    }
}
//    CREATE TABLE automovil (
//    id SERIAL PRIMARY KEY,           
//    tipo VARCHAR(50) NOT NULL,       
//    descripcion TEXT,                 
//    cantidad INT,                     
//    marca VARCHAR(50) NOT NULL,       
//    modelo VARCHAR(50) NOT NULL,      
//    num_serie VARCHAR(50) UNIQUE,     
//    precio NUMERIC(10, 2),
//	nombre VARCHAR(35)
//);