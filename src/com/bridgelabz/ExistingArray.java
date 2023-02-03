package com.bridgelabz;

import java.util.Scanner;

public class ExistingArray {
    public static void main(String[] args) {
        int n, pos, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements wants in array => ");
        n = scanner.nextInt();
        int a[] = new int[n + 1];
        System.out.println("Enter all the elements");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter the position where want to insert the element => ");
        pos = scanner.nextInt();
        System.out.println("Enter the element want to insert => ");
        x = scanner.nextInt();
        for (int i = (n - 1); i >= (pos - 1); i--) {
            a[i + 1] = a[i];
        }
        a[pos - 1] = x;
        System.out.println("After inserting the elements => ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + ",");
        }
        System.out.println(a[n]);
    }
}
