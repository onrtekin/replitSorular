package semanas_2;

public class Q29 {
    /*
    Create 2 constructors one is with parameters,
    the other one is without parameter. By using that constructors create at least
    2 objects then print their features on the console.
     */
    public static int x=3;
    public static int y=3;


    Q29(){
      x+=4;
        System.out.println("Without Parameters Constructor : "+x);
    }
    Q29 (int number1,int number2){
        System.out.println(number1+number2);

    }

    public static void main(String[] args) {
        Q29 obj1 = new Q29();
        Q29 obj2 = new Q29(5,9);


    }
}
