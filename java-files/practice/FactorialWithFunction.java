package practice;

import java.util.*;

public class FactorialWithFunction {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1 ; i <= n ; i++)
            fact *= i ;
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to get the factorial : ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact+" is the factorial of "+n);
        sc.close();
    }
}