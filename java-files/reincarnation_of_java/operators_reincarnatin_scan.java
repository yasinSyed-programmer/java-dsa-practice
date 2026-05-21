package reincarnation_of_java;

import java.util.*;

public class operators_reincarnatin_scan {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = s.nextInt();
        System.out.print("enter the secong number : ");
        int b = s.nextInt();
        int c = a+b ;
        System.out.println("the sum of "+a+" and "+b+" is "+c);
        s.close();
    }
}
