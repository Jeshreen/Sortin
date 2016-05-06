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
public class enhancedBubblesort {
    public static int swaps =1;
        public static void enhancedBubblesort(int[] arr) {
            boolean flag = true;
            int temp = 0;
                for (int i = arr.length; i > 0 && flag == true; i--) {
                    flag = false;
                    for (int j = 0; j < i - 1; j++) {
                         if (arr[j] > arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            flag = true;
                            swaps++;
                        }
                    }
                }
            }
}
