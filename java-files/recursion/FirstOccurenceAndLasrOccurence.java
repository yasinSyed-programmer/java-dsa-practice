import java.util.*;

public class FirstOccurenceAndLasrOccurence {
    public static int first = -1 , last = -1;
    public static void occurence(String str , char a , int n){
        if(n == str.length()){
            if(first >= 0){
                 System.out.println("first time at "+first);
                System.out.println("last time at "+last);
            }else
                System.out.println("no such element found in string");
            return;
        }
        if(str.charAt(n)==a){
            if(first == -1)
                first = n+1;
            last = n+1;
        }
        occurence(str , a , n+1);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        String str = sc.nextLine();
        System.out.print("enter the element to find in the string : ");
        char ele = (sc.next()).charAt(0);
        //function call return type(void)
        occurence(str , ele , 0);
        sc.close();
    }
}
