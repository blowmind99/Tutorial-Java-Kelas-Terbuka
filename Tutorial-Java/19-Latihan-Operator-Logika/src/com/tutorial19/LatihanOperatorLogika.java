package com.tutorial19;
import java.util.Scanner;
public class LatihanOperatorLogika {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int nilaiTebakan, nilaiBenar;
        boolean statusTebakan;

        System.out.println("MENEBAK SEBUAH ANGKA");
        System.out.println("masukan nilai tebakan anda: ");
        nilaiTebakan = userInput.nextInt();
        nilaiBenar = 6;
        // operasi logika == (sama dengan)
        statusTebakan = nilaiTebakan == nilaiBenar;
        System.out.println("nilai tebakan anda " + statusTebakan);

        // Operasi aljabar boolean (and / or)

        System.out.println("masukan nilai lebih besar dari 4 dan lebih kecil dari 9: ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("tebakan anda " + statusTebakan);

        /*
            OPERATOR LOGIKA AND

            a | b | C
            0   0   0
            1   0   0
            0   1   0
            1   1   1

            OPERATOR LOGIKA OR

            a | b | c
            0   0   0
            1   0   1
            0   1   1
            1   1   1

         */
    }
}
