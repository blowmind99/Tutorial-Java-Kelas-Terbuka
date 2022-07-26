package com.tutorial15;

public class OperatorLogika {
    public static void main(String[] args) {
        // Operator logika dipakai untuk menghasilkan nilai boolean true atau false dari 2 kondisi atau lebih.
        // Operator Logika juga disebut sebagai operator aritmatika tipe data boolean
        // AND, OR, XOR, Negasi

        boolean a, b, c;

        // Operator Logika AND (&&)
        System.out.println("==========Operator Logika And==========");
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        System.out.println("\n");


        // Opeerator Logika OR (||)
        System.out.println("==========Operator Logika OR==========");
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        System.out.println("\n");

        // Operator Logika XOR (^)
        System.out.println("==========Operator Logika XOR==========");
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("\n");

        // Operator Logika NOT, Negasi atau flipping (membalikan) (!)
        System.out.println("==========Operator Logika NOT==========");
        a = true;
        c = !a;
        System.out.println("Nilai a = "+ a + " , Sesudah di !a atau flipping menjadi = " + c);
        a = false;
        c = !a;
        System.out.println("Nilai a = "+ a + " , Sesudah di !a atau flipping menjadi = " + c);

    }

}