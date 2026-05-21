package reincarnation_of_java;

import java.util.*;

public class reincarnation_by_calculating_simple_intrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the amount : ");
        int amount = sc.nextInt();
        System.out.println("enter the intrest and time respectively"); 
        int intrest = sc.nextInt() , time = sc.nextInt();
        float SI = amount * time *((float)intrest/100);
        System.out.print("the simple intrest is "+SI);
        sc.close();
    }
}
