package DSA_in_Java.LInkedListQ;

import java.util.*;

public class Q2 {
    Node head = null , setter;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void setNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            setter = head = newNode;
            return;
        }

        setter.next = newNode;
        setter = newNode;
    }

    public void refine(){
        System.out.println("removing data whose value is higher than 25...");
        while(head.data > 25){
            head = head.next;
        }
        Node currNode = head;
        while(currNode!=null){
            if(currNode.data > 25){
                setter.next = currNode.next;
                currNode = setter.next;
                continue;
            }
            setter = currNode;
            currNode = currNode.next;
        }
    }

    public void printList(){
        Node currNode = head ;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] k){
        Q2 list = new Q2();
        int n;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter the data or (-1) to stop : ");
            n = sc.nextInt();
            if(n == -1)
                break;
            list.setNode(n);
        }
        list.printList();
        list.refine();
        list.printList();
        sc.close();
    }
}
