/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.asprak.ima.pkg2;

/**
 *
 * @author Unknown
 */
public class Peserta implements Comparable <Peserta>{
    private int nomor, nilai;
    private String nama;

    @Override
    public String toString() {
        return nama + " nilai : " +nilai;
    }
      

    public Peserta(int nomor, int nilai, String nama) {
        this.nomor = nomor;
        this.nilai = nilai;
        this.nama = nama;
    }

    public int getNomor() {
        return nomor;
    }

    public int getNilai() {
        return nilai;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public int compareTo(Peserta o) {
        if (this.nilai < o.nilai) {
            return 1;
        } else if (this.nilai == o.nilai) {
            return 0;
        } else {
            return -1;
        }
    }
    
}
