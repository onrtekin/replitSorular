package semanas_2;

import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}

Input2={5,6}

Output={1,2,3,4,5,6}
         */
        int input1[]={1,2,3,4};
        int input2[]={5,6};
        int output[]=twoArrays(input1,input2);
        System.out.println(Arrays.toString(output));
    }
    private static int[] twoArrays(int[] input1, int[] input2) {
        int output[]=new int[input1.length+input2.length];
        int index=0;
        for (int i = 0; i < input1.length; i++) {
            output[index]=input1[i];
            index++;
        }
        for (int i = 0; i < input2.length; i++) {
            output[index]=input2[i];
            index++;
        }
        return output;
    }
}
