package com.tugas1;


public class Main {
    public static void main(String[] args) {
        float [] deret = {8, 3.5f, 2, 7, 9, 6, 4};
        float min = 6;
        float max = 0;
        int i;

        for (i = 0; i < deret.length; i++){
            if (deret[i] > max){

                max = deret[i];
            }else {
                if (deret[i] < min){
                    min = deret[i];
                }
            }

        }
        System.out.println("nilai maximal adalah "+max);
        System.out.println("nilai maximal adalah "+min);





    }
}
