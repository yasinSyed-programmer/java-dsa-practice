import java.util.*;

public class PrintAStringInReverse {
    public static void stringReverse(String str , int n){
        if( n == 0 ){
            System.out.println(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        stringReverse(str , n-1);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string : ");
        String str = sc.nextLine();
        int len = str.length();
        //function call return-type(void)
        stringReverse(str , len-1);
        sc.close();
    }
}
