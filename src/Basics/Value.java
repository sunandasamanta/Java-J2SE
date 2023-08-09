package Basics;

import java.util.Scanner;

// Check if a given number is positive, negative, or zero.
public class Value {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number to check if it is positive, negative, or zero: ");
        int num = read.nextInt();
        if (num == 0) {
            System.out.println("You've entered zero.");
        } else if (num < 0) {
            System.out.println("You've entered a negative number.");
        } else {
            System.out.println("You've entered a positive number.");
        }
    }
}
