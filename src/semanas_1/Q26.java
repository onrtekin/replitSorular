package semanas_1;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :

30

40

Beklenen Cikti:
Beklenen Cikti:
30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("1. tamsayiyi giriniz : ");
        int sayi1=scan.nextInt();
        System.out.print("2. tamsayiyi giriniz : ");
        int sayi2=scan.nextInt();
        int ortakB=0;
        int ortakK=0;
        for (int i = 1; i <= sayi1; i++) {
            for (int j = 1; j <= sayi2; j++) {
                if(sayi1%i==0&&sayi2%j==0&&i==j){
                    ortakB=i;
                }

            }
        }

        for (int i = 1; i <999999999; i++) {
            if(i%sayi1==0&&i%sayi2==0){
                ortakK=i;
                break;
            }
        }
        System.out.println(sayi1+" ve "+sayi2+" icin GCD "+ortakB);
        System.out.println(sayi1+" ve "+sayi2+" icin LCM "+ortakK);




    }
}
