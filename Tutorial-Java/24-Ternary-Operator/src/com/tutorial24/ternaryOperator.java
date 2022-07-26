package com.tutorial24;

import java.util.*;

public class ternaryOperator {
    public static void main(String[] args) {
        // ternary operator

        int input,x;

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai : ");
        input = userInput.nextInt();

        // variable x = ekspresi ? statement true : statement false

        x = (input == 10) ? (input*input*input*0) : (input/2);

        System.out.println("hasil = " + x);



    }
}
