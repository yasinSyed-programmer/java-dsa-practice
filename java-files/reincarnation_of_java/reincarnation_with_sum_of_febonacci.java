package reincarnation_of_java;

import java.util.*;

public class reincarnation_with_sum_of_febonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int sum = 0 , cn = 0 , pn = 0 , nn = 1; 
        for(int count = 1 ; count <= n ; count++){
            System.out.print(cn);
            if(count != n)
                System.out.print("+");
            else 
                System.out.print("=");
            sum += cn ;
            cn = nn ;
            nn = pn + cn ;
            pn = cn ;
        }
        System.out.print("\nsum is "+sum);
        sc.close();
    }
}
