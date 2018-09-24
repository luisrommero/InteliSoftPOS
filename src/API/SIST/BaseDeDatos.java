/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API.SIST;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class BaseDeDatos {

    //--Attributes
    public Connection ConexionActual = null;
    private String lastMessage = "";

    private boolean CargarDriverDeMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return (true);
        } catch (Exception E) {
            System.out.println(">> No se ha podido cargar el 'JDBC Driver' para MySQL.");
            return (false);
        }
    }

    public boolean Conectar() {
        ConstantesDeBaseDeDatos ConstantesBD = new ConstantesDeBaseDeDatos();
        try {
            this.CargarDriverDeMySQL();
            this.ConexionActual = DriverManager.getConnection(ConstantesBD.DATABASE_URL, ConstantesBD.USERNAME, ConstantesBD.PASSWORD);
            return (true);
        } catch (SQLException E) {
            System.out.println(">> Error al conectarse a la base de datos. (Class: BaseDeDatos | Method: Concetar) - " + E.getMessage());
            return (false);
        }
    }

    private boolean IsConectada() {
        if (this.ConexionActual != null) {
            return (true);
        } else {
            return (false);
        }
    }

    public boolean CerrarConexion() {
        if (this.IsConectada()) {
            try {
                this.ConexionActual.close();
                this.ConexionActual = null;
                return (true);
            } catch (SQLException E) {
                System.out.println(">> Error al cerrar la conexion a la base de datos.");
                return (false);
            }
        } else {
            return (true);
        }
    }

    public ArrayList<ArrayList<String>> EjecutarSentenciaSELECT(String Query) {
        if (this.Conectar()) {
            Statement Statement = null;
            ResultSet ResultSet = null;
            //--
            try {
                Statement = this.ConexionActual.createStatement();
                ResultSet = Statement.executeQuery(Query);
                //--
                ArrayList<ArrayList<String>> ListaDeFilas = new ArrayList<ArrayList<String>>();
                //--
                while (ResultSet.next()) {
                    int NumCols = ResultSet.getMetaData().getColumnCount();
                    //System.out.println(">>NumCols:"+NumCols);
                    ArrayList<String> ListaDeColumnas = new ArrayList<String>();
                    //--
                    for (int i = 1; i <= NumCols; i++) {
                        String ContenidoDeCampo = ResultSet.getString(i);
                        //System.out.println(">>ContenidoDeCampo["+i+"]:"+ContenidoDeCampo);
                        ListaDeColumnas.add(ContenidoDeCampo);
                    }
                    //--
                    ListaDeFilas.add(ListaDeColumnas);
                }
                //--
                return (ListaDeFilas);
            } catch (SQLException E) {
                System.out.println(">> Error al ejecutar sentencia SELECT (Class: BaseDeDatos | Method: EjecutarSentenciaSELECT)(Ver Siguiente Línea)");
                System.out.println(Query);
                return (null);
            } finally {
                this.CerrarConexion();
            }
        } else {
            return (null);
        }
    }

    public int EjecutarSentenciaINSERT(String Query) {
        //--Recodificar Query
        try {
            //Query.getBytes("ISO-8859-1").toString();
            Query = new String(Query.getBytes("UTF-8"), "UTF-8");
        } catch (Exception E) {
            System.out.println(">Error al recodificar Query (Class: BaseDeDatos | Method: EjecutarSentenciaINSERT)");
        }
        //--
        if (this.Conectar()) {
            Statement Statement = null;
            int RowCount = 0;
            //--
            try {
                Statement = this.ConexionActual.createStatement();
                RowCount = Statement.executeUpdate(Query);
            } catch (SQLException E) {
                System.out.println(">> Error al ejecutar sentencia INSERT (Class: BaseDeDatos | Method: EjecutarSentenciaINSERT)[Ver Siguiente Línea]");
                System.out.println(Query);
                return (0);
            } finally {
                this.CerrarConexion();
                return (RowCount);
            }
        } else {
            return (0);
        }
    }

    public int EjecutarSentenciaUPDATE(String Query) {
        //--Recodificar Query
        try {
            //Query.getBytes("ISO-8859-1").toString();
            Query = new String(Query.getBytes("UTF-8"), "UTF-8");
        } catch (Exception E) {
            System.out.println(">Error al recodificar Query (Class: BaseDeDatos | Method: EjecutarSentenciaUPDATE) " + Query);
        }
        //--
        if (this.Conectar()) {
            Statement Statement = null;
            int RowCount = 0;
            //--
            try {
                Statement = this.ConexionActual.createStatement();
                RowCount = Statement.executeUpdate(Query);
            } catch (SQLException E) {
                System.out.println(Query);
                System.out.println(">> Error al ejecutar sentencia UPDATE");
                return (0);
            } finally {
                this.CerrarConexion();
                return (RowCount);
            }
        } else {
            return (0);
        }
    }

    public int ejecutarSentenciaSQL(String query) {
        this.lastMessage = "";
        if (this.Conectar()) {
            Statement Statement = null;
            int RowCount = 0;
            //--
            try {
                Statement = this.ConexionActual.createStatement();
                RowCount = Statement.executeUpdate(query);
                return RowCount;
            } catch (SQLException E) {
                System.out.println(">> Error al ejecutar sentencia ejecutarSentenciaSQL " + E.getMessage());
                this.lastMessage = "MySQL response -> " + E.getMessage();
                return -1;
            } finally {
                this.CerrarConexion();
            }
        } else {
            return -1;
        }
    }

    public String getMessageError() {
        return this.lastMessage;
    }

    public int EjecutarSentenciaDELETE(String Query) {
        if (this.Conectar()) {
            Statement Statement = null;
            int RowCount = 0;
            //--
            try {
                Statement = this.ConexionActual.createStatement();
                RowCount = Statement.executeUpdate(Query);
            } catch (SQLException E) {
                System.out.println(">> Error al ejecutar sentencia DELETE");
                return (0);
            } finally {
                this.CerrarConexion();
                return (RowCount);
            }
        } else {
            return (0);
        }
    }
}
