package semanas_1;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen doouble bir sayi giriniz : ");
        double sayi1=scan.nextDouble();


       int sayi2=(int) sayi1;

        System.out.println(sayi2);

    }
}
