package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner scan_a = new Scanner(System.in);
        Scanner scan_b = new Scanner(System.in);
        Scanner scan_c = new Scanner(System.in);
        a = scan_a.nextInt();
        b = scan_b.nextInt();
        c = scan_c.nextInt();
        if (a + b < c || b + c < a || a + c < b) {
            System.out.println("Yes, this can become a triangle.");
        } else {
            System.out.println("No, this cannot be a triangle");
        }
    }
}
