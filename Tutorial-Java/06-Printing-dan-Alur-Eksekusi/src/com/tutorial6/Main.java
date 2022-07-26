package com.tutorial6;

public class Main {
    public static void main(String[] args) {
        // menggunakan print ln atau baris baru
        System.out.println("====MENGGUNAKAN PRINTLN====");
        System.out.println("Hai Bro");
        System.out.println("Hai Sist");
        System.out.println("=====================");
        System.out.println("\n");


        // menggunakan print tidak menambah bari baru
        System.out.println("====MENGGUNAKAN PRINT====");
        System.out.println("baris ke-3 : ini adalah baris ketiga");
        System.out.println("baris ke-4 : saya meneruskan baris keempat");
        System.out.println("=====================");
        System.out.println("\n");

        // Alur Eksekusi Program
        System.out.println("====Alur Eksekusi Program====");
        System.out.print("Hai Sist");
        System.out.println("Hai Sist");
        System.out.println("=====================");
        System.out.println("\n");

        // menambahkan new line/ ln secara manual dengan \n
        System.out.println("====New Line Manual dengan \\n====");
        System.out.print("Hai Sist\n");
        System.out.print("Hai Sist\n");
        System.out.print("Hai Sist\n");
        System.out.print("=====================");
        System.out.print("\n");

        // menggunakan %d atau desimal untuk memasukan angka yang ada di dalam variable
        int a = 3;
        System.out.println("====Menambahkan variable int ke dalam string (%d)=======");
        System.out.printf("ternyata benda itu ada %d", a);
    }
}