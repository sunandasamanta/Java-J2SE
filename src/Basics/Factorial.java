package Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number to get factorial: ");
        int num = read.nextInt();
        if (num == 0 || num == 1) {
            System.out.printf("Factorial of %d is 1.", num);
        } else if (num > 0) {
            int fact = factorial(num);
            System.out.printf("Factorial of %d is %d.", num, fact);
        } else {
            System.out.println("You've entered a negative number.");
        }
    }
    static int factorial(int num) {
        int factorial = 1;
        while (num > 1) {
            factorial *= num;
            num--;
        }
        return factorial;
    }
}
