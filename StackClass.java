public class StackClass {
    //stack using linked list scratch code
    
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
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();           
        }

    }

    
}