package com.coforge.Day4Prj;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int size = 5;

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;

        System.out.print("Before deletion: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        System.out.print("Enter index to delete (0 to " + (size - 1) + "): ");
        int index = sc.nextInt();

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.print("After deletion:  ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
