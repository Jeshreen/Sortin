/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmex;

/**
 *
 * @author jeshreen
 */
public class insertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        
        
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        
        }
    } 
}
