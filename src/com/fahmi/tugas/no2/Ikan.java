package com.fahmi.tugas.no2;

public class Ikan extends Binatang {

    public String nama, berenang;

    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }

    public void berenang(){
        System.out.println("Aktivitas\t\t: " + berenang);
    }
}