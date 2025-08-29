import java.util.Scanner;
public class Addlast {
   public static void main(String[] args) {
    Scanner ad=new Scanner(System.in);
    int a,b,c,r,m;
    int sum=0;
    System.out.println("enter num1");
    a= ad.nextInt();
    System.out.println("enter num2");

    
    b=ad.nextInt();

    r=a%10;
    m=b%10;
    sum=r+m;
    System.out.println(sum);

       
   } 
}
