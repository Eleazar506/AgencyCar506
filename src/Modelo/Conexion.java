
package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    public static String nameBd="agencynew";
    public static  String user = "postgres";
    public static  String password="zapatin04";
    public static String url="jdbc:postgresql://localhost:5432/";
    public static Statement s;
//    public static Connection conexion ;
    public static Connection con;
    
    public static void conectagency(){
        try{
            con=DriverManager.getConnection(url+"agencynew",user,password);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet queryusers(String tabla,String user, String passw){
        ResultSet rs=null;
        String query="select nameuser, contrasenia from "+tabla+" where nameuser=? and contrasenia=?";
        try{
           PreparedStatement ps = con.prepareStatement(query); 
           ps.setString(1, user);
           ps.setString(2, passw);
           rs=ps.executeQuery();
           
        }catch(SQLException e){
            System.out.println("ERROR");
        }
        return rs;
    }
    public static void closeBd(){
        try{
            con.close();
           // s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static boolean querydelete(String tabla,int id){
       boolean b=false;
        String query="DELETE FROM "+tabla+" where id=?";
        try{
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            b=true;
            //JOptionPane.showMessageDialog(null, "El registro se elimino correctamente","",JOptionPane.YES_OPTION);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return b;
    }
    public static ResultSet queryInventary(){
        ResultSet rs=null;
        String query="select * from automovil;";
        try{
            PreparedStatement ps= con.prepareStatement(query);
            rs=ps.executeQuery();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
    public static void querysInsertEmpleados(String idocurp, String nombre,
            String apellidoP, String apellidoM, String fechaN,String fechaI,
            String estado, String telefono,String mail, int idarea,
            String ubi, String horaEntrada,String horaSalida,String horaComida, int idpuesto){
            String query="INSERT INTO empleado values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        java.sql.Date fechaNac = java.sql.Date.valueOf(fechaN),fechaIngres=java.sql.Date.valueOf(fechaI); //Se castean los tipos de datos Date y ime
        java.sql.Time horaE = java.sql.Time.valueOf(horaEntrada),horaS=java.sql.Time.valueOf(horaSalida),horaC=java.sql.Time.valueOf(horaComida);
            try{
                
               PreparedStatement ps=con.prepareStatement(query);
               ps.setString(1,idocurp);
               ps.setString(2,nombre);
               ps.setString(3,apellidoP);
               ps.setString(4,apellidoM);
               ps.setDate(5,fechaNac);
               ps.setDate(6,fechaIngres);
               ps.setString(7,estado);
               ps.setString(8,telefono);
               ps.setString(9,mail);
               ps.setInt(10, idarea);
               ps.setString(11,ubi);
               ps.setTime(12,horaE);
               ps.setTime(13,horaS);
               ps.setTime(14,horaC);
               ps.setInt(15, idpuesto);
               ps.execute();
               JOptionPane.showMessageDialog(null,"Query exitosa");
               
           }catch(Exception e){
               System.out.println("Error en ps:"+e.getMessage());
           }
    }
    
}
