package semanas_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q26 {
    /*
    Write a Java program to get a String from user as input and find the
    maximum occurring character in that string.(Ignore case sensitivity).

Input : Learning java is easy

Output: maximum occurring character is : a
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String : ");


        String arr[]=scan.nextLine().split("");
        System.out.println(Arrays.toString(arr));
        String mstRpt="";
        int maxCount=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[i].equalsIgnoreCase(arr[j])){
                    count++;
                }
            }if(count>maxCount){
                maxCount=count;
                mstRpt=arr[i];
            }else if(count==maxCount){
                mstRpt+=", "+arr[i];
            }
        }
        System.out.println(mstRpt+" character is : "+maxCount);

    }
}
