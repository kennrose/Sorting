/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import java.io.PrintStream;

/**
 *
 * @author User
 */
public class BubbleSort {
    int[] numbers;
    
    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }
    
    public void swapped (int index) {
       int left = numbers[index];
       
       numbers[index] = numbers[index + 1];
       numbers[index + 1] = left;
        
        
        
    }
    
    public void print() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
   
   
    public void sort() { 
        for (int i = 0; i < numbers.length; i++);
        int i = 0;
        
             System.out.printf("Iteration " +   (i + 1));
        
        for (int index = 0; index < numbers.length-1; index++) {
            
            
            System.out.printf(
                    "Index %d: %d => ",
                    index,
                    numbers[index],
                    numbers[index + 1]
        
            );                    
            
            if (numbers[index] > numbers[index + 1]); {
            swapped(index);
        }
            print();
           
        }
    }
    
}
