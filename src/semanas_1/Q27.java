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
        String str = "Javaisalsosasy";

        String tekrarEden = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)&&!tekrarEden.contains(str.substring(i,i+1))){
                    tekrarEden+=str.charAt(i)+" ";
                }
            }

    }
        System.out.println(tekrarEden);
}
}