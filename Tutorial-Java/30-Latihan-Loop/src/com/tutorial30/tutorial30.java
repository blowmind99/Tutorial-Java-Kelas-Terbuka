package com.tutorial30;
import java.util.*;
public class tutorial30 {
    public static void main(String[] args) {
        int nilaiAkhir, nilaiAwal, total, first;

        Scanner InputUser = new Scanner(System.in);
        first = 0;
        total = 0;

        // latihan looping menggunakan while
//        System.out.print("Masukan Nilai Awal: ");
//        nilaiAwal = InputUser.nextInt();
//        System.out.print("Masukan Nilai Akhir: ");
//        nilaiAkhir = InputUser.nextInt();
//
//        while(nilaiAwal < nilaiAkhir){
//            total = total + nilaiAwal;
//            System.out.println("ditambah "+nilaiAwal+" menjadi "+ total);
//            nilaiAwal++;
//        }

        // latihan looping menggunakan do

//        System.out.print("Masukan Nilai awal: ");
//        nilaiAwal= InputUser.nextInt();
//        System.out.print("Masukan Nilai akhir: ");
//        nilaiAkhir= InputUser.nextInt();
//
//        do{
//            total = total + nilaiAwal;
//            System.out.println("ditambah "+nilaiAwal+" menjadi "+total);
//            nilaiAwal++;
//        }while(nilaiAwal <= nilaiAkhir);

        // latihan perulangan menggunakan for

        System.out.print("masukan nilai awal: ");
        nilaiAwal= InputUser.nextInt();
        System.out.print("masukan nilai akhir: ");
        nilaiAkhir= InputUser.nextInt();

        for (; nilaiAwal <= nilaiAkhir;){
            first = total;
            total = total + nilaiAwal;
            System.out.println(first+ " ditambah "+nilaiAwal+ " menjadi "+ total);
            nilaiAwal++;
        }
    }
}
