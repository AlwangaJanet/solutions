/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solutions.solutions;

/**
 *
 * @author Janet Alwanga
 */
//imports the Scanner class from the java.util
import java.util.Scanner;

/**Write a program that accepts a string as input, capitalizes the first letter of each word in the
string, and then returns the result string.*/
public class Capitalize {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = capitalizeFirstLetter(input);
        System.out.println("Result: " + result);
    }

    private static String capitalizeFirstLetter(String input) {
       StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;
        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
}
