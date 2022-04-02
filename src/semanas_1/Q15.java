package semanas_1;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        /*Girilen zamanı saniyeye çeviren bir program yazınız.

Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("hesaplanacak saati giriniz : ");
        int saat=scan.nextInt();
        System.out.print("hesaplanacak daikayi  giriniz : ");
        int dakika=scan.nextInt();
        System.out.print("hesaplanacak saniyeyi giriniz : ");
        int saniye=scan.nextInt();

        System.out.println("girdiginiz sureler toplam : "+((saat*60*60)+(dakika*60)+(saniye)));




    }
}
