package semanas_1;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen dakika giriniz : ");
        int dakika=scan.nextInt();
       int kacYil=dakika/60/24/365;
       int kacGun=dakika/60/24;
       kacGun=kacGun-(kacYil*365);
        System.out.println("girdiginiz dakika yaklasik : "+kacYil+" yil "+kacGun+" gundur");





    }
}
