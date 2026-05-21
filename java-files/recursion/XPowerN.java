import java.util.*;

public class XPowerN {
    public static int exp( int x , int n ){
        if(n == 0 )
            return 1;
        return x*exp(x , n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x and n(power) : ");
        int x = sc.nextInt() , n = sc.nextInt();
        //function call return-type(int)
        int result = exp( x , n );
        System.out.println(result+" is the answer of "+x+" power of "+n);
        sc.close();
    }
}
