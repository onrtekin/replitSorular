package semanas_1;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
       /*
       Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in altındaysa zayıfsınız

BMI 18,5 ile 25 arasında ise kilonuz idealdir

BMI 25-30 arasındaysa şişmansınız

BMI 30'dan büyük veya eşitse, obez

Input:

Output:

Agirlik : 71

Boy : 1,72

BMI : 23.99945916711736

Zayifsiniz.
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen kilonuzu giriniz :");
        double  kilo=scan.nextDouble();
        System.out.print("Lutfen boyunuzu giriniz :");
        double  boy=scan.nextDouble();

        double bmi=kilo/(boy*boy);

      if(bmi<18.5){
          System.out.println("cok zayifsiniz");
      }else if(bmi<25){
          System.out.println("kilonuz ideal");
      }else if(bmi<30){
          System.out.println("sismansiniz");
      }else if(bmi>=30){
          System.out.println("obezsiniz");
      }else{
          System.out.println("girdiginiz degerleri kontrol ediniz");
      }










    }
}
