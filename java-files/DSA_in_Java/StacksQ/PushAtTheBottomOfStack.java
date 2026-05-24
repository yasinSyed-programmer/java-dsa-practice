package DSA_in_Java.StacksQ;

public class PushAtTheBottomOfStack {
    private static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        static Node head = null;
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
            if(head == null){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(head == null){
                return -1;
            }
            return head.data;
        }
    }

    public static void pushBottom(int ele){
        if(Stack.head == null){
            Node newNode = new Node(ele);
            Stack.head = newNode;
            return;
        }
        Node top = Stack.head;
        Stack.head = Stack.head.next ;
        pushBottom(ele);
        top.next = Stack.head;
        Stack.head = top;
    }

    public static void main(String[] args){
        Stack.push(76);
        Stack.push(65);
        Stack.push(23);
        Stack.push(66);
        Stack.push(77);
        Stack.push(33);
        Stack.push(44);

        pushBottom( 25);

        while(Stack.head !=null){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
