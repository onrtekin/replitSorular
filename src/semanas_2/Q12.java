package semanas_2;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        /*
        Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

Input : Coding is greate.

Output : .etaerg si gnidoC
         */

       String str="Coding is greate.";

       String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
        String tersArr[]=new String[arr.length];
        int index=0;
        for (int i =arr.length-1; i >=0; i--) {
            tersArr[index]=arr[i];
            index++;}
        String tersStr="";
        for (int i = 0; i < tersArr.length; i++) {
            tersStr+=tersArr[i];
        }
        System.out.println(Arrays.toString(tersArr));
        System.out.println(tersStr);
    }
}
