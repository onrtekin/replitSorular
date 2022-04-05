package semanas_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q23 {
    static List<Integer> numList = new ArrayList<Integer>();

    public static void main(String[] args) {
        /*
        Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers if they are even or not in a return method.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
         */
        int input=5;
        int index = 0;
        int count = 0;
        for (int i =input+1; i <= 100; i++) {
            count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                numList.add(i);
                index++;
            }
            if (index == 10) {
                break;
            }
        }
        System.out.print(numList);

    }
}
