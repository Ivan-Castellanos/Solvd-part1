package com.solvd.laba.quickSort;

public class QuicksortAlgorithm {
    /*First Laba Solvd Homework
    Author: Ivan Castellanos
    06/03/2022*/

    void swap(int[] arr, int i, int j) {
        int aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

    int pivoter(int[] arr, int left, int right) {

        int pivot = arr[right];
        int i = (left - 1);

        for (int j = left; j <= right - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return (i + 1);
    }

    void quickSort(int[] arr, int left, int right) {
        if (left < right) {

            int pi = pivoter(arr, left, right);

            quickSort(arr, left, pi - 1);
            quickSort(arr, pi + 1, right);
        }
    }

    void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}