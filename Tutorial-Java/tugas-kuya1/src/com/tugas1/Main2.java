package com.tugas1;

public class Main2 {
    public static void main(String[] args) {
        int [] data = {10,40,20,15,12};
        int temp, i, j;

        for (i = 0; i < data.length; i++) {
            for (j = i ; j < data.length; j++){
                if (data[i] > data[j]){

                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;

                }


            }
            System.out.println(data[i]);

        }


        System.out.println("ini adalah akhir program");
    }
}
