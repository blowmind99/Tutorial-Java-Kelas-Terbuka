package com.tutorial28;

public class tutorial28 {
    public static void main(String[] args) {
        boolean kondisi;
        kondisi = true;
        int a;
        a = 0;
        do {
            a++;
            System.out.println("do while ke-" +a);

            if (a == 10){
                kondisi = false;
            }
        }while(kondisi);
    }
}
