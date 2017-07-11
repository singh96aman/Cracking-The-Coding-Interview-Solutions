import java.util.*;
class Node{
  int data;
  Node next = this;
  Node(int d)
  {
    data = d;
    next = this;
  }
  void append(int d)
  {
    Node n = this;
    //System.out.println("lala1");
    while(n.next!=this)
    {
      //System.out.println(n.data);
      n = n.next;
    }
    Node newnode = new Node(d);
    n.next = newnode;
    newnode.next = this;
    //System.out.println("lala3");
    //System.out.println();
  }

  void output()
  {
    Node n = this;
    while(n.next!=this)
    {
      System.out.println(n.data+" ");
      n = n.next;
    }
  }
}

class circularlinked
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int val = in.nextInt();
    Node head = new Node(val);
  //System.out.println(head.data);
    //Node head = new Node();
    for(int i=0; i<3; i++)
    {
      int d = in.nextInt();
      head.append(d);
    }
    //System.out.println(head.next.next.data);
    head.output();
  }
}
