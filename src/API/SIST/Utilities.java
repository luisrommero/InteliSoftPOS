/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API.SIST;

import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Luis Romero
 */
public class Utilities {
    
    public String GetRandomUUID() {
        return (UUID.randomUUID().toString());
    }
    public String GetFecha(){
        Date fecha =  new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
    }
    
}
