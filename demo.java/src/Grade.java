import java.util.Scanner;
public class Grade {
    public static void main(String args[]){
        char g;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter your grade: ");
        g=ob.next().charAt(0);
        System.out.println("your grade is :"+g);
    }
}
