package com.tutorial20;

public class IfElseIfStatement {
    public static void main(String[] args) {

        // if else if statement
        String a = "0895378187010";
        System.out.println("ini adalah awal program");


        if (a.length() < 13) {

            System.out.println("ini adalah aksi 1");

        } else if ((a.length() == 13)  && (a.length() > 12) || a.length() < 8 ){

            System.out.println("ini adalah aksi 2");

        }else{
            System.out.println("tidak ada yang benar");
        }
        System.out.println("ini adalah akhir program");
    }
}
