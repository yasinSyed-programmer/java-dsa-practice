package DSA_in_Java.StacksQ;

public class StacksUsingLinkedList {
    private static class Node{
        int data;
        Node next;

        public Node(int data){//constructor
            this.data = data;
            next = null;
        }
    }
    
    static class Stack{
        static Node head = null ;


        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int n){
            Node newNode = new Node(n);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
           return head.data;
        }

    } 


    public static void main(String[] args){
        Stack.push(65);
        Stack.push(76);
        Stack.push(12);
        Stack.push(765);
        Stack.push(55);
        Stack.push(43);
        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
