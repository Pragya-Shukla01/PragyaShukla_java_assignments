package com.coforge.Day4Prj;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {21, 209, 73, 48, 5};

        System.out.print("Before sorting: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int t = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = t;
        }

        System.out.print("After sorting:  ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}