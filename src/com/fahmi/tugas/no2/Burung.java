package com.fahmi.tugas.no2;

public class Burung extends Binatang {

    public String nama, terbang;

    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }

    public void terbang(){
        System.out.println("Aktivitas\t\t: " + terbang);
    }
}