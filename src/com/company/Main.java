package com.company;

import java.security.SecureRandom;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
//     int[] numbers =
//             random.ints(20,1,100).toArray();

        for (int i = 0; i < 10; i++) {
            int[] numbers =
                    random.ints(20,1,100).toArray();

            bubbleSortEnhanced(numbers);
        }



    }

    public static void bubbleSort(int[] array){
        System.out.println("bubbleSort Method ");
        System.out.println("un sorted"+ Arrays.toString(array));

        int iteration = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                iteration++;
                int temp = (Math.min(array[j], array[j + 1]));
                int temp1 = (Math.max(array[j], array[j + 1]));
                array[j] = temp;
                array[j + 1] = temp1;
            }
        }
        System.out.println("sorted"+ Arrays.toString(array));
        System.out.printf("%s %d %n","iteration",iteration);
    }

    public static void bubbleSortEnhanced(int[] array){
        System.out.println("bubbleSort Enhanced Method ");

        System.out.println("un sorted"+ Arrays.toString(array));
        int counter = 0;
        int iteration = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = counter; j < array.length - 1; j++) {
                int[] tempArray = Arrays.copyOf(array,array.length);
                iteration++;
                int temp = (Math.min(array[j], array[j + 1]));
                int temp1 = (Math.max(array[j], array[j + 1]));
                array[j] = temp;
                array[j + 1] = temp1;
                if (Arrays.equals(tempArray, array)) break;
            }
            counter++;
        }
        System.out.println("sorted"+ Arrays.toString(array));
        System.out.println(iteration);
    }
}
