package com.coforge.Day4Prj;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {11, 2, 3, 48, 5};

        System.out.print("Before sorting: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.print("After sorting:  ");
        for (int x : arr)
            System.out.print(x + " ");
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
            }
        }

        int t = arr[i];
        arr[i] = arr[high];
        arr[high] = t;

        return i;
    }
}