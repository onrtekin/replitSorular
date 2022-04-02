package semanas_1;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT :

25

46

OUTPUT :

Numaralarin Toplami:

71

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen 2. sayiyi giriniz");
        double sayi2=scan.nextDouble();
        double toplam=sayi1+sayi2;

        if(sayi1>=1000000000||sayi2>=1000000000||toplam>=1000000000){
            System.out.println("OVERFLOW");
        }else{
            System.out.println(toplam);
        }



    }
}
