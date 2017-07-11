import java.util.*;

class Node{
  Node next;
  int data;

  Node(int d){
    data = d;
    next = null;
  }
  Node(){
    //data =0;
    Node n =this;
    n =null;
  }

  void appendToTail(int d)
  {
    Node temp = new Node(d);
    Node n = this;
    while(n.next!=null)
    {
      n = n.next;
    }
    n.next= temp;
  }

  void output()
  {
    Node temp = this;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}

class ques8
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Node head = new Node(1);
    head.appendToTail(2);
    head.appendToTail(3);
    head.appendToTail(3);
    head.appendToTail(4);
    head.appendToTail(5);
    //head.output();
    head.next.next.next.next.next.next= head;
    if(isLoopDetection(head))
      System.out.println("Loop Present!");
    else
    System.out.println("Loop not present!");
  }

  static boolean isLoopDetection(Node head)
  {
      // Give condition for head 

      Node fast = head, slow = head;
      fast = fast.next.next;

      while(fast.next!=null & fast!=null)
      {
        //System.out.println(slow.data);
        if(fast==slow)
          return true;
        slow = slow.next;
        fast = fast.next.next;
      }
      return false;
  }
}
