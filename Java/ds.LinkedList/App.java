public class App{

	public static void main(String[] args){
		Node nodeA = new Node();
		nodeA.data = 4;
	
		Node nodeB = new Node();
		nodeB.data = 3;

		Node nodeC = new Node();
		nodeC.data = 7;

		Node nodeD = new Node();
                nodeC.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
	
		System.out.println(listLength(nodeA));//4
		System.out.println(listLength(nodeB));//3
		
	}
	
	public static int listLength(Node aNode){
		int counter = 1;
		//Node temp = aNode;
		while(aNode.next != null)
		{
			counter++;
			aNode = aNode.next;
		}
		return counter;
	}
}
