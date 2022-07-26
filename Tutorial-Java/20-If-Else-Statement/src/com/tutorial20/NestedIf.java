package com.tutorial20;

public class NestedIf {
    public static void main(String[] args) {
        // Nested If

        int a = 11;
        int b = 7;
        System.out.println("ini adalah awal programm");
        if (a == 10){
            System.out.println("ini statement 1"); // jika kondisi/ ekspresi pertama terpenuhi, maka dijalankan dan program selesai
        }else{
            if (b == 8){
                System.out.println("statement 4");// jika ekspresi 1 tidak terpenuhi, dan ekspresi 2 terpenuhi maka akan dijalankan dan program berakhir
            }else{
                if (b == 7){
                    System.out.println("statement 2"); // jika ekspresi 1 dan 2 tidak terpenuhi dan ekspresi 3 terpenuhi maka akan dijalankan dan program berakhir
                }else{
                    System.out.println("statement 3"); // jika ekspresi 1,2,3 tidak terpenuhi maka akan dijalankan dan program berakhir
                }
            }
        }

        System.out.println("ini adalah akhir program");
    }
}
