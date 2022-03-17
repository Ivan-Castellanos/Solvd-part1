package com.solvd.laba.quickSort;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuicksortAlgorithm quicksortAlgorithm = new QuicksortAlgorithm();
        Scanner scan = new Scanner(System.in);
        int length;
        int election;
        System.out.println("Select the numbers of elements in the array: ");
        length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i<length;i++){
            System.out.println("Type the " + (i + 1) +" element of the array");
            arr[i] = scan.nextInt();
        }
        System.out.println("Select 1 for a normal sort,  or 2 for a reverse sort: ");
        election = scan.nextInt();
        System.out.println("Array before being sorted: ");
        quicksortAlgorithm.printArray(arr, length);
        if (election == 2){
            quicksortAlgorithm.quickSort(arr, 0, length - 1 , true);
        } else {
            quicksortAlgorithm.quickSort(arr, 0, length - 1 , false);
        }
        System.out.println("Sorted array: ");
        quicksortAlgorithm.printArray(arr, length);
    }
}
