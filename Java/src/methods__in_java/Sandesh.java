package methods__in_java;

public class Sandesh {
    //Methods in Java
    //  1. Void Keyword

    public static void main(String[] args) {

        //Object in java
        Sandesh m = new Sandesh();

        int n = m.test();
        System.out.println(n);

    String y=m.test1();
        System.out.println(y);

    // return keyword in java
        m.test2();

    //return value in java

    int g= m.test4();
       System.out.println(g);

    //method argument in java

        m.test5(9000);
        m.test6(600,"Yaduvanshi");

    // static method in java

    int l= test8(5,9);
       System.out.println(l);

}

public int test() {
    return 100;
}
public String test1(){
    return "Yadavji";
}

//Return keyword in java
public void test2(){
    System.out.println(1000);
    return;
}
//Return value in java
public int test4(){
    return 5000;
}

// method argument in java
public void test5(int a){
    System.out.println(a);
}

public void test6(int c,String b){
    System.out.println(c);
    System.out.println(b);
}

// static method in java
public static void test7(){

    System.out.println(400);
}
public static int test8(int m, int n){

    return m+n;
}
}
