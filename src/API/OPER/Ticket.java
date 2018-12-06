/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API.OPER;

import java.util.ArrayList;
import API.SIST.*;

/**
 *
 * @author luisromero
 */
public class Ticket {
    
    private String IdTicket;
    private String FechaYHoraDeCreacion;
    private Double TotalSinIVA;
    private Double IVA;
    private Boolean Factura; //SIN USO
    private String IdUsuario; //Usuario Creador
    
    //--
    private final static String TABLE_NAME = "ticket";
    
    public Ticket()
    {
        this.ResetAttributes();
    }
    
    public Boolean InsertRegistro(Ticket U)
    {
        String Query = "INSERT INTO `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Ticket.TABLE_NAME +"` VALUES("
        + "'" + U.IdTicket + "',"
        + "CURRENT_TIMESTAMP,"
        + "" + U.TotalSinIVA + ","
        + "" + U.IVA + ","
        + "'" + ((U.Factura) ? "1" : "0") + "',"
        + "'" + U.IdUsuario + "')";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaINSERT(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }

    public Ticket GetRegistro(String Id)
    {
        String Query = "SELECT * FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Ticket.TABLE_NAME +"` WHERE `idticket` = '" + Id + "';";
        ArrayList<ArrayList<String>> ListaDeFilas = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
        try
        {
            Ticket Ticket = new Ticket();
            //--
            Ticket.IdTicket = ListaDeFilas.get(0).get(0);
            Ticket.FechaYHoraDeCreacion = ListaDeFilas.get(0).get(1);
            Ticket.TotalSinIVA = Double.parseDouble(ListaDeFilas.get(0).get(2));
            Ticket.IVA = Double.parseDouble(ListaDeFilas.get(0).get(3));
            Ticket.Factura = false;//((ListaDeFilas.get(0).get(4).equals("1")) ? true : false);
            Ticket.IdUsuario = ListaDeFilas.get(0).get(5);
            //--
            return (Ticket);
        }
        catch (IndexOutOfBoundsException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Ticket> GetAllTicket()
    {
        ArrayList<Ticket> Lista = new ArrayList<Ticket>();
        String Query = "SELECT `idticket` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Ticket.TABLE_NAME +"` ";
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
                System.out.println("\n>>Error al extraer datos del ResultSet GetAllTicket");
                return (null);
            }
        } else {
            return (null);
        }
    }

    public boolean Update_Registro(String Id, Ticket U)
    {
        String Query = "UPDATE `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Ticket.TABLE_NAME +"` SET "
        //+ "`idticket` = '" + U.IdTicket + "', "
        + "`fecha_hora` = CURRENT_TIMESTAMP, "
        + "`totalsiniva` = " + U.getTotalSinIVA() + ", "
        + "`iva` = " + U.getIVA() + " "
        //+ "`factura` = '" + ((U.Factura.equals("1")) ? true : false) + "', "
        //+ "`usuario_idusuario` = '" + U.IdUsuario + "' "
        + "WHERE `idticket` = '" + Id + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        if(AffectedRows == 1) return(true);
        else return(false);
    }

    public boolean UpdateRegistroPorCampo(String Id, String Campo, String Valor)
    {
        String Query = "UPDATE  `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Ticket.TABLE_NAME +"` SET"
        + "`" + Campo + "` = '" + Valor + "' "
        + "WHERE `idticket` = '" + Id + "';";
        //--
        int AffectedRows = new BaseDeDatos().EjecutarSentenciaUPDATE(Query);
        //--
        return(AffectedRows == 1);
    }

    public boolean DeleteRegistro(String id)
    {
        String Query = "DELETE FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Ticket.TABLE_NAME +"` WHERE `idticket` = '" + id + "';";
        int affectedRows = new BaseDeDatos().EjecutarSentenciaDELETE(Query);
        return(affectedRows == 1);
    }

    public Ticket getNuevo()
    {
        Ticket Ticket = new Ticket();
        Ticket.IdTicket = this.GetIdUnicoParaTicket();
        return (Ticket);
    }

    private String GetIdUnicoParaTicket() {
        Utilities utilities = new Utilities();
        while (true) {
            String UUID = utilities.GetRandomUUID();
            String IdModulo = UUID.substring(0, 9);
            if (this.IsIdUnique(IdModulo)) {
                return (IdModulo);
            }
        }
    }

    private boolean IsIdUnique(String Id)
    {
        String Query = "SELECT `idticket` FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ Ticket.TABLE_NAME +"` WHERE `idticket` = '" + Id + "';";
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
    
    public String getIdTicket()
    {
        return(this.IdTicket);
    }
    
    public void setIdTicket(String IdTicket)
    {
        this.IdTicket = IdTicket;
    }
    
    public String getFechaYHoraDeCreacion()
    {
        return(this.FechaYHoraDeCreacion);
    }
    
    public void setFechaYHoraDeCreacion(String FechaYHoraDeCreacion)
    {
        this.FechaYHoraDeCreacion = FechaYHoraDeCreacion;
    }
    
    public Double getTotalSinIVA()
    {
        return(this.TotalSinIVA);
    }
    
    public void setTotalSinIVA(Double TotalSinIVA)
    {
        this.TotalSinIVA = TotalSinIVA;
    }
    
    public Double getIVA()
    {
        return(this.IVA);
    }
    
    public void setIVA(Double IVA)
    {
        this.IVA = IVA;
    }
    
    public Boolean getFactura()
    {
        return(this.Factura);
    }
    
    public void setFactura(Boolean Factura)
    {
        this.Factura = Factura;
    }
    
    public String getIdUsuario()
    {
        return(this.IdUsuario);
    }
    
    public void setIdUsuario(String IdUsuario)
    {
        this.IdUsuario = IdUsuario;
    }
    
    
    public Boolean ActualizarTotales(String IdTicket)
    {
        try
        {
            String Query = "SELECT "
            + "SUM(`"+ AsociacionProductoATicket.TABLE_NAME +"`.`preciosiniva` * `"+ AsociacionProductoATicket.TABLE_NAME +"`.`cantidad`) AS `SubtotalSinIVA`, "
            + "SUM(`"+ AsociacionProductoATicket.TABLE_NAME +"`.`total_compra`) AS `TotalConIVA` "
            + "FROM `"+ ConstantesDeBaseDeDatos.DATABASE_NAME +"`.`"+ AsociacionProductoATicket.TABLE_NAME +"` "
            + "WHERE "
            + "`"+ AsociacionProductoATicket.TABLE_NAME +"`.`ticket_idticket` = '"+IdTicket+"'";
            //--
            ArrayList<ArrayList<String>> ResultSet = new BaseDeDatos().EjecutarSentenciaSELECT(Query);
            //
            if(ResultSet != null)
            {
                Double SubTotalSinIVA = Double.parseDouble(ResultSet.get(0).get(0));
                Double TotalConIVA = Double.parseDouble(ResultSet.get(0).get(1));
                //--
                Ticket Ticket = new Ticket().GetRegistro(IdTicket);
                //--
                if(Ticket != null)
                {
                    Ticket.setTotalSinIVA(SubTotalSinIVA);
                    Ticket.setIVA(TotalConIVA - SubTotalSinIVA);
                    System.out.println("SUBTOTALES CALCULADOS ("+Ticket.getTotalSinIVA()+"|"+Ticket.getIVA()+")");
                    //--
                    if(Ticket.Update_Registro(IdTicket, Ticket))
                    {
                        return(true);
                    }
                    else return(false);
                }
                else return(false);
            }
            else
            {
                System.out.println("SUBTOTALES NO CALCULADOS");
                return(false);
            }
        }
        catch(Exception e)
        {
            return(false);
        }
    }
    
    public void ResetAttributes()
    {
        this.IdTicket = "";
        this.FechaYHoraDeCreacion = "";
        this.TotalSinIVA = 0.0;
        this.IVA = 0.0;
        this.Factura = false; //SIN USO
        this.IdUsuario = ""; //Usuario Creador
    }
    
}
