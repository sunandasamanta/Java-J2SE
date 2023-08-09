package Basics;

import java.util.Scanner;

// Calculate the simple interest for a loan amount using user input.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter principle amount, interest rate and time span in order to get simple interest: ");
        double p = read.nextDouble();
        double r = read.nextDouble();
        double t = read.nextDouble();
        double i = p*r*t/100;
        System.out.printf("Simple interest of %.2f at %.2f percent rate in %.2f time unit is %.2f.", p, r,t, i);
    }
}
