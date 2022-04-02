package semanas_1;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen 3 harfli bir isim giriniz : ");
        String name=scan.next().toLowerCase();

        String sonuc="";
        sonuc=name.length()==3?(name.charAt(0)==name.charAt(1)||name.charAt(0)==name.charAt(2)||
                name.charAt(1)==name.charAt(2)?"İsim ayni karakterlere sahiptir":"Dizenin benzersiz karakterleri var"):
                "lutfen 3 harf kullanin";
        System.out.println(sonuc);








    }
}
