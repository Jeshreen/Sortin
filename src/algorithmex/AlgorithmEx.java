/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmex;

import static algorithmex.bubbleSort.bubbleSort;
import static algorithmex.enhancedBubblesort.enhancedBubblesort;
import static algorithmex.exchangeSort.exchangeSort;
import static algorithmex.insertionSort.insertionSort;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jeshreen
 */
public class AlgorithmEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner in = new Scanner (System.in); 
        System.out.println("Enter number:- ");
        int x = in.nextInt();//getting the user input
        double time = 0;
        int[] arr = new int[x];//creating the array according to the user input
        
        System.out.println("Numbers Generated");
        Random randomGenerator  = new Random ();
        for (int i=0; i <=(x-1); i++){
             arr[i] = randomGenerator.nextInt(1000);
             System.out.print(arr[i] + " ");
        }

         long start = System.nanoTime();
         exchangeSort(arr);
         long end = System.nanoTime();
         time += end - start;
         System.out.println("");
         System.out.println("Sorted array exchnage sort");
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i] + " ");
         }
         System.out.println("");
         System.out.println("Time taken :- "+time/1000000000.0);
         
         long start1 = System.nanoTime();
         bubbleSort(arr);
         long end1 = System.nanoTime();
         time += end1 - start1;
         System.out.println("");
         System.out.println("Sorted array bubble sort");
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i] + " ");
         }
         System.out.println("");
         System.out.println("number of swaps :- " + bubbleSort.swaps);
         System.out.println("Time taken :- "+time/1000000000.0);
         
         long start2 = System.nanoTime();
         insertionSort(arr);
         long end2 = System.nanoTime();
         time += end2 - start2;
         System.out.println("");
         System.out.println("Sorted array insertion sort");
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i] + " ");
         }
         System.out.println("");
         System.out.println("Time taken :- "+time/1000000000.0);
        
         long start3 = System.nanoTime();
         enhancedBubblesort(arr);
         long end3 = System.nanoTime();
         time += end3 - start3;         
         System.out.println("");
         System.out.println("Sorted array enhanced bubble sort");
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i] + " ");
         }
         System.out.println("");
         System.out.println("number of swaps :- " + enhancedBubblesort.swaps);
         System.out.println("Time taken :- "+time/1000000000.0);
    }
    
}
