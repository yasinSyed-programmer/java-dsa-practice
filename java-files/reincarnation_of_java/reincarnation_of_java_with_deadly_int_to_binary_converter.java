package reincarnation_of_java;

import java.util.*;

public class reincarnation_of_java_with_deadly_int_to_binary_converter {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = s.nextInt();
        int binary = 0,mul = 1;
        int op =n ;
        while(op > 0){
            binary += mul*(op%2) ;
            mul *=10 ;
            op /= 2 ; 
        }
        System.out.println("integer ("+n+") --- Binary ("+binary+")");
        s.close();
    }
}
