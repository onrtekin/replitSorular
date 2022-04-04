package semanas_2;

public class Q4 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts an integer as input and calculates factorial and prints like output.

Input : 6

Output: 6!=65432*1=720
         */

        int input = 6;
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println(input + "!=" + factorial);
    }
}
