package DSA_in_Java.LInkedListQ;

// Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

import java.util.*;

public class Q2WithCollectionFramework {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int n ;
        while(true){
            System.out.print("enter the data or (-1) to stop data : ");
            n = sc.nextInt();
            if(n == -1)
                break;
            list.add(n);
        }
        for(int i = 0 ; i < list.size();i++){
            if(list.get(i) > 25){
                list.remove(i);
            }
        }
        for(int i = 0 ; i<list.size() ; i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        sc.close();
    }
}
