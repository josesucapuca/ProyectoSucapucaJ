/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

/**
 *
 * @author alum.fial8
 */
public class Conexion {
    private static Connection conex=null;
    private static String url ="jdbc:mysql://localhost/dbvisitas";
    private static String usuario="root";
    private static String Usuario="root";
    
    public void Connection getConexion()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            if(conex==null)
            {
                conex=DriverManager.getConnection(url,usuario,clave);
                
            }else{
                conex=null;
            }
        }catch(classNotFoundExeption |SQLExeption e){
            JOptionPane.showMessageDialog(null,e);
        }
        return conex;
    }
}
