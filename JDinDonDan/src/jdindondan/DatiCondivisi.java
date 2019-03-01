/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import java.util.concurrent.Semaphore;

/**
 *
 * @author mauri_simone
 */
public class DatiCondivisi {
    
    String ris;
    Semaphore s1,s2,s3,p;
    
    
    public DatiCondivisi(){
        ris = "";
        s1 = new Semaphore(1);
        s2 = new Semaphore(0);
        s3 = new Semaphore(0);
        p = new Semaphore(0);
    }
    
    public String getR(){
    
        return ris;
    }
    
    synchronized public void setR(String r){
        
        ris = r;
    }
}
