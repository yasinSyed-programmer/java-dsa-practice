package DSA_in_Java.StacksQ;

import java.util.*;

public class PushAtBottomOfStackUsingCollectionFrameWork {

    public static void pushAtBottom(int item , Stack<Integer> s){
         if(s.isEmpty()){
            s.push(item);
            return;
        }
        int top = s.peek();
        s.pop();
        pushAtBottom(item , s);
        s.push(top);
    }

    public static void main(String args[]){
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        pushAtBottom(25 , list);

        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }
    }
}