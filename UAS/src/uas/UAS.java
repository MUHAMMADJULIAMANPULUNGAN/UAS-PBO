/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author juan1
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Programer p = new Programer ("2101","JUAN","Rp 2000000","Rp 1000000");
        Manajer m= new Manajer("2100","SALSA","Rp 5000000","Rp 3000000");
        
        p.viewKaryawan();
        p. viewProgramer();
        
        m.viewKaryawan();
        m.viewManajer();
                
    }
    
}
