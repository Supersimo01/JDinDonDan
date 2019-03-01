
package jdindondan;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mauri_simone
 */
public class JDinDonDanTemp {
    
    
    public static void main(String[] args) {
        
        DatiCondivisi dc = new DatiCondivisi();
        
        Scanner sc = new Scanner(System.in);
        
        Th1 t1 = new Th1(dc);
        Th2 t2 = new Th2(dc);
        Th3 t3 = new Th3(dc);
        ThPrint tp = new ThPrint(dc);
        
        t1.start();
        t2.start();
        t3.start();
        tp.start();
        
        while(sc.nextLine().equals(null)){}
        
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
        tp.interrupt();
        
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JDinDonDanTemp.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JDinDonDanTemp.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JDinDonDanTemp.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            tp.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JDinDonDanTemp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
