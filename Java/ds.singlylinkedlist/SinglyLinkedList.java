public class SinglyLinkedList{
    private Node first;
//    private Node last;
    
    
    public SinglyLinkedList(){
        
    }
    
    public boolean isEmpthy(){
        return (first == null);
    }
    
    //used to insert at the begining of the list
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
//        if(newNode.next == null)
//        {
//            last = newNode;
//        }
        
    }

    public Node deleteFirst(){
        Node temp = first;
        first = temp.next;
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
    
    public void insertlast(int data){
        Node current = first;
        while(current.next != null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    
    }
}