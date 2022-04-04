package semanas_2;

public class Q17 {
    public static void main(String[] args) {
        /*
        Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.

Eg :

input : {1,2,3,4,5,6,7,8};

output: 36
         */
        int input[]={1,2,3,4,5,6,7,8};
        int sum=sumOffAllElements(input);
        System.out.println(sum);
    }
    private static int sumOffAllElements(int[] input) {
        int sum=0;
        for (int i = 0; i < input.length; i++) {
            sum+=input[i];
        }
        return sum;
    }
}
