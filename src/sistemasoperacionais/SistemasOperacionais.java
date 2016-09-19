/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasoperacionais;

import SubstituicaoPagina.Pagina;
import SubstituicaoPagina.WSClock;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author sorcerer
 */
public class SistemasOperacionais {

    
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        WSClock wsc = new WSClock(8,2204, 9);
        Pagina p1 = new Pagina(2014, 1, 1);
        Pagina p2 = new Pagina(2213, 1, 1);
        Pagina p3 = new Pagina(1980, 1, 1);
        Pagina p4 = new Pagina(2003, 1, 1);
        Pagina p5 = new Pagina(2084, 1, 1);
        Pagina p6 = new Pagina(1620, 1, 1);
        Pagina p7 = new Pagina(2032, 1, 1);
        Pagina p8 = new Pagina(2020, 1, 1);
        
        Pagina p9 = new Pagina(2204, 1, 1);
        
        wsc.solicitarPagina(p1);
        wsc.solicitarPagina(p2);
        wsc.solicitarPagina(p3);
        wsc.solicitarPagina(p4);
        wsc.solicitarPagina(p5);
        wsc.solicitarPagina(p6);
        wsc.solicitarPagina(p7);
        wsc.solicitarPagina(p8);
        
        System.out.println(wsc.toString());
        wsc.solicitarPagina(p9);
       
        System.out.println(wsc.toString());
          
    }
    
}
