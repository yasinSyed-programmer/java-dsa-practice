package DSA_in_Java;

public class LinkL {

    private int size;

    LinkL() {
        this.size = 0;
    }

    Node head = null;
    
    class Node{
        String data;
        Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
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

    public void printList(){
        if(head == null){
            System.out.println("this list is empty just fuck off...");
            return ; 
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        //if list is already empty
        if(head == null){
            System.out.println("this list is empty...");
            return;
        }
        // if list even have one node
        head = head.next;
        size--;
    }

    public void deleteLast(){
        //if list is already empty
        if(head == null){
            System.out.println("this list is already empty...");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
        }

        //if list have nodes
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public int getSize(){
        return this.size;
    }

    public static void main(String[] arg){
        LinkL list = new LinkL();
        list.addFirst("hello");
        list.addLast("world");
        System.out.println(list.getSize());
        list.addFirst("heyy");
        list.addLast("this is yasin...");
        list.printList();
        System.out.println(list.getSize());


        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());


        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

    }
}
