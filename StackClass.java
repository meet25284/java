import java.util.*;
public class StackClass {
    // stack using linked list scratch code
    
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }
        //adding data
        public static void push(int data){
            Node NewNode = new Node(data);
            if(isEmpty()){
                return;
            }
            NewNode.next = head;
            head = NewNode;
        }
        //deleting data
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peeking data
        public static int peek(){
          if(isEmpty()){
                return -1;
            }
            return head.data;  
        }

        //stack using Arraylist

        static ArrayList<Integer> list = new ArrayList<Integer>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();           
        }

    }

    
}