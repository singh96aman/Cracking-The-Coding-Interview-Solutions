import java.util.*;

class Node{

  Node next;
  Node last;
  int data;

  Node(int d)
  {
    data = d;
    next = null;
    last = null;
  }

  Node appendToHead(int d)
  {
    Node temp = new Node(d);
    Node n = this;
    temp.next = n;
    n.last = temp;
    return temp;
  }

  void appendToTail(int d)
  {
    Node temp = new Node(d);
    Node n = this;
    while(n.next!=null)
      n=n.next;
    n.next=temp;
    temp.last=n;
  }

  Node del(int d)
  {
    Node n = this;
    Node head = n;
    if(n.data==d)
    {
      n=n.next;
      return n;
    }
    else
    {
        while(n.next!=null){
          if(n.next.data==d){
            n.next = n.next.next;
            n.next.last=n;
            return head;
          }
          n=n.next;
        }
        return head;
    }
  }

  void outputfronttoback()
  {
    Node n = this;
    while(n!=null)
      {
        System.out.println(n.data);
        n=n.next;
      }
  }
  void outputbacktofront()
  {
    Node n = this;
    while(n.next!=null)
        n=n.next;
    while(n!=null)
    {
      System.out.println(n.data);
      n = n.last;
    }
  }
}

class doublelinked
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int d = in.nextInt();
    Node head = new Node(d);
    for(int i=0; i<4; i++)
    {
      d = in.nextInt();
      head=head.appendToHead(d);
    }
    System.out.println();
    head = head.del(3);
    head.outputbacktofront();
  }
}
