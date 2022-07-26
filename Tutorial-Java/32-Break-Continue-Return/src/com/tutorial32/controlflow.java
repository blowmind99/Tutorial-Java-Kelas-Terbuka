package com.tutorial32;

public class controlflow {
    public static void main(String[] args) {
        // break, continue, rertun

        int a = 0;

        while(true){
            a++;
            if (a == 10){
                break;
            }else if(a == 5){
                continue;
            }else if (a == 7){
            return;

            }
            System.out.println("looping ke- "+a);
        }
    }
}
