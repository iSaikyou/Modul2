package com.fahmi.tugas.no1;

public class DemoClub {
    public static void main(String[] args) {

        Club club1 = new Club();
        Club club2 = new Club("Juventus");
        Club club3 = new Club("Juventus", "Juventus Football Club atau biasa disebut Juve merupakan klub sepak bola professional asal Italia.");
        Club club4 = new Club("Juventus", 1897, "Stadion Juventus");
        Club club5 = new Club("Juventus", 1897, "Stadion Juventus", 2, "Juventus Footbal Club atau biasa disebut Juve merupakan klub sepak bola professional asal Italia.");

        //Calling Method
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}