/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class BubbleSort_Test {
    public static void main(String[] args) {
        int[] numbers = {9, 12, 2, 4, 5, 8, 0,};
        
        BubbleSort bubbleSort = new BubbleSort(numbers);
        
        System.out.println("Original Array:");
        bubbleSort.print();
        
        bubbleSort.sort();
        
        System.out.println("\nFinal:");
        bubbleSort.print();
                
                
    }
    
}
