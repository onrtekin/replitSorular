package semanas_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q24 {
    public static void main(String[] args) {
        /*
        Write a program to find the common elements between two String Arrays (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}

Input2 : {sofia,brad,grace,emily,hazel}

Output : [sofia,brad,emily]
         */
        String input1[] ={"John","Brad","Ange","Sofia","Emily"};
       String input2 [] = {"sofia","brad","grace","emily","hazel"};
       List<String> list = new ArrayList<String>();

        for (int i = 0; i <input1.length ; i++) {
            for (int j = 0; j < input2.length; j++) {
                if(input2[j].equalsIgnoreCase(input1[i])){
                  list.add(input2[j]);
                }
            }
        }
        System.out.println(list);
    }
}
