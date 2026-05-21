package exercise;

import java.util.*;

public class GCD {
    public static int gCD(int a , int b){
        if(b==0)
            return a;
         return gCD(b,(a%b));
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n1,n2;
        System.out.print("enter the first number : ");
        n1 = sc.nextInt();
        System.out.print("enter the first number : ");
        n2 = sc.nextInt();
        int a = n1,b = n2;
        if(b>a){
            int temp = b;
            b = a;
            a = temp;
        }
        int gcd = gCD(a,b);
        System.out.println("the gcd is "+gcd);
        sc.close();
    }
}
