/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solutions.solutions;

//imports the Scanner class from the java.util
import java.util.Scanner;
/**
 *
 * @author Janet Alwanga
 */

//Write a program that takes an integer as input and returns true if the input is a power of two.
public class PowerTwo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
         if (isPowerTwo(num)) {
            System.out.println(num + " true ");
        } else {
            System.out.println(num + " false ");
        }
    }

    private static boolean isPowerTwo(int num) {
      if (num <= 0) {
            return false;
        }
            return (num & (num - 1)) == 0;
    }
}


