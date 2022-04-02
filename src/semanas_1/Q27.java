package semanas_1;

import java.sql.Array;
import java.util.Arrays;

public class Q27 {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
         */
        String str="Javaisalsoeasy";

        String tekrarEden="";
        String arr[]=new String[str.length()];
        arr=str.toLowerCase().split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sayac=0;
        for (int i = 1; i <arr.length; i++) {
            sayac=0;
            if (arr[i - 1].equals(arr[i])) {
                sayac++;
                if (sayac >=1) {
                    if (!arr[i].equals(tekrarEden)) {
                        tekrarEden += arr[i] + " ";
                    }
                }
            }

        }System.out.println(tekrarEden);



    }
}
