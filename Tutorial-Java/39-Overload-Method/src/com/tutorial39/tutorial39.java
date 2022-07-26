package com.tutorial39;
import java.lang.String;

public class tutorial39 {
    public static void main(String[] args) {

    int hasilInt = (int) tambah(3.9f ,4);
    printAngka(hasilInt);

    float hasilFloat = tambah(10.0f, 50.8d);
    printAngka(hasilFloat);

    double hasilDouble = tambah(50, 60.8d);
    printAngka(hasilDouble);
    }
    private static int tambah (int angka1, int angka2){
        return angka1 + angka2;
    }
    private static int tambah (int angka1, float angka2){
        return (int) ( angka1 + angka2);
    }

    private static int tambah (int angka1, double angka2){
        return (int) (angka1 + angka2);
    }
    private static float tambah (float angka1, int angka2){
        return angka1 + angka2;
    }
    private static float tambah (float angka1, double angka2){
        return (float) (angka1 + angka2);
    }
    private static double tambah (double angka1, int angka2){
        return angka1 + angka2;
    }
    private static double tambah (double angka1, float angka2){
        return angka1 + angka2;
    }
    private static double tambah (double angka1, double angka2){
        return angka1 + angka2;
    }


    private static void printAngka (float angkaFloat){
        System.out.println("angka "+ angkaFloat + " bertipe data float");
    }

    private static void printAngka (int angkaInteger){
        System.out.println("angka "+ angkaInteger + " bertipe data integer");
    }

    private static void printAngka (double angkaDouble){
        System.out.println("angka "+ angkaDouble + " bertipe data double");
    }


}
