package com.tutorial27;

public class tutorial27 {
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;

        while (kondisi){
            System.out.println("ini while ke -"+a);

            if (a == 10){
                kondisi = false;
            }
            a++;
        }
    }
}
