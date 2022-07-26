package com.tutorial9;

public class TypeDataPrimitive {
    public static void main(String[] args) {
        // 1 bytes = 8 bit
        // tipe data Primitive di Java
        // memiliki default value 0
        // integer, byte, short, long, double, float, char, boolean

        // integer (satuan)
        // jika memberikan nilai lebih kedalam nilai max interger dia akan mengembalikan nilai minus
        int i = 2147483647; // nilai max dari int dan 10 digit angka
        System.out.println("========INTEGER========");
        System.out.println("nilai integer i = " + (i + 1));

        // Helper Class untuk mengecek nilai max dan min
        System.out.println("Nilai Max = " + Integer.MAX_VALUE);
        System.out.println("Nilai Min = " + Integer.MIN_VALUE);

        // integer mempunyai ukuran dari segi memory
        // mengecek ukuran memory
        // int memiliki nilai max 4 bytes atau 32 bit
        System.out.println("Besar Integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar Integer = " + Integer.SIZE + " bit");
        System.out.println("================================");

        // byte (satuan)
        // jika memberikan nilai lebih kedalam nilai max byte dia akan error
        byte b = 127; // nilai max dari byte adalah 3 digit angka
        System.out.println("========BYTE========");
        System.out.println("nilai byte b = " + (b + 1));

        // Helper Class untuk mengecek nilai max dan min
        System.out.println("Nilai Max = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min = " + Byte.MIN_VALUE);

        // Byte mempunyai ukuran dari segi memory
        // mengecek ukuran memory
        // byte memiliki nilai max 1 bytes atau 8 bit
        System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");
        System.out.println("================================");

        // short (satuan)
        // jika memberikan nilai lebih kedalam nilai max short dia akan error
        short s = 32767; // nilai max dari short 5 digit angka
        System.out.println("========SHORT========");
        System.out.println("nilai short s = " + (s + 1));

        // Helper Class untuk mengecek nilai max dan min
        System.out.println("Nilai Max = " + Short.MAX_VALUE);
        System.out.println("Nilai Min = " + Short.MIN_VALUE);

        // Short mempunyai ukuran dari segi memory
        // mengecek ukuran memory
        // short memiliki nilai max 2 bytes atau 16 bit
        System.out.println("Besar Short = " + Short.BYTES + " bytes");
        System.out.println("Besar Short = " + Short.SIZE + " bit");
        System.out.println("================================");

        // Long (satuan)
        // jika memberikan nilai lebih kedalam nilai max Long dia akan mengembalikan nilai min Long
        long l = 9223372036854775807L; // nilai max dari Long
        System.out.println("========LONG========");
        System.out.println("nilai long b = " + (l + 1));

        // Helper Class untuk mengecek nilai max dan min
        System.out.println("Nilai Max = " + Long.MAX_VALUE);
        System.out.println("Nilai Min = " + Long.MIN_VALUE);

        // Long mempunyai ukuran dari segi memory
        // mengecek ukuran memory
        // long memiliki nilai max 8 bytes atau 64 bit
        System.out.println("Besar Long = " + Long.BYTES + " bytes");
        System.out.println("Besar Long = " + Long.SIZE + " bit");
        System.out.println("================================");

        // double (bilangan real, atau bilangan pecahan desimal dengan koma)
        // jika memberikan nilai lebih (dikalikan) kedalam nilai max Double dia akan mengembalikan nilai Infinity
        double d = 1.7976931348623157E308d; // nilai max dari double dan float
        System.out.println("========DOUBLE========");
        System.out.println("nilai double d = " + (d * 1.7));

        // Helper Class untuk mengecek nilai max dan min
        System.out.println("Nilai Max = " + Double.MAX_VALUE);
        System.out.println("Nilai Min = " + Double.MIN_VALUE);

        // Double mempunyai ukuran dari segi memory
        // mengecek ukuran memory
        // double memiliki nilai max 8 bytes atau 64 bit
        System.out.println("Besar Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Double = " + Double.SIZE + " bit");
        System.out.println("================================");

        // Float (bilangan real, atau bilangan pecahan desimal dengan koma)
        // jika memberikan nilai lebih kedalam nilai max float itu akan dijumlahkan
        float f = 3.4028235E38F; // nilai max float
        System.out.println("========FLOAT========");
        System.out.println("nilai float f = " + (f * 1.7));

        // Helper Class untuk mengecek nilai max dan min
        System.out.println("Nilai Max = " + Float.MAX_VALUE);
        System.out.println("Nilai Min = " + Float.MIN_VALUE);

        // Float mempunyai ukuran dari segi memory
        // mengecek ukuran memory
        // float memiliki nilai max 4 bytes atau 32 bit
        System.out.println("Besar Float = " + Float.BYTES + " bytes");
        System.out.println("Besar Float = " + Float.SIZE + " bit");
        System.out.println("================================");

        // char (karakter) Berdasarkan ASCII code
        char c = 'c';
        System.out.println("========CHAR========");
        System.out.println("nilai char f = " + c);

        // Helper Class untuk mengecek nilai max dan min
        System.out.println("Nilai Max = " + Character.MAX_VALUE); // mengeluarkan simbol maksimum ASCII
        System.out.println("Nilai Min = " + Character.MIN_VALUE); // mengeluarkan simbol minimum ASCII

        // Char mempunyai ukuran dari segi memory
        // mengecek ukuran memory
        // char memiliki nilai max 2 bytes atau 16 bit
        System.out.println("Besar Char = " + Character.BYTES + " bytes");
        System.out.println("Besar Char = " + Character.SIZE + " bit");
        System.out.println("================================");

        // Boolean (nilai true atau false)
        boolean val = true;
        System.out.println("========BOOLEAN========");
        System.out.println("nilai boolean val = " + val);

        // Helper Class untuk mengecek nilai max dan min
        // boolean tidak memiliki nilai max dan min hanya memiliki nilai true dan false
        System.out.println("Nilai Max = " + Boolean.TRUE);
        System.out.println("Nilai Min = " + Boolean.FALSE);

        // Char mempunyai ukuran dari segi memory
        // mengecek ukuran memory
        // boolean tidak memiliki ukuran karena dia hanya mempunyai 1 bytes saja
        System.out.println("================================");

    }
}
