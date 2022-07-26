package com.tutorial35;

public class tutorial35 {
    public static void main(String[] args) {


        /*
            void itu artinya hampa jadi jadi void itu adalah tipe data kosong
            sehingga tidak memerlukan return untuk mengembalikan sebuah nilai
         */
        System.out.println(simple());
        fungsiVoid("apa pun");
        selamatpagi("emak");
        selamatpagi("abah");
    }

    private static void selamatpagi(String nama){
        System.out.println("selamat pagi "+ nama);
    }


    // fungsi atau method tanpa return (kembalian)
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    /*
        fungsi atau method dengan kembalian
        sehinggal menggunakan rerturn untuk
        mengembalikan nilainya (10.0f)
     */
    private static float simple(){
        return 10.0f;
    }
}
