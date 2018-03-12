public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = last;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        
        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }
    
    public void insertlast(int data){
        Node newNode = new Node();
        newNode.data = data;
        
        if(isEmpty()){
            first = newNode;
        }
        else{
            last.next = newNode;//the next value of the last node will point to the new node
            last = newNode;
            
        }
    }
    
    public int deleteFirst(){
        int temp = first.data;
        if (first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
    
}
