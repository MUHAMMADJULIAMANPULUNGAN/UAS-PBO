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
public class Manajer extends Karyawan{
    private String tunjangan;
    
public Manajer (String id, String nama, String gaji, String tunjangan){
    super(id, nama, gaji);
    this.tunjangan= tunjangan;
}

public void viewManajer(){
    System.out.println("TUNJANGAN :" +tunjangan);
}
}
