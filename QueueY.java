import java.util.*;
public class QueueY {
    static class ArrQueue {
       static int arr[];
       static int size;
       static int rear;


        ArrQueue(int size) {
           this.size = size;
           arr = new int[size];
           rear = -1;
       }


       public static boolean isEmpty() {
           return rear == -1;
       }


       public static boolean isFull() {
           return rear == size-1;
       }

       //queue using array
       //enque
       public static void add(int data) {
           if(isFull()) {
               System.out.println("Overflow");
               return;
           }


           arr[++rear] = data;
       }


       //O(n)
       //deque
       public static int remove() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
           int front = arr[0];
           for(int i=0; i<rear; i++) {
               arr[i] = arr[i+1];
           }
	     rear--;	
           return front;
       }

       //front
       public static int peek() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
          
           return arr[0];
       }
   }
   // circuler queue using array - O(1)
   static class CirQueue {
       static int arr[];
       static int size;
       static int rear;
       static int front;


        CirQueue(int size) {
           this.size = size;
           arr = new int[size];
           rear = -1;
           front = -1;
       }


       public static boolean isEmpty() {
           return rear == -1 && front == -1;
       }

       public static boolean isFull(){
        return (rear + 1) % size == front;
       }

       //enque 
       public static void add(int data) {
           if(isFull()) {
               System.out.println("Overflow");
               return;
           }
           if(front == -1){
            front = 0;
           }

           rear = (rear + 1) % size;
           arr[rear] = data;
       }


       //O(1)
       //deque
       public static int remove() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
           int result = arr[front];
           //for single element
           if(rear == front){
            rear = front = -1;
           }
           else{
            front = (front + 1) % size; 
           }
           	
           return result;
       }

       //front
       public static int peek() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
          
           return arr[front];
       }
   }

   //queue using linklist
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            next = null;
        }    
   }

   static class LLqueue {
    static Node head = null;
    static Node tail = null;
    
    public static boolean isEmpty(){
        return head == null && tail == null;
    }

    public static void add(int data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front = head.data;
        head = head.next;
        if (head == null) {
        tail = null;
    }

        return front;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }

        return head.data;

    }
   
    
   }
   public static void main(String args[]) {
        ArrQueue q = new ArrQueue(5);
        CirQueue Q = new CirQueue(5);
        LLqueue llq = new LLqueue();
        System.out.println("using normal queue");
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();            
        }

        System.out.println("using circuler queue");
        Q.add(0);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        System.out.println(Q.remove());
        Q.add(4);
        System.out.println(Q.remove());
        Q.add(5);
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
        }

        System.out.println("queue using linked list");
        llq.add(0);
        llq.add(1);
        llq.add(3);
        llq.add(2);
         while (!llq.isEmpty()) {
            System.out.println(llq.peek());
            llq.remove();
        }

        System.out.println("queue using collection framework");
        Queue<Integer> queue = new LinkedList<>();// using linked list because queue is interface
        // Queue<Integer> queue = new ArrayDeque<>();// using arraydeque
        queue.add(0);
        queue.add(1);
        queue.add(3);
        queue.add(2);
         while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }




    }
    
}
