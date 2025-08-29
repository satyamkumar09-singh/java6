public class Preinc {
    public static void main(String[] args) {
        int a,b,c,d;
        a=10;
        b=20;
        System.out.println("a : +a");
        System.out.println("B : +b");
        c=++a;
        d=--b;
        System.out.println("after pre increment");

        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("D: "+d);
    }
}
