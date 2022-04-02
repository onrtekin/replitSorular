package semanas_1;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("bir isim giriniz: ");
    String isim= scan.next();

    if(isim.length()>=2){
        String yeniIsim=isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2);
        System.out.println(yeniIsim);


    }else{
        System.out.println("hatali giris");
    }


    }
}
