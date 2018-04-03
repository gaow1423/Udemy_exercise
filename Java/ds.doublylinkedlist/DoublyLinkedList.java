public class DoublyLinkedList{
	private Node first;
	private Node last;

	public DoublyLinkedList(){
		this.first = null;
		this.last = null;
	}
	public boolean isEmpty(){
		return first == null;
	}
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;

		if(isEmpty()){
			last = newNode; //if empty, last will refer to the new Node being created.
		}
		else{
			first.previous = newNode;
		}

		newNode.next = first; //the new node's next field will point to the old first
		this.first = newNode;
	}

	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			first = newNode;
		}
		else{
			last.next = newNode;//assigning old last to newNode
			newNode.previous = last;//the old last will be the newnodes previous
		}
		last = newNode;//the linkedList's last field should point to the new node
	}
	public Node deleteFirst(){
		Node temp = first;
		if(first.next == null){
			last = null;
		}else{
			first.next.previous = null;
		}
		first = first.next;//we are assigning the reference of the node following the old first node to the first field in the linked list
		return temp;//return the deleted old first node
	}
	public Node deleteLast(){
		Node temp = last;
		if(first.next == null){
			//last = null;
			first = null;
		}else{
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}
	//assume noe-empty list
	public boolean insertAfter(int key, int data){
		Node current = first; // we start from the beginning of the list
		while(current.data != key){
			current = current.next;
			if(current == null) 
				return false;	
		}
		Node newNode = new Node();
		newNode.data = data;

		if(current == last){
			current.next = null;
			last = newNode;
		}else{
			newNode.next = current.next;//new node's next field should point to the node ahead of the current one
			current.next.previous = newNode;//the node ahead of current, it's previous field should point to the new node
		}
		newNode.previous = current;
                current.next = newNode;
		
		return true;
	}

	//assume non-empty list
	public Node deleteKey(int key){
		Node current = first;
		while(current.data != key){
			current = current.next;
                        if(current == null)
                                return null;
		}
		if(current == first)
			deleteFirst();
		else if (current == last)
			deleteLast();
		else{
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
			//last = last.previous;
		return current;
	}
	
	public void displayForward(){
		System.out.print("List (first --> last): ");
		Node current = first;
		while(current != null){
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward(){
		System.out.print("List (first --> last): ");
		Node current = last;
		while(current != null){
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	
	}


}






