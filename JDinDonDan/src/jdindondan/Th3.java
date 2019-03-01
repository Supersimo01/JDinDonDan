/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mauri_simone
 */
public class Th3 extends Thread{
    
    DatiCondivisi d;
    
    
    public Th3(DatiCondivisi dc){
        
        d = dc;
    
    }
    
    @Override
    public void run(){
    
        try {
            while (true) {
                d.s3.acquire();
                d.setR("DAN");
                d.p.release();
                Th3.yield();
            }
        } catch (InterruptedException ex) {
            // Logger.getLogger(Th1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
