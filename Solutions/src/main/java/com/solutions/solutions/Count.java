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
/**Write a program that counts the number of vowels in a sentence.*/
public class Count {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }

    private static int countVowels(String sentence) {
        int count;
        count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < sentence.length(); i++) {
            if (vowels.indexOf(sentence.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    
}
}
