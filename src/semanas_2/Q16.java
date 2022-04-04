package semanas_2;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        /*
        Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output :

min: 1

max: 6
         */
        int input[]={3,2,5,4,1,6};
        minimumMaxNumbers(input);
    }
    private static void minimumMaxNumbers(int[] input) {
        Arrays.sort(input);
        System.out.println("minimum number : "+input[0]);
        System.out.println("max number : "+input[input.length-1]);
    }
}
