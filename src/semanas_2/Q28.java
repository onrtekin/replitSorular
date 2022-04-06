package semanas_2;

import java.util.Scanner;

public class Q28 {
    /*
    Write a java program which accept a sentence as parameter,
    than reverses sentence by using StringBuilder
    and checks if sentence is palindrome or not
     (without case sensitivity) Eg : input : I love Java Output:
     "Reversed sentence : avaJ evol I . It is not a palindrome"

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=scan.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.insert(0,str,0,str.length());
        StringBuilder sb2=new StringBuilder(str);
        reverseStr(sb,sb2);
    }
    private static void reverseStr(StringBuilder sb, StringBuilder sb2) {
        sb.reverse();
        if(sb.compareTo(sb2)==0){
            System.out.println("Reversed sentence : "+sb+"--->Palindrome ");
        }else{
            System.out.println("Reversed sentence : "+sb+"--->Not Palindrome ");
        }
    }

}
