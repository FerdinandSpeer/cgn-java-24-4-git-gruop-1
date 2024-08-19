package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {11, 12, 13,14, 15, 16, 17, 18, 19, 20};
        int[] numbers3=new int[numbers.length];
        int sum = 0;
        int max = numbers[0];  // Initialize max with the smallest possible integer value

        for (int numbre:numbers){
            System.out.println(numbre);
        }

        for (int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            System.out.println(sum);
        }

        for (int i = 0; i < numbers.length; i++) {
            // Update max if the current number is greater than the current max
            if (numbers[i] > max) {
                max = numbers[i];
            }
//            System.out.println("Current max: " + max);
        }

        // Output the final results
        System.out.println("Final sum: " + sum);
        System.out.println("Final max: " + max);

        for (int i = 0; i < numbers.length; i++) {
            numbers3[i] = numbers[i]+numbers2[i];
        }
        System.out.println(Arrays.toString(numbers3));
    }
}
