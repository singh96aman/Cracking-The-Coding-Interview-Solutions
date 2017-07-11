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

  Node appendToHead(int d)
  {
    Node temp = new Node(d);
    Node n = this;
    temp.next = n;
    return temp;
  }

  Node del(int d)
  {
    Node n = this;
    Node head =n;
    if(n.data==d)
    {
      n=n.next;
      return n;
    }
    else
    {
      Node prev=n;
      while(n.data!=d || n!=null)
        {
          prev=n;
          n=n.next;
        }
      if(n==null)
      {
        System.out.println("Node not found");
        return head;
      }
      else
      {
        prev.next = n.next;
        return head;
      }

    }
  }

}

class linked{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int val = in.nextInt();
    Node head = new Node(val);
    //Node head = new Node();
    for(int i=0; i<4; i++)
    {
      int d = in.nextInt();
      head = head.appendToHead(d);
    }
    System.out.println();
    head=head.del(8);
    head.output();
  }
}



// Simple Example of Linked List

/*
import java.util.*;

class Node{
  Node next;
  int data;

  Node(int d){
    data=d;
    next = null;
  }
}

class linked{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int d = in.nextInt();
    Node head = new Node(d);
    d = in.nextInt();
    Node second = new Node(d);
    head.next = second;
    Node temp = head;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
*/
