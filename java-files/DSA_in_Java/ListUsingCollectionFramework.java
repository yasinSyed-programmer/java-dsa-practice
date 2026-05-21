
package DSA_in_Java;

import java.util.*;
public class ListUsingCollectionFramework {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("hello");
        list.addFirst("hey");
        list.add("this");
        list.add(1,"is");
        list.add("syed Yasin");
        list.addFirst("mic testing ");
        System.out.println(list);

        list.remove(2);
        list.removeLast();
        System.out.println(list);
    }
}
