import java.util.*;

public class power {
    public static int Power(int i , int n){
        if(i == n)
            return n;
        return n*Power(i+1 , n );
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        //function call return-type(int)
        int exp = Power(1 , n);
        System.out.println(exp+" is the exponential of "+n);
        sc.close();
    }
    
}
