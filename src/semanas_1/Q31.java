package semanas_1;

public class Q31 {
    public static void main(String[] args) {
        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
Input :

6

Output:

6 Mukemmel Sayidir.

======================

Input

7

Output:

7 Mukemmel Sayidir degildir.
         */
        int sayi=6;
        int bolenlerToplami=0;

        for (int i = 1; i <sayi ; i++) {
            if(sayi%i==0){
                bolenlerToplami+=i;
            }

        }
        if(bolenlerToplami==sayi){
            System.out.println("sayi mukemmel sayidir");
        }else{
            System.out.println("sayi mukemmel sayi degildir");
        }

    }
}
