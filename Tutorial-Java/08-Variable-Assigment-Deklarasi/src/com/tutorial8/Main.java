package com.tutorial8;

public class Main {
    public static void main(String[] args) {
        // a adalah variable
        // int adalah type data
        // = adalah assignment dan 10 adalah value yang diberikan kedalam variable
        int a = 10;
        System.out.printf("ini adalah nilai a  = %d\n", a);
        a = 20;
        System.out.println("nilai a baru = " + a);

        // deklarasi / pernyataan adalah untuk menyatakan sebuah variable

        String b; // kini variable b sudah dinyatakan dan mempunyai type data string tetapi tidak mempunyai nilai
                  // karena tidak dilakukan assignment
                  // akan eror ketika di run karena tidak mempunyai nilai

        b = "hello world"; // mempunyai nilai karena sudah dilakukan assignment

        System.out.println(b);
    }
}
