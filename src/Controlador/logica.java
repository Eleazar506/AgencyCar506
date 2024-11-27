
package Controlador;

import Modelo.Conexion;
import javax.swing.JOptionPane;
/**
 *
 * @author chay
 */
public class logica {
    public static void insertaE(String idocurp, String nombre,
            String apellidoP, String apellidoM, String fechaN,String fechaI,
            String estado, String telefono,String mail, int idarea,
            String ubi, String horaEntrada,String horaSalida,String horaComida, int idpuesto){
        JOptionPane.showMessageDialog(null,"Entro a logica");
        Conexion.querysInsertEmpleados( idocurp,  nombre,
             apellidoP,  apellidoM,  fechaN, fechaI,
             estado,  telefono, mail,  idarea,
             ubi,  horaEntrada, horaSalida, horaComida,  idpuesto);
    }
}
