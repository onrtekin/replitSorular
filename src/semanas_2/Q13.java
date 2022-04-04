package semanas_2;

public class Q13 {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

input : ade1r4d3

output : 8

Hint :
     Use Character.isDigit()
     Integer.valueOf()
         */
        String str="ade1r4d3";
        String arr[]=str.split("");
        System.out.println("Lengt of String : "+arr.length);

    }
}
