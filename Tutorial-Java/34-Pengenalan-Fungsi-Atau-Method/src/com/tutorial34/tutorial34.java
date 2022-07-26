package com.tutorial34;

public class tutorial34 {
    public static void main(String[] args) {
        int x, y;

        x = 5;
        y = hitung(x);
        System.out.println("x = " + x + ", y " + y);

        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + ", y " + y);

        x = 40;
        y = hitung(x);
        System.out.println("x = " + x + ", y " + y);

    }

    static int hitung (int input){
        int hasil;

        hasil = input * input;

        return hasil;

    }
}
