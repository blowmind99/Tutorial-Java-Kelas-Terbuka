package com.tutorial10;

public class Aritmatika {
    public static void main(String[] args) {
        // Operasi Aritmatika
        int x = 10;
        int y = 6;
        int hasil;

        // 1. Penjumlahan
        hasil = x + y;
        System.out.printf("%d + %d = %d \n", x,y,hasil);

        // 2. pengurangan
        hasil = x - y;
        System.out.printf("%d - %d = %d \n", x,y,hasil);

        // 3. perkalian
        hasil = x * y;
        System.out.printf("%d * %d = %d \n", x,y,hasil);

        // 4. pembagian
        hasil = x / y;
        System.out.printf("%d / %d = %d \n", x,y,hasil);

        // 5. modulus
        hasil = x % y;
        System.out.printf("%d %% %d = %d \n", x,y,hasil);

    }

}
