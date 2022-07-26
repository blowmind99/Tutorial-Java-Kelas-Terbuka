package com.tutorial14;

public class OperatorKomparasi {
    public static void main(String[] args) {

        // operator komparasi atau operator perbandingan
        // akan menghasilkan nilai boolean

        int a,b;
        boolean hasil;

        a = 10;
        b = 15;

        // Operator sama dengan (==)
        hasil = (a == b);
        System.out.printf("%d apakah sama dengan %d? %s \n", a,b, (hasil));

        // Operator tidak sama dengan (!=)
        hasil = (a != b);
        System.out.printf("%d apakah tidak sama dengan %d? %s \n", a,b, (hasil));

        // Operator lebih besar dari (>)
        hasil = (a > b);
        System.out.printf("%d apakah lebih besar dari %d? %s \n", a,b, (hasil));

        // Operator lebih kecil dari (<)
        hasil = (a < b);
        System.out.printf("%d apakah lebih kecil dari %d? %s \n", a,b, (hasil));

        // Operator lebih besar atau sama dengan (>=)
        a = 12;
        b = 10;
        hasil = (a >= b);
        System.out.printf("%d apakah lebih besar atau sama dengan dari %d? %s\n", a,b, hasil);

        // Operator lebih kecil atau sama dengan (>=)
        a = 12;
        b = 12;
        hasil = (a <= b);
        System.out.printf("%d apakah lebih kecil atau sama dengan dari %d? %s\n", a,b, hasil);
    }
}
