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

class ques7
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Node head1, head2, head3;

    // For Intersecting Linked Lists

    /*
    head1 = new Node(3);
    head1.appendToTail(1);
    head1.appendToTail(5);
    head1.appendToTail(9);

    head2 = new Node(4);
    head2.appendToTail(6);

    head3 = new Node(7);
    head3.appendToTail(2);
    head3.appendToTail(1);

    Node temp = head1;
    while(temp.next!=null)
      temp = temp.next;
    temp.next=head3;

    temp = head2;
    while(temp.next!=null)
      temp = temp.next;
    temp.next=head3;
    */

    //head1.output();
    //System.out.println();
    //head2.output();

    // For Non-Intersecting Nodes

    head1 = new Node(3);
    head1.appendToTail(1);
    head1.appendToTail(5);
    head1.appendToTail(9);
    head1.appendToTail(7);
    head1.appendToTail(2);
    head1.appendToTail(1);

    head2 = new Node(4);
    head2.appendToTail(6);
    head2.appendToTail(7);
    head2.appendToTail(2);
    head2.appendToTail(1);


    if(isIntersecting(head1, head2))
      System.out.println("Intersecting");
    else
      System.out.println("Non Intersecting");
  }

  static boolean isIntersecting(Node head1, Node head2)
  {
    while(head1.next!=null)
    {
        Node temp = head2;
      while(temp.next!=null)
      {
          if(temp==head1)
            return true;
          else
            temp = temp.next;
      }
      head1=head1.next;
    }
    return false;
  }

}
