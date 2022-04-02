package semanas_1;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J* W**

CCN : ** ** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String ad=scan.next();
        System.out.println("Soyadinizi giriniz");
        String soyAd=scan.next();
        System.out.println("kredi kart numaranizi giriniz");
        String kKNo=scan.next();
        ad=ad.substring(0,1).toUpperCase()+ad.replaceAll(ad.substring(0),"*");
        soyAd=soyAd.substring(0,1).toUpperCase()+soyAd.replaceAll(soyAd.substring(0),"**");
        kKNo=kKNo.replaceAll(kKNo.substring(0,kKNo.length()-4),"** ** **** ");
        System.out.println(ad+" "+soyAd);
        System.out.println("CCN : "+kKNo);








    }
}
