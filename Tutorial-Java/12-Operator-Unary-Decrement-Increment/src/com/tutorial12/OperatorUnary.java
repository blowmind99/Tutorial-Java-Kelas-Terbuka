package com.tutorial12;

public class OperatorUnary {
    public static void main(String[] args) {
        // operator unary adalah operasi yang dilakukan pada satu variable

        // unary + dan - dilakukan sebelum variable dan tidak akan merubah data dari variable
        int angka = 1;
        System.out.printf("unary '+' %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '-' %d menjadi %d\n", angka, -angka);
        System.out.println(angka);

        // unary increment
        System.out.println("===========UNARY INCREMENT===========");
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi " + angka2);
        System.out.println("============================================");
        System.out.println("\n");

        // unary decrement
        System.out.println("===========UNARY DECREMENT===========");
        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi " + angka3);
        System.out.println("============================================");
        System.out.println("\n");

        // prefix increment, nilainya akan ditambah dulu lalu di tampilkan
        System.out.println("===========PREFIX INCREMENT DAN POSTFIX INCREMENT===========");
        int angka4 = 10;
        System.out.printf("nilai %d dengan '++' prefix menjadi = %d \n", angka4, ++angka4);

        // postfix increment, nilainya akan di tampilkan dulu lalu ditambah dan harus di tampilkan kembali
        int angka5 = 10;
        System.out.printf("nilai %d dengan '++' postfix menjadi = %d \n", angka5, angka5++);
        System.out.printf("sesudah di postfix menjadi = %d \n", angka5);
        System.out.println("============================================");
        System.out.println("\n");

        // prefix decrement, nilainya akan di kurang dulu lalu di tampilkan
        System.out.println("===========PREFIX DECREMENT dan POSTFIX DECREMENT===========");
        int angka6 = 10;
        System.out.printf("nilai %d dengan '--' prefix menjadi = %d \n", angka6, --angka6);

        // postfix decrement, nilainya akan di tampilkan dulu lalu di kurang dan harus di tampilkan kembali
        int angka7 = 10;
        System.out.printf("nilai %d dengan '--' postfix menjadi = %d \n", angka7, angka7--);
        System.out.printf("sesudah di postfix menjadi = %d \n", angka7);
        System.out.println("============================================");
        System.out.println("\n");

        // unary boolean dengan ! untuk negasi dan tidak akan merubah data dari variable
        boolean didun = false;
        System.out.println("===========UNARY BOOLEAN DENGAN !==========");
        System.out.println("nilai boolean = " + didun);
        System.out.println("nilai boolean = " + !didun);
        System.out.println("nilai boolean = " + didun);


    }
}
