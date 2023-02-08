package org.example;


public class function {
    // Integer to Binary translation
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
        byte bi;

        //      byte z = (byte) 1 ? x : 0;
        //      return 1 ? x : 0;
        return 0;
    }


    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {

        boolean rez1 = (a ^ b && c ^ d) || (a ^ c || b ^ d);
        boolean rez = !(a ^ b ^ c ^ d) & !(a & b & c & d) & !(!a & !b & !c & !d);
        return rez;
        //write code above this line
    }

    public static int getFactorial(int number) {
        if (number > 1) {
            return getFactorial(number - 1) * number;
        }
        return 1;
    }

    public static int getFibonacciNumber(int n) {
        switch (n) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            default: {
                return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
            }
        }
    }

}
