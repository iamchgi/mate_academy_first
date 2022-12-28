package org.example;


import java.util.Arrays;

class Printer {
    public String print(String message) {
        return message;
    }

    public String print(int intMessage) {
        return String.valueOf(intMessage);
    }

    public String print(double doubleMessage) {
        return String.valueOf(doubleMessage);
    }

    public String print(String message, int intMessage) {
        return message + " and " + intMessage;
    }

    public String print(String[] messages) {
     //   messages.toString();
        return Arrays.toString(messages);
    }

    public static char[] removeLetter(String message) {
        char[] charMessage = new char[0];
        if (message != null) {
            message = message.toLowerCase();
            charMessage = message.toCharArray();
            for (int i = 0; i < charMessage.length; i++) {
                charMessage[i] = (charMessage[i] == 'r') ? '!' : charMessage[i];
            }
        }
        return charMessage;
    }

    public void printer(String stringArg) {
        char[] charMessage = stringArg.toCharArray();
        System.out.println("This is the string: " + stringArg);
    }

    public void printer(int intArg) {
        System.out.println("This is the int: " + intArg);
    }

    public void printer(boolean argument) {
        System.out.println("This is the bool: " + argument);
    }

    public void printer(String firstArgument, String secondArgument) {
        System.out.println("This is the strings: " + firstArgument + " , " + secondArgument);
    }
}