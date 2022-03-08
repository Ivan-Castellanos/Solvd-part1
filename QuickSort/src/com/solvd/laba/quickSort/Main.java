package com.solvd.laba.quickSort;

public class Main {
    public static void main(String[] args) {
        QuicksortAlgorithm quicksortAlgorithm = new QuicksortAlgorithm();
        int[] arr = {3, -3,5,78,9, 19, 29, 14, 19, 27};
        int length = arr.length;
        System.out.println("Array before being sorted: ");
        quicksortAlgorithm.printArray(arr,length);
        quicksortAlgorithm.quickSort(arr, 0, length - 1);
        System.out.println("Sorted array: ");
        quicksortAlgorithm.printArray(arr, length);
    }
}
