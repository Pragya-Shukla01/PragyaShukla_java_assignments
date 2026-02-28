package com.coforge.Day4Prj;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {11, 2, 3, 48, 5};

        System.out.print("Before sorting: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        System.out.print("After sorting:  ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
