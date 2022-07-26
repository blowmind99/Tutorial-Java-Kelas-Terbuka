package com.tutorial18;

import java.util.Scanner;

public class PengelompokanOperasiAritmatika {
    public static void main(String[] args) {
        // Urutan eksekusi operator aritmatika
        // Perkalian atau Pembagian akan di eksekusi terlebih dahulu
        // jika dilakukan perkalian dan pembagian maka operasinya akan
        // dilakukan dari kiri ke kanan

        Scanner userInput = new Scanner(System.in);
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;
        System.out.println("Masukan Nilai X = ");
        x = userInput.nextInt();
        System.out.println(("Masukan Gradient M = "));
        m = userInput.nextInt();
        System.out.println("Masukan Nilai Bias C = ");
        c = userInput.nextInt();

        int y = (m * x * x) + c;
        System.out.println("nilai y = " + y);



    }
}
