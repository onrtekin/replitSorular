package semanas_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        /*
        Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

input :

Learning java is easy

output:

maximum occurring character is : a
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("enter string  : ");
         String arr[]=scan.nextLine().split("");
         int count=0;
         int maxCount=0;
         String masRepeat="";
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = i; j <arr.length ; j++) {
                if(arr[i].equalsIgnoreCase(arr[j])){
                    count++;
                }
            }if(count>maxCount){
                maxCount=count;
                masRepeat+=arr[i]+" ";
            }else if(count==maxCount){
                masRepeat+=arr[i];
            }
        }
        System.out.println("maximum occurring character is : "+masRepeat+" letra ocurre "+maxCount+" veces ");
    }
}
