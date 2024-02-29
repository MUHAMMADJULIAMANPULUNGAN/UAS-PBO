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
public class Programer extends Karyawan{
    private String bonus;
    
public Programer(String id, String nama, String gaji, String bonus){
    super(id, nama, gaji);
    this.bonus = bonus;
}

public void viewProgramer(){
    System.out.println("BONUS :" +bonus);
    System.out.println("------------------");
}
}
