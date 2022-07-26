package com.tutorial17;
import java.util.Scanner;

public class MengambilUserInput {
    public static void main(String[] args) {
        // membuat class user input dan obyek
        Scanner userInput = new Scanner(System.in);
        Scanner userChoice = new Scanner(System.in);
        int panjang, lebar, luas;
        int pilihan;
        double r,a,phi;
        String opening = "SELAMAT DATANG SILAHKAN MEMILIH\n1. MENGHITUNG LUAG PERSEGI.\n2. LUAS LINGKARAN BERDASARKAN JARI JARI. (1/2)?\n";

        // Membuat program menghitung luas persegi panjang
        // rumus luas = panjang * lebar

        System.out.printf(opening);
        pilihan = userChoice.nextInt();

        switch (pilihan) {
            case 1 :
                System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
                System.out.print("panjang = ");
                panjang = userInput.nextInt();
                System.out.print("lebar = ");
                lebar = userInput.nextInt();
                luas = panjang * lebar;
                System.out.println("luas persegi panjang = " + luas);
                break;

            case 2 :
                // menghitung luas lingkaran dengan jari-jari
                // rumus = a = (r * r) * phi
                System.out.println("MENGHITUNG LUAS LINGKARAN BERDASARKAN JARI-JARI");
                System.out.print("jari-jari dalam cm = ");
                phi = 3.14;
                r = userInput.nextDouble();
                a = (double) (r * r) * phi;
                System.out.println("Luas Lingkaran = " + a + " cm kuadrat");
                break;

            default :
                System.out.println("pilihan tidak tersedia silahkan pilih kembali");
                break;

        }
        System.out.println("PROGRAM TELAH SELESAI SELAMAT DATANG KEMBALI ANJING");
    }
}
