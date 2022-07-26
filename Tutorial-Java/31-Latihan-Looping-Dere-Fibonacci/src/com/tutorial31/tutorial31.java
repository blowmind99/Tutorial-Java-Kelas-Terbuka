package com.tutorial31;
import java.util.*;


public class tutorial31 {
    public static void main(String[] args) {
        int f_n, f_n_1, f_n_2, n;
        Scanner InputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke- : ");
        n = InputUser.nextInt();
        f_n_1 = 1;
        f_n_2 = 0;
        f_n = 1;
        // menggunakan for
//        for (int i = 1; i <=n; i++){
//            System.out.println("nilai ke- "+i+" adalah "+ f_n);
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//            f_n = f_n_1 + f_n_2;
//
//
//        }
        // menggunakan while
        int i = 1;
//        while (i<=n){
//            System.out.println("deret ke - "+ i+" adalah "+f_n);
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//            f_n = f_n_1 + f_n_2;
//
//            i++;
//        }
        // menggunakan do while
        do{
            System.out.println("deret ke - "+ i + " adalah "+f_n);
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            f_n = f_n_1 + f_n_2;
            i++;

        }while(i<=n);
    }

}
