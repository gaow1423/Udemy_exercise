public class App{
    
    public static void main(String[] args){
        CircularLinkedList mylist = new CircularLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(90);
        mylist.insertFirst(80);
        mylist.insertFirst(70);
        mylist.insertFirst(60);
        mylist.insertlast(666666);
    
        mylist.displayList();
    }
}
