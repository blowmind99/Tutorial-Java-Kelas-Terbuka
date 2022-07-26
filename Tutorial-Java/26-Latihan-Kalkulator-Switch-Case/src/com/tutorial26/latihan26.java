package com.tutorial26;
import java.util.*;

public class latihan26 {
    public static void main(String[] args) {
        Scanner InputUser;
        InputUser = new Scanner(System.in);
        float a,b,hasil;
        String Operator;

        System.out.print("Nilai a = ");
        a = InputUser.nextFloat();
        System.out.print("Operator = ");
        Operator = InputUser.next();
        System.out.print("Nilai b = ");
        b = InputUser.nextFloat();

        switch(Operator){
            case "+" :
                // penjumlahan
                hasil = a + b;
                System.out.println(hasil);
                break;
            case "-" :
                // pengurangan
                hasil = a - b;
                System.out.println(hasil);
                break;
            case "*" :
                // perkalian
                hasil = a * b;
                System.out.println(hasil);
            case "/" :
                // pembagian
                hasil = a / b;
                System.out.println(hasil);

            default:
                System.out.println("Operator " + Operator + " tidak ditemukan");
        }

    }
}
