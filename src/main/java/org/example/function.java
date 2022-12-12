package org.example;


public class function {

    public static String iToBi(int value) {
        StringBuilder intNumber = new StringBuilder();
        do {
            intNumber.append(value % 2);
            value = value / 2;
        } while (value > 0);
        return intNumber.reverse().toString();
    }

    public static int getDoubledNumber(int number) {
        return number << 1;
    }

    public static byte bToB(boolean x) {
        //      byte z = (byte) 1 ? x : 0;
        //      return 1 ? x : 0;
        return 0;
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        //write code below this line

        System.out.println(a + " " + b + " " + c + " " + d);
        //       System.out.println(bToB(a) + " " + booleanExpression(b) + " " + booleanExpression(c) + " " + booleanExpression(d));

        return false;
        //write code above this line
    }
}
