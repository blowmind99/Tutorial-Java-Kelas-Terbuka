package com.tutorial37;
import java.util.*;


public class tutorial37 {
    public static void main(String[] args) {

        // fungsi recrusive adalah fungsi yang bisa di panggil berulang-ulang seperti looping

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai " + nilai);
        printNilai(nilai);
        System.out.print("\n");

        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);
        System.out.print("\n");
        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil Faktorial = " + faktorial);


    }

    // fungsi rekrusif sederhana
    // faktorial rekrusif == mengkalikan nilai
    private static int hitungFaktorial (int parameter){

        System.out.println("parameter = "+ parameter);
        if (parameter == 1){
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);

    }

    // rekrusif penjumlahan
    private static int jumlahNilai (int parameter){

        System.out.println("parameter = "+ parameter);
        if (parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);

    }
    private static int printNilai (int parameter){
        System.out.println("nilai = " + parameter);

        if (parameter == 0){
            return parameter;
        }
        parameter--;
        printNilai(parameter);
        return parameter;
    }
}
