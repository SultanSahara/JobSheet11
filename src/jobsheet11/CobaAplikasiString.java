/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

/**
 *
 * @author ASUS
 */
public class CobaAplikasiString {
    public static void main(String[] args) {
        String identitas = "M.Sultan Sahara/XR5/27";
        System.out.println("Identitas siswa : " +identitas);
        
        String x = "Operasi";
        System.out.println("Isi Variabel x : "+ x);
        System.out.println("\""+ x + "\" Panjang Karakter = "+ x.length());
        
        System.out.println("x adalah kosong : "+ x.isEmpty());
        
        String y = "";
        System.out.println("Isi Variabel y : "+ y);
        System.out.println("y adalah kosong : "+ y.isEmpty());
        
    }
    
}
