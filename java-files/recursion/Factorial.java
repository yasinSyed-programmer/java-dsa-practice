import java.util.*;

public class Factorial {
    public static int factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] k){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        //factorial return-type (int)
        int fact = factorial(n);
        System.out.println(fact+" is the factorial of "+n);
        sc.close();
    }
}
