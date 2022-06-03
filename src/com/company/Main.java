package com.company;

import java.security.SecureRandom;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
     int[] numbers =
             random.ints(3,1,100).toArray();
        System.out.println("un sorted"+ Arrays.toString(numbers));
      for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {

                int temp = (Math.min(numbers[j], numbers[j + 1]));
                int temp1 = (Math.max(numbers[j], numbers[j + 1]));
                numbers[j] = temp;
                numbers[j + 1] = temp1;

            }
        }
        System.out.println("sorted"+ Arrays.toString(numbers));

    }
}
