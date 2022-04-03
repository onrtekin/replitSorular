package semanas_1;

public class Q30 {
    public static void main(String[] args) {
        /*
        Konsolda Alfabeyi Yazdıran programi yaziniz.

OUTPUT :

a b c .. .. .. .. y z
         */
        String alfabe="";
        for (char i = 'a'; i <='z' ; i++) {
            alfabe+=i+" ";
        }
        System.out.print(alfabe);
    }
}
