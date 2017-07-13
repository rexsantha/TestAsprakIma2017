/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.asprak.ima.pkg2;


import java.util.*;
/**
 *
 * @author Unknown
 */
public class TestAsprakIMA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peserta peserta[] = new Peserta[5];
        int pil=0, counter=0;
        int nomor = 0, nilai;
        String nama;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Input Data");
        System.out.print("Masukan Pilihan : ");
        pil = sc.nextInt();
        while(pil==1){ 
            System.out.print("Masukan Nomor : ");
            nomor = sc.nextInt();
            if(nomor == 9999 || counter == 5){
                int count = 1;
                Arrays.sort(peserta);
                for(Peserta x : peserta){
                    System.out.println("Juara " + count);
                    System.out.println(x.toString());
                    System.out.println("--------------------------");
                    count++;
                }
            }
            else{
                System.out.print("Masukan Nama : ");
                nama = sc.next();
                System.out.print("Masukan Nilai : ");
                nilai = sc.nextInt();
                Peserta temp = new Peserta(nomor, nilai, nama);
                peserta[counter] = temp;
                counter++;
            }
                
        }
    }
    
}