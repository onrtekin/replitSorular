package semanas_2;

public class Q9 {
    public static void main(String[] args) {
        /*
        Write a java program to reverse the number which user entered.

Input :1238
Output :Reverse Of The Number: 8321
         */
        int input =1238;
        do{
            System.out.print(input%10);
            input/=10;
        }while(input>0);

    }
}
