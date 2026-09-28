/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */

 public class MergeSort_Test {
    
      public static void main(String[] args) {

        int[] digits = {30, 42, 8, 12, 7, 5, 26, 1};

        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println();

        Merge_Sort mS = new  Merge_Sort(digits);
        mS.Sort();
    }
}

