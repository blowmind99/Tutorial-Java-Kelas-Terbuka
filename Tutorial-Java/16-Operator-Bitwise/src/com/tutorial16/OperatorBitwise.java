package com.tutorial16;

public class OperatorBitwise {
    public static void main(String[] args) {

        // Operator Bitwise ---> untuk melakukan operasi pada nilai bit
        byte a, b, c;
        String a_bits,b_bits, c_bits;
        a =12;
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(" ", "0"); // helper memindahkan variable a kedalam format binari string
        System.out.printf("nilai bit dari %d = %s \n", a, a_bits);

        // Operator Bitwise SHIFT LEFT (<<)
        System.out.println("=========== SHIFT LEFT");
        b = (byte) (a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(" ", "0");
        System.out.printf("nilai bit dari %d sebelum di << = %s \n", a, a_bits);
        System.out.printf("nilai bit dari %d setelah di << = %s dan bernilai = %d \n", a, b_bits, b);
        System.out.println("=============================================SHIT LEFT");

        // Operator Bitwise SHIFT RIGHT (>>)
        System.out.println("=========== SHIFT RIGHT");
        b = (byte) (a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(" ", "0");
        System.out.printf("nilai bit dari %d sebelum di >> = %s \n", a, a_bits);
        System.out.printf("nilai bit dari %d setelah di >> = %s dan bernilai = %d \n", a, b_bits, b);
        System.out.println("=============================================SHIT RIGHT");

        // Operator Bitwise OR (|)
        System.out.println("=========== OR (|)");
        a = 24;
        b = 12;
        c = (byte) (a | b);
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(" ", "0");
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(" ", "0");
        c_bits = String.format("%8s", Integer.toBinaryString(c)). replace(" ", "0");
        System.out.printf("nilai bit dari %d      = %s \n", a, a_bits);
        System.out.printf("nilai bit dari %d      = %s \n", b, b_bits);
        System.out.printf("%d dan %d setelah di | = %s = %d \n",a, b, c_bits, c);
        System.out.println("=============================================OR");

        // Operator Bitwise AND (&)
        System.out.println("=========== AND (&)");
        a = 24;
        b = 12;
        c = (byte) (a & b);
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(" ", "0");
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(" ", "0");
        c_bits = String.format("%8s", Integer.toBinaryString(c)). replace(" ", "0");
        System.out.printf("nilai bit dari %d      = %s \n", a, a_bits);
        System.out.printf("nilai bit dari %d      = %s \n", b, b_bits);
        System.out.printf("%d dan %d setelah di & = %s = %d \n",a, b, c_bits, c);
        System.out.println("=============================================AND");

        // Operator Bitwise XOR (^)
        System.out.println("=========== XOR (^)");
        a = 24;
        b = 12;
        c = (byte) (a ^ b);
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(" ", "0");
        b_bits = String.format("%8s", Integer.toBinaryString(b)). replace(" ", "0");
        c_bits = String.format("%8s", Integer.toBinaryString(c)). replace(" ", "0");
        System.out.printf("nilai bit dari %d      = %s \n", a, a_bits);
        System.out.printf("nilai bit dari %d      = %s \n", b, b_bits);
        System.out.printf("%d dan %d setelah di ^ = %s = %d \n",a, b, c_bits, c);
        System.out.println("=============================================XOR");

        // Operator Bitwise NOT (~)
        System.out.println("=========== NOT (~)");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)). replace(" ", "0");
        System.out.printf("nilai bit dari %d sebelum di ~ = %s \n", a, a_bits);
        b_bits = String.format("%8s", Integer.toBinaryString(b)). substring(24);
        System.out.printf("nilai bit dari %d setelah di ~ = %s = %d \n", a, b_bits,b);


    }
}
