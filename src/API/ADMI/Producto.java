package API.ADMI;

import java.util.ArrayList;
import API.SIST.*;

public class Producto {
    private String idProducto;
    private String upc;
    private String nombreProd;
    private String descripcion;
    private String clasificacion;
    private String existencia;
    private String codigoSat;
    private String precioSinIva;
    private String tasaCero;
    private String costo;
    //--
    private final static String TABLE_NAME = "producto";
    
    public Producto()
    {
        this.ResetAttributies();
    }
    
    public Boolean InsertRegistro(Producto P)
    {
        String Query = "INSERT INTO `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` VALUES("
        + "'" + P.idProducto + "',"
        + "'" + P.upc + "',"
        + "'" + P.nombreProd + "',"
        + "'" + P.descripcion + "',"
        + "'" + P.clasificacion + "',"
        + "'" + P.existencia + "',"
        + "'" + P.codigoSat + "',"
        + "'" + P.precioSinIva + "',"
        + "'" + P.tasaCero + "',"
        + "'" + P.costo + "')";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaINSERT(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }
    
    public Producto GetRegistro(String Id)
    {
        String Query = "SELECT * FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` WHERE `idproducto` = '" + Id + "';";
        ArrayList<ArrayList<String>> ListaDeFilas = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
        try
        {
            Producto Producto = new Producto();
            //--
            Producto.idProducto = ListaDeFilas.get(0).get(0);
            Producto.upc = ListaDeFilas.get(0).get(1);
            Producto.nombreProd = ListaDeFilas.get(0).get(2);
            Producto.descripcion = ListaDeFilas.get(0).get(3);
            Producto.clasificacion = ListaDeFilas.get(0).get(4);
            Producto.existencia = ListaDeFilas.get(0).get(5);
            Producto.codigoSat = ListaDeFilas.get(0).get(6);
            Producto.precioSinIva= ListaDeFilas.get(0).get(7);
            Producto.tasaCero= ListaDeFilas.get(0).get(8);
            Producto.costo= ListaDeFilas.get(0).get(9);
            //--
            return (Producto);
        }
        catch (IndexOutOfBoundsException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Producto> GetAllProducto()
    {
        ArrayList<Producto> Lista = new ArrayList<Producto>();
        String Query = "SELECT `idProducto` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` ";
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
                System.out.println("\n>>Error al extraer datos del ResultSet GetAllProducto");
                return (null);
            }
        } else {
            return (null);
        }
    }
    
    public boolean Update_Registro(String Id, Producto P)
    {
        String Query = "UPDATE `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` SET"
        + "`idproducto` = '" + P.idProducto + "', "
        + "`upc` = '" + P.upc + "', "
        + "`nombreproducto` = '" + P.nombreProd + "', "
        + "`descripcion` = '" + P.descripcion + "', "
        + "`clasificacion` = '" + P.clasificacion + "', "
        + "`existencia` = '" + P.existencia + "', "
        + "`codigosat` = '" + P.codigoSat + "', "
        + "`preciosiniva` = '" + P.precioSinIva + "', "
        + "`tasacero` = '" + P.tasaCero + "', "
        + "`costo` = '" + P.costo + "' "
        + "WHERE `idproducto` = '" + Id + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }
    
    public boolean UpdateRegistroPorCampo(String Id, String Campo, String Valor)
    {
        String Query = "UPDATE  `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` SET"
        + "`" + Campo + "` = '" + Valor + "' "
        + "WHERE `idProducto` = '" + idProducto + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        //--
        return(AffectedRows == 1);
    }
    
    public boolean DeleteRegistro(String id)
    {
        String Query = "DELETE FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` WHERE `idProducto` = '" + id + "';";
        int affectedRows = new BaseDeDatos().EjecutarSentenciaDELETE(Query);
        return(affectedRows == 1);
    }
    
    public Producto getNuevo()
    {
        Producto Producto = new Producto();
        Producto.idProducto = this.GetIdUnicoParaProducto();
        return (Producto);
    }
    
    private String GetIdUnicoParaProducto() {
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
        String Query = "SELECT `idProducto` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` WHERE `idProducto` = '" + Id + "';";
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
    
    public String getIdProducto()
    {
        return(this.idProducto);
    }
    
    public String getUpc()
    {
        return(this.upc);
    }
    public String getNombreProd()
    {
        return(this.nombreProd);
    }
    
    public String getDescripcion()
    {
        return(this.descripcion);
    }
    
    public String getClasificacion()
    {
        return(this.clasificacion);
    }
    
    public String getExistencia()
    {
        return(this.existencia);
    }
    
    public String getCodigoSat()
    {
        return(this.codigoSat);
    }
    
    public String getPrecioSinIva()
    {
        return(this.precioSinIva);
    }
    
    public String getTasaCero()
    {
        return(this.tasaCero);
    }
    
    public String getCosto()
    {
        return(this.costo);
    }
    
    public void setIdProducto(String IdProducto)
    {
        this.idProducto = IdProducto;
    }
    
    public void setUpc(String Upc)
    {
        this.upc = Upc;
    }
    
    public void setNombreProducto(String NombreProducto)
    {
        this.nombreProd = NombreProducto;
    }
    
    public void setDescripcion(String Descripcion)
    {
        this.descripcion = Descripcion;
    }
    
    public void setClasificacion(String Clasificacion)
    {
        this.clasificacion = Clasificacion;
    }
    
    public void setExistencia(String Existencia)
    {
        this.existencia = Existencia;
    }
    
    public void setCodigoSat(String CodigoSat)
    {
        this.codigoSat = CodigoSat;
    }
    
    public void setPrecioSinIva(String PrecioSinIva)
    {
        this.precioSinIva = PrecioSinIva;
    }
    
    public void setTasaCero(String TasaCero)
    {
        this.tasaCero = TasaCero;
    }
    
    public void setCosto(String Costo)
    {
        this.costo = Costo;
    }

    private void ResetAttributies() {
        this.idProducto = "";
        this.upc = "";
        this.nombreProd = "";
        this.descripcion = "";
        this.clasificacion = "";
        this.existencia = "";
        this.codigoSat = "";
        this.precioSinIva = "";
        this.tasaCero = "";
        this.costo = "";
    }
}