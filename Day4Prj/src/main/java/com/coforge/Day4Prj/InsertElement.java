package com.coforge.Day4Prj;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int size = 5;

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;

        System.out.print("Before insertion: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position (0 to " + size + "): ");
        int pos = sc.nextInt();

        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = element;
        size++;

        System.out.print("After insertion : ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
