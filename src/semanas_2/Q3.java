package semanas_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)

Input :

String str=“Javaisalsoeasy”

Output: [a, s]
         */
        String str="Javaisalsoeasy";
       List<String> list=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)&&!list.contains(str.substring(i,i+1))){
                    list.add(str.substring(i,i+1));


                }
            }
        }
        System.out.println(list);




    }
}
