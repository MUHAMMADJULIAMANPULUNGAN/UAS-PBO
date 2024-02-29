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
public class Karyawan {
    private String id;
    private String nama;
    private String gaji;
    
 public Karyawan (String id, String nama, String gaji){
     this.id = id;
     this.nama = nama;
     this.gaji= gaji;
 }
 public void viewKaryawan() {
     System.out.println("ID :" +id);
     System.out.println("NAMA :" +nama);
     System.out.println("GAJI :" +gaji);
     
 }
    
}
