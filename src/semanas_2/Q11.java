package semanas_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*Write a return method to reverse number.

Input : 12345

Output : 54321

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("enter integer : ");
        int num=scan.nextInt();
        int reverseNum=0;
        System.out.print("Number in Reverse : ");

        do{
            reverseNum=num%10;
            System.out.print(reverseNum);
            num/=10;


        }while(num>0);




    }
}
