package com.tutorial25;
import java.util.*;
public class kalkulatorIfElse {
    public static void main(String[] args) {
        Scanner userInput;
        int a, b, hasil;
        char operator;
        userInput = new Scanner (System.in);

        System.out.print("masukan angka pertama :");
        a = userInput.nextInt();
        System.out.print("masukan opertaror :");
        operator = userInput.next().charAt(0);
        System.out.print("masukan angka kedua :");
        b = userInput.nextInt();

        if (operator == '+') {
            hasil = a + b;
            System.out.printf("%d + %d = %d\n", a, b, hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.printf("%d * %d = %d\n", a, b, hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.printf("%d - %d = %d\n", a, b, hasil);
        } else if (operator == '/'){
            if (b == 0){
                System.out.println("jangan di bagi 0 karena bakalan tak terhingga cuy");
            }else{
                hasil = a / b;
                System.out.printf("%d * %d = %d\n", a,b,hasil);
            }

        } else {
            System.out.println("Operator tidak ditemuka harap masukan operasi, kali,tambah,kurang,bagi");
        }
    }
}
