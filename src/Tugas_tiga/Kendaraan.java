/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_tiga;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Kendaraan {
    String jenis,brand;
    int cc;
    
    void isi(){
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan Jenis Mobil : ");
        jenis = in.nextLine();
        System.out.println("Masukkan Brand Mobil : ");
        brand = in.nextLine();
        System.out.println("Masukkan CC Mobil : ");
        cc = in.nextInt();
    }
    void tampilan(){
        System.out.println(" ");
        System.out.println("Jenis Mobil : "+jenis);
        System.out.println("Brand Mobil : "+brand);
        System.out.println("CC Mobil : "+cc);
    }
    
}
