/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API.ADMI;

import java.util.ArrayList;
import API.SIST.*;

/**
 *
 * @author luisromero
 */
public class Usuario {
    private String idEmpleado;
    private String claveEmpleado;
    private String nombreEmpleado;
    private String aPaterno;
    private String aMaterno;
    private String direccion;
    private String tipo;
    //--
    private final static String TABLE_NAME = "admi_usuario";
    
    public Usuario()
    {
        this.ResetAttributes();
    }
    
    public Boolean InsertRegistro(Usuario U)
    {
        String Query = "INSERT INTO `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` VALUES("
        + "'" + U.idEmpleado + "',"
        + "'" + U.claveEmpleado + "',"
        + "'" + U.nombreEmpleado + "',"
        + "'" + U.aPaterno + "',"
        + "'" + U.aMaterno + "',"
        + "'" + U.direccion + "',"
        + "'" + U.tipo + "')";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaINSERT(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }

    public Usuario GetRegistro(String Id)
    {
        String Query = "SELECT * FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` WHERE `idEmpleado` = '" + Id + "';";
        ArrayList<ArrayList<String>> ListaDeFilas = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
        try
        {
            Usuario Usuario = new Usuario();
            //--
            Usuario.idEmpleado = ListaDeFilas.get(0).get(0);
            Usuario.claveEmpleado = ListaDeFilas.get(0).get(1);
            Usuario.nombreEmpleado = ListaDeFilas.get(0).get(2);
            Usuario.aPaterno = ListaDeFilas.get(0).get(3);
            Usuario.aMaterno = ListaDeFilas.get(0).get(4);
            Usuario.direccion = ListaDeFilas.get(0).get(5);
            Usuario.tipo = ListaDeFilas.get(0).get(6);
            //--
            return (Usuario);
        }
        catch (IndexOutOfBoundsException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Usuario> GetAllUsuario()
    {
        ArrayList<Usuario> Lista = new ArrayList<Usuario>();
        String Query = "SELECT `idEmpleado` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` ";
        ArrayList<ArrayList<String>> ListaDeFilas = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
        //--
        if (!ListaDeFilas.isEmpty()) {
            try {
                //--Iterar Todos Los Modulo 
                for (int i = 0; i < ListaDeFilas.size(); i++) {
                    String Id = ListaDeFilas.get(i).get(0);
                    Lista.add(this.GetRegistro(Id));
                }
                //--
                return (Lista);
            } catch (Exception E) {
                System.out.println("\n>>Error al extraer datos del ResultSet GetAllUsuario");
                return (null);
            }
        } else {
            return (null);
        }
    }

    public boolean Update_Registro(String Id, Usuario U)
    {
        String Query = "UPDATE `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` SET"
        + "`idEmpleado` = '" + U.idEmpleado + "', "
        + "`claveEmpleado` = '" + U.claveEmpleado + "', "
        + "`nombreEmpleado` = '" + U.nombreEmpleado + "', "
        + "`aPaterno` = '" + U.aPaterno + "', "
        + "`aMaterno` = '" + U.aMaterno + "', "
        + "`direccion` = '" + U.direccion + "', "
        + "`tipo` = '" + U.tipo + "' "
        + "WHERE `idEmpleado` = '" + Id + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }

    public boolean UpdateRegistroPorCampo(String Id, String Campo, String Valor)
    {
        String Query = "UPDATE  `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` SET"
        + "`" + Campo + "` = '" + Valor + "' "
        + "WHERE `idEmpleado` = '" + idEmpleado + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        //--
        return(AffectedRows == 1);
    }

    public boolean DeleteRegistro(String id)
    {
        String Query = "DELETE FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` WHERE `idEmpleado` = '" + id + "';";
        int affectedRows = new BaseDeDatos().EjecutarSentenciaDELETE(Query);
        return(affectedRows == 1);
    }

    public Usuario getNuevoModulo()
    {
        Usuario Usuario = new Usuario();
        Usuario.idEmpleado = this.GetIdUnicoParaUsuario();
        return (Usuario);
    }

    private String GetIdUnicoParaUsuario() {
        Utilities utilities = new Utilities();
        while (true) {
            String UUID = utilities.GetRandomUUID();
            String IdModulo = UUID.substring(24, UUID.length());
            if (this.IsIdUnique(IdModulo)) {
                return (IdModulo);
            }
        }
    }

    private boolean IsIdUnique(String Id)
    {
        String Query = "SELECT `idEmpleado` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` WHERE `IdModulo` = '" + Id + "';";
        ArrayList<ArrayList<String>> ListaDeFilas = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
        //--
        try {
            if (ListaDeFilas.isEmpty()) {
                return (true);
            } else {
                return (false);
            }
        } catch (NullPointerException e) {
            System.out.println(">> Error al verificar si el ResultSet está vacío (Class: Modulo | Method: IsIdUnique).");
            return (false);
        }
    }
    
    public String getIdEmpleado()
    {
        return(this.idEmpleado);
    }
    
    public String getClaveEmpleado()
    {
        return(this.claveEmpleado);
    }
    
    public String getNombreEmpleado()
    {
        return(this.nombreEmpleado);
    }
    
    public String getAPaterno()
    {
        return(this.aPaterno);
    }
    
    public String getAMaterno()
    {
        return(this.aMaterno);
    }
    
    public String getDireccion()
    {
        return(this.direccion);
    }
    
    public String getTipo()
    {
        return(this.tipo);
    }
    
    public void setIdEmpleado(String IdEmpleado)
    {
        this.idEmpleado = IdEmpleado;
    }
    
    public void setClaveEmpleado(String ClaveEmpleado)
    {
        this.claveEmpleado = ClaveEmpleado;
    }
    
    public void setNombreEmpleado(String NombreEmpleado)
    {
        this.nombreEmpleado = NombreEmpleado;
    }
    
    public void setAPaterno(String APaterno)
    {
        this.aPaterno = APaterno;
    }
    
    public void setAMaterno(String AMaterno)
    {
        this.aMaterno = AMaterno;
    }
    
    public void setDireccion(String Direccion)
    {
        this.direccion = Direccion;
    }
    
    public void setTipo(String Tipo)
    {
        this.tipo = Tipo;
    }
    
    public void ResetAttributes()
    {
        this.idEmpleado = "";
        this.claveEmpleado = "";
        this.nombreEmpleado = "";
        this.aPaterno = "";
        this.aMaterno = "";
        this.direccion = "";
        this.tipo = "";
    }
    
}
