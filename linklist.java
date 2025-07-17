public class linklist {
    Node head;
    class Node {
        
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
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

    public static void main(String[] args) {
        linklist list = new linklist();
        list.printList();
        list.AddFirst("Meet");
        list.AddFirst("Pansuriya");
        list.printList();
        list.AddLast("Ashokbhai");
        list.printList();
    }
}
