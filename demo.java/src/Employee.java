import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        double da=0;
        double hra=0;
        double ta=0;
        double totalincentive=0;
        
        Scanner em=new Scanner(System.in);
        String name;
        int basicsal;
        int deptno;
        String job;
        System.out.println("enter name ");
        name=em.nextLine();
        System.out.println("enter basic salary");
        basicsal=em.nextInt();
        System.out.println("enter department");
        deptno=em.nextInt();
        em.nextLine();
        System.out.println("enter job role");
        job=em.nextLine();

        hra=basicsal*0.2;
        da=basicsal*0.1;
        ta=basicsal*0.1;
        totalincentive=hra+da+ta;

        System.out.println(name);
        System.out.println(basicsal);
         System.out.println(deptno);
        System.out.println(job);

        System.out.println(hra);
        System.out.println(da);
        System.out.println(ta);
        System.out.println(totalincentive);
       


    }
    
}
