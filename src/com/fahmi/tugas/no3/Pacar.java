package com.fahmi.tugas.no3;

public class Pacar extends Mahasiswa{

    public String namaPacar = "Ga ada";
    public int lamaHubungan = 0;

    public void getStatus(){
        System.out.println("Nama Pacar\t\t: "+namaPacar);
        System.out.println("Lama Hubungan\t: "+lamaHubungan);
    }
}