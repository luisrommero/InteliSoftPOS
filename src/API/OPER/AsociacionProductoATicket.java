/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API.OPER;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import API.SIST.*;

>>>>>>> ab1acba040c379f21351e7162d8eac8d9f431ff6
/**
 *
 * @author luisromero
 */
public class AsociacionProductoATicket {
<<<<<<< HEAD
    
=======
    private String IdAsociacion;
    private Double PrecioSinIVA;
    private String Cantidad;
    private Double TotalDeCompra; 
    private String ProductoIdProducto;  
    private String TicketIdTicket;  

    
    public final static String TABLE_NAME = "producto_ticket";
    
    public AsociacionProductoATicket()
    {
        this.ResetAttributes();
    }
public Boolean InsertRegistro(AsociacionProductoATicket U)
    {
        String Query = "INSERT INTO `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ AsociacionProductoATicket.TABLE_NAME +"` VALUES("
        + "'" + U.IdAsociacion + "',"
        + "" + U.PrecioSinIVA + ","
        + "'" + U.Cantidad + "',"
        + "" + U.TotalDeCompra + ","
        + "'" + U.ProductoIdProducto + "',"
        + "'" + U.TicketIdTicket + "')";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaINSERT(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }

    public AsociacionProductoATicket GetRegistro(String Id)
    {
        String Query = "SELECT * FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ AsociacionProductoATicket.TABLE_NAME +"` WHERE `idasociacion` = '" + Id + "';";
        ArrayList<ArrayList<String>> ListaDeFilas = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
        try
        { 
    
            AsociacionProductoATicket AsociacionProductoAAsociacionProductoATicket = new AsociacionProductoATicket();
            //--
            AsociacionProductoAAsociacionProductoATicket.IdAsociacion = ListaDeFilas.get(0).get(0);
            AsociacionProductoAAsociacionProductoATicket.PrecioSinIVA = Double.parseDouble(ListaDeFilas.get(0).get(1));
            AsociacionProductoAAsociacionProductoATicket.Cantidad = ListaDeFilas.get(0).get(2);
            AsociacionProductoAAsociacionProductoATicket.TotalDeCompra = Double.parseDouble(ListaDeFilas.get(0).get(3));
            AsociacionProductoAAsociacionProductoATicket.ProductoIdProducto = ListaDeFilas.get(0).get(4);
            AsociacionProductoAAsociacionProductoATicket.TicketIdTicket = ListaDeFilas.get(0).get(5);

            //--
            return (AsociacionProductoAAsociacionProductoATicket);
        }
        catch (IndexOutOfBoundsException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<AsociacionProductoATicket> GetAllAsociacionProductoATicket()
    {
        ArrayList<AsociacionProductoATicket> Lista = new ArrayList<AsociacionProductoATicket>();
        String Query = "SELECT `idasociacion` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ AsociacionProductoATicket.TABLE_NAME +"` ";
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
                System.out.println("\n>>Error al extraer datos del ResultSet GetAllAsociacionProductoATicket");
                return (null);
            }
        } else {
            return (null);
        }
    }

    public boolean Update_Registro(String Id, AsociacionProductoATicket U)
    {
        this.IdAsociacion = "";
        this.PrecioSinIVA = 0.0;
        this.Cantidad = "";
        this.TotalDeCompra = 0.0;
        this.ProductoIdProducto = ""; 
        this.TicketIdTicket = ""; 

        String Query = "UPDATE `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ AsociacionProductoATicket.TABLE_NAME +"` SET"
        //+ "`idasociacion` = '" + U.IdAsociacionProductoATicket + "', "
        + "`preciosiniva` = " + U.PrecioSinIVA + ", "
        + "`cantidad` = " + U.Cantidad + ", "
        + "`total_compra` = " + U.TotalDeCompra + ", "
        + "`idasociacion` = '" + U.ProductoIdProducto + "', "
        + "`producto_idproducto` = '" + U.TicketIdTicket + "' "
        + "WHERE `idasociacion` = '" + Id + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }

    public boolean UpdateRegistroPorCampo(String Id, String Campo, String Valor)
    {
        String Query = "UPDATE  `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ AsociacionProductoATicket.TABLE_NAME +"` SET"
        + "`" + Campo + "` = '" + Valor + "' "
        + "WHERE `idasociacion` = '" + Id + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        //--
        return(AffectedRows == 1);
    }

    public boolean DeleteRegistro(String id)
    {
        String Query = "DELETE FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ AsociacionProductoATicket.TABLE_NAME +"` WHERE `idasociacion` = '" + id + "';";
        int affectedRows = new BaseDeDatos().EjecutarSentenciaDELETE(Query);
        return(affectedRows == 1);
    }

    public AsociacionProductoATicket getNuevo()
    {
        AsociacionProductoATicket AsociacionProductoATicket = new AsociacionProductoATicket();
        AsociacionProductoATicket.IdAsociacion = this.GetIdUnicoParaAsociacionProductoATicket();
        return (AsociacionProductoATicket);
    }

    private String GetIdUnicoParaAsociacionProductoATicket() {
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
        String Query = "SELECT `idasociacion` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ AsociacionProductoATicket.TABLE_NAME +"` WHERE `idasociacion` = '" + Id + "';";
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
    
    public String getIdAsociacionProductoATicket()
    {
        return(this.IdAsociacion);
    }
    
    public void setIdAsociacion(String IdAsociacion)
    {
        this.IdAsociacion = IdAsociacion;
    }
    
    public Double getPrecioSinIVA()
    {
        return(this.PrecioSinIVA);
    }
    
    public void setPrecioSinIVA(Double PrecioSinIVA)
    {
        this.PrecioSinIVA = PrecioSinIVA;
    }
    
    public String getCantidad()
    {
        return(this.Cantidad);
    }
    
    public void setCantidad(String Cantidad)
    {
        this.Cantidad = Cantidad;
    }
    
    public Double getTotalDeCompra()
    {
        return(this.TotalDeCompra);
    }
    
    public void setTotalDeCompra(Double TotalDeCompra)
    {
        this.TotalDeCompra = TotalDeCompra;
    }

    public String getProductoIdProducto()
    {
        return(this.ProductoIdProducto);
    }
    
    public void setProductoIdProducto(String ProductoIdProducto)
    {
        this.ProductoIdProducto = ProductoIdProducto;
    }
    
    public String getTicketIdTicket()
    {
        return(this.TicketIdTicket);
    }
    
    public void setTicketIdTicket(String TicketIdTicket)
    {
        this.TicketIdTicket = TicketIdTicket;
    }
    
    
    public Boolean ActualizarTotales(String IdAsociacion)
    {
        try
        {
            String Query = "SELECT "
            + "SUM(`"+ AsociacionProductoATicket.TABLE_NAME +"`.`preciosiniva` * `"+ AsociacionProductoATicket.TABLE_NAME +"`.`cantidad`) AS `SubtotalSinIVA`, "
            + "SUM(`"+ AsociacionProductoATicket.TABLE_NAME +"`.`total_compra`) AS `TotalConIVA` "
            + "FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ AsociacionProductoATicket.TABLE_NAME +"` "
            + "WHERE "
            + "`"+ AsociacionProductoATicket.TABLE_NAME +"`.`ticket_idticket` = '"+IdAsociacion+"'";
            //--
            ArrayList<ArrayList<String>> ResultSet = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
            //
            if(ResultSet != null)
            {
                Double SubTotalSinIVA = Double.parseDouble(ResultSet.get(0).get(0));
                Double TotalConIVA = Double.parseDouble(ResultSet.get(0).get(1));
                //--
                AsociacionProductoATicket AsociacionProductoATicket = new AsociacionProductoATicket().GetRegistro(IdAsociacion);
                //--
                if(AsociacionProductoATicket != null)
                {
                    AsociacionProductoATicket.setPrecioSinIVA(PrecioSinIVA);
                    AsociacionProductoATicket.setTotalDeCompra(TotalDeCompra - PrecioSinIVA);
                    //--
                    if(AsociacionProductoATicket.Update_Registro(IdAsociacion, AsociacionProductoATicket))
                    {
                        return(true);
                    }
                    else return(false);
                }
                else return(false);
            }
            else return(false);
        }
        catch(Exception e)
        {
            return(false);
        }
    }
    
    public void ResetAttributes()
    {
        this.IdAsociacion = "";
        this.PrecioSinIVA = 0.0;
        this.Cantidad = "";
        this.TotalDeCompra = 0.0;
        this.ProductoIdProducto = "";
        this.TicketIdTicket = "";
    }

    public void setIdProducto(String idProducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdTicket(String idTicket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
>>>>>>> ab1acba040c379f21351e7162d8eac8d9f431ff6
}
