package API.ADMI;

import java.util.ArrayList;
import API.SIST.*;

public class Usuario {
    private String idUsuario;
    private String claveEmpleado;
    private String nombreEmpleado;
    private String aPaterno;
    private String aMaterno;
    private String direccion;
    private String tipoUsuario;
    private String password;
    //--
    public static final String TABLE_NAME = "usuario";
    
    public Usuario()
    {
        this.ResetAttributes();
    }
    
    public Boolean InsertRegistro(Usuario U)
    {
        String Query = "INSERT INTO `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` VALUES("
        + "'" + U.idUsuario + "',"
        + "'" + U.claveEmpleado + "',"
        + "'" + U.nombreEmpleado + "',"
        + "'" + U.aPaterno + "',"
        + "'" + U.aMaterno + "',"
        + "'" + U.direccion + "',"
        + "'" + U.password + "',"        
        + "'" + U.tipoUsuario + "')";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaINSERT(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }

    public Usuario GetRegistro(String Id)
    {
        String Query = "SELECT * FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` WHERE `idusuario` = '" + Id + "';";
        ArrayList<ArrayList<String>> ListaDeFilas = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
        try
        {
            Usuario Usuario = new Usuario();
            //--
            Usuario.idUsuario = ListaDeFilas.get(0).get(0);
            Usuario.claveEmpleado = ListaDeFilas.get(0).get(1);
            Usuario.nombreEmpleado = ListaDeFilas.get(0).get(2);
            Usuario.aPaterno = ListaDeFilas.get(0).get(3);
            Usuario.aMaterno = ListaDeFilas.get(0).get(4);
            Usuario.direccion = ListaDeFilas.get(0).get(5);
            Usuario.password = ListaDeFilas.get(0).get(6);
            Usuario.tipoUsuario= ListaDeFilas.get(0).get(7);
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
        String Query = "SELECT `idUsuario` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` ";
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
        + "`idusuario` = '" + U.idUsuario + "', "
        + "`claveempleado` = '" + U.claveEmpleado + "', "
        + "`nombreempleado` = '" + U.nombreEmpleado + "', "
        + "`apaterno` = '" + U.aPaterno + "', "
        + "`amaterno` = '" + U.aMaterno + "', "
        + "`direccion` = '" + U.direccion + "', "
        + "`password` = '" + U.password + "', "         
        + "`tipousuario` = '" + U.tipoUsuario + "' "
        + "WHERE `idusuario` = '" + Id + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }

    public boolean UpdateRegistroPorCampo(String Id, String Campo, String Valor)
    {
        String Query = "UPDATE  `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` SET"
        + "`" + Campo + "` = '" + Valor + "' "
        + "WHERE `idUsuario` = '" + idUsuario + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        //--
        return(AffectedRows == 1);
    }

    public boolean DeleteRegistro(String id)
    {
        String Query = "DELETE FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` WHERE `idUsuario` = '" + id + "';";
        int affectedRows = new BaseDeDatos().EjecutarSentenciaDELETE(Query);
        return(affectedRows == 1);
    }

    public Usuario getNuevo()
    {
        Usuario Usuario = new Usuario();
        Usuario.idUsuario = this.GetIdUnicoParaUsuario();
        return (Usuario);
    }

    private String GetIdUnicoParaUsuario() {
        Utilities utilities = new Utilities();
        while (true) {
            String UUID = utilities.GetRandomUUID();
            String IdModulo = UUID.substring(0,10);
            if (this.IsIdUnique(IdModulo)) {
                return (IdModulo);
            }
        }
    }

    private boolean IsIdUnique(String Id)
    {
        String Query = "SELECT `idUsuario` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Usuario.TABLE_NAME +"` WHERE `idUsuario` = '" + Id + "';";
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
    
    public String getIdUsuario()
    {
        return(this.idUsuario);
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
    public String getPassword()
    {
        return(this.password);
    }
    
    public String getTipoUsuario()
    {
        return(this.tipoUsuario);
    }
    
    public void setIdUsuario(String IdUsuario)
    {
        this.idUsuario = IdUsuario;
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
    public void setPassword(String Password)
    {
        this.password = Password;
    }    
    
    public void setTipoUsuario(String Tipo)
    {
        this.tipoUsuario = Tipo;
    }
    
    public void ResetAttributes()
    {
        this.idUsuario = "";
        this.claveEmpleado = "";
        this.nombreEmpleado = "";
        this.aPaterno = "";
        this.aMaterno = "";
        this.direccion = "";
        this.password = "";
        this.tipoUsuario = "";
    }
    
}
