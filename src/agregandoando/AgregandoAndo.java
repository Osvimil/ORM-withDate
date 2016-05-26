/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregandoando;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author oswaldosaldivar
 */
public class AgregandoAndo {

             static final SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws InterruptedException {
        
        try{
        
        final CtrlPrueba ctrlprueba = new CtrlPrueba();
        final Prueba prueba1 = new Prueba("Oswaldo","56331147",fmt.parse("17/03/1993"));
        final Prueba prueba2 = new Prueba("Alfonso","56330164",fmt.parse("14/06/1991"));
        
            ctrlprueba.agrega(prueba2);
            ctrlprueba.agrega(prueba1);
        }catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}
