package constructor.in.java;

public class Sandesh {
//Constructor
    Sandesh(){
        System.out.println("sandesh yadav");
    }
 //   Constructor overloading
 Sandesh(int x){
        System.out.println(x);
 }

 Sandesh(int x, int y){
        System.out.println(x);
     System.out.println(y);
 }
//constructor chaining
    Sandesh(String a ){
        //Constructor c=new Constructor();
        this  ();
    }


    public static void main(String[] args) {
        Sandesh c = new Sandesh();
        Sandesh d = new Sandesh(500);
        Sandesh e = new Sandesh(50, 200);
        Sandesh f = new Sandesh("sandesh yadav ji");
        // for this keyword create object
        Sandesh t = new Sandesh();
        t.test();
    }
        //this keyword in java
        public void test (){
            System.out.println(this);

    }
}
