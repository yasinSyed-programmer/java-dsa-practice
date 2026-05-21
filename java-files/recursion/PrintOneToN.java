import java.util.*;

public class PrintOneToN {
    public static void print(int i , int n ){
        if(i == n+1)
            return;
        System.out.println(i++);
        print(i ,n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        print(1 , n);
        sc.close();
    }
}
