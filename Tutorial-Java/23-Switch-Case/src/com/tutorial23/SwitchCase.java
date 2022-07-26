package com.tutorial23;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        String input1, input2;
        String[][] menu = {
                {"nasi goreng", "omlet", "sandwich"}, {"coffee", "tea", "teh botol sosro"}
        };

        Scanner inputMakanan = new Scanner(System.in);
        Scanner inputMinuman = new Scanner(System.in);
        System.out.println("Makanan");
        System.out.println("1. " + menu[0][0]);
        System.out.println("2. " + menu[0][1]);
        System.out.println("3. " + menu[0][2]);
        System.out.println("Minuman");
        System.out.println("1. " + menu[1][0]);
        System.out.println("2. " + menu[1][1]);
        System.out.println("3. " + menu[1][2]);
        System.out.println("pilih menu sarapan : ");

        input1 = inputMakanan.next();
        switch (input1){
            case "1" :
                input1 =(menu[0][0]);
                break;
            case "2" :
                input1 = (menu[0][1]);
                break;
            case "3" :
                input1 = menu[0][2];
                break;
            default:
                System.out.println("menu tidak ada nyien sorangan koplok");

        }
        System.out.println("pilih minuman : ");
        input2 = inputMinuman.next();
        switch (input2){
            case "1" :
                input2 = menu[1][0];
                break;
            case "2" :
                input2 = menu[1][1];
                break;
            case "3" :
                input2 = menu[1][2];
                break;
            default:
                System.out.println("menu tidak ada nyien sorangan koplok");
        }
        System.out.println("sarapan anda " + input1 + " dan minumnya " + input2);
        System.out.println("selamat menikmati");
    }
}
