package semanas_1;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim=scan.nextLine().toLowerCase();
        System.out.print("lutfen bir karakter giriniz : ");
        char karakter=scan.next().toLowerCase().charAt(0);
        int sayac=0;

        for (int i = 0; i <isim.length() ; i++) {
        if(isim.charAt(i)==karakter){
            sayac++;

        }

        }
        System.out.println("girdiginiz isimde : "+karakter+" "+sayac+" tane gecmektedir");

    }
}
