package semanas_2;

public class Q27 {
    /*
    Write a return method that accepts more than one integer
    as parameter and prints the sum of integers
    Method name = sum if you call method like that
    sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 9;
        int num4 = 15;
        int num5 = 22;
        int num6 = 34;
      int total=numbersSum(num1,num2,num3,num4,num5,num6);
        System.out.println(total);
    }
    private static int numbersSum(int... numbers) {
        int total=0;
        for (int sum:numbers) {
            total+=sum;
        }
      return total;
    }
}
