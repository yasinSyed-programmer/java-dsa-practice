package exercise;

import java.util.*;

public class Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,pos=0,neg=0,zero=0;
        System.out.println("enter any number and enter '12345' to end");
        while(true){
            System.out.print("enter a number : ");
            n = sc.nextInt();
            if(n == 12345)
                break;
            else if(n>0)
                pos +=1;
            else if(n<0)
                neg +=1;
            else
                zero +=1;
        }
        System.out.print("positive : "+pos+"\nnegative : "+neg+"\nzeroes : "+zero );
        sc.close();
    }
}
