package semanas_2;

public class Q15 {
    public static <doouble> void main(String[] args) {
        /*
        Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
         */
        double input[]= {1,2,3,4,5,6,7};
        double sum=0;
        for (double i = 0; i <input.length ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(input.length);
        System.out.println(sum/input.length);

    }
}
