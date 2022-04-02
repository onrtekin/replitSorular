package semanas_1;

public class Q6 {
    public static void main(String[] args) {
        /*

    Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

int a= 3;

int b= 5;

Ornek Cikti:

a=5

b=3


    */
     int a=3;
     int b=5;
     int temp=0;
        System.out.println("swaptan once : a:"+a+" b : "+b);

     temp=a;
     a=b;
     b=temp;

        System.out.println("swaptan sonra : a:"+a+" b : "+b);
    }

}
