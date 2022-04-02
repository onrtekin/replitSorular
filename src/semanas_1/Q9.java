package semanas_1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
        */
    Scanner scan=new Scanner(System.in);
        System.out.println("Dikdortgenin 1. kenar uzunlugunu giriniz: ");
       int k1=scan.nextInt();
        System.out.println("Dikdortgenin 2. kenar uzunlugunu giriniz: ");
        int k2=scan.nextInt();
        System.out.println("Alan :"+k1*k2);
        System.out.println("Cevre : "+(2*k1+2*k2));
    }
}
