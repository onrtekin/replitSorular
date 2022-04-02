package semanas_1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr

Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.
        */
   Scanner scan=new Scanner(System.in);
        System.out.println("gunde kac bardak cay iciyorsunuz :");
        int kacBardak=scan.nextInt();
        System.out.println("bir bardak caya kac kup seker atiyorsunuz : ");
        int kacKup=scan.nextInt();
        int toplam=(kacBardak*kacKup)*365;
        double kg=toplam*1.7/1000;

        System.out.println("senede "+kg+" kg seker kullaniyor");




    }
}
