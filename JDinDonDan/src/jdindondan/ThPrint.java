/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdindondan;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mauri_simone
 */
public class ThPrint extends Thread {

    DatiCondivisi d;

    public ThPrint(DatiCondivisi dc) {

        d = dc;

    }

    @Override
    public void run() {
        try {
            while (true) {
                d.p.acquire();
                System.out.println(d.getR());

                if (d.getR().equals("DIN")) {
                    d.s2.release();
                } else if (d.getR().equals("DON")) {
                    d.s3.release();
                } else {
                    d.s1.release();
                }
            }
        } catch (InterruptedException ex) {
            // Logger.getLogger(Th1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
