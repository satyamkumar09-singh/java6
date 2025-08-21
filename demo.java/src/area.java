import java.util.Scanner;
class area{
    public static void main(String[] args) {
        int area,l,b;
        Scanner sk=new Scanner(System.in);
       System.out.println("enter length");
       l=sk.nextInt();
       System.out.println("enter bredth");
       b=sk.nextInt();

       area=l*b;
       System.out.println("area is "+ area);
    }
}
    

