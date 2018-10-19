package API.OPER;

import java.util.ArrayList;
import API.SIST.*;

public class Producto_Ticket {
    private String idasociacion;
    private String preciosiniva;
    private String cantidad;
    private String total_compra;
    private String producto_idproducto;
    private String ticket_idticket;
    //--
    private final static String TABLE_NAME = "producto_ticket";
    
    public Producto_Ticket() {
        this.ResetAttributies();
    }
    
    public Boolean InsertRegistro(Producto_Ticket PT) {
        String Query = "INSERT INTO `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto_Ticket.TABLE_NAME +"` VALUES("
        + "'" + PT.idasociacion + "',"
        + "'" + PT.preciosiniva + "',"
        + "'" + PT.cantidad + "',"
        + "'" + PT.total_compra + "',"
        + "'" + PT.producto_idproducto + "',"
        + "'" + PT.ticket_idticket + "')";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaINSERT(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }
    
    public Producto_Ticket GetRegistro(String Id)
    {
        String Query = "SELECT * FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto_Ticket.TABLE_NAME +"` WHERE `idasociacion` = '" + Id + "';";
        ArrayList<ArrayList<String>> ListaDeFilas = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
        try
        {
            Producto_Ticket Productoticket = new Producto_Ticket();
            //--
            Productoticket.idasociacion = ListaDeFilas.get(0).get(0);
            Productoticket.preciosiniva = ListaDeFilas.get(0).get(1);
            Productoticket.cantidad = ListaDeFilas.get(0).get(2);
            Productoticket.total_compra = ListaDeFilas.get(0).get(3);
            Productoticket.producto_idproducto = ListaDeFilas.get(0).get(4);
            Productoticket.ticket_idticket = ListaDeFilas.get(0).get(5);
            //--
            return (Productoticket);
        }
        catch (IndexOutOfBoundsException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Producto_Ticket> GetAllProducto_Ticket()
    {
        ArrayList<Producto_Ticket> Lista = new ArrayList<Producto_Ticket>();
        String Query = "SELECT `idasociacion` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto_Ticket.TABLE_NAME +"` ";
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
                System.out.println("\n>>Error al extraer datos del ResultSet GetAllProducto_Ticket");
                return (null);
            }
        } else {
            return (null);
        }
    }
    
    public boolean Update_Registro(String Id, Producto_Ticket PT)
    {
        String Query = "UPDATE `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto_Ticket.TABLE_NAME +"` SET"
        + "`idasociacion` = '" + PT.idasociacion + "', "
        + "`preciosiniva` = '" + PT.preciosiniva + "', "
        + "`cantidad` = '" + PT.cantidad + "', "
        + "`total_compra` = '" + PT.total_compra + "', "
        + "`producto_idproducto` = '" + PT.producto_idproducto + "', "
        + "`ticket_idticket` = '" + PT.ticket_idticket + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }
    
    public boolean UpdateRegistroPorCampo(String Id, String Campo, String Valor)
    {
        String Query = "UPDATE  `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto_Ticket.TABLE_NAME +"` SET"
        + "`" + Campo + "` = '" + Valor + "' "
        + "WHERE `idasociacion` = '" + idasociacion + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        //--
        return(AffectedRows == 1);
    }
    
    public boolean DeleteRegistro(String id)
    {
        String Query = "DELETE FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto_Ticket.TABLE_NAME +"` WHERE `idasociacion` = '" + id + "';";
        int affectedRows = new BaseDeDatos().EjecutarSentenciaDELETE(Query);
        return(affectedRows == 1);
    }
    
    public Producto_Ticket getNuevo()
    {
        Producto_Ticket Producto_Ticket = new Producto_Ticket();
        Producto_Ticket.idasociacion = this.GetIdUnicoParaProducto_Ticket();
        return (Producto_Ticket);
    }
    
    private String GetIdUnicoParaProducto_Ticket() {
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
        String Query = "SELECT `idasociacion` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Producto_Ticket.TABLE_NAME +"` WHERE `idasociacion` = '" + Id + "';";
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
    
    public String getIdasociacion()
    {
        return(this.idasociacion);
    }
    
    public String getpreciosiniva()
    {
        return(this.preciosiniva);
    }
    
    public String getcantidad()
    {
        return(this.cantidad);
    }
    
    public String gettotal_compra()
    {
        return(this.total_compra);
    }
    
    public String getproducto_idproducto()
    {
        return(this.producto_idproducto);
    }
    
    public String getticket_idticket()
    {
        return(this.ticket_idticket);
    }
    
    private void ResetAttributies() {
        this.idasociacion = "";
        this.preciosiniva = "";
        this.cantidad = "";
        this.total_compra = "";
        this.producto_idproducto = "";
        this.ticket_idticket = "";
    }
}
