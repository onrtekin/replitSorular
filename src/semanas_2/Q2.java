package semanas_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :

30 and 40

Expected OutPut:

GCD for 30 and 40 = 10

LCM for 30 and 40 = 120
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("enter an integer : ");
        int num1=scan.nextInt();
        System.out.print("enter an integer : ");
        int num2=scan.nextInt();
        int gcd=0;
        int lcm=0;
        for (int i = 1; i <=num1 ; i++) {
            if(num1%i==0&&num2%i==0){
                gcd=i;
            }
        }

        for (int i = num1; i <=num1*num2 ; i++) {
            if(i%num1==0&&i%num2==0){
                lcm=i;
                break;
            }

        }
        System.out.println("GCD for 30 and 40 ="+gcd);
        System.out.println("LCM for 30 and 40 ="+lcm);

    }
}
