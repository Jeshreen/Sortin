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
public class exchangeSort {
        public static void exchangeSort(int[] arr){
        int n = arr.length;
        int temp = 0;
                
        for (int i=0; i < n-1; i++) {
         for (int j = i+1; j<n; j++) {
            if(arr[ i ] > arr[ j ]) {
               temp = arr[i]; 
               arr[i] = arr[j];
               arr[j] = temp; 
            }           
         }
        }
    }
}
