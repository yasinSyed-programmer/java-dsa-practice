package reincarnation_of_java;

import java.util.*;

public class reincarnation_of_factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to find factorial : ");
        int n = sc.nextInt(),fact = 1;
        for(int i = 1 ; i<=n ;i++){
            fact *=i ;
        }
        System.out.println(fact+" is the factorial of "+n);
        sc.close();
    }
}
