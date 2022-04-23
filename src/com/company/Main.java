package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter text");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(text);

        boolean find = matcher.find();
        boolean start = matcher.lookingAt();
        boolean end = text.endsWith(String.valueOf(pattern));
        boolean equal = matcher.matches();
        int index = text.indexOf(String.valueOf(pattern));



        if (find) {
            System.out.println("Found Java");

        }
        if (start) {
            System.out.println("Starts with Java");
        }

        if (end)
            System.out.println("Ends with Java");

        if (equal) {
            System.out.println("Equals Java");
        }

        if (find){
            System.out.println(index);
        } else {
            System.out.println("Sorry, no matches.");
        }
    }
}

