package com.coforge.Day4Prj;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {121, 12, 32, 48, 5};

        System.out.print("Before sorting: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("After sorting:  ");
        for (int x : arr)
            System.out.print(x + " ");
    }

    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int a[] = new int[n1];
        int b[] = new int[n2];

        for (int i = 0; i < n1; i++)
            a[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            b[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }
}