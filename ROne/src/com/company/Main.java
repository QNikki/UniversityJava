package com.company;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        char[] yea = new char[] {'Y','N'};
        int symbols;
        if(args.length < 7) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            symbols = in.nextInt();
        }
        else {
            symbols = args.length;
        }
        StringBuilder outputString = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < symbols; i++) {
            if(random.nextBoolean()) {
                outputString.append(yea[0]);
            }
            else {
                outputString.append(yea[1]);
            }
        }
        System.out.printf("Your random string: %s \n", outputString.toString());
    }
}
