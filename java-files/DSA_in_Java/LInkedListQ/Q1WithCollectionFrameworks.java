package DSA_in_Java.LInkedListQ;

// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

import java.util.*;

public class Q1WithCollectionFrameworks {

    public static void main(String[] arg){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        int idx = 0 , ele = 2;
        while(idx < list.size()){
            if(list.get(idx) == ele){
                System.out.println(ele+" found at "+idx);
                break;
            }
            idx++;
        }
        if(idx == list.size()){
            System.out.println("element not found...");
        }
    }
}
