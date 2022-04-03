package semanas_1;

public class Q29 {
    public static void main(String[] args) {
        /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

OUTPUT : 100 98 96 94 92 … … … … 2 0
         */
        int sayi=100;
        int ciftSayilar=0;
        do{
            ciftSayilar=sayi-2;

            System.out.print(ciftSayilar+" ");
            sayi=sayi-2;

        }while(sayi>0);

    }
}
