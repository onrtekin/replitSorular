package semanas_1;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        //Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
         
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir float deger giriniz : ");
        
        float sayi=scan.nextFloat();
        
        short sayi2=(short)sayi;
        System.out.println(sayi2);
        
        
    }
}
