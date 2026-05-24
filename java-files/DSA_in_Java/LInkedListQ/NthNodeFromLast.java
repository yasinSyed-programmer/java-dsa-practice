package DSA_in_Java.LInkedListQ;

import java.util.*;

public class NthNodeFromLast {

    Node head = null , setter;
    public int size = 0;

    class Node{
        int data;
        Node next;

        public Node(int n ){
            this.data = n;
            this.next = null;
        }
    }

    public void setNode(int n ){
        Node newNode = new Node(n);
        if(head == null){
            setter = head  = newNode;
            size++;
            return;
        }
        setter.next = newNode ;
        setter = newNode;
        size++;
    }

    public void fromLast(int pos){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(pos <= size){
            Node currNode = head;
            for(int count = size - pos ; count>0 ; count--){
                currNode = currNode.next;
            }
            System.out.println(currNode.data);
            return;
        }
        System.out.println("error : position underflow....");
    }

    public void printList(){
        if(head == null){
            System.out.println("list is empty...");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        } 
        System.out.println("null");
    }

    public static void main(String[] args){
        NthNodeFromLast list = new NthNodeFromLast();
        Scanner sc  = new Scanner(System.in);
        int n;
        System.out.println("enter a positive value to set in node or (-1) to stop");
        while(true){
            n = sc.nextInt();
            if(n == -1)
                break;
            list.setNode(n);
        }
        
        list.printList();
        System.out.print("enter the position to find : ");
        int pos = sc.nextInt();


        list.fromLast(pos);
        sc.close();
    }
}
