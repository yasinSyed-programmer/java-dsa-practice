package practice;

import java.util.*;

public class SimpleFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = 1,faah = 1;
        while(i<=n){
            faah *= i ;
            i++;
        }
        System.out.println(faah+" is the factorial of "+n);
        sc.close();
    }
}
