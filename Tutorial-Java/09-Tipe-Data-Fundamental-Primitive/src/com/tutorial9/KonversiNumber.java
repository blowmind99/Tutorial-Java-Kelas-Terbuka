package com.tutorial9;

public class KonversiNumber {
    public static void main(String[] args) {
        // urutan casting tipe data number
        // Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        // Narrowing Casting (Manual) : double -> float -> long -> int -> char -> short -> byte
        // Warning !
        // jika menkonversi manual harus mengetahui nilai max  dari tipe data yang akan di konversi
        // Agar tidak terjadi number overflow
        // memperkecil rentang ke tipe data yang memeliki rentang lebih kecil akan menghasilkan angka yang tidak sesuai

        // Widening casting
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt  = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;
        System.out.println(iniDouble);

        // Narrowing Casting
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
        System.out.println(iniLong2);

        // number overflow

        int iniInt3 = 1000;
        byte iniByte3 = (byte) iniInt3;
        System.out.println(iniByte3);


        // konversi tipe data primitive ke bukan primitive (object)

        // konversi tipe data primitive ke bukan primitive / sebaliknya dengan tipe data yang sama
        int age = 30;

        Integer ageObject = age;

        int ageAgain = ageObject;

        // konversi tipe data primitive ke bukan primitive / sebaliknya dengan tipe data yang berbeda

        short thisShort = ageObject.shortValue();
        System.out.println(thisShort);
    }

}
