/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API.SIST;

public class ConstantesDeBaseDeDatos {
    
    private final String HOST_NAME = "127.0.0.1";
    public final static String DATABASE_NAME = "punto_venta";
    private final String PORT = "3306";
    private final String JDBC = "mysql";
    public final String USERNAME = "root";
    public final String PASSWORD = "";
    //---Users-LOCALHOST
    //public final String USERNAME = "User_02"; //User 02
    //public final String PASSWORD = "Password_02"; //User 02
    
    //public final String USERNAME = "User_03"; //User 03
    //public final String PASSWORD = "Password_03"; //User 03
    
    //--Database Full URL
    //public final String DATABASE_URL = "jdbc:"+this.JDBC+"://"+this.HOST_NAME+":"+this.PORT+"/"+this.DATABASE_NAME;
    public final String DATABASE_URL = "jdbc:"+this.JDBC+"://"+this.HOST_NAME+"/"+this.DATABASE_NAME;
}