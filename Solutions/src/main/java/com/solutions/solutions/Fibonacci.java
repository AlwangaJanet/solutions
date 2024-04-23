/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solutions.solutions;

/**
 *
 * @author Janet Alwanga
 */
/**
 * Write a program to generate the Fibonacci sequence up to 100.
 */
public class Fibonacci {
    public static void main(String args[]) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print(num1 + " " + num2 + " ");
        
        while (num1 <= 100) {
             num3 = num1 + num2;
            if (num3 <= 100) {
                System.out.print(num3 + " ");
                num1 = num2;
                num2 = num3;
            }
        }
    }
}
