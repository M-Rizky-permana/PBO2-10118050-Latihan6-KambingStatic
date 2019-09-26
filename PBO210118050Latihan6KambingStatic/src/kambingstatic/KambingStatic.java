/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingstatic;

/**
 *
 * @author
 * NAMA     : Muhamad Rizky Permana
 * KELAS    : IF-2
 * NIM      : 10118050
 * Deskripsi Program : Menampilkan double class
 */
 
public class KambingStatic {
       
    
    // 
    public static final String NAMA_KAMBING = "MIDUN";
    
  
    public static void main(String[] args) {
        // TODO code application logic here  
        
        Mamalia.jumlahKambing =  485000 ;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
       
    }
    
}

    