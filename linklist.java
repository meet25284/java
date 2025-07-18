import java.util.*;
public class linklist {
    Node head;
    private int size;

    linklist(){
        this.size = 0;
    }
    class Node {
        
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add data from first
    public void AddFirst(String data){
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
            return;
        }
        NewNode.next = head;
        head = NewNode;
    }
        //add data from last
    public void AddLast(String data){
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;            
        }
        currNode.next = NewNode;
    }

    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("it is a empty list");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("it is a empty list");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node lastSecond = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            lastSecond = lastSecond.next;
        }
        lastSecond.next = null;
    }



    //print list
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;            
        }
        System.out.println("null");

    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        linklist list = new linklist();
        list.printList();
        list.AddFirst("Meet");
        list.AddFirst("Pansuriya");
        list.printList();
        list.AddLast("Ashokbhai");
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

        // this is how to make linked list we can use it method get, remove, add, size
        LinkedList<int> list = new LinkedList<int>();


    }
}
