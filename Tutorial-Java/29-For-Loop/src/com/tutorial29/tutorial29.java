package com.tutorial29;

public class tutorial29 {
    public static void main(String[] args) {
        System.out.println("looping pertama");
        for (int i =0; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("looping kedua");
        for (int i =0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("looping ketiga");
        for (int i =10; i>5; i--){
            System.out.println(i);
        }
        System.out.println("looping keempat");
        int i = 0;
        for (; i<=10;){
            System.out.println(i);
            i++;
        }

    }
}
