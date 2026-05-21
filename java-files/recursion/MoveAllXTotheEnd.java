import java.util.*;

public class MoveAllXTotheEnd {
    public static int count = 0;
    public static void moveX(String str ,int n ){
        if(n == str.length()){
            for(int i = 0 ; i<count ; i++){
                System.out.print("x");
            }
            return;
        }
        if(str.charAt(n) == 'x')
            count++;
        else
            System.out.print(str.charAt(n));
        moveX(str , n+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ente the string : ");
        String str = sc.next();
        //function call return-type(void)
        moveX(str , 0);
        sc.close();
    }
}
