import java.util.*;

public class febonacci {
    public static void feb(int i ,int a , int b , int n){
        if(i>n)
            return;
        System.out.print(a+" ");
        i++;
        feb(i , b , a+b , n);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbr : ");
        int n = sc.nextInt();
        //function call return-type(void)
        feb( 1 , 0 , 1 , n);
        sc.close();
    }
}
