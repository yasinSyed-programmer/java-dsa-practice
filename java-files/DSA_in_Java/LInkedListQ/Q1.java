package DSA_in_Java.LInkedListQ;

public class Q1 {

    Node head = null; 

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addData(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void searchEle(int ele){
        Node currNode = head;
        int idx = 0;
        while(currNode != null){
            if(currNode.data == ele){
                System.out.println("index is "+ idx);
                return;
            }
            idx++;
            currNode = currNode.next;
        }
        System.out.println("no element found in the list.....");
    }

    public static void main(String args[]){
        Q1 list = new Q1();
        list.addData(1);
        list.addData(5);
        list.addData(7);
        list.addData(3);
        list.addData(8);
        list.addData(2);
        list.addData(3);

        list.searchEle(2);
    }
}
