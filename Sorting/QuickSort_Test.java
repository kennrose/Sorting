/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import static Sorting.QuickSort.displayArray;
import static Sorting.QuickSort.quickSort;

/**
 *
 * @author User
 */
public class QuickSort_Test {
    public static void main(String[] args) {

        int[] arr = {40, -10, 30, 50, -20, -60, 15};

        System.out.println("Original List:");
        displayArray(arr);

        System.out.println("\n==============================");
        System.out.println("       QUICK SORT PROCESS");
        System.out.println("==============================");

        // Start Quick Sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Num");
        displayArray(arr);

        System.out.println("\n==============================");
        System.out.println("       SORTING COMPLETE");
        System.out.println("==============================");
    }
}