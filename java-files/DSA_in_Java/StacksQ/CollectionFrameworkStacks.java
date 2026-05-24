package DSA_in_Java.StacksQ;

import java.util.*;

public class CollectionFrameworkStacks {
    public static void main(String args[]){
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }
    }
}
