package Basics;

// Write a program to calculate the area of a rectangle given its length and width.

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter length and width of a rectangle to get area: ");
        int len = read.nextInt();
        int wid = read.nextInt();
        int area = len * wid;
        System.out.printf("The area of the rectangle having length %d and width %d units is %d sq.units.", len, wid, area);
    }
}
