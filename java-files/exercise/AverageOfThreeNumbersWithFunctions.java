package exercise;

import java.util.*;

public class AverageOfThreeNumbersWithFunctions {
    public static void average(int a , int b , int c){
        float  avg = (a+b+c)/3.0f;
        System.out.println("the average is "+avg);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b,c);
        sc.close();
    }
}
