package DSA_in_Java.LInkedListQ;

import java.util.*;



public class ReverseALinkedList{
    Node head = null , setter;
    
    class Node{//structure of a node...
        int data;
        Node next;

        public Node(int n){
            this.data = n;
            this.next = null;
        }
    }

    public void setNode(int n){
        Node newNode = new Node(n);
        if(head == null){
            setter = head = newNode;
            return;
        } 
        setter.next = newNode;
        setter = newNode;
    }

    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node currNode = head.next , next = head , prev = currNode.next ;
        next.next = null;
        while(currNode.next != null){
            currNode.next = next;
            next = currNode;
            currNode = prev;
            prev = prev.next;
        }
        head = currNode;
        head.next = next; 
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
        int n;
        Scanner sc = new Scanner(System.in);
        ReverseALinkedList list = new ReverseALinkedList();

        while(true){
            System.out.print("enter the value to add into list or (-1) to stop : ");
            n = sc.nextInt();
            if(n == -1)
                break;
            list.setNode(n);
        }
        list.printList();
        list.reverseList();
        list.printList();
        sc.close();
    }
}