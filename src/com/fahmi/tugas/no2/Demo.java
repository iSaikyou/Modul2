package com.fahmi.tugas.no2;

public class Demo {
    public static void main(String[] args) {

        //Burung
        Burung burung = new Burung();
        burung.nama = "Merpati";
        burung.makan = "Kacang - kacangan";
        burung.tidur = "Saat mengantuk";
        burung.terbang = "Menggunakan sayapnya";

        //Methodnya
        System.out.println("# Burung #");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        //Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Giru (Biasa disebut ikan badut)";
        ikan.makan = "Cacing";
        ikan.tidur = "Saat mengantuk juga";
        ikan.berenang = "Menggunakan sirip kecilnya";


        //Methodnya
        System.out.println("# Ikan #");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        //Kucing
        Kucing kucing = new Kucing();
        kucing.nama  = "Ragdoll";
        kucing.makan = "Ikan tongkol";
        kucing.tidur = "Pas ngantuk lah";
        kucing.meong = "Mengeong pada saat galau";

        //Methodnya
        System.out.println("# Kucing #");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();

        System.out.println();
    }
}