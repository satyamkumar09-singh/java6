import java.util.Scanner;
public class Stuinfo {
    public static void main(String args[]){
        String enroll,Name;
        int roll,age;
        float percent;
        char grade;
        Scanner st=new Scanner(System.in);
        System.out.println("Enter Roll Number :");
        roll=st.nextInt();
         System.out.println("Enter Name :");
        Name=st.nextLine();
        System.out.println("Enter percent :");
        percent=st.nextFloat();
        System.out.println("Enter enrollment no :");
        enroll=st.next();
        System.out.println("Enter Age :");
        age=st.nextInt();
        System.out.println("Enter grade :");
        grade=st.nextLine().charAt(0);
        
       System.out.println("Roll Number :"+roll);
       System.out.println("Name :"+Name);
        System.out.println("percent :"+percent);
        System.out.println("enrollmenr no :"+enroll);
        System.out.println("Age :"+age);
        System.out.println("grade :"+grade);

    }
    
}
