
package Controlador;

import javax.swing.table.DefaultTableModel;

public class CodeLogic {
    private static Object [] cabecera =  {"ID","TIPO","DESCRIPCIÓN","CANTIDAD","MARCA","MODELO","NUM.SERIE","PRECIO","NOMBRE"};
    private static DefaultTableModel modeloInventario=new DefaultTableModel();
    public static DefaultTableModel mkmodel(){
        modeloInventario.setColumnIdentifiers(cabecera);   
        return modeloInventario;
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
    
}
