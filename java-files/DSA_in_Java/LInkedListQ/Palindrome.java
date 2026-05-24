package DSA_in_Java.LInkedListQ;

import java.util.*;

public class Palindrome {

    Node head = null , setter;
    public int size;

    class Node{
        int num;
        Node next;


        public Node(int n){
            this.num = n;
            this.next = null;
            size++;
        } 
    }

    public void setNode(int n){
        Node newNode = new Node(n);
        if(head == null){
            setter = head = newNode;
            return;
        } 
        setter.next = newNode ;
        setter = newNode;
    }

    public Boolean isPalindrome(Palindrome list){
        int count = 0;

        if(count == size / 2)
            return true;
        return false;
    }

    public void printList(){
        if(head == null){
            System.out.println("list is empty...");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.num + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        //create a list...
        Palindrome list = new Palindrome();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the element or (-1) to stop ");
        while(true){
            n = sc.nextInt();
            if(n == -1)
                break;
            list.setNode(n);
        }
        list.printList();

        if(list.isPalindrome(list)){
            System.out.println("palindrome...");
        }else{
            System.out.println("not palindrome...");
        }
        sc.close();
    }
}
