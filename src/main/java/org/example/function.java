package org.example;


public class function {
<<<<<<< HEAD
// Integer to Binary translation
=======
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        //write code below this line
        a = b = true;
        c = d = false;
        return !(a ^ b ^ c ^ d) & !(a & b & c & d) & !(a || b || c || d);
        //write code above this line
    }

>>>>>>> 15db5d4 (Xmmmm)
    public static String iToBi(int value) {
        StringBuilder intNumber = new StringBuilder();
        do {
            intNumber.append(value % 2);
            value = value / 2;
        } while (value > 0);
        return intNumber.reverse().toString();
    }
// Умножалка на два
    public static int getDoubledNumber(int number) {
        return number << 1;
    }

//
    public static byte bToB(boolean x) {
        byte bi ;

     //      byte z = (byte) 1 ? x : 0;
        //      return 1 ? x : 0;
        return 0;
    }

<<<<<<< HEAD

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

        boolean rez1 =  ( a ^ b && c ^ d ) || (a ^ c || b ^ d );
        boolean rez = !(a ^ b ^ c ^ d) & !(a & b & c & d) & !(!a & !b & !c & !d);
        return rez;
        //write code above this line
    }
=======
>>>>>>> 15db5d4 (Xmmmm)
}
