package semanas_2;

import java.util.Arrays;
import java.util.List;

public class Q20 {
    public static void main(String[] args) {
        /*
        Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
         */
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> list= Arrays.asList(names);
        String temporary=list.get(7);
        list.set(7,list.get(2));
        list.set(2,temporary);
        for (int i = 0; i < list.size(); i++) {
            names[i]=list.get(i);
        }
        System.out.println(Arrays.toString(names));
    }
}
