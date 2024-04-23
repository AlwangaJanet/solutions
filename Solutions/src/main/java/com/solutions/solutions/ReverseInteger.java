/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solutions.solutions;

/**
 *
 * @author Janet Alwanga
 */
import java.util.Scanner;
/**Write a program that takes an integer as input and returns an integer with reversed digit
ordering.*/
public class ReverseInteger {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int reversed = reverseDigits(num);
        System.out.println("Reversed: " + reversed);
    }

    private static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
            return reversed;
    }
}
