package com.tutorial13;

public class OperatorAssignment {
    public static void main(String[] args){
        // Operator Assignment atau operator penugasan adalah operator untuk memasukan nilai kedalam suatu variable
        // di bahasa Java operator assignment menggunakan (=)
        // pembacaan operasi assignment dilakukan dari kanan ke kiri

        // contoh pembacaan operasi asssignment
        int value = 10;
        System.out.println("value = " + value);

        // pembacaannya adalah berikan nilai 10 kedalam variable nilai, jadi variable value mempunyai nilai 10

        /* Operator Assignment Gabungan adalah cara penulisan singkat operator assignment
           yang digabung dengan operator lain seperti operator aritmatika dan bitwise
         */

        // Contoh Operator Assignment Gabungan dengan operator aritmatika // augmented assignment atau operasi ke variable itu sendiri

        // Penjumlahan
        int a = 37;
        a += 20;
        System.out.println(a);

        // Pengurangan
        int b = 100;
        b -= 20;
        System.out.println(b);

        // Perkalian
        int c = 100;
        c *= 20;
        System.out.println(c);

        // Pembagian
        int d = 100;
        d /= 20;
        System.out.println(d);

        // modulus atau sisa bagi
        int e = 10;
        e %= 7;
        System.out.println(e);

        // Contoh Operator Assignment Gabungan dengan operator bitwise
        System.out.println("==========OPERATOR GABUNGAN DENGAN OPERATOR BITWISE==========");

       // Operator bitwise AND (&)
       a &= b;
       System.out.println (a);

       // Operator bitwise OR (|)
       a |= b;
        System.out.println(a);

       // Operator XOR (^)
       a ^= b;
       System.out.println(a);

       // Operator Not (~)
       int hasil = ~a;
       System.out.println("hasil dari ~a = " + hasil);

       // Operator Shift Right
       int f = 181;
        hasil = f >> 1;
        System.out.println("hasil dari f >> 1 = " + hasil);

       // Operator bitwise Shift Left
        hasil = f << 1;
        System.out.println("hasil dari f << 1 = " + hasil);
    }

}






