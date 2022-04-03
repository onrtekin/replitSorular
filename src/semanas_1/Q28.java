package semanas_1;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=65432*1=720
         */
       Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir tamsayi giriniz : ");
       int sayi=scan.nextInt();
       int faktoryel=1;
        for (int i = 1; i <=sayi ; i++) {
            faktoryel*=i;

        }
        System.out.println(faktoryel);


    }

}
