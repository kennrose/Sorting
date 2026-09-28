/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class SelectionSort_Test {
    public static void main(String[] args) {

   int[] numbers = { 13, 32, 26, 9, 33, 18 };

    SelectionSort selectionSort = new SelectionSort(numbers);

    // Print the Original Array values!!
    System.out.println("Original Array: ");
    selectionSort.print();
    System.out.println();

    // Perform Selection Sort!!
    selectionSort.sort();

    // Print the Sorted Array!!
    System.out.println("\nSorted Array: ");
    selectionSort.print();
}
    
}
