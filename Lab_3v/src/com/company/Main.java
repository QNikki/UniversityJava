package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a sentence with length 12 and more, else well be used default sentence: ");
        String str = in.nextLine();
        if (str.length() < 12) {
            str = "Hello world! Welcome to Java";
        }

        outputResult(StringHandler.AddHelloToEnd(str));
        outputResult(StringHandler.FirsWordToUp(str));
        try {
            outputResult(StringHandler.ReplaceStringCut(str, 5, 12));
        }
        catch (ValidationException ex) {
            outputResult(ex.getMessage());
            return;
        }

        outputResult(StringHandler.CountCharInString(str, 'w'));
    }

    public static int outputResult(Object result) {
        System.out.println(result);
        return 0;
    }
}