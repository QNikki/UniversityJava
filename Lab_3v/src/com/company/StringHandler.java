package com.company;

import java.util.concurrent.ExecutionException;

public class StringHandler {

    public static String AddHelloToEnd(String rawString) {
        return rawString.concat("Hello");
    }

    public static String FirsWordToUp(String rawString) {
        String[] array = rawString.split(" ");
        return array[0].toUpperCase();
    }

    public static String ReplaceStringCut(String rawString,int StartCut, int EndCut) throws ValidationException {
        if (EndCut < StartCut && EndCut < 0 && StartCut <= 0) {
            throw new ValidationException("Wrong Arguments");
        }

        char[] cutChars = new char[EndCut - StartCut];
        String cutStr = rawString.substring(StartCut, EndCut);
        String reverseCut = new StringBuilder(cutStr).reverse().toString();
        return rawString.replace(cutStr, reverseCut);
    }

    public static int CountCharInString(String srcString, char symbol) {
        char[] arrChars = new char[srcString.length()];
        srcString.getChars(0, srcString.length(), arrChars,0);
        int result = 0;
        for (char ch:arrChars) {
            if  (ch == symbol) {
                result++;
            }
        }

        return result;
    }
}
