//write a java program to convert given days into number of years, number of months and number of days.

import java.util.Scanner;
public class Calender {
    public static void main(String[] args) {
        Scanner dy=new Scanner(System.in);
int tdays,years,months,days,rem;
System.out.println("enter total number of days");
tdays=dy.nextInt();

years=tdays/365;
rem=tdays-years*365;
months=rem/30;


System.out.println(tdays);
System.out.println(years);
System.out.println(months);
System.out.println(rem);
    }
}
