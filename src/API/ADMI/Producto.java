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
public class Producto {
    
    private String IdProducto;
    private String UPC;
    private String NombreProducto;
    private String Descripcion;
    private String Clasificacion; 
    private String Existencia; 
    private Double CodigoSat;
    private Double PrecioSinIVA;
    private Double TasaCero;
    private Double Costo;
    
    //--
    private final static String TABLE_NAME = "ticket";
    
    public Producto()
    {
        this.ResetAttributes();
    }
    
    public Boolean InsertRegistro(Producto U)
    {
        String Query = "INSERT INTO `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` VALUES("
        + "'" + U.IdProducto + "',"
        + "'" + U.UPC + "',"
        + "'" + U.NombreProducto + "'," //string
        + "'" + U.Descripcion + "',"
        + "'" + U.Clasificacion + "',"
        + "'" + U.Existencia + "',"
        + "" + U.CodigoSat + ","
        + "" + U.PrecioSinIVA + ","
        + "" + U.TasaCero + ","
        + "" + U.Costo + ")";
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
            Producto.IdProducto = ListaDeFilas.get(0).get(0);
            Producto.UPC = ListaDeFilas.get(0).get(1);
            Producto.NombreProducto = ListaDeFilas.get(0).get(2);
            Producto.Descripcion = ListaDeFilas.get(0).get(3);
            Producto.Clasificacion = ListaDeFilas.get(0).get(4);
            Producto.Existencia = ListaDeFilas.get(0).get(5);
            Producto.CodigoSat = Double.parseDouble(ListaDeFilas.get(0).get(6));
            Producto.PrecioSinIVA = Double.parseDouble(ListaDeFilas.get(0).get(7));
            Producto.TasaCero = Double.parseDouble(ListaDeFilas.get(0).get(8));
            Producto.Costo = Double.parseDouble(ListaDeFilas.get(0).get(9));
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
        String Query = "SELECT `idproducto` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` ";
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

    public boolean Update_Registro(String Id, Producto U)
    {
        
        String Query = "UPDATE `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` SET"
        //+ "`idproducto` = '" + U.IdProducto + "', "
        + "`upc` = " + U.UPC + ", "
        + "`nombreproducto` = '" + U.NombreProducto + "', "
        + "`descripcion` = '" + U.Descripcion + "', "
        + "`existencia` = '" + U.Existencia + "', "
        + "`codigosat` = " + U.CodigoSat + ", "
        + "`preciosiniva` = " + U.PrecioSinIVA + ", "
        + "`tasacero` = " + U.TasaCero + ", "        
        + "`costo` = '" + U.Costo + "' "
        + "WHERE `idticket` = '" + Id + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }

    public boolean UpdateRegistroPorCampo(String Id, String Campo, String Valor)
    {
        String Query = "UPDATE  `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` SET"
        + "`" + Campo + "` = '" + Valor + "' "
        + "WHERE `idproducto` = '" + Id + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        //--
        return(AffectedRows == 1);
    }

    public boolean DeleteRegistro(String id)
    {
        String Query = "DELETE FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` WHERE `idproducto` = '" + id + "';";
        int affectedRows = new BaseDeDatos().EjecutarSentenciaDELETE(Query);
        return(affectedRows == 1);
    }

    public Producto getNuevo()
    {
        Producto Producto = new Producto();
        Producto.IdProducto = this.GetIdUnicoParaProducto();
        return (Producto);
    }

    private String GetIdUnicoParaProducto() {
        Utilities utilities = new Utilities();
        while (true) {
            String UUID = utilities.GetRandomUUID();
            String IdModulo = UUID.substring(10, UUID.length());
            if (this.IsIdUnique(IdModulo)) {
                return (IdModulo);
            }
        }
    }

    private boolean IsIdUnique(String Id)
    {
        String Query = "SELECT `idproducto` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto.TABLE_NAME +"` WHERE `idproducto` = '" + Id + "';";
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
        return(this.IdProducto);
    }
    
    public void setIdProducto(String IdProducto)
    {
        this.IdProducto = IdProducto;
    }

    public String getUPC()
    {
        return(this.UPC);
    }
    
    public void setUPC(String UPC)
    {
        this.UPC = UPC;
    }
    
    public String getNombreProducto()
    {
        return(this.NombreProducto);
    }
    
    public void setNombreProducto(String NombreProducto)
    {
        this.NombreProducto = NombreProducto;
    }
    
    public String getDescripcion()
    {
        return(this.Descripcion);
    }
    
    public void setDescripcion(String Descripcion)
    {
        this.Descripcion = Descripcion;
    }
    
    public String getClasificacion()
    {
        return(this.Clasificacion);
    }
    
    public void setClasificacion(String Clasificacion)
    {
        this.Clasificacion = Clasificacion;
    }
     
    public String getExistencia()
    {
        return(this.Existencia);
    }
    
    public void setExistencia(String Existencia)
    {
        this.Existencia = Existencia;
    }
     
    public Double getCodigoSat()
    {
        return(this.CodigoSat);
    }
    
    public void setCodigoSat(Double CodigoSat)
    {
        this.CodigoSat = CodigoSat;
    }
    
    public Double getPrecioSinIVA()
    {
        return(this.PrecioSinIVA);
    }
    
    public void setPrecioSinIVA(Double PrecioSinIVA)
    {
        this.PrecioSinIVA = PrecioSinIVA;
    }
    
    public Double getTasaCero()
    {
        return(this.TasaCero);
    }
    
    public void setTasaCero(Double TasaCero)
    {
        this.TasaCero = TasaCero;
    }
    public Double getCosto()
    {
        return(this.Costo);
    }
    
    public void setCosto(Double PrecioSinIVA)
    {
        this.PrecioSinIVA = PrecioSinIVA;
    }
    
    
    public void ResetAttributes()
    {
        this.IdProducto = "";
        this.UPC = "";
        this.NombreProducto = "";
        this.Descripcion = "";
        this.Clasificacion = "";
        this.Existencia = "";
        this.CodigoSat = 0.0;
        this.PrecioSinIVA = 0.0;
        this.TasaCero = 0.0;
        this.Costo = 0.0; 
    }

}
