import java.util.*;  

public class Node {
  
  int data;
  Node next;

  public Node(int data){
    this.data = data;
  }

  static void countNodes(Node head) {
    Node currentData = head;
    int count = 1;

    while(currentData.next instanceof Node) {
        currentData = currentData.next;
        count++;
    }
    System.out.println("This linked list contains " + count + " node(s).");
    
  }

  public static void main(String[] args) {
    Node head = new Node(4);
    Node nodeB = new Node(2);
    Node nodeC = new Node(3);
    Node nodeD = new Node(10);
    Node nodeE = new Node(4);

    head.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = nodeD;
    nodeD.next = nodeE;

    countNodes(head);
    
  }
}
