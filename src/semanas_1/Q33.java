package semanas_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

Input :1238

Output :Girilen Numananin Tersi: 8321
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
      int sayi=scan.nextInt();
        int tersSayi=0;
        do{
           tersSayi=sayi%10;
            System.out.print(tersSayi);
            sayi/=10;

        }while(sayi>0);



    }





}
