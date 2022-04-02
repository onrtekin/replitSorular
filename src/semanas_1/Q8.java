package semanas_1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :

Alan: 9

Cevre: 12
        */

    Scanner scan=new Scanner(System.in);
        System.out.println("Karenin kenar uzunlugunu giriniz: ");
        int a=scan.nextInt();

        System.out.println("Alan : "+(a*a));
        System.out.println("Cevre :"+(a*4));
    }
}
