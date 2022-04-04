package semanas_2;

import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        /*
        Create a custom return type method accepts a name as parameter and prints the name as a char array.

(do not use toCharArray() method)

Input : John

Output :[J, o, h, n]
         */
        String input="John";
        convertStringToArray(input);

    }
    private static String convertStringToArray(String input) {
    String arr[]=input.split("");
        System.out.println(Arrays.toString(arr));

    return Arrays.toString(arr);
    }
}
