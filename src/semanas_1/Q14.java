package semanas_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        //Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        //
        //Örnek Çıktı:
        //
        //Verilen tamsayının rakamları toplamı 10'dur.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        int birler=sayi%10;
        sayi=sayi/10;
        int onlar=sayi%10;
        sayi=sayi/10;
        int yuzler=sayi%10;
        System.out.println("girdiginiz sayinin rakamlari toplami : "+(birler+onlar+yuzler));





    }
}
