package semanas_2;

public class Q5 {
    public static void main(String[] args) {
        /*
        Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
         */
        int num=100;
        int evenNum=0;
        System.out.print(num+" ");
        do{
            evenNum=num-2;
            System.out.print(evenNum+" ");
            num=num-2;


        }while(num>0);
    }
}
