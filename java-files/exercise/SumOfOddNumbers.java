package exercise;

import java.util.*;

public class SumOfOddNumbers {
    public static void sumOffOddNumbers(int n){
        int sum = 0;
        for(int i = 1 ; i<=n ; i++){
            if(i%2!=0)
                sum += i ;
        }
        System.out.println("the sum of odd numbers up to "+n+" is "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        sumOffOddNumbers(n);
        sc.close();
    }
}
