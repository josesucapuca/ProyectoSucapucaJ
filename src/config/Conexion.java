/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alum.fial8
 */
public class Conexion {
    private static Connection conex=null;
    private static String url ="jdbc:mysql://localhost/dbvisitas";
    private static String usuario="root";
    private static String clave="root";
    
   public static Connection getConexion() throws ClassNotFoundException, SQLException{

            Class.forName("com.mysql.jdbc.Driver");
            if(conex==null)
            {
                conex=DriverManager.getConnection(url,usuario,clave);
                
            }else{
                conex=null;
            }
        return conex;
    }
}
